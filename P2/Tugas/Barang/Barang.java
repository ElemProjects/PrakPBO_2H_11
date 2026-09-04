package PrakPBO_2H_11.P2.Tugas.Barang;

public class Barang {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;

    public int hitungHargaJual(){
         
        return (int) (hargaDasar-(diskon*hargaDasar));

    }
    public void tampilData(){
        System.out.println("Kode barang " + kode);
        System.out.println("nama Barang " + namaBarang);
        System.out.println("harga dasar " + hargaDasar);
        System.out.println("diskon " + diskon);
        System.out.println("harga jual " + hitungHargaJual());
    }
}
