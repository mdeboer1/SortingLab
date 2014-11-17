/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import common.Song;
import java.util.Comparator;

/**
 *
 * @author mdeboer1
 */
public class CompareByComposerName implements Comparator<Song>{

    @Override
    public int compare(Song s1, Song s2) {
        return s1.getComposer().compareTo(s2.getComposer());
    }
    
}
