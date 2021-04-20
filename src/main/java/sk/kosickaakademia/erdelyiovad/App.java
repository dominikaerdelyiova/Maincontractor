package sk.kosickaakademia.erdelyiovad;

import sk.kosickaakademia.erdelyiovad.collection.Duty;
import sk.kosickaakademia.erdelyiovad.mongodb.MongoImpl;

import java.util.Date;
import java.util.List;

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
    Duty duty = new Duty("umyt riad", 2, false, new Date(),10.11);
    MongoImpl mongo = new MongoImpl();
    mongo.insertDuty(duty);


    private static void printAllTasksByPriority(){
        MongoImpl mongo = new MongoImpl();
        List<Duty> list = mongo.getAllDuties(2);
        for(Duty d: list){
            System.out.println(d.toString());

        }

            private static void printAllDuties(){
                MongoImpl mongo = new MongoImpl();
                List<Duty> list = mongo.getAllDuties(false);
                for(Duty d: list) {
                    System.out.println(d.toString());


                }

        }


    }

}

