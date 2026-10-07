package PrakPBO_2H_11.P6.Contoh_4;

public class Rekening {
    protected int Saldo;

    public int getSaldo(){
        return Saldo;
    }

    public void simpanUang(int jumlah){
        Saldo=Saldo+jumlah;
    }

    public void ambilUang(int jumlah){
        Saldo = Saldo-jumlah;
    }
}
