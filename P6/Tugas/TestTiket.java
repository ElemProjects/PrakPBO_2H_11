package PrakPBO_2H_11.P6.Tugas;

public class TestTiket {
    public static void main(String[] args) {
        System.out.println("TIKET KERETA");
        TiketKereta kereta = new TiketKereta();
        kereta.kodeTiket="KA-001";
        kereta.namaPenumpang="Andi";
        kereta.asal="Malang";
        kereta.tujuan="Jakarta";
        kereta.setHargaDasar(350000);
        kereta.nomorGerbong=3;
        kereta.nomorKursi="12A";
        kereta.tampilKereta();

        System.out.println("TIKET PESAWAT DOMESTK");
        TiketDomestik domestik = new TiketDomestik("GA-102", "Sinta", "Surabaya", "Denpasar", 900000, "Garuda Indonesia", 25, 75000);
        domestik.tampilDomestik();

        System.out.println("TIKET PESAWAT INTERNASIONAL");

        TiketInternasional internasional = new TiketInternasional("SQ-205", "Budi", "Jakarta", "Singapura", 2500000,"Singapore Airline" , 20, "C1234567", 150000);
        internasional.tampilInternasional();
    }
}
