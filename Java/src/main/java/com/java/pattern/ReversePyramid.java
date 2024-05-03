package com.java.pattern;
import java.util.Scanner;

public class ReversePyramid {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = scanner.nextInt();
        
        // Print rows
        for(int i = 1; i <= a; i++) {
            // Print spaces
            for(int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for(int k = 1; k <= 2 * (a - i) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
