package com.devtraining.mission2;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service

public class MusicStoreService {
    private static List<MusicStoreModel> musicStoreModelList = new ArrayList<>(Arrays.asList(
            new MusicStoreModel("02","Hello","Adele","25","2015"),
            new MusicStoreModel("03","Paradise", "Cold Play", "Mylo Xyloto","2014"),
            new MusicStoreModel("04","Rude", "Magic", "Don't Kill the Magic","2016")
    ));


// get all the list
public List<MusicStoreModel> getMusicStoreModelList() {return musicStoreModelList;}

// get by passing id
public MusicStoreModel getMusic(String id){return musicStoreModelList.stream().filter(music -> music.getId().equals(id)).findFirst().get();}

// add Music
public void addMusic(MusicStoreModel music){musicStoreModelList.add(music);}

// update Music
public void updateMusic(MusicStoreModel music, String id){
    int counter = 0;
    for (MusicStoreModel music1 : musicStoreModelList) {
        if (music1.getId().equals(id)) {musicStoreModelList.set(counter, music);}
    counter++;
    }
}
// delete Music
public void deleteMusic(String id){musicStoreModelList.removeIf(music -> music.getId().equals(id));}

}

