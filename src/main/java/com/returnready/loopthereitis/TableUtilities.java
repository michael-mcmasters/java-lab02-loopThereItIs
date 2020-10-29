package com.returnready.loopthereitis;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String results = "";
        int columnSize = 5;
        int rowSize = 5;
        
        for (int column = 1; column <= columnSize; column++) {
            for (int row = 1; row <= rowSize; row++) {
                int result = column * row;
                if (result < 10) {
                    results += "  ";
                } else {
                    results += " ";
                }
                results += result + " |";
            }
            results += "\n";
        }
        return results;
    }

    public static String getLargeMultiplicationTable() {
        return null;
    }

    public static String getMultiplicationTable(int tableSize) {
        return null;
    }
}
