/*7. Write a Java program to test if an array list is empty or not.
* */
package Homework_week5_java;

import java.util.ArrayList;

public class Programme7
{
    public static void main(String[] args)
    {
        //ArrayList of String Type
        ArrayList<String> arr = new ArrayList();

        //Checking whether the list is empty
        System.out.println("Is ArrayList Empty: " + arr.isEmpty());

        //Adding String elements
        arr.add("Java");
        arr.add("Python");
        arr.add("C++");
        arr.add("PHP");

        //Again check for isEmpty
        System.out.println("Is Array Empty: " + arr.isEmpty());

    }
}
