package PrakPBO_2H_11.P6.Percobaan_2;

public class ClassB extends ClassA{
    protected  int z;

    public void setZ(int z){
        this.z=z;
    }

    public void getNilaiZ(){
        System.out.println("nilai Z: " +z);
    }

    public void getJumlah(){
        System.out.println("Jumlah: " + (x+y+z));
    }
}

