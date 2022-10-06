package ishant.dsa.integerQuestion;

public class AddTwoBinary {
    private static long query = 0;
    private static boolean firstTime = true;

    public static void main(String[] args) {
        String data = addTwoBinaryValue("101010", "010101");
        System.out.println(String.valueOf(data));
    }
    public static void main(char[] args) {
        String data = addTwoBinaryValue("101010", "010101");
        System.out.println(String.valueOf(data));
    }

    private static long getSumOfBinary(long data, long data2) {
        if (data == 1 && data2 == 1) {
            long temp = 10;
            temp = temp + query;
            if (temp > 10) {
                query = 1;
                return 1;
            } else {
                query = 1;
                return 0;
            }
        } else if (data == 0 && data2 == 0) {
            if (query == 1) {
                query = 0;
                return 1;
            }
            query = 0;
            return 0;
        } else {
            if (query == 1) {
                return getSumOfBinary(1, 1);
            } else {
                query=0;
                return 1;
            }

        }
    }

    private static String addTwoBinaryValue(String input1, String input2) {
        long data = 0L;
        try {
            long input1Long = Long.valueOf(input1);
            long input2Long = Long.valueOf(input2);
            long modulas = 0;
            long modulas2 = 0;
            long firstValue = 0;
            for (int i = 0; i < input1.length(); i++) {
                modulas = input1Long % 10;
                modulas2 = input2Long % 10;
                input1Long = input1Long / 10;
                input2Long = input2Long / 10;
                if(firstTime){
                    firstTime=false;
                    firstValue=getSumOfBinary(modulas, modulas2);
                    data = data * 10 + firstValue;
                }else{
                    data = data * 10 + getSumOfBinary(modulas, modulas2);
                }
            }
            if(query==1){
                data=data*10+query;
            }
            if(firstValue==0){
                return String.valueOf(data*10);
            }

            return String.valueOf(data);
        } catch (Exception e) {
            System.out.println("Your input1 or input2 is not valid");
            return "Your input1 or input2 is not valid";
        }

    }
}
