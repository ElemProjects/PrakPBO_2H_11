package PrakPBO_2H_11.P2.Tugas.Peminjaman;

public class Peminjaman {
    public int id;
    public String namaMember;
    public String namaGame;
    public int hargaBarang;
    private int hargaSewa;
    public int lamaSewa;

    public void tampilHasil(){
        System.out.println("Total harga yang harus dibayar: " + hargaSewa);
        System.out.println("Harga sewa satuan barang: " +hargaBarang);
        System.out.println("id barang: " + id);
        System.out.println("nama game: " +namaGame);
        System.out.println("nama member: " + namaMember);
        System.out.println("lama sewa dalam hari: " + lamaSewa);
    }

    public int hitungHargaSewa(){
        hargaSewa = hargaBarang * lamaSewa;
        return hargaSewa;

    }


}
