package gov.nasa.jpf.test;

public sealed class Animal permits Dog, Cat { }

final class Dog extends Animal { }
final class Cat extends Animal { }