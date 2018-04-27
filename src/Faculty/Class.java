package Faculty;

import java.util.LinkedHashMap;
import java.util.Map;

public class Class {
    private LinkedHashMap<String,Integer> reservedSlots; //time slots are 3 hours/slot by default
    private String name;
    private int numberOfSeats;

    public Class(String name,int numberOfSeats){
        this.name=name;
        this.numberOfSeats=numberOfSeats;
        reservedSlots=new LinkedHashMap<>();
    }

    public void reserve(String day,int time,int numberOfStudents){
        //you can reserve a class every 3 hours only;starting from 8AM to 8PM
        if(this.isEmpty(day,time)&&numberOfStudents<=numberOfSeats) {
            this.reservedSlots.put(day, time);
        }
    }

    public boolean isEmpty(String day,int time){
        for(Map.Entry m:this.reservedSlots.entrySet()){
            if(m.getKey().equals(day)&&(int)m.getValue()==time)
                return false;
        }
        return true;
    }
}
