public class Finally_ex {
    public static void main(String[] args){
        try{
            System.out.println("Inside try");
        }
        catch(Exception e){
            System.out.println("Inside catch");
        }
        finally{
            System.out.println("Inside finally");
        }
    }
}
