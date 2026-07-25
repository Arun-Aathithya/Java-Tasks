import java.io.File;
public class File_handling {
    public static void main(String[] args){
        File f=new File("Student.txt");
        System.out.println("Exists"+f.exists());
        System.out.println("Name:"+f.getName());
        System.out.println("Path:"+f.getAbsolutePath());
    }
}
