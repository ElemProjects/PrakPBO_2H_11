package PrakPBO_2H_11.P6.Exercise_1;

public class Televisi {
    public String merk;
    public int jumlahChannel;
    private int channelAktif=1;

    public Televisi(){

    }

    public void switchChannel(int newChannel){
        channelAktif=newChannel;
    }

    public int getActiveChannel(){
        return channelAktif;
    }
}
