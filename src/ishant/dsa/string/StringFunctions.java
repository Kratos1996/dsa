package ishant.dsa.string;

public class StringFunctions {
    public static void main(String[] args) {

        String data ="Ishant is a best programmer in the world now a days";
         //Strings function are

        String Split [] =data.split( " " );
        //array.to string ??
        System.out.println(Split.toString());
        for (String i:Split
             ) {
            System.out.println(i);
        }
        //limit is use to break split method

        String Split2 [] =data.split( " " , 9);
        for (String i:Split2
        ) {
            System.out.println(i);
        }


    }
}
