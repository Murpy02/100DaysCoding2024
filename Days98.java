
package DaysOfCoding;
import java.util.Scanner;

public class Days98 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        System.out.println("masukkann angka x : ");
        int x=a.nextInt();
        System.out.println("masukkann angka y : ");
        int y =a.nextInt();
        
        int total=0;
        int i=x;
        while(i <= y){
            if(i % 2 ==0 ){
                total += i;
            }
            i++;
        }
        System.out.println("Total penjumlahan bilangan genap dari " + x + " ke " + y + " adalah: " + total);
    }
}
