package Tugas;

public class Elektronik {
    private int Volt;
    private int Ampere;

    public int setVolt(int inputVolt){
        Volt = inputVolt;
        return Volt;
    }
    public int setAmpere(int inputAmpere){
        Ampere = inputAmpere;
        return Ampere;
    }
    public void printInfo(){
        System.out.println("Volt : " + Volt);
        System.out.println("Ampere : " + Ampere);
    }
}
