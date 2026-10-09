package PrakPBO_2H_11.P7.Tugas_Overriding;

public class Dosen extends Manusia{
    @Override 
    public void makan(){
        System.out.println("Dosen makan!");
    }

    public void lembur(){
        System.out.println("Dosen lembur!");
    }
}
