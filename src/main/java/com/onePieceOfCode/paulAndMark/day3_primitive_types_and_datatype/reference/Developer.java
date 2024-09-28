package com.onePieceOfCode.paulAndMark.day3_primitive_types_and_datatype.reference;

public class Developer implements Employee{

    @Override
    public void work() {
        System.out.println("Developer is writing some code");
    }

    @Override
    public void takeBreak() {
        System.out.println("Developer is having his coffee break");
    }

    @Override
    public void attendMeeting() {
        System.out.println("Manager is attending the meeting");
    }
}
