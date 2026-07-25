class Student1{
        String name;
        int age;
        void display() {
            System.out.println("Name:"+name);
            System.out.println("Age:"+age);
}
}
public class Multiple_obj{
            public static void main(String[] args){
                Student1 s1=new Student1();
                s1.name="Anbu";
                s1.age=19;
                Student1 s2=new Student1();
                s2.name="Arivu";
                s2.age=18;
                s1.display();
                s2.display();
            }
}
