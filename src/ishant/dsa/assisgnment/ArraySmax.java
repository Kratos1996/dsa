package ishant.dsa.assisgnment;

public class ArraySmax {
    public static void main(String[] args) {
        int a[]={1,1,0,2};

        int max=a[0];
        int smax=a[0];

        for(int i=0;i<a.length;i++){

            if(max<=a[i]){
                   smax=max;
                   max=a[i];
            }else{
                smax=a[i];
            }
        }
        if(smax!=max){
            System.out.format("smax is = %d",smax);
        }else{
            System.out.printf("Smax and max is equal");
        }

    }
}
