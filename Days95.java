
package DaysOfCoding;


public class Days95 {
    public static void main(String[] args) {
        int n =5;
        
          // Segitiga Siku-Siku
          System.out.println("Segitiga Siku-Siku: ");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
         // Segitiga Siku-Siku terbalik
         System.out.println(" ");
         System.out.println("Segitiga Siku-Siku Terbalik: ");
         for(int i =n ;i>=1;i--){
             for(int j=1;j<=i;j++){
                 System.out.print("*");
             }
             System.out.println();
         }
    }
}
