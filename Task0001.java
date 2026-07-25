class Stud2{
    String name;
    long roll;
    void display(){
        System.out.println("NAME:"+name);
        System.out.println("Roll no:"+roll);
    }
    public class Task0001{
    public static void main(String[] args){
        Stud2 s1=new Stud2();
        s1.name="Bharani";
        s1.roll=410624104015L;
        Stud2 s2=new Stud2();
        s2.name="Mubeen";
        s2.roll=410624104061L;
        s1.display();
        s2.display();
    }
    }
}