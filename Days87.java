
package DaysOfCoding;


public class Days87 {
    public static void main(String[] args) {
        int[] array = { 10,20,30,40,50 };
        
        System.out.println(" Array sebelum diubah : ");
        for(int i = 0 ; i < array.length;i++ ){
            System.out.println("Elemen ke "+ i+" : " + array[i]);
        }
        System.out.println("  ");
        array [0]= 1;
        array [1]= 2;
        array [2]= 3;
        array [3]= 4;
        array [4]= 5;
        
        System.out.println(" Array Setelah diubah : ");
        for(int i = 0; i < array.length;i++){
            System.out.println("Elemen ke "+i+ " : " + array[i]);
        }
    }
}
