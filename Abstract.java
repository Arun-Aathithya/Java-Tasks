abstract class vehicle{
    abstract void start();
        void stop() {
            System.out.println("Vehicle Stopped");
        }
    }
class car extends vehicle{
    void start(){
        System.out.println("Car Started");
    }
}
public class Abstract {
    public static void main(String[] args){
        car c=new car();
        c.start();
        c.stop();
    }
}
