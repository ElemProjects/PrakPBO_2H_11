package PrakPBO_2H_11.P6.Percobaan_6;

public class Manager extends Karyawan {
    public int tunjangan;

    public Manager(){

    }
    public void tampilDataManager(){
        super.tampilDataKaryawan();
        System.out.println("Tunjangan\t="+ tunjangan);
        System.out.println("Total Gaji\t="+ (super.gaji+tunjangan));
    }
}
