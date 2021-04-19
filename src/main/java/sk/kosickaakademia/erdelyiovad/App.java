package sk.kosickaakademia.erdelyiovad;

import sk.kosickaakademia.erdelyiovad.collection.Duty;
import sk.kosickaakademia.erdelyiovad.mongodb.MongoImpl;

import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );





    }

    public static void testAddNewDuties(){
    Duty duty = new Duty("umyt riad", 2, false, new Date());
    MongoImpl mongo = new MongoImpl();
    mongo.insertDuty(duty);


}

}
