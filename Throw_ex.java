public class Throw_ex {
    public static void main(String[] args){
        int age=15;
        if(age<18){
            throw new ArithmeticException("Not Eligible");
        }
        System.out.println("Eligible");
    }
}
