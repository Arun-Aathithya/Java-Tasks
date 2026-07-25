public class Break_2 {
    public  static void main(String[] args) {
        int i=2;
        while(i<=50){
            if(i%2==0)
            {
                System.out.println(i);
            }
            if(i==24){
                break;
            }
            i++;
        }
    }
}
