package com.company;
/*Loop completion activity
The following program should allow the users to input 10 integers and output the total. Please finish it.*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int num, total = 0;
        System.out.println("We are going to total 10 numbers\n Please enter 1 number at a time.\nLet's Go!!!");
       for(int i=1;i<11;i++) {
           num = keyboard.nextInt();
           total += num;
           // Loop should end here

           System.out.println("Thanks for the number "+ i +": " +num+ ".\nThe total of "+ i + " numbers are " + total);

       }
        System.out.println("The total of all 10 numbers is " + total);
    }
}

