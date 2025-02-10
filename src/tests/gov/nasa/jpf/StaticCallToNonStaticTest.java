package gov.nasa.jpf;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Assertions;

public class StaticCallToNonStaticTest {
    
    @Test
    public void testStaticCallToNonStatic() {
        assertThrows(IncompatibleClassChangeError.class, () -> {
            D.m();  // This should trigger the exception in JPF
        });
    }
    
}
