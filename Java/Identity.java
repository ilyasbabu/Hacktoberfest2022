interface data{
    final int age = 20;
    void name();
}
class rawdata implements data{
    public void name(){
        System.out.println("My name is Vikash Jha");
    }
}
public class Identity extends rawdata {
   public static void main(String[] args) {
    rawdata r1 = new rawdata();
    r1.name();
   }
}
