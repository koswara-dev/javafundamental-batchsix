package com.juaracoding.daynine;

public class LambdaOne {
    public static void main(String[] args) {
        // (lambda) ->
        Addable addOne = (a, b) -> (a + b); // (a, b) adalah function anonymous
        System.out.println(addOne.add(10, 5));

        Addable addTwo = (int a, int b) -> { // (int a, int b) adalah function anonymous
            return (a + b);
        };
        System.out.println(addTwo.add(20, 10));
    }
}
