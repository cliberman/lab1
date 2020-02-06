package edu.ti.foo;

public class HelloWorld {
    public static void main(String[] args) {
        String name = "Bob";
        if (args.length > 0) {
            name = args[0];
        }
        System.out.println("Hello, " + name + " from the world!");
    }
}
