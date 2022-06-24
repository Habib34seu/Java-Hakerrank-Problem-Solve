
package main;

import java.util.Scanner;

public class JavaStdinandStdout_II {
    public static void main(String[] args) {
    Scanner input = new  Scanner(System.in);
    
    
    int n = input.nextInt();
    double x = input.nextDouble();
    
    String z = input.nextLine();
    z = input.nextLine();
    
    System.out.println("String: " + z);
    System.out.println("Double: " + x);
    System.out.println("Int: " + n);
    }
    
    
}
