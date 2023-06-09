public class Main {
    public static void main(String[] args) {
        RWOnly a = new  RWOnly();


       // a.name= "Rajat"; not possible beacuse it is private
     //   System.out.print(a.name);not possible beacuse it is private


        try
        {
            a.name="rajat";
        }catch( Exception E){
            System.out.print(" you might seen some error, please not it down in commnets");
        }
        a.setName("rajat");

      a.getName();

    }
}
