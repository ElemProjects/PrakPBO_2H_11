package PrakPBO_2H_11.P4.Percobaan4;

public class MainPercobaan4 {
    public static void main(String[] args) {
        // Penumpang p = new Penumpang("12345", "Mr. Krab");
        // Gerbong gerbong = new Gerbong("A", 10);
        // gerbong.setPenumpang(p, 1);
        // // System.out.println(gerbong.info());


        // Penumpang budi = new Penumpang("111", "Budi");
        // gerbong.setPenumpang(budi, 1);
        // System.out.println(gerbong.info());

        Penumpang p = new Penumpang("1234", "Mr. Krab");
Penumpang budi = new Penumpang("111", "Budi");

Gerbong gerbong = new Gerbong("A", 10);

gerbong.setPenumpang(p, 1);
gerbong.setPenumpang(budi, 1);

System.out.println(gerbong.info());

        

    }

}
