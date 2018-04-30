package Faculty;

import java.util.LinkedHashMap;
import java.util.Map;

public class Class {
    private LinkedHashMap<String,Integer> reservedSlots; //time slots are 3 hours/slot by default
    private String name;


    public Class(String name){
        this.name=name;
        reservedSlots=new LinkedHashMap<>();
    }

    public static String reserve(String day,int time){
        //you can reserve a class every 3 hours only;starting from 8AM to 8PM
        system.initializeRooms();
        for(int i=0;i<system.classes.size();i++) {
            if (system.classes.get(i).isEmpty(day, time)) {
                system.classes.get(i).reservedSlots.put(day, time);
                return system.classes.get(i).name;
            }
        }
        return null;
    }

    public boolean isEmpty(String day,int time){
        for(Map.Entry m:this.reservedSlots.entrySet()){
            if(m.getKey().equals(day)&&(int)m.getValue()==time)
                return false;
        }
        return true;
    }
}
