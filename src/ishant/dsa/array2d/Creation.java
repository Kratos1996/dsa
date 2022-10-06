package ishant.dsa.array2d;

import java.util.Arrays;
import java.util.Scanner;

public class Creation {

    public static void main (String [] args){
        int a [][]=new int[3][3];
        System.out.println(a.length);
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }

    }
}
