package com.devtraining.mission2;

public class MusicMain {
    public static void main(String[] args) {

        MusicStoreModel musicModel = new MusicStoreModel("01", "New Rules", "Dua Lipa", "Dua Lipa", "2017");
        System.out.println(musicModel.toString());

        MusicStoreModel musicMdl = new MusicStoreModel();

        musicMdl.setId("01");
        musicMdl.setSong("New Rules");
        musicMdl.setArtist("Dua Lipa");
        musicMdl.setAlbum("Deluxe");
        musicMdl.setYear("2017");

        System.out.println(musicMdl.getId());
        System.out.println(musicMdl.getSong());
        System.out.println(musicMdl.getArtist());
        System.out.println(musicMdl.getAlbum());
        System.out.println(musicMdl.getYear());
    }
}
