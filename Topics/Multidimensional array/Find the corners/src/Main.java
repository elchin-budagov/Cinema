class ArrayOperations {
    public static void printCorners(int[][] twoDimArray) {

        int[] firstRow = twoDimArray[0];
        int[] lastRow = twoDimArray[twoDimArray.length - 1];

        System.out.print(firstRow[0] + " ");
        System.out.println(firstRow[firstRow.length - 1]);

        System.out.print(lastRow[0] + " ");
        System.out.println(lastRow[lastRow.length - 1]);


    }
}