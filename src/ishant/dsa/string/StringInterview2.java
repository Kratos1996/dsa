package ishant.dsa.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//Write the maximum alphabate in String

public class StringInterview2 {
    public static void main(String[] args) {
        String sentence="";
        String maxKeyWord="";
        int maxCount=0;
        HashMap<Character,Integer> charData=new HashMap<>();
        System.out.println("Enter String ");
        sentence=new Scanner(System.in).nextLine();
        System.out.printf("Your String is : %s",sentence);
        char data[]=sentence.replace(" ","").toCharArray();
        for (int i = 0; i < data.length; i++) {
            if(charData.get(data[i])!=null){
                int dataInt =charData.get(data[i]);
                dataInt=dataInt+1;
                charData.put(data[i],dataInt);
            }else{
                charData.put(data[i],1);
            }
        }

        System.out.printf("Char map detail : %s ",charData);
        for(Map.Entry<Character,Integer> entry: charData.entrySet()){
            if(entry.getValue()>maxCount){
                maxCount= entry.getValue();
                maxKeyWord=entry.getKey().toString();
            }
        }
        System.out.printf("Maximum Charchter is in This String is %s and its Count is : %d",maxKeyWord,maxCount);
    }
}
