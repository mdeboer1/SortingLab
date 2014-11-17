/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab3;

import common.Song;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author mdeboer1
 */
public class SortingLab3 {
    public static void main(String[] args) {

        Song song1 = new Song("46 in 2", "Tool", "Tool", "8:00:00");
        Song song2 = new Song("Jingle Bells", "Bing Crosby", "Unknown", "5:00:00");
        Song song3 = new Song("Another Song", "A singer", "A singer", "4:00:00");
        Song song4 = new Song("A new Song", "B singer", "b singer", "6:00:00");

        Map<String, Song> map2 = new TreeMap<>();
        map2.put("Tool", song1);
        map2.put("Bing Crosby", song2);
        map2.put("A singer", song3);
        map2.put("B singer", song4);

        Collection<String> values2 = map2.keySet();
        for (String s : values2){
            System.out.println(s);
        }
    }
}
