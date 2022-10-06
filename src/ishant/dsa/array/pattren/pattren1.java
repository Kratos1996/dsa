package ishant.dsa.array.pattren;

public class pattren1 {
    public static void main(String[] args) {
        char[]array={'A','B','C','D','E'};
        for(int i=0;i<array.length ; i++){
            for(int j = i;j<array.length;j++){
                System.out.print(array[j]);
            }
            System.out.println("\n");
        }
    }
}
