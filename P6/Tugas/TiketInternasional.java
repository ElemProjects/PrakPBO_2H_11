package PrakPBO_2H_11.P6.Tugas;

public class TiketInternasional extends TiketPesawat{
    protected String nomorPaspor;
    protected int asuransi;

    public TiketInternasional(){

    }
    public TiketInternasional(String kodeTiket, String namaPenumpang, String asal,String tujuan, int hargaDasar, String maskapai, int beratBagasi, String nomorPaspor, int asuransi){
        super(kodeTiket, namaPenumpang, asal, tujuan,hargaDasar, maskapai, beratBagasi);
        this.nomorPaspor=nomorPaspor;
        this.asuransi=asuransi;
    }
    public void tampilInternasional(){
        super.tampilPesawat();
        System.out.println("Nomor Paspor\t= " + nomorPaspor );
        System.out.println("Asuransi\t= " + asuransi );
        System.out.println("Total Bayar\t= " + (getHargaDasar()+hitungBiayaBagasi()+asuransi));
    }
}
