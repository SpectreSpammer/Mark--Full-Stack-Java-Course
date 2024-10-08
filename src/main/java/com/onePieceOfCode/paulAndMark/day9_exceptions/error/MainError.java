package com.onePieceOfCode.paulAndMark.day9_exceptions.error;

import java.util.ArrayList;
import java.util.List;

public class MainError {
    public static void main(String[] args) {

        //StackOverFlow
        /*
        try{
            recursiveMethod(1);
        }catch(StackOverflowError stackOverflowError){
            System.out.println("Caught the StackOverflowError: " + stackOverflowError.getMessage());
        }
          */

        outOfMemoryError();
    }

    private static void outOfMemoryError() {
        List<byte[]> listOfBytes = new ArrayList<>();
        while(true){
            listOfBytes.add(new byte[1024 * 1024]);
        }
    }


    private static void recursiveMethod(int num) {
        System.out.println(num);
        recursiveMethod(num + 1);
    }




}
