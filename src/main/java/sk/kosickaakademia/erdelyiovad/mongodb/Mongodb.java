package sk.kosickaakademia.erdelyiovad.mongodb;

import sk.kosickaakademia.erdelyiovad.collection.Duty;

import java.util.List;

public interface Mongodb {
/**
 * description
 * @param duty
 * @author Dominika
 * @version 1.0
 */


    public void insertDuty(Duty duty);

    public void setDutyToDone(int id);

    public List<Duty> getAllDuties();

    public List<Duty> getAllDuties(boolean done);

    public List<Duty> getAllDutiesByPriority();

    public List<Duty> getAllDutiesByName(String name);

    public void DeleteDoneDuties();








}
