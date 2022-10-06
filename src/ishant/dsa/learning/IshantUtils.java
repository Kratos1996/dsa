package ishant.dsa.learning;

public class IshantUtils {
    //code
    //global var
    int shyam =10; //
    int shayam =10; //
    static int data=5000; //OneTime Created in Memory
    private static String name="Ishant Sharma";//Class Scope

    //Access Mod- public //Static  //void -No return type //Function name () //parms
    public static void main(String[] args) {
        //no change

    }

    private String getName(){
        return name;
    }

    public int sum(int b,int a){
        //int d=sum(1,1);
        //System.out.println(d);
        return a+b;
    }
    public double sum(int a,double b){
        return a+b;
    }
    public double sum(double a,int b){
        return a+b;
    }
    public double sum(float a,double b){
        return a+b;
    }
    public double sum(double a,double b){
        return a+b;
    }
    public int sum(int a,int b,int c){
        return a+b+c;
    }

    /*With parms*/  //with return
    public int multiply(int value1,int value2){
        return value1*value2;
    }


}
