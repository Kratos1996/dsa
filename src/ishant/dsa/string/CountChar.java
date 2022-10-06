package ishant.dsa.string;

import java.util.Arrays;
import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String data=sc.nextLine();
       System.out.println(Arrays.toString(data.split(" ")));
       String ab=Integer.toString(2);
       String datab=String.valueOf(1);
       int datam=(int )10.45;
       double dat=10;
       /* int maxChar=0;
        char datavalue=0;
         for (int i=0;i<data.length();i++){
             char charData=data.charAt(i);
             int value=1;
             for(int j = i; j< data.length();j++){
                 if(charData==data.charAt(j)){
                    *//* maxChar++;*//*
                     if(value>maxChar){
                         maxChar=value;
                         datavalue=charData;
                     }
                     value++;
                 }
             }
         }
         System.out.println(""+datavalue+":"+maxChar);*/
    }
}
