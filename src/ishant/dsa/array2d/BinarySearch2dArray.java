package ishant.dsa.array2d;

public class BinarySearch2dArray {

    public boolean SearchWithSortedMatrix(int sortedMatrix[][], int data) {

        int row = 0;
        int col = sortedMatrix.length - 1;

        while (row < sortedMatrix.length && col >= 0) {

            if(sortedMatrix[row][col]==data){
                return true;
            }else if(sortedMatrix[row][col]<data){
                row++;
            }else {
                col--;
            }

        }
        return false;


    }

    private boolean binarySearch(int sortedMatrix[][], int row,int start,int end,int data){

        while (start<=end){
            int mid =(start+(end-start))/2;
            if(sortedMatrix[row][mid]==data){
                return true;
            }else if(sortedMatrix[row][mid]<data){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return false;
    }

    public boolean SortedMatrixWithBinarySearch(int sortedMatrix[][], int data){
        int row =0;
        int col = sortedMatrix.length-1;
        boolean isFound =false;

        while(row<sortedMatrix.length){

            if(sortedMatrix[row][col]>data){
                isFound= binarySearch(sortedMatrix,row,0,sortedMatrix.length-1,data);
                return isFound;
            }else{
              row++;
            }

        }
       return isFound;
    }
}
