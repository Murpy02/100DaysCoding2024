package DaysOfCoding;

public class Days78 {

    public static void main(String[] args) {
        String teks1 = " teknik ";
        String teks2 = " TEKNIK ";
        String teks3 = " TekNik ";

        System.out.println("teks1 sama dengan teks2 : " + teks1.equalsIgnoreCase(teks2));
        System.out.println("teks1 sama dengan teks3 : " + teks1.equalsIgnoreCase(teks3));
    }
}
