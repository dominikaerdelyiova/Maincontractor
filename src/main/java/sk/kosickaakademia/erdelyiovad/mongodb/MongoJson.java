package sk.kosickaakademia.erdelyiovad.mongodb;

import sk.kosickaakademia.erdelyiovad.collection.Duty;

import java.util.List;

public interface MongoJson {
    public void insertDutyJSON(JSONObject duty);

    public JSONObject getAllDutiesJSON();
}
