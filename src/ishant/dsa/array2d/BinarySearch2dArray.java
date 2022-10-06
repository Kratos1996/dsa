package ishant.dsa.array2d;

public class BinarySearch2dArray {

    public boolean binarySearch(int sortedMatrix[][], int data) {

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
}
