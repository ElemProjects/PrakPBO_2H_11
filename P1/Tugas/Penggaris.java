package Tugas;
public class Penggaris{
    private int panjang;
    private int lebar;

    public int setPanjang(int inputPanjang){
        panjang = inputPanjang;
        return panjang;

    }

    public int setLebar(int inputLebar){
        lebar = inputLebar;
        return lebar;

    }
    
    public void printInfo(){
        
        System.out.println("Panjang : " + panjang);
        System.out.println("Lebar: " + lebar);
    }
}