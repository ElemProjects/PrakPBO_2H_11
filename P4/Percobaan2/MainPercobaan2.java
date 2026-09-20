package PrakPBO_2H_11.P4.Percobaan2;

public class MainPercobaan2 {
    public static void main(String[] args) {
        Mobil m = new Mobil();
        m.setMerk("Avanza");
        m.SetBiaya(350000);

        Sopir s = new Sopir();
        s.setNama("John DOe");
        s.setBiaya(200000);

        Pelanggan p = new Pelanggan();
        p.setNama("Jane DOe");
        p.setMobil(m);
        p.setSopir(s);
        p.setHari(2);

        System.out.println("biyaya total " + p.hitungBiayaTotal());

        System.out.println(p.getMobil().getMerk());
    }
}
