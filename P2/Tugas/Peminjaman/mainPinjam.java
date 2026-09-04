package PrakPBO_2H_11.P2.Tugas.Peminjaman;

public class mainPinjam {
    public static void main(String[] args) {
        Peminjaman pinjam1  = new Peminjaman();
        pinjam1.id = 1;
        pinjam1.hargaBarang=2000;
        pinjam1.lamaSewa=2;
        pinjam1.namaMember="Lembah";
        pinjam1.namaGame="Growtopia";
        
        pinjam1.hitungHargaSewa();
        pinjam1.tampilHasil();


        
    }
}
