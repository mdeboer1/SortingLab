/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import common.Song;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mdeboer1
 */
public class CompareByComposerName {

    public List compare(List list) {
        ArrayList<Song> tempArray = new ArrayList<>(list);
        for (int i = 0; i < tempArray.size(); i++){
            for (int j = 0; j < tempArray.size()-i-1; j++){
                if ((tempArray.get(j)).getComposer().compareToIgnoreCase(tempArray.get(j+1)
                .getComposer()) > 0){
                    Song temp = tempArray.get(j);
                    tempArray.set(j, tempArray.get(j+1));
                    tempArray.set(j+1, temp);
                }
            }
        }
        List<Song> sortedList = new ArrayList<>(tempArray);
        return  sortedList;
    }
}
