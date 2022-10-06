package ishant.dsa.array.learn;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    static int insertionValue=10;
    //Array
    public static void main(String[] args) {


        int a[]={2,2,4,8,5,6,8,10,12,14};
        int b[]=new int[a.length+1];
        findMaximum maximum=new findMaximum();
        maximum.find(a,3);
        //insertArrayDataDynamically(b);
       // insert(a,b);
        //insert(a,3);
       // Sort sort=new Sort();
       // sort.sortTheArray(a);
      // CreateArrayDivisible data=new CreateArrayDivisible();
      //  System.out.print(Arrays.toString(data.getArray(a,1)));
      // System.out.print(Arrays.toString(data.getLongestSubArray(a,2)));

    }
    static void insert(int a[], int b[]){
        int temp=0;
        for(int i=0;i<b.length;i++){
            if(i==(b.length-1)){
                b[i]=insertionValue;
            }else{
                b[i]=a[i];
            }
        }
        temp=a[2];
        b[2]=insertionValue;
        b[a.length]=temp;


       printDelta(b);
    }

    private static void printDelta(int[] b) {
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }

    static void insert(int a[],int position ){
        int b[]=new int[a.length+1];
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        for(int i=b.length-1;i>=position;i--){
            if(position==i){
                b[position]=insertionValue;
            }else{
                b[i]=b[i-1];
            }

        }
        printDelta(b);


    }

    static void insertArrayDataDynamically(int b[]){
        Scanner data=new Scanner(System.in);
        for(int i=0;i<b.length;i++){
            b[i]=data.nextInt();
        }
       System.out.println(Arrays.toString(b));
    }

}
