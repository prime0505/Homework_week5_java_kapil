/*
* Create a HashMap object called people that will store String keys and Integer values:
* And use for each loop to iterate the value from Map. */
package Homework_week5_java;

import java.util.HashMap;

import java.util.Map;

public class Programme9
{
    public static void main(String[] args) {
        useMap();
    }
    public static void useMap()
    {
        HashMap<Integer,String> people = new HashMap<>();
        people.put(01,"First person");
        people.put(02,"Second person");
        people.put(03,"Third person");
        people.put(04,"Fourth person");
        people.put(05,"Fifth person");

        for (Map.Entry<Integer,String> person : people.entrySet())
        {
            System.out.println(person);
        }
    }
}
