package com.prakash.javaprograms;

import java.util.Scanner;

public class PrintASCII {

    public static void main(String[] args) {

        int i;
        do {
            i=-1;
            System.out.println("Enter a character....");
            Scanner sc = new Scanner(System.in);
            char ch = sc.next().charAt(0);
            int asciiVal = ch;
            System.out.println("ASCII of " + ch + " izz " + asciiVal);
            System.out.println("Do you want to continue 1/0 ?");
            i=sc.nextInt();
            System.out.println("i izz.."+i);
        }while(i>0);
    }
}
