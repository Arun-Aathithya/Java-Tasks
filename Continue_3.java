public class Continue_3 {
    public  static void main(String[] args) {
        for(int i=1;i<=10;i++){
            for(int j=1;j<=i;j++)
            { if(j==2)continue;
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("NEXT SERIES");
        for(int k=1;k<=10;k++){
            for(int h=1;h<=k;h++){
                if(h==2) break;
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
