package ishant.dsa.map.imp;

import java.util.HashMap;

public class LongestSubArrayOfSumDivisibleByK {
    public static void main(String[] args) {
        int [] question ={2,7,6,1,4,5};
        int k=3;
        //Find the Sum of The Longest Sub-array Divisible by K
        int ans=Solution(question,k);
        System.out.println("Answer is : "+ ans);
    }

    private static int Solution(int[] question, int k) {
        int answer=0;
        int sum=0;
        int rem=0;
        //First create hashmap for save reminder and indices

        HashMap<Integer,Integer>saveReminder=new HashMap<>();
        //HashMap<Reminder,Indices>
        //Enter Initial Data
        saveReminder.put(0,-1);
        for(int i=0;i<question.length;i++){
            sum +=question[i];
            rem=sum%k;
            if(rem<0){
                rem=rem+k;
            }
            if(saveReminder.containsKey(rem)){
                int indx=saveReminder.get(rem);
                int length = i-indx;
                if(length>answer){
                    answer=length;
                }

            }else{
                saveReminder.put(rem,i);
            }

        }

        return answer;
    }

}
