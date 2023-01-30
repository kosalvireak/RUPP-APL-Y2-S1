import Class_Object.Author;
import mainclass.Dog;
import Class_Object.Author.*;

public class MainClass {
    public static void main(String[] args){
        Dog dogobj1 = new Dog();
//        dogobj1.Run();
        Author author2 = new Author("david", "chea");
        String lastName = author2.lastName;
        System.out.println(lastName);
    }
}
