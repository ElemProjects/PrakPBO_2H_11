package PrakPBO_2H_11.P6.Percobaan_6;

public class Staff extends Karyawan {
    public int lembur, potongan;

    public Staff(){

    }
    public Staff(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan){
        super(nama, alamat, jk, umur, gaji);
        this.lembur=lembur;
        this.potongan=potongan;

    }
    public void tampilDataStaff(){
        super.tampilDataKaryawan();
        System.out.println("LEMBUR\t=" +lembur);
        System.out.println("POTONGAN\t=" +potongan);
        System.out.println("Total gaji\t=" +(gaji+lembur-potongan));
    }
    
}
