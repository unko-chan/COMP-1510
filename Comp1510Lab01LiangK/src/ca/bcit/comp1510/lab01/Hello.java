package ca.bcit.comp1510.lab01;

/**
 * Prints a Hello World message.
 * 
 * @author Kevin Liang
 * @version 2023
 */
public class Hello {

    /**
     * Prints "Hello world!".
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

//a. 
//Error: Could not find or load main class 
//ca.bcit.comp1510.lab01.Hello in module Comp1510Lab01LiangK2

//b.
//prints Helo instead of Hello

//c.
//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//    String literal is not properly closed by a double-quote
//
//    at Comp1510Lab01LiangK2/ca.bcit.comp1510.lab01.Hello.main(Hello.java:18)

//d
//many syntax errors

//e
//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//    Syntax error, insert ";" to complete BlockStatements
//
//    at Comp1510Lab01LiangK2/ca.bcit.comp1510.lab01.Hello.main(Hello.java:18)
