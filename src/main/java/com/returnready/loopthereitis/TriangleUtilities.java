package com.returnready.loopthereitis;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String stars = "";
        int numberOfColumns = 9;
        for (int i = 1; i <= numberOfColumns; i++) {
            for (int j = 1; j <= i; j++) {
                stars += "*";
            }
            stars += "\n";
        }
        System.out.println(stars);
        return stars;
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
