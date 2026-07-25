import java.io.FileOutputStream;
import java.util.*;

public class Byte_frame{
    public static void main(String[] args){
        try{
            FileOutputStream fout=new FileOutputStream("Output.txt");
            String S="Welcome To Mubeen";
            byte [] b=S.getBytes();
            fout.write(b);
            fout.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}