package Tugas;

public class tugasDemo {
    public static void main(String[] args) {

        Elektronik baterai1 = new Elektronik();
        Lampu lampu1  = new Lampu();
        Monitor monitor1 = new Monitor();
        Kunci kunci1 = new Kunci();
        Penggaris penggaris1 = new Penggaris();

        baterai1.setAmpere(4);
        baterai1.setVolt(12);
        baterai1.printInfo();

        lampu1.setAmpere(5);
        lampu1.setVolt(9);
        lampu1.setSuhu(5500);
        lampu1.setCahaya(12000);
        lampu1.printInfo();

        monitor1.setAmpere(3);
        monitor1.setVolt(10);
        monitor1.setPixel(1080);
        monitor1.setBrand("Sony");
        monitor1.printInfo();


        
    }
    
}
