package BinarySearch.search2DMatrix;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix={{1,2,4,8},{10,11,12,13},{14,20,30,40}};
        System.out.println(matrix(matrix,22));
    }

    public static boolean matrix(int[][] matrix,int target){
          if(matrix.length==0)
              return false;

          int rows=matrix.length;
          int columns=matrix[0].length-1;

          int left=0;
          int right=(rows*columns)-1;

          while(left<=right) {
              int mid = left + (right - left) / 2;
              int mid_value = matrix[mid / columns][mid % columns];
              if (mid_value == target) {
                  return true;
              } else if (target < mid_value) {
                  right = mid - 1;
              } else {
                  left = mid + 1;
              }

          }
          return false;
    }


}
