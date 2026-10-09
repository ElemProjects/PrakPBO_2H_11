package PrakPBO_2H_11.P7.Exercise3;

public class Fish extends Ikan{
    public static void main(String[] args) {
        Ikan a = new Ikan();
        Ikan b = new Piranha();
        
        a.swim(); // Output: Ikan bisa berenang
        b.swim(); // Output: Piranha bisa makan daging
    }
}
