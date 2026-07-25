import java.io.FileWriter;
import java.io.IOException;

public class File_Write {
    public static void main(String[] args){
        try{
            FileWriter fw=new FileWriter("Student.txt");
            fw.write("Arjun");
            fw.write(101);
            fw.write("java");
            fw.close();
            System.out.println("Successfully wrote to the file");
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
