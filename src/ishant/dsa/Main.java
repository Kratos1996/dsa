package ishant.dsa;

import ishant.dsa.assisgnment.MedianInTwoShortedArrays;
import ishant.dsa.string.MainClass;

public class Main {
    public static void main(String[] args) {


        MedianInTwoShortedArrays data =new MedianInTwoShortedArrays();
        int [] nums={1};
        int [] nums2={};
        data.findMedianSortedArraysWithoutMerged(nums , nums2);
    }
}
