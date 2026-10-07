package PrakPBO_2H_11.P6.Exercise_1;

public class TelevisiModern extends Televisi{
    private String displayMode;
    private String dvd;

    TelevisiModern(String mrk, int channelCount){
        merk=mrk;
        jumlahChannel=channelCount;
    }

    public void changeDisplayMode(String mode){
        displayMode=mode;

    }

    public void playDVD(){
    
        if (dvd==null) {
            System.out.println("Sedang memainkan: kosong");
        }else{
            System.out.println("Sedang memainkan: " + dvd);
        }

        
        
    }

    public  void insertDVD(String dvdTitle){
        dvd=dvdTitle;
    }
}
