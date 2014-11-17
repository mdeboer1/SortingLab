/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import common.Song;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author mdeboer1
 */
public class SortingLab6 {
    public static void main(String[] args) {
        Song song1 = new Song("46 in 2", "Tool", "Tool", "8:00:00");
        Song song2 = new Song("Jingle Bells", "Bing Crosby", "Unknown", "5:00:00");
        Song song3 = new Song("Another Song", "A singer", "A singer", "4:00:00");
        Song song4 = new Song("A new Song", "B singer", "B singer", "6:00:00");
        
        List<Song> list = new ArrayList<>();
        list.add(song1);
        list.add(song2);
        list.add(song3);
        list.add(song4);
        
        for(Song s : list){
            System.out.println(s);
        }
        
        Collections.sort(list, new CompareByComposerName());
        
        for(Song s : list){
            System.out.println(s);
        }
//        CompareByComposerName compare = new CompareByComposerName();
//        
//        for (int i = 0; i < list.size() - 1; i++){
//            compare.compare(list.get(i), list.get(i+1));
//            System.out.println(list.get(i));
//        }
    }
}
