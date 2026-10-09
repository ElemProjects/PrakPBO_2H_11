package PrakPBO_2H_11.P7.Exercise2;

public class Perkalianku {
    
    void perkalian(int a, int b) {
        System.out.println(a * b);
    }

    
    void perkalian(double a, double b) {
        System.out.println(a * b);
    }

    public static void main(String[] args) {
        Perkalianku objek = new Perkalianku();

        // Memanggil metode dengan parameter int
        objek.perkalian(25, 43);
        
        // Memanggil metode dengan parameter double
        objek.perkalian(34.56, 23.7);
    }
}
