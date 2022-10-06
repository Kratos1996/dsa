package ishant.dsa.string;

import java.util.Scanner;

public class SplitArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String : ");
        String data =sc.nextLine();
        String [] dataArray=data.split(" ");
         for(int i =0;i<dataArray.length;i++){
             System.out.print("First Char Of Every Array String is : "+dataArray[i].charAt(0));
         }
    }
}
