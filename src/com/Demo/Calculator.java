package com.Demo;

import java.lang.*;
import java.util.*;

class Calculator
{
    private int solution;

    public Calculator()
    {
        solution = 0;
    }

    public int addition(int firstValue, int secondValue)
    {
        return firstValue + secondValue;
    }
    public int subtraction(int firstValue, int secondValue)
    {
        return firstValue - secondValue;
    }
    public int multiplication(int firstValue, int secondValue)
    {
        return firstValue * secondValue;
    }
    public int division(int firstValue, int secondValue)
    {
        solution = firstValue / secondValue;
        return solution;
    }

    public void calc(int operator){
        int firstValue = 5;
        System.out.println("operand 2: ");
        int secondValue = 2;

        switch(operator)
        {
            case(1):
                System.out.println(addition(firstValue, secondValue));
                break;
            case(2):
                System.out.println(subtraction(firstValue, secondValue));
                break;
            case(3):
                System.out.println(multiplication(firstValue, secondValue));
                break;
            case(4):
                System.out.println(division(firstValue, secondValue));
                break;
        }
    }
    public static void main (String[] args)
    {
        System.out.println("What operation? ('+', '-', '*', '/')");
        System.out.println(" Enter 1 for Addition");
        System.out.println(" Enter 2 for Subtraction");
        System.out.println(" Enter 3 for Multiplication");
        System.out.println(" Enter 4 for Division");

        Calculator calc = new Calculator();
        calc.calc(4);
    }
}