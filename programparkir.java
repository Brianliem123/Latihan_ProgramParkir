import java.util.Scanner;

public class programparkir{
    public static void main(String[] args) {

        Scanner input_masuk = new Scanner(System.in);
        int tarif_Parkir = 0;
        int  total_jam;
        Double jumlah_bayar;
        double kembalian;

        System.out.println("WELCOME");  
        System.out.println("TO MY APPLICATION");  
        System.out.println();  
        System.out.println("Masukan No Polisi");  
        String No_Polisi = input_masuk.next();
        System.out.println("Masukan Jam Masuk");
        int Jam_Masuk = input_masuk.nextInt();
        System.out.println("Masukan Jam Keluar");
        int Jam_Keluar = input_masuk.nextInt();
        System.out.println();
        System.out.println("Kode Kendaraan");
        System.out.println();
        System.out.println("1.Mobil");
        System.out.println("1.Motor");
        System.out.println();
        System.out.println("Masukan Kode Kendaraan");
        System.out.println();
        int tipe = input_masuk.nextInt();

        // Total_Jam_Parkir = jam_keluar-jam_masuk;
        // Switch(tipe){








        