
package DaysOfCoding;

import java.util.Scanner;
public class Days88 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int[]angka = {1,2,3,4,5,6,7,8,9,10};
        
        System.out.println("masukkan nilai yang ingin dicari : ");
        int n =a.nextInt();
        
        
        if(n==angka[0]){
            System.out.println("Nilai ditemukan!");
        }else if(n!=angka[0]){
            System.out.println("Nilai tidak ditemukan");
        }
            
        }
    }

