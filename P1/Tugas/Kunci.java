package Tugas;
public class Kunci{
    private String tipe;
    private String warna;

    public String setWarna(String inputWarna){
        warna = inputWarna;
        return warna;
    }
    public String setTipe(String inputTipe){
        tipe = inputTipe;
        return warna;
    }
    public void printInfo(){
        
        System.out.println("Tipe" + tipe);
        System.out.println("Warna" + warna);
    }
    


    
}