package com.corejava;

import java.security.cert.PKIXRevocationChecker.Option;
import java.util.Optional;

/**
 * Hello world!
 *
 */
public class App
{
     public static void main(String[] args)
    {
App app=null;
// App app=new App();
Optional<App> optional= Optional.ofNullable(app);

if(optional.isPresent()){
    System.out.println("App is not null");
    App result=optional.get();
    System.out.println(result.hashCode());

}else{
    System.out.println("App is  null");
}

    }

}
