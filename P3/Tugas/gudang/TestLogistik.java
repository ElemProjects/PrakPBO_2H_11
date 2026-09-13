package PrakPBO_2H_11.P3.Tugas.gudang;
import java.util.Scanner;

public class TestLogistik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        kontainer kontainer = new kontainer("REQ-9988", "PT. Maju Bersama", 5000);

        System.out.println("Nama Pemilik Kontainer: " + kontainer.getNamaPemilik());
        System.out.println("Kapasitas Maksimal: " + kontainer.getKapasitasMaksimal() + " kg\n");

        System.out.println("Tambahkan Jumlah Muatan: ");
        int masukMuatan = scanner.nextInt();
        kontainer.tambahMuatan(masukMuatan);

        System.out.println("Masukkan turun muatan: ");
        int turunMuatan = scanner.nextInt();
        kontainer.turunkanMuatan(turunMuatan);

        System.out.println("Muatan saat ini " + kontainer.getBeratMuatanSaatIni());


        // System.out.println("Tambah berat 2000");
        // kontainer.tambahMuatan(2000);
        // System.out.println(kontainer.getBeratMuatanSaatIni());
        // System.out.println();

        // System.out.println("Turunkan 1001 (lebih dari 50%)");
        // kontainer.turunkanMuatan(1001);
        // System.out.println(kontainer.getBeratMuatanSaatIni());
        
        // kontainer.turunkanMuatan(1000);
        // kontainer.getBeratMuatanSaatIni();
        

        // System.out.println("\nMemasukkan muatan baru seberat 6.000 kg...");
        // kontainer.tambahMuatan(6000);
        // System.out.println("Berat muatan saat ini: " + kontainer.getBeratMuatanSaatIni() + " kg");

        // System.out.println("\nMemasukkan muatan baru seberat 4.000 kg...");
        // kontainer.tambahMuatan(4000);
        // System.out.println("Berat muatan saat ini: " + kontainer.getBeratMuatanSaatIni() + " kg");


        // System.out.println("\nMembongkar muat/menurunkan barang seberat 500 kg...");
        // kontainer.turunkanMuatan(500);
        // System.out.println("Berat muatan saat ini: " + kontainer.getBeratMuatanSaatIni() + " kg");

        // System.out.println("\nMembongkar muat/menurunkan barang seberat 1.500 kg...");
        // kontainer.turunkanMuatan(1500);
        // System.out.println("Berat muatan saat ini: " + kontainer.getBeratMuatanSaatIni() + " kg");
    }
}
