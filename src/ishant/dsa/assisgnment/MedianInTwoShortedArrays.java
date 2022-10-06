package ishant.dsa.assisgnment;

import java.util.Arrays;

public class MedianInTwoShortedArrays {

    public double findMedianSortedArrayswithMerged(int[] nums1, int[] nums2) {
        double median=0;
        int[] mergedArrayData = new int[nums1.length + nums2.length];
        int mergePointer = 0, nums1Pointer = 0, nums2Pointer = 0;
        while (mergePointer != mergedArrayData.length ) {
            if (nums1.length - 1 >= nums1Pointer) {
                if (nums2.length - 1 >= nums2Pointer) {
                    if (nums1[nums1Pointer] < nums2[nums2Pointer]) {
                        mergedArrayData[mergePointer] = nums1[nums1Pointer];
                        nums1Pointer++;
                        mergePointer++;
                    } else {
                        mergedArrayData[mergePointer] = nums2[nums2Pointer];
                        nums2Pointer++;
                        mergePointer++;
                    }
                } else {
                    mergedArrayData[mergePointer] = nums1[nums1Pointer];
                    nums1Pointer++;
                    mergePointer++;
                }
            } else {
                if (nums2.length - 1 >= nums2Pointer) {
                    mergedArrayData[mergePointer] = nums2[nums2Pointer];
                    nums2Pointer++;
                    mergePointer++;
                }
            }
        }
        if(mergedArrayData.length%2==0){
            median= (mergedArrayData[(mergePointer - 1) / 2] + mergedArrayData[mergePointer / 2]) / 2.0;
        }else{
            median= (mergedArrayData.length+1)/2;
        }
        System.out.println(Arrays.toString(mergedArrayData));
        System.out.println("Median of Arrays is : "+median);
        return median;
    }
    public double findMedianSortedArraysWithoutMerged(int[] nums1, int[] nums2) {
        double median=0,median2=0;
        int nums1Pointer = 0, nums2Pointer = 0;

        for (int i=0; i<=(nums1.length+nums2.length)/2; i++) {
            median = median2;
            if (nums1Pointer == nums1.length) {
                median2 = nums2[nums2Pointer];
                nums2Pointer++;
            } else if (nums2Pointer == nums2.length) {
                median2 = nums1[nums1Pointer];
                nums1Pointer++;
            } else if (nums1[nums1Pointer] < nums2[nums2Pointer] ) {
                median2 = nums1[nums1Pointer];
                nums1Pointer++;
            }  else {
                median2 = nums2[nums2Pointer];
                nums2Pointer++;
            }
        }

        // the median is the average of two numbers
        if ((nums1.length+nums2.length)%2 == 0) {
            return (float)(median+median2)/2;
        }
        System.out.println("Median of Arrays is : "+median2);
        return median2;
    }
}
