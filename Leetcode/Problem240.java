// 240. Search a 2D Matrix II
public class Problem240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length-1;

        while(row < matrix.length && col >= 0){
            int current = matrix[row][col];

            if(current == target){
                return true;
            }
            else if(target < current){
                col--;
            }
            else{
                row++;
            }
        }
        return false;
    }
}
