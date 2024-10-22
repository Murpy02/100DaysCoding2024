
package DaysOfCoding;

import java.util.Scanner;
public class Days51 {
    public static void main(String[] args) {
        int hari;
        Scanner a =new Scanner (System.in);
        System.out.println("masukkan hari : ");
        hari = a.nextInt();
        
        switch(hari){
            case 1:
                System.out.println("SENIN");
                break;
            case 2:
                System.out.println("SELESA");
                break;
            case 3:
                System.out.println("RABU");
                break;
            case 4:
                System.out.println("KAMIS");
                break;
            case 5:
                System.out.println("JUMAT");
                break;
            case 6:
                System.out.println("SABTU");
                break;
            case 7:
                System.out.println("MINGGU");
                break;
            default:
                System.out.println("HARI TIDAK VALID");
        }
    }
}
