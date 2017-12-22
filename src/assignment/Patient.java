package assignment;
//2 propertires - name and condition - both strings
//constructor, toString
public class Patient {
    String name, condition;
    
    Patient(String c, String n){
        n=name;
        c=condition;
    }
    
    public String name(){
        return name;
    }
    
    public String condition(){
        return condition;
    }
    
    public String toString(){
        return "name: "+name+" \tCondition "+condition;
    }
}

