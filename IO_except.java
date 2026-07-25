import java.io.FileReader;
import java.io.IOException;

public class IO_except {
    static void readFile() throws IOException{
        FileReader fr=new FileReader("data.txt");
    }
    public static void main(String[] args){
        try{  readFile();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
