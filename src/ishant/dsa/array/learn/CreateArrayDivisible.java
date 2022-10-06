package ishant.dsa.array.learn;

public class CreateArrayDivisible {

    public int [] getArray(int a[],int divisibleData){
        int position=0;
        int b[]=new int[a.length];
      for(int i=0;i<a.length;i++){
          if(a[i]%divisibleData==0){
              b[position]=a[i];
              position++;
          }
      }
        return b;
    }
    public int [] getLongestSubArray(int a[],int divisibleData){
        int count=0;
        int lastCount=-1;
       int startPoint=-1;
       int lastStartPoint=-1;
        int lastEndPoint=-1;
        int endPoint=-1;
       int position=0;
        for(int i=0;i<a.length;i++){
           if(a[i]%divisibleData==0){
               if(count==0){
                  startPoint=i ;
               }
               endPoint=i;
               if(startPoint>=0){
                   count++;
               }

           }else{
               count=0;
           }
            if(count>lastCount){
                lastCount=count;
                lastStartPoint=startPoint;
                lastEndPoint=endPoint;
            }
        }
        int b[]=new int [lastCount];
        for(int i=lastStartPoint;i<=lastEndPoint;i++){
            b[position]=a[i];
            position++;
        }
        return b;
    }
}
