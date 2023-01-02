public class Main {
    static M2 m2 = new M2();
    static M1 m1 = new M1();

    public static void main(String[] args) {
        System.out.println("This is M1 Students "+ m1.num_of_student);
        m2.Dance(10);
        System.out.println(m2.m1_room);

    }
}
