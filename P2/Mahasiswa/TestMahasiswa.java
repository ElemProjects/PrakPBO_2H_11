package PrakPBO_2H_11.P2.Mahasiswa;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();
        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia NO 1A";
        mhs1.kelas = "1a";
        mhs1.tampilBiodata();
        mhs2.nim = 102;
        mhs2.nama = "Les";
        mhs2.alamat = "Turen";
        mhs2.kelas = "1C";
        mhs2.tampilBiodata();
        mhs3.nim = 103;
        mhs3.nama = "tari";
        mhs3.alamat = "Jatiasih";
        mhs3.kelas = "1D";
        mhs3.tampilBiodata();
    }
}
