package src.com.set_1.go.classes;
/*
    Creating Immutable class in java
   1) Declare the class as final so it can’t be extended.
   2) Make all fields private so that direct access is not allowed.
   3) Don’t provide setter methods for variables.
   4) Make all mutable fields final so that its value can be assigned only once.
   5) Initialize all the fields via a constructor performing deep copy
   6) Perform cloning of objects in the getter methods to return a copy rather than returning the actual object
      reference.

*/

import java.util.HashMap;
import java.util.Map;

public final class Immutable {

    private final int id;
    private final String name;


    private Map<String,String> map;



    public Immutable(int id, String name,Map<String,String> map) {
        this.id = id;
        this.name = name;
//        this.map=map; //Shallow copy do not do this

        Map<String,String> tempMap=new HashMap<>();
        for (Map.Entry<String,String> entry:map.entrySet()) {
            tempMap.put(entry.getKey(),entry.getValue());
        }
        this.map=tempMap;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public Map<String, String> getMap() {
        return map;
    }



    public static void main(String[] args) {
        Map<String,String> testMap=new HashMap<>();
        testMap.put("a","b");
        testMap.put("c","d");
        int id=100;
        String s="Stuart";
        Immutable immutable=new Immutable(id,s,testMap);

        System.out.println(s==immutable.getName());
        System.out.println(testMap==immutable.getMap());

        id=20;
        s="broad";
        testMap.put("d","e");

        System.out.println(immutable.getId());
        System.out.println(immutable.getName());





    }

}
