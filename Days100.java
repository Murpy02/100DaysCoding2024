
package DaysOfCoding;
import java.time.LocalTime;
import java.util.Scanner;
public class Days100 {
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        System.out.println("Masukkan nama anda : ");
        String nama=a.nextLine();
        
        LocalTime sekarang=LocalTime.now();
        String salam="";    
        
        if(sekarang.isBefore(LocalTime.NOON)){
            salam="Selamat Pagi";
        }else if(sekarang.isBefore(LocalTime.of(17,0))){
            salam="Selamat Siang";
        }else{
            salam = "Selamat Malam";
        }
        System.out.println("================================");
        System.out.println("    "+ salam + ", " + nama );
        System.out.println("   Program Anda Telah Selesai");
         System.out.println("================================");
    }
}
