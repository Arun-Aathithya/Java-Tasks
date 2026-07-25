public class Arith_Except {
public static void main(String[] args){
    try{
        int []arr={1,2,3};
        System.out.println(arr[5]);
    }
    catch(ArithmeticException e){
        System.out.println("Arithmetic Error");
    }catch(ArrayIndexOutOfBoundsException a){
        System.out.println("Invalid index");
    }catch(Exception e){
        System.out.println("General Exception");
    }
}
}
