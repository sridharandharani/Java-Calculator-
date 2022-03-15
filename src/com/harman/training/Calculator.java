package com.harman.training;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Addition addobj = new Addition();
        Subtraction subobj = new Subtraction();
        Multiply mulobj = new Multiply();
        Division divobj = new Division();

        Integer x , y , addresult,subresult,mulresult,divresult;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the num 1");
        x = input.nextInt();
        System.out.println("Enter the num 2 ");
        y = input.nextInt();
        addresult = addobj.Add2number(x,y);
        System.out.println(addresult);
        subresult = subobj.subract2numbers(x,y);
        System.out.println(subresult);
        mulresult = mulobj.multiply2number(x,y);
        System.out.println(mulresult);
        divresult = divobj.divide2numbers(x,y);
        System.out.println(divresult);




    }

}
