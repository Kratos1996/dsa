package ishant.dsa.string.pattern;

import java.util.Scanner;

public class pattern1 {
    /*
    *   *
    *     *
    *       *
    *         *
    *       *
    *     *
    *   *
    * *
    * */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a = scanner.nextInt();
         for (int i=1;i<=a;i++){
             for (int j=1;j<=i;j++){
                 System.out.print(" ");
                 if(j==i){
                     System.out.print("*");
                 }
             }
             System.out.println();
        }
        for (int i=a;i>=1;i--){
            for (int j=i;j>=1;j--){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
