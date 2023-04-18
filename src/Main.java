import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("C:\\Users\\lango\\OneDrive\\Desktop\\da_file.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.print((char)data);
                data = reader.read();

            }
            reader.close();
        }catch(FileNotFoundException e) {

            e.printStackTrace();

        }catch(IOException e){
            e.printStackTrace();
        }
    }

}


    // FileReader = read the contents of a file as a stream of characters. read method returns an int containing
// byte value