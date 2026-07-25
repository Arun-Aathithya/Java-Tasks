class Animal{
    void Sound(){
        System.out.println("Animal Makes Sound");
    }
}
class Dog1 extends Animal{
    void bark(){
        System.out.println("Dog Barks");
    }
}
public class Oop_concept{
    public static void main(String[] args){
        Dog1 d =new Dog1();
        d.Sound();
        d.bark();
    }
}