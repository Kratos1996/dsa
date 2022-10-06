package ishant.dsa.array2d;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting2dArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Matrix Size : ");
        int matrixSize=sc.nextInt();
        int matrix[][]=new int[matrixSize][matrixSize];

        for(int i=0;i<matrixSize;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print("Enter Value Matrix : ");
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("Your Matrix is  : ");
        for(int j=0;j<matrixSize;j++){
            System.out.println(Arrays.toString(matrix[j]));
        }

        System.out.println("Your Sorted Matrix is  : ");
        for(int i=0;i<matrixSize;i++){
            for(int j=0;j<matrixSize;j++){
                for(int k=0;k<matrixSize;k++){
                    for(int l=0;l<matrixSize;l++){
                       if(matrix[i][j]<matrix[k][l]){
                           int temp =matrix[i][j];
                           matrix[i][j]=matrix[k][l];
                           matrix[k][l]=temp;
                       }
                    }
                }
            }
        }


        for(int j=0;j<matrixSize;j++){
            System.out.println(Arrays.toString(matrix[j]));
        }

        BinarySearch2dArray search=new BinarySearch2dArray();
        System.out.println(search.binarySearch(matrix,9));


    }
}
