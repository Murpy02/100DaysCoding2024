
package DaysOfCoding; 

import java.util.Scanner;
public class Days99 {
    public static void main(String[] args) {
        Scanner  a = new Scanner(System.in);
        System.out.println("Masukkan angka pertama : ");
        double angka1 =a.nextDouble();
        System.out.println("masukkan angka kedua : ");
        double angka2 =a.nextDouble();
        System.out.println("Pilih Operasi : ");
        System.out.println("1. Penjumlahan  ");
        System.out.println("2. Pengurangan  ");
        System.out.println("3. Perkalian ");
        System.out.println("4. Pembagian");
        
        System.out.print("Pilihan : ");
      int pilihan =a.nextInt();
      
       double hasil = 0;
        
        
        switch (pilihan) {
            case 1:
                hasil = angka1 + angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case 2:
                hasil = angka1 - angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case 3:
                hasil = angka1 * angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case 4:
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                    System.out.println("Hasil: " + hasil);
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}
    
