/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaysOfCoding;

import java.util.Scanner;

public class Days90 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Masukkan bilangan genap : ");
        int n = a.nextInt();
        int hasil = 1;
        if (n % 2 == 0 && n > 0) {
            for (int i = 1; i <= n; i++) {
                hasil *= i;
                System.out.print(i);

                if (i < n) {
                    System.out.print(" X ");
                }
            }
            System.out.println(" = " + hasil);
        } else {
            System.out.println("masukkan bilangan positif");
        }
    }
}
