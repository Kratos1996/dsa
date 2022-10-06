package ishant.dsa.string.pattern;

public class Pattern {
    public static void main(String[] args) {
       /*  String data="ABCDE";
         for(int i=0;i<data.length();i++){
             System.out.println(data.substring(i));
         }
*/
       long ms=0, msFinal=0;
       ms=System.currentTimeMillis();
        int k = 0 ,temp=0;
        for (int i = 0; i < 26; i++) {
            k++;
            temp=k;
            for (int j = 0; j < 26; j++) {
                if (j >= i) {
                    System.out.printf("%c",k+64);
                    k++;
                }
            }
            System.out.printf("\n");
            k=temp;
        }
        msFinal=System.currentTimeMillis();
        System.out.println((msFinal-ms));
    }

}
