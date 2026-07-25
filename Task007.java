public class Task007 {
    void area(int side){
        System.out.println("Area:"+side*side);
    }
    void area(int length,int breadth){
        System.out.println("Area:"+length*breadth);
    }
    public static void main(String[] args){
        Task007 obj=new Task007();
        obj.area(10);
        obj.area(10,20);
    }
}
