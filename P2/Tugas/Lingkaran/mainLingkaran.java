package PrakPBO_2H_11.P2.Tugas.Lingkaran;

public class mainLingkaran {
    public static void main(String[] args) {
        Lingkaran lingkaran1 = new Lingkaran();

        lingkaran1.phi = 3.14;
        lingkaran1.r = 2;

        double hasilLuas =  lingkaran1.hitungLuas();
        double hasilKeliling = lingkaran1.hitungKeliling();

        System.out.println("Hasil luas " +hasilLuas);
        System.out.println("Hasil keliling " + hasilKeliling);
    }
}
