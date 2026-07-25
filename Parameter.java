class Employee{
    int id;
    String name;
    Employee(int id,String name){
        this.id=id;
        this.name=name;
    }
    void display(){
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
    }
}
public class Parameter{
    public static void main(String[] args){
        Employee e1=new Employee(101,"Arun");
        e1.display();
    }
}