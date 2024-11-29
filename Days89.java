
package DaysOfCoding;

import java.util.Scanner;
public class Days89 {
    public static void main(String[] args) {
          Scanner a = new Scanner(System.in);
        while (true) {
            System.out.println("masukkan angka : ");
            String n = a.nextLine();
            if (n.equalsIgnoreCase("stop")) {
                System.out.println("program selesai.");
                break;

            }
            try {
                int angka = Integer.parseInt(n);
                if (angka >= 1 && angka <= 100) {
                    System.out.println("nilai tidak ditemukan");
                } else {
                    System.out.println("tidak ditemukan");
                }
            } catch (NumberFormatException e) {
                System.out.println("harap masukkan angka yang valid");
            }

        }
    }
}
    

