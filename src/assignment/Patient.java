package assignment;
//2 propertires - name and condition - both strings
//constructor, toString
public class Patient {
    String name, condition;
    
    Patient(String n, String c){
        name=n;
        condition=c;
        
    }
    
    public String name(){
        return name;
    }
   
    
    public String condition(){
        return condition;
    }
    
    public String toString(){
        return name;
    }
}

