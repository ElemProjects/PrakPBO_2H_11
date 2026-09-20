package PrakPBO_2H_11.P4.Tugas;

public class kipasAngin {
    private String merk;
    private balingKipas baling;
    private dinamoKipas dinamo;
    private bateraiKipas baterai;
    private boolean status = false;

    public kipasAngin(String merk, int jumlahBaling, int torsi, bateraiKipas baterai) {
        this.merk = merk;
        this.baling = new balingKipas(jumlahBaling);
        this.dinamo = new dinamoKipas(torsi);
        this.baterai = baterai;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void tampilkanStatus() {
        System.out.println("Merk kipas: " + merk);

        if (baterai == null) {
            System.out.println("Baterai Tidak tersedia");
        } else {
            System.out.println("Voltase baterai: " + baterai.getVolt() + " V");
        }

        System.out.println("Jumlah baling: " + baling.getBaling());
        System.out.println("Torsi dinamo: " + dinamo.getTorsi() + " Nm");

        if (status) {
            System.out.println("Status: Kipas sedang menyala");
        } else {
            System.out.println("Status: Kipas sedang mati");
        }
    }

    public void nyalakan() {
        if (baterai == null) {
            System.out.println("Kipas tidak dapat menyala, baterai tidak tersedia");
            setStatus(false);
        } else if (baterai.getVolt() < 12) {
            System.out.println("Ukuran baterai kurang pas");
            setStatus(false);
        } else {
            setStatus(true);
            System.out.println("Kipas berhasil dinyalakan");
        }
    }

    public void matikan() {
        setStatus(false);
        System.out.println("Kipas berhasil dimatikan.");
    }
}
