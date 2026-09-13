package PrakPBO_2H_11.P3.Tugas.bioskop;

public class tiket {
    private String judulFilm;
    private double hargaDasar;
    private boolean statusPembayaran = false;

    tiket(String judulFIlm, double inputhargaDasar){
        this.judulFilm = judulFIlm;
        if (inputhargaDasar<0) {
            hargaDasar = 35000;
        }else{
            hargaDasar=inputhargaDasar;
        }
        
    }

    public String getJudulFilm(){
        return this.judulFilm;
    }

    public double getHargaDasar(){
        return this.hargaDasar;
    }

    public boolean lakukanPembayaran(){
        return statusPembayaran = true;
    }

    public boolean isStatusPembayaran(){
        return this.statusPembayaran;
    }
}
