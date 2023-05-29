import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Text_To_File {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write something: ");
        String content = scanner.nextLine();
        try{
            File file = new File("javafile.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            fw.write(content);
            fw.flush();
            fw.close();
        } catch (IOException e) {
            System.out.println("An error occurred"); e.printStackTrace();
        }
    }
}