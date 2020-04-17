package com.devtraining.mission2;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class MusicStoreModel {
    private String id;
    private String song;
    private String artist;
    private String album;
    private String year;
}
