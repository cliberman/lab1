package edu.ti.foo;

public class HelloWorld {
    public static void main(String[] args) {
        String name = (args.length > 0) ? args[0] : "Bob";
        System.out.println("Hello, " + name + " from the world!");
    }
}
