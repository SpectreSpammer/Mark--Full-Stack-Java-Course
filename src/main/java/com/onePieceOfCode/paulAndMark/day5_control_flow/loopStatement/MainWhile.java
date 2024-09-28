package com.onePieceOfCode.paulAndMark.day5_control_flow.loopStatement;

public class MainWhile {
    public static void main(String[] args) {

        int yearsOfService = 3;
        int performanceRating = 8;
        boolean isPromotionEligible = false;

        System.out.println("Years until promotion is eligibility");
        while(!isPromotionEligible){
            if(yearsOfService >= 10 || (yearsOfService >=5 && performanceRating >= 6)) {
                isPromotionEligible = true;
                System.out.println("Employee is not eligible for promotion");
            }else {
                yearsOfService++;
                System.out.println("Years of service: " + yearsOfService);
            }



        }
    }
}
