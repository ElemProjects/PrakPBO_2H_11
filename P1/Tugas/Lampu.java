package Tugas;

public class Lampu extends Elektronik {
    private int suhuWarna;
    private int cerahCahaya;

    public int setSuhu(int inputSuhu){
        suhuWarna = inputSuhu;
        return suhuWarna;
    }
    public int setCahaya(int inputCahaya){
        cerahCahaya = inputCahaya;
        return cerahCahaya;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        
        System.out.println("suhu (Dalam Kelvin) : " + suhuWarna + "K");
        System.out.println("Kecerahan Cahaya: " + cerahCahaya + "lm");
    }
    


}
