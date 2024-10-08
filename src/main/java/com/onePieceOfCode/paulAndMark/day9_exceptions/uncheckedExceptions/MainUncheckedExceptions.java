package com.onePieceOfCode.paulAndMark.day9_exceptions.uncheckedExceptions;

public class MainUncheckedExceptions {
    public static void main(String[] args) {

        // we except that it throws null pointer
        /*
        try{
            String name = null;
            System.out.println(name.length());
        }catch (NullPointerException nullPointerException){
            System.out.println("Caught Null Pointer");
        }
        */

        //we dont know that it throws an null pointer exception
        /*
        String name = null;
        System.out.println(name.length());
        */

        //we dont know that it throws index out of bounds exception
        /*
        int [] arr = new int[5];
        System.out.println(arr[6]);
        */

        // we except that it throws index out of bounds exception
        try{
            int [] arr = new int[5];
            System.out.println(arr[6]);
        }catch (IndexOutOfBoundsException indexOutOfBoundsException){
            System.out.println("index out of bounds exception" );
        }
    }
}
