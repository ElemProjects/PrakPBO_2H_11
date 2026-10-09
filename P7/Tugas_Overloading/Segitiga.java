 package PrakPBO_2H_11.P7.Tugas_Overloading;

 public class Segitiga {

    
 
    private int sudut;
    
    public int totalSudut(int sudutA){
        return sudut= 180-sudutA;
    }
    public int totalSudut(int sudutA, int sudutB){
        return sudut= 180-(sudutA+sudutB);
    }
    public int keliling(int sisiA, int sisiB, int sisiC){
        return sudut= sisiA+sisiB+sisiC;
    }
    public double keliling(int sisiA, int sisiB){
        return  Math.sqrt(Math.pow(sisiA, 2)) + Math.sqrt(Math.pow(sisiB, 2));
    }

    public static void main(String[] args) {
        
        Segitiga t = new Segitiga();

        
        System.out.println("Total sudut (1 sudut diketahui): " + t.totalSudut(60));
        System.out.println("Total sudut (2 sudut diketahui):   " + t.totalSudut(60, 50));

        
        System.out.println("Keliling (3 sisi diketahui): " + t.keliling(3, 4, 5));
        System.out.println("Keliling hypotenuse (2 sisi diketahui):  " + t.keliling(3, 4));
    }
 }