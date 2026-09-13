package PrakPBO_2H_11.P3.Tugas.encap;

public class encapTest {
    public static void main(String[] args) {
        encapDemo encap = new encapDemo();

        encap.setName("James");
        encap.setAge(25);
        System.out.println("Name : " + encap.getName());
        System.out.println("Age : " + encap.getAge());

    }
}
