package models;


import java.util.ArrayList;

public class Squad {
    private String name;
    private String cause;
    private int maxSize;
    private static ArrayList<Squad>squads = new ArrayList<>();
    public Squad(String name, String cause, int maxSize) {
        this.name = name;
        this.cause = cause;
        this.maxSize = maxSize;
        squads.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public static ArrayList<Squad> getSquads() {
        return squads;
    }

}
