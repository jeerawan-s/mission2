package com.devtraining.mission2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MusicStoreController {
    @Autowired
    private MusicStoreService musicStoreService;

    // get all music list
    @RequestMapping("/musicstore")
    public List<MusicStoreModel> getMusicStore()
    {return musicStoreService.getMusicStoreModelList();}

    // get music by passing id
    @RequestMapping("/musicstore/{id}")
    public MusicStoreModel getMusic(@PathVariable("id") String id) {return musicStoreService.getMusic(id);}

    // add music
    @RequestMapping(method = RequestMethod.POST, value = "/musicstore")
    public void addMusic(@RequestBody MusicStoreModel music) {musicStoreService.addMusic(music);}

    // update music
    @RequestMapping(method = RequestMethod.PUT, value = "/musicstore/{id}")
    public void updateMusic(@RequestBody MusicStoreModel music, @PathVariable("id") String id)
    {musicStoreService.updateMusic(music, id);}

    // delete music
    @RequestMapping(method = RequestMethod.DELETE, value = "/musicstore/{id}")
    public void deleteMusic(@PathVariable("id") String id)
    {musicStoreService.deleteMusic(id);}

}
