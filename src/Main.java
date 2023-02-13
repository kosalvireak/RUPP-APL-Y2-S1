public class Main {
    static M2 m2 = new M2();
    static M1 m1 = new M1(18243,"At E2STEM");

    public static void main(String[] args) {
        System.out.println("This is M1 Students "+ m1.num_of_student);
//        m2.Dance(10);
        methodobj(m1);



    }
    public static void methodobj(M1 object){
        System.out.println("M1 object number of student:" +object.num_of_student+",  M1 object number of room:"+object.room);
    }
}
class Second_Main{
    public int secondId = 18243;
}
