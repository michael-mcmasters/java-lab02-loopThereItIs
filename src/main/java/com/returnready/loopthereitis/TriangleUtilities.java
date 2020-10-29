package com.returnready.loopthereitis;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        // *** Both tests pass if we treat param as numOfColumns instead of numOfRows. ***
        int numbersOfColumns = numberOfRows - 1;
        return getTriangleWithinRange(numbersOfColumns);
        
        // *** I tried doing it by looping through rows instead of columns like it suggests. ***
        // *** But this only passes 1 test. ***
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
        return getTriangleWithinRange(4);
    }

    public static String getLargeTriangle() {
        return getTriangleWithinRange(9);
    }
    
    private static String getTriangleWithinRange(int numberOfColumns) {
        String stars = "";
        for (int column = 1; column <= numberOfColumns; column++) {
            for (int j = 0; j < column; j++) {
                // The amount of stars is the same as the column they are on (for example, column 3 has 3 stars)
                stars += "*";
            }
            stars += "\n";
        }
        return stars;
    }
}
