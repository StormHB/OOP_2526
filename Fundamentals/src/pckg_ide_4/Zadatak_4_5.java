package pckg_ide_4;

import java.util.Scanner;

public class Zadatak_4_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite znak: ");
        char ch = sc.next().charAt(0);
        switch(ch){
            case 'a': System.out.println("Case is: " + ch); break;
            case 'b': System.out.println("Case is: " + ch); break;
            case 'c': System.out.println("Case is: " + ch); break;
            case 'd': System.out.println("Case is: " + ch); break;
            case 'e': System.out.println("Case is: " + ch); break;
            case 'f': System.out.println("Case is: " + ch); break;
            case 'g': System.out.println("Case is: " + ch); break;
            case 'h': System.out.println("Case is: " + ch); break;
            case 'i': System.out.println("Case is: " + ch); break;
            case 'j': System.out.println("Case is: " + ch); break;
            case 'k': System.out.println("Case is: " + ch); break;
            case 'l': System.out.println("Case is: " + ch); break;
            case 'm': System.out.println("Case is: " + ch); break;
            default: System.out.println("Case is not a case!");
        }

    }
}

