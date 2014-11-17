/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import common.Song;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author mdeboer1
 */
public class SortingLab4 {
    public static void main(String[] args) {
        Song song1 = new Song("46 in 2", "Tool", "Tool", "8:00:00");
        Song song2 = new Song("Jingle Bells", "Bing Crosby", "Unknown", "5:00:00");
        Song song3 = new Song("Another Song", "A singer", "A singer", "4:00:00");
        Song song4 = new Song("A new Song", "B singer", "b singer", "6:00:00");
        
        Set<Song> set = new TreeSet<>();
        set.add(song1);
        set.add(song2);
        set.add(song3);
        set.add(song4);
        
        for (Song s : set){
            System.out.println(s);
        }
    }
}
