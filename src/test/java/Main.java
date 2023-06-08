import org.junit.platform.engine.support.descriptor.FileSystemSource;

import java.net.SocketOption;

public class Main {
    public static void main(String[] args) {
        RWOnly a = new RWOnly();
       // a.name= "Rajat"; not possible beacuse it is private
     //   System.out.print(a.name);not possible beacuse it is private

        //a.setId(100);
        a.setter("Rajat");
        System.out.print(a.getter());


    }
}
