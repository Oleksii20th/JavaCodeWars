package com.company;

public class Main {
//Usually when you buy something, you're asked whether your credit card number,
//phone number or answer to your most secret question is still correct.
//However, since someone could look over your shoulder, you don't want that shown on your screen.
//Instead, we mask it.
//Your task is to write a function maskify, which changes all but the last four characters into '#'.

    private static final int VISIBLE_LENGTH = 4;

    public static void main(String[] args) {
        String str = "Oleksii";
        System.out.println(maskify(str));
    }
    public static String maskify(String input) {
        if (input != null && input.length() < VISIBLE_LENGTH) {
            return input;
        } else {
            return makeMask(input.length() - VISIBLE_LENGTH) +
                    input.substring(input.length() - VISIBLE_LENGTH, input.length());
        }
    }

    private static String makeMask(int length) {
        return new String(new char[length]).replace("\0", "#");
    }
}
