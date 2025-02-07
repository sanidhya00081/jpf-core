package gov.nasa.jpf;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;  

class StaticCallToNonStaticTest {

    @Test
    void testStaticCallToNonStatic() {
        Assertions.assertThrows(IncompatibleClassChangeError.class, () -> {
            D.m();  
        });
    }
}
