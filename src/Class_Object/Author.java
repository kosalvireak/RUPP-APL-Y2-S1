package Class_Object;

public class Author {
    public String firstName;
    public String lastName;
    public Author(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getFirstName(){
//        System.out.println("The first name is: " + this.firstName);
        return "The first name is: " + this.firstName;
    }
    public String getLastName(){
//        System.out.println("The last name is: " + this.lastName);
        return "The last name is: " + this.lastName;
    }
    public String toString(){
        return "The name is of the author is : " + this.firstName +" "+ this.lastName;
    }

    public static void main(String[] arsgs) {
        Author author1 = new Author("Khoeun","Vireak");
        author1.setFirstName("Kosal");
        author1.setLastName("Vary");
        System.out.println(author1.getLastName());
        System.out.println(author1.getFirstName());
        System.out.println(author1.toString());


    }

}
