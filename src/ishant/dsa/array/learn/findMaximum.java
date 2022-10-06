package ishant.dsa.array.learn;

//WAP of find Sum of Continuously sub Array and Find maximum from all the Sum

import java.util.Arrays;

public class findMaximum {

    public void find(int a[],int subArraySplitTarget ){
        int max=0;

        int j=0;
        System.out.println("array Data   "+ Arrays.toString(a));
        for (int i=0;i<a.length;i++){
            int sum=0;
            if((i+subArraySplitTarget)<=a.length){
                for(j=i;j<i+subArraySplitTarget;j++){
                    System.out.println("array details  "+a[j]);
                    sum=sum+a[j];
                }
                System.out.println("sum of array "+sum);
                if(max<=sum){
                    max=sum;
                    System.out.println("Current Maximum Data "+sum);
                }
            }

        }

        System.out.println("maximum sub array of sum is"+max);
    }
}
