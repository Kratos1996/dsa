package ishant.dsa.string;

import java.util.Scanner;

public class StringPart1 {
    public static void main(String[] args) {
        //how to add data in String
        String name="Ishant";
        String nameother="Ishant";
        // Way of print
        System.out.print(name);//default print
        System.out.println(nameother);//add next line
        System.out.printf("Name String data is %s and Name other String data is : %s \n",name,nameother);//Format specifier  %d is for int ,%f is float ,%s is for String and %c for char
        System.out.format("Name String data is %s and Name other String data is : %s \n",name,nameother);//Format specifier  %d is for int ,%f is float ,%s is for String and %c for char

        float data=5.45637f;
        System.out.format("%.2f",data);//.2 means data will show 2 number after decimal
        //5.45 only show
        //if i print "%8.2" so 8 is blank 8 space after data will print

        // What is System : System is a final class
        // What is out : out is a static final PrintStream object
        // What is print or format : this is a function which return PrintStream

        // Scanner
        //Ex :
         /* String input = "1 fish 2 fish red fish blue fish";
        Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
        System.out.println(s.nextInt());   System.out.println(s.nextInt());
        System.out.println(s.next());   System.out.println(s.next());
        s.close();*/
        Scanner s = new Scanner(System.in); //this code allows a user to read a number from System inputStream or User
        String Username=s.nextLine();
        System.out.println(Username);

    }
}
