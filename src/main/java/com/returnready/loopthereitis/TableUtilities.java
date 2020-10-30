package com.returnready.loopthereitis;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        int columnSize = 5;
        int rowSize = 5;
        return getMultiplicationTableInRange(columnSize, rowSize);
    }

    public static String getLargeMultiplicationTable() {
        int columnSize = 10;
        int rowSize = 10;
        return getMultiplicationTableInRange(columnSize, rowSize);
    }

    public static String getMultiplicationTable(int tableSize) {
        return getMultiplicationTableInRange(tableSize, tableSize);
    }
    
    private static String getMultiplicationTableInRange(int columnSize, int rowSize) {
        String table = "";
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
