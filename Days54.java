
package DaysOfCoding;


public class Days54 {
    public static void main(String[] args) {
        String[] hariDalamMinggu={ "Senin" , "Selasa" , "Rabu" , "Kamis" , "Jumat" , "Sabtu", "Minggu" };
        
        // Inisialisasi penghitung untuk Sabtu
        int penghitungSabtu=0;
        
         // Loop melalui array hari
         for ( String hari : hariDalamMinggu){
             if(hari.equals("Sabtu")){
                 penghitungSabtu++;
                 System.out.println("Increment pada " + hari + ", jumlah saat ini : " + penghitungSabtu);
             }
         }
    }
}
