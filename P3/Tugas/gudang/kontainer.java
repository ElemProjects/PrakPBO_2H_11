package PrakPBO_2H_11.P3.Tugas.gudang;

public class kontainer {
    private String nomorResi;
    private String namaPemilik;
    private float kapasitasMaksimal;
    private float beratMuatanSaatIni;

    public kontainer(String inputResi, String inputPemilik, int inputMaksimal) {
        nomorResi = inputResi;
        namaPemilik = inputPemilik;
        kapasitasMaksimal = inputMaksimal;
    }

    public String getNamaPemilik() {
        return namaPemilik;

    }

    public float getKapasitasMaksimal() {
        return kapasitasMaksimal;
    }

    public float getBeratMuatanSaatIni() {
        return beratMuatanSaatIni;
    }

    public void tambahMuatan(int tambahMuatan) {
        if (tambahMuatan + beratMuatanSaatIni <= kapasitasMaksimal) {
            beratMuatanSaatIni += tambahMuatan;
        } else {
            System.out.println("Muatan terlalu anyak, kapasitas tidak cukup.");
        }
    }

    public void turunkanMuatan(int kurangMuatan) {
        if (kurangMuatan>beratMuatanSaatIni) {
            System.out.println("Yang dikurangi tidak boleh lebih dari bereat saat ini");
        } 
        else if (kurangMuatan>(0.5*beratMuatanSaatIni)) {
            System.out.println("maaf demi keselamatan pembongkaran muatan satu kali jalan  tidak boleh melebih 50% dari muatan saat ini");
        }
        else{
            beratMuatanSaatIni= beratMuatanSaatIni-kurangMuatan;
        }
    
        

    }

}
