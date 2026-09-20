package PrakPBO_2H_11.P4.Tugas;

public class mainTugas {
    public static void main(String[] args) {
    bateraiKipas baterai1 = new bateraiKipas(12);
    kipasAngin kipas1 = new kipasAngin("Cosmos", 5, 9, baterai1);
    remote remote1 = new remote();

    remote1.nyalakan(kipas1);
    kipas1.tampilkanStatus();

    remote1.matikan(kipas1);
    kipas1.tampilkanStatus();
    
    bateraiKipas baterai2 = new bateraiKipas(0);
    kipasAngin kipas2 = new kipasAngin("Nano", 10, 10, baterai2);
    remote remote2 = new remote();

    remote2.nyalakan(kipas2);
    kipas2.tampilkanStatus();
    
        
    }
    

    
}
