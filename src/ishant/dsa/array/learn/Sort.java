package ishant.dsa.array.learn;

import java.util.Arrays;

public class Sort {
    // Sorting
    public void sortTheArray(int a []){

        for(int i=0;i<a.length;i++){
            int temp=0;
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            System.out.print(Arrays.toString(a));
        }
    }
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int i=0;
        for(int j=i+1;j<nums.length;j++){

            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;

    }
}
