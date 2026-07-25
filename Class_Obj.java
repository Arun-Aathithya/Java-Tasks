 class Student2 {
        String name = "Anbu";
        int age = 25;

        void display() {
            System.out.println("Name:" + name);
            System.out.println("Age:" + age);
        }
    }
    public class Class_Obj{
        public static void main(String[] args){
            Student2 s1=new Student2();
            s1.display();
        }
    }
