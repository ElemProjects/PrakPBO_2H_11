package PrakPBO_2H_11.P4.Percobaan6;

public class Laptop {
    private String merk;
    private Printer printer;

    public Laptop(String merk, Printer printer) {
        this.merk = merk;
        this.printer=printer;
    }

    public void cetakDokumen( String namaFile) {
        System.out.println(merk + " mengirim dokumen ke printer...");
        printer.cetak(namaFile);
    }

}
