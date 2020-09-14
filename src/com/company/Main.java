package com.company;

public class Main {

    public static void main(String[] args) {
        String[] students = {"Anastasia", "Corina", "Ana-Maria"};
        for(String i : students)
        {
            System.out.println(i);
        }

        int[] array = {1,2,3,4,5,6,7,8,9};
        for(int i : array)
        {
            if(i % 2 == 0)
            {
                System.out.println("The number " + i + " is even");
            }
            else
            {
                System.out.println("The number " + i + " is odd");
            }
        }
        double a = 20.7;
        int b = (int)a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        try{
            int[] num = {1,2,3,4};
            System.out.println(num[4]);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
