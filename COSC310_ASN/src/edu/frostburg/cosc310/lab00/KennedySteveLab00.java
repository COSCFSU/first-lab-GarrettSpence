/*
 * Steve Kennedy
 * Sept x, 20xx
 * 
 * Please put your name, date, and brief description of this class here.
 */
package edu.frostburg.cosc310.lab00;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Your documentation should begin here.
 * @author SteveK
 */
public class KennedySteveLab00 implements Lab00 {

    /**
     * Makes a long string using Java concatenation.
     * @param size the # of times
     * @return how long it took
     */
    @Override
    public long problem0(int size) {
        System.out.println("This is just an example, but please follow this template.");
        String s = "";
        long start = System.currentTimeMillis();

        for (int i=0; i<size; i++) {
            s = s + i;
        }
        
        long end = System.currentTimeMillis();
        return end - start;
    }

    /**
     * Makes a long string using Java StringBuilder
     * @param size the # of times
     * @return how long it took
     */
    @Override
    public long problem1(int size) {
        StringBuilder sb = new StringBuilder();
        long start = System.currentTimeMillis();

        for (int i=0; i<size; i++) {
            sb.append(i);
        }
        
        long end = System.currentTimeMillis();
        return end - start;
    }

    @Override
    public long problem2(int size) {

        //initializes ArrayList and LinkedList
        List<String> thing = new ArrayList<>();
        LinkedList<String> thing2 = new LinkedList<>();

        //Times incrementation of an ArrayLists from 0 to 'size'
        long start = System.currentTimeMillis();
        for (int i=0; i<size; i++) {
            thing.add(Integer.toString(i));
        }
        long end = System.currentTimeMillis();
        long ArrayListTime = end - start;

        //Times incrementation of a LinkedList from 0 to 'size'
        start = System.currentTimeMillis();
        for (int i=0; i<size; i++) {
            thing2.add(Integer.toString(i));
        }
        end = System.currentTimeMillis();
        long LinkedListTime = end - start;

        //Output times and compare them
        System.out.println("ArrayList time: " + ArrayListTime + "\nLinkedList time: " + LinkedListTime);
        return end-start;
    }
    
}
