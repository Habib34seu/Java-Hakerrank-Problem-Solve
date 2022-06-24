package main;

import java.util.Scanner;

public class Java_If_Else {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        if(n> 1 && n <= 5){
            if (n % 2 == 0) {

                System.out.println("Not Weird");
            } else {
                System.out.println("Weird");
            }
        }else if(n>=6 && n <= 20){
         
                System.out.println("Weird");
            
        }
        
         if (n > 20) {
            if (n % 2 == 0) {

                System.out.println("Not Weird");
            } else {
                System.out.println("Weird");
            }
        } 

    }

}
