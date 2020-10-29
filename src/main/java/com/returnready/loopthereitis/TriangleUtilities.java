package com.returnready.loopthereitis;

public class TriangleUtilities {

    // numberOfRows for this method seems like it should be numberOfColumns minus 1.
    // By doing this I pass all tests. The commented out code below it attempts to the param as rows, but that only passes 1 of 2 tests.
    public static String getTriangle(int numberOfRows) {
        String stars = "";
        int numberOfColumns = numberOfRows - 1;
        for (int i = 1; i <= numberOfColumns; i++) {
            for (int j = 1; j <= i; j++) {
                stars += "*";
            }
            stars += "\n";
        }
        System.out.println(stars);
        return stars;
        
        // ** This only passes 1 test **
        // String stars = "";
        // int numberOfStars = 1;
        // for (int i = 0; i < numberOfRows; i++) {
        //     for (int j = 0; j < numberOfStars; j++) {
        //         stars += "*";
        //     }
        //     numberOfStars++;
        //     stars += "\n";
        //     if (numberOfStars > 9) {
        //         break;
        //     }
        // }
        // System.out.println(stars);
        // return stars;
    }

    public static String getRow(int numberOfStars) {
        String stars = "";
        for (int i = 0; i < numberOfStars; i++) {
            stars += "*";
        }
        return stars;
    }

    public static String getSmallTriangle() {
        return null;
    }

    public static String getLargeTriangle() {
        return null;
    }
}
