package sk.kosickaakademia.erdelyiovad.mongodb;


import sk.kosickaakademia.erdelyiovad.collection.Duty;

import java.util.List;

public class MongoImpl implements Mongodb {
    // dbname: myduties
    // collection: duties


    @Override
    public void insertDuty(Duty duty) {


    }

    @Override
    public void setDutyToDone(int id) {

    }

    @Override
    public List<Duty> getAllDuties() {
        return null;
    }

    @Override
    public List<Duty> getAllDuties(boolean done) {
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
