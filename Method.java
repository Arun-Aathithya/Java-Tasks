public class Method {
    static void display(){
        System.out.println("This is Static Method");
    }
    void show(){
        System.out.println("This is Instance Method");
    }
    public static void main(String[] args){
        display();
        Method obj=new Method();
        obj.show();

    }
}
