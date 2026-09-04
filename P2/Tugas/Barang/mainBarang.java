package PrakPBO_2H_11.P2.Tugas.Barang;

public class mainBarang {
    public static void main(String[] args) {
        Barang barang1 = new Barang();
        barang1.diskon = 0.2f;
        barang1.hargaDasar = 5000;
        barang1.kode = "10";
        barang1.namaBarang = "Ikan";

        barang1.hitungHargaJual();
        barang1.tampilData();
    }
}
