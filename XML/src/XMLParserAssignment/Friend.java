package XMLParserAssignment;

import java.util.Arrays;

public class Friend {

    public Integer index;
    public Integer id;
    public String name;
    public Integer age;
    public String description;
    public String[] phonenumbers;

    public Friend( Integer index, Integer id, String name, Integer age, String description, String[] phonenumbers) {
        this.index=index;
        this.id = id;
        this.name = name;
        this.age = age;
        this.description = description;
        this.phonenumbers = phonenumbers;
    }

    @Override
    public String toString() {
        return "Friend index = " + index +
                "\n\tID =" + id +
                "\n\tName = " + name +
                "\n\tAge = " + age +
                "\n\tDescription= " + description +
                "\n\t" + (phonenumbers[0]) +
                "\n\t" + (phonenumbers[1]) + "\n";
    }
}
