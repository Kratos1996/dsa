package ishant.dsa.string;

import java.util.Scanner;

public class MainClass {

    public MainClass(){
       
    }

    public static void main(String[] args) {
        StringManipulation dm=new StringManipulation();
        Scanner sc=new Scanner(System.in);
        System.out.print(dm.isEqualIgnoreCase(sc.next(),sc.next()));

    }
}
