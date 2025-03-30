package test;

import java.util.List;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
     int dia_left = 0, dia_right = 0;
     int size = arr.size()-1;
     for(int i = 0; i < size; i++)
     {
        dia_left += arr.get(i).get(i);
        dia_right += arr.get(i).get(size - i);
     }
     
     return Math.abs(dia_left-dia_right);

    }

}