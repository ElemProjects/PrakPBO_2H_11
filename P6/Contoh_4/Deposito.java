package PrakPBO_2H_11.P6.Contoh_4;

public class Deposito extends Rekening{
    private double BungaPerBulan;
    private int Tenor;

    public Deposito(int saldoAwal, int masaTenor){
        Saldo=saldoAwal;
        Tenor=masaTenor;
        BungaPerBulan=0.05;
    }

    public double getNilaiBunga(){
        double nilaiBunga;

        nilaiBunga=Saldo*BungaPerBulan*Tenor/12;

        return nilaiBunga;
    }

    
}
