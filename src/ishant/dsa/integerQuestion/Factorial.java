package ishant.dsa.integerQuestion;

import java.util.Arrays;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorialOfNumber(3));

    }
    private static Integer factorialOfNumber(int number){
      int sum=1;
        for (int i =1;i<=number;i++){
            sum=sum*(i);
        }
        return sum;
    }
}
