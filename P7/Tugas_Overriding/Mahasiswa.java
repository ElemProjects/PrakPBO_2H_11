package PrakPBO_2H_11.P7.Tugas_Overriding;

public class Mahasiswa extends Manusia {
    @Override 
    public void makan(){
        System.out.println("Mahasiswa makan!");
    }
    public void tidur(){
        System.out.println("Mahasiswa tidur");
    }
}
