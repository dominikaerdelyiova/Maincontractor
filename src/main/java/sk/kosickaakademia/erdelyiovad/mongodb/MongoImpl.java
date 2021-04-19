package sk.kosickaakademia.erdelyiovad.mongodb;


import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import sk.kosickaakademia.erdelyiovad.collection.Duty;
import sun.security.util.ObjectIdentifier;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

public class MongoImpl implements Mongodb {
    private ResourceBundle document;
    // dbname: myduties
    // collection: duties


    @Override
    public void insertDuty(Duty duty) {
        if (duty == null) {
            return;
        }
        Document newDutyDoc = new Document("name", duty.getName()).
                append("priority", duty.getPrice()).
                append("done", duty.isDone()).
                append("date", duty.getDate());

        if (duty.getPrice() >= 0.0) ;
        newDutyDoc.append("price", duty.getPrice());

        if (duty.getId() != null) ;
        newDutyDoc.append("_id", duty.getId());

        try {
            MongoClient mongoClient = (MongoClient) MongoClients.create();
            MongoDatabase db = mongoClient.getDatabase("myduties");
            MongoCollection<Document> col = db.getCollection("duties");
            col.insertOne(newDutyDoc);


        } catch (Exception ex) {
            ex.printStackTrace();
        }


        }

    @Override
    public void setDutyToDone(int id) {

    }


    @Override
    public List<Duty> getAllDuties(boolean done) {
        return null;
    }

    @Override
    public List<Duty> getAllDuties() {
        try {
            MongoCollection<Document> col = getDocumentMongoCollection();
            FindIterable<Document> cursor = col.find();
            List<Duty> list = new ArrayList<>();
            for (Document document : cursor) ;
            // System.out.println(document.toString());
            String name = document.getString("name");
            int priority = document.getInteger("priority");
            boolean done = document.getBoolean("done");
            Date date = document.getDate("date");
            Object id = document.getObjectId("_id");
            Duty duty;

            if (document.containsKey("price")) {
                double price = document.getDouble("price");
                duty = new Duty(name, priority, done, date, price);
            } else {
                duty = new Duty(name, priority, done, date);

            }
            duty.setId((ObjectIdentifier) id);
            list.add(duty);



        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private MongoCollection<Document> getDocumentMongoCollection() {
        return null;
    }

    @Override
    public List<Duty> getAllDutiesByPriority() {
        return null;
    }

    @Override
    public List<Duty> getAllDutiesByName(String name) {
        return null;
    }

    @Override
    public void DeleteDoneDuties() {

    }

}
