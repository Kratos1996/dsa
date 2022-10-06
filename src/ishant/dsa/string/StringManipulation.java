package ishant.dsa.string;

public class StringManipulation {

    public boolean isEqualIgnoreCase (String s1,String s2){
        String data1=s1.toLowerCase().trim();
        String data2=s2.toLowerCase().trim();
        return data1.equals(data2);
    }
}

