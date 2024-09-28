package com.onePieceOfCode.paulAndMark.day3_primitive_types_and_datatype.reference;

public class Designer implements Employee{

    @Override
    public void work() {
        System.out.println("Designer is designing the user interface");
    }

    @Override
    public void takeBreak() {
        System.out.println("Designer is having his walked");
    }

    @Override
    public void attendMeeting() {
        System.out.println("Designer is presenting the meeting");
    }
}
