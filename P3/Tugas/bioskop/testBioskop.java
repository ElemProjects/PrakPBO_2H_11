package PrakPBO_2H_11.P3.Tugas.bioskop;

public class testBioskop {
    public static void main(String[] args) {
        tiket tiket1 = new tiket("Avengers: Endgame", -50000);
        System.out.println("Film: " + tiket1.getJudulFilm());
        System.out.println("Harga Tiket: " + tiket1.getHargaDasar());
        System.out.println("Status Lunas? " + tiket1.isStatusPembayaran());

        System.out.println("\nMemproses pembayaran...");
        tiket1.lakukanPembayaran();
        System.out.println("Status Lunas Terbar? " + tiket1.isStatusPembayaran());
    }
}
