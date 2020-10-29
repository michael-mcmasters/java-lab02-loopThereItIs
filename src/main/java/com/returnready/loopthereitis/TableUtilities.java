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
        String table = "";
        int columnSize = 10;
        int rowSize = 10;

        for (int column = 1; column <= columnSize; column++) {
            for (int row = 1; row <= rowSize; row++) {
                int result = column * row;
                if (result < 100) {
                    if (result < 10) {
                        table += "  ";
                    } else {
                        table += " ";
                    }
                }
                table += result + " |";
            }
            table += "\n";
        }
        return table;
    }

    public static String getMultiplicationTable(int tableSize) {
        String table = "";
        int columnSize = 20;
        int rowSize = 20;

        for (int column = 1; column <= columnSize; column++) {
            for (int row = 1; row <= rowSize; row++) {
                int result = column * row;
                if (result < 100) {
                    if (result < 10) {
                        table += "  ";
                    } else {
                        table += " ";
                    }
                }
                table += result + " |";
            }
            table += "\n";
        }
        return table;
    }
}
