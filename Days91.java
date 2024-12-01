
package DaysOfCoding;
import java.util.Scanner;
public class Days91 {
    public static void main(String[] args) {
            Scanner a = new Scanner(System.in);
            System.out.println("Masukkan nilai : ");
            int n = a.nextInt();
            while(true){
                if(n%2==1){
                    System.out.println("You and I,End!");
                    break;
                }
                System.out.println("Genap");
                System.out.println("Masukkan nilai : ");
                n=a.nextInt();
            }
    }
}
