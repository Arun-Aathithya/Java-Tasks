class Stude{
    private String name;
public void setName(String Name){
    this.name=name;
}
public String getName(){
    return name;
}
}
public class Encap_01{
    public static void main(String[] args){
        Stude s=new Stude();
        s.setName("Mercin");
        System.out.println(s.getName());
    }

}