
package DaysOfCoding;


public class Days72 {
   public static int pengurangan (int n){
       if(n==0){
           return 1;
       }else{
           return n*pengurangan(n-1);
       }
   } 
    public static void main(String[] args) {
        int angka = 5;
        int hasil = pengurangan(angka);
        System.out.println("Faktorial dari " + angka + " adalah " + hasil);
    }
}
