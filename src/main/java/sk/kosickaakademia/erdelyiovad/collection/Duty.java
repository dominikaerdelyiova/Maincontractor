package sk.kosickaakademia.erdelyiovad.collection;

import sun.security.util.ObjectIdentifier;

import java.util.Date;
import java.util.List;

public class Duty {

    private ObjectIdentifier id;
    private String name;
    private List priority;
    private boolean done;
    private Date date;
    private double price;


    public Duty(String name, List priority, boolean done, Date date) {
        this.name = name;
        this.priority = priority;
        this.done = done;
        this.date = date;
        this.price = -1;
        id = null;
    }

    public Duty(String name, List priority, boolean done, Date date, double price) {
        this(name, priority, done, date);
        this.price = price;

    }

    public Duty(String name, int priority, boolean done, Date date) {

    }

    public void setId(ObjectIdentifier id) {
        this.id = id;
    }

    public ObjectIdentifier getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List getPriority() {
        return priority;
    }

    public boolean isDone() {
        return done;
    }

    public Date getDate() {
        return date;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Duty: Id +"+id+"Name:"+name+"Priority"+priority+"Done:"+done+
                "Date:"+date+ (price>=0?("Price:"+price):"");
    }
}
