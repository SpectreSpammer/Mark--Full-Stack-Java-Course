package com.onePieceOfCode.paulAndMark.day4_operatos_in_java.ternary;

public class MainTernary {
    public static void main(String[] args) {

        /*
            * condition ? expression1 : expression2
         */

        int x = 10;
        System.out.println(x > 20 ? "x is greater than 20" : " x is less than 20");

        boolean isReceivedTheBonus = false;
        String receivedBonus = isReceivedTheBonus ? " received bonus " : "not yet receiving the bonus";
        System.out.println("Zoro has: " + receivedBonus);


    }


}
