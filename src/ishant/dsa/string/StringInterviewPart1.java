package ishant.dsa.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Find out maximum value of string in a sentence
public class StringInterviewPart1 {

    public static void main(String[] args) {
        String S="";
        System.out.println("Enter Sentence Please : ");
        S=new Scanner(System.in).nextLine();
        findOutMaximum(S);
    }
    private static void findOutMaximum(String str){
        String max="";
        Integer count=0;
        HashMap<String,Integer> sentenceMap=new HashMap<>();
        String sentenceArray[]=str.split(" ");
        for (int i = 0; i < sentenceArray.length; i++) {
            if(sentenceMap.get(sentenceArray[i])!=null){
                int data=sentenceMap.get(sentenceArray[i]);
                data=data+1;
                sentenceMap.put(sentenceArray[i],data);
            }else{
                sentenceMap.put(sentenceArray[i],1);
            }
        }
        for (Map.Entry<String, Integer> entry : sentenceMap.entrySet()) {
            if (entry.getValue()>count) {
                count= entry.getValue();
                max=entry.getKey();
            }
        }
        System.out.printf("%s is max total count is : %d",max,count);

    }
}
