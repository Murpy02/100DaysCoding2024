/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaysOfCoding;

/**
 *
 * @author Murpy
 */
public class Days66 {
    public static void main(String[] args) {
        System.out.println("PERSEGI");
        int n =5;//ukuran sisi persegi
        for(int i = 0 ; i < n;i++){
            for(int j = 0 ; j < n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println(" ");
        
        System.out.println("PERSEGI PANJANG");  
int panjang = 7;
int lebar = 4;
for( int i = 0; i< lebar;i++){
    for( int j =0; j<panjang;j++){
        System.out.print("* ");
    }
    System.out.println();
}
    }
}