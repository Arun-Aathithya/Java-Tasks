public class New{
    public static void main(String[] args){
        int [][] marks={{90,80,75},{60,70,85},{95,88,91}};
        for(int i=0;i<marks.length;i++)
        {
            for(int j=0;j<marks.length;j++){
            System.out.println(marks[i][j]+"");
            }
            System.out.println("\n");
        }
    }
}