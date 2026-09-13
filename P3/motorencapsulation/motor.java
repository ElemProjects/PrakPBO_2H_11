package PrakPBO_2H_11.P3.motorencapsulation;

public class motor {
    private  int kecepatan = 0;
    private boolean kontakOn = false;

    public void nyalakanMesin(){
        kontakOn = true;
    }
    public void matikanMesin(){
        kontakOn=false;
        kecepatan=0;
    }
    public void tambahKecepatan(){
        if (kontakOn==true) {
            if (kecepatan<100) {
                kecepatan+=5;
                
            }else{
                System.out.println("Kecepatan max 100");
            }
            
        }
        else{
            System.out.println("Kecepatan tidak bisa bertambah. Karena mesin off\n");
        }
    }
    public void kurangiKecepatan(){
        if (kontakOn==true) {
            kecepatan-=5;
        }
        else{
            System.out.println("Kecepatan tidak bisa berkurang. Karena mesin off \n");
        }
    }
    public void printStatus(){
        if (kontakOn == true) {
            System.out.println("Kontak on");
        }
        else{
            System.out.println("Kontak off");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }

}
