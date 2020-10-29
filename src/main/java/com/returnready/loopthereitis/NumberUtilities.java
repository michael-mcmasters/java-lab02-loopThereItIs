package com.returnready.loopthereitis;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String evenNumbers = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 == 0) {
                evenNumbers += i;
            }
        }
        return evenNumbers;
    }


    public static String getOddNumbers(int start, int stop) {
        String oddNumbers = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 != 0) {
                oddNumbers += i;
            }
        }
        return oddNumbers;
    }


    // Test fails. Not sure why.
    public static String getSquareNumbers(int start, int stop, int step) {
        String squareNumbers = "";
        for (int i = start; i < stop; i += step) {
            double cast = (double) i;
            if (Math.sqrt(cast) == 0) {
                squareNumbers += i;
            }
        }
        return squareNumbers;
    }

    // Parameter says start but it's supposed to be stop. This passes test.
    public static String getRange(int start) {
        String numbers = "";
        for (int i = 0; i < start; i++) {
            numbers += i;
        }
        return numbers;
    }

    public static String getRange(int start, int stop) {
        return null;
    }


    public static String getRange(int start, int stop, int step) {
        return null;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        return null;
    }
}
