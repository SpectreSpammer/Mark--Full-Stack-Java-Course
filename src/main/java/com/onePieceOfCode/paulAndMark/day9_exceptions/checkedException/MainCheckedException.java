package com.onePieceOfCode.paulAndMark.day9_exceptions.checkedException;

import java.io.FileNotFoundException;

public class MainCheckedException {
    public static void main(String[] args) throws FileNotFoundException {

        CheckedException.readFile("C:\\One Drive\\OneDrive\\Desktop");
        CheckedException.connectToDatabase();
    }
}
