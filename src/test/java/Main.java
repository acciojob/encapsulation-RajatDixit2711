public class Main {
    public static void main(String[] args) {
        RWOnly a = new  RWOnly();
       // a.name= "Rajat"; not possible beacuse it is private
     //   System.out.print(a.name);not possible beacuse it is private



      a.setName( "rajat");
      a.getName();

    }
}
