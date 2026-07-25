abstract class Aniimal {
    abstract void sound();
    void eat() {
        System.out.println("Animal is Eating");
    }}
    class Dog extends Aniimal{
        void sound(){
            System.out.println("Dog Bark");
        }
    }
public class Abst_class {
    public static void main(String[] args){
        Dog d=new Dog();
        d.sound();
        d.eat();
    }
}
