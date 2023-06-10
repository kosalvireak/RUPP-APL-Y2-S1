import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.lang.String;
class StringException extends Exception{
    public StringException(String message){
        super(message);
    }
}

public class Input_Only_Text {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String content = null;
            try {
                System.out.print("Write something: ");
                content = scanner.nextLine();
                if (!content.matches("[a-zA-Z]+")) {
                   throw new StringException("Error: \nInput must not contain number: ");
                }
            } catch  (StringException e){
                    System.out.println(e.getMessage());
                }
            try{
                File file = new File("ABC/only text.txt");
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

