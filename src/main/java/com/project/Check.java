package com.project;

public class Check {

    public static boolean length(String password) {
        return password.length() >= 12;
    }


    public static boolean uppercase(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean lowercase(String input) {
        return false;
    }

}