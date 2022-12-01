package org.example;

import org.example.beans.Insure;

public class Main {
    public static String member = "";
    public static String ssn = "";

    public static void main(String[] args) {
        System.out.println("Please Wait!");

        if (args.length == 2) {
            member = args[0];
            ssn = args[1];
            Insure.searchInsureData(ssn);
        } else {
            System.out.println("Please Enter parameter");
            System.exit(0);
        }
    }
}