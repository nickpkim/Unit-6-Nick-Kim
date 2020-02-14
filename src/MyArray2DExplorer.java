public class MyArray2DExplorer {

    public static void main(String[] args) {
        int array[][] = {{4, 1, 8, 5},
                {0, 2, 3, 4},
                {6, 6, 2, 2}};
        MyArray2DExplorer exp = new MyArray2DExplorer();

        System.out.println("Test evenRow: \n Row w/ odd, Expecting: false \n Actual: " + exp.evenRow(array, 0));
        System.out.println("Test evenRow: \n Row w/o odd, Expecting: true \n Actual: " + exp.evenRow(array, 2));

        System.out.println();

        System.out.println("Test oddColSum: \n Col w/ odd Sum, Expecting: true \n Actual: " + exp.oddColSum(array, 1));
        System.out.println("Test oddColSum: \n Col w/ even, Expecting: false \n Actual: " + exp.oddColSum(array, 0));

        System.out.println();


        System.out.print("Test minRow: \n Expecting: {0 2 3 4} \n Actual: {");
        int[] row = exp.minRow(array);
        for (int i = 0; i < row.length; i++) {
            System.out.print(row[i] + " ");
        }
        System.out.print("]");

    }

    //WRITE YOUR METHODS BELOW

    public boolean evenRow(int[][] mat, int row) {
        for (int i=0; i<mat[row].length; i++){
            if (mat[row][i]%2 != 0){
                return false;
            }
        }
        return true;
    }

    public boolean oddColSum(int[][] mat, int col){
        int sum = 0;
        for (int i=0; i<mat.length; i++){
            sum += mat[i][col];
        }
        return sum%2 != 0;
    }

    public int[] minRow(int[][] mat) {
        int min = mat[0][0];
        int rowNum = 0;
        for (int i=0; i<mat.length; i++){
            for (int j=0; j<mat[0].length; j++){
                if (mat[i][j] < min){
                    min = mat[i][j];
                    rowNum = i;
                }
            }
        }
        return mat[rowNum];
    }

    public int minRow(int[][] mat, int row) {
        int min = mat[row][0];
        for (int i=1; i<mat[row].length; i++){
            if (mat[row][i] < min){
                min = mat[row][i];
            }
        }
        return min;
    }
}








