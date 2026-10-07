package PrakPBO_2H_11.P6.Contoh_4;
public class TestDeposito {

    public static void main(String[] args) {
        Deposito dpt = new Deposito(1200000, 4);

        System.out.println("Saldo Awal: " + dpt.getSaldo());
        System.out.println("Nilai berupa deposito: " + dpt.getNilaiBunga());
        System.out.println("Total deposito: " + (dpt.getSaldo()+dpt.getNilaiBunga()));
    }
}