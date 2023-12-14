package com.Xwokrz.dto.hospital;

public class SongDTO {
    private String name;
    private String singer;
    private String writer;
    private String composer;
    private double duration;
    private String lang;

    public SongDTO() {

    }
    public SongDTO(String name,double duration){
        this.name=name;
        this.duration=duration;
    }

    public String toString() {
        return "song name" + this.name + ",song writer " + this.writer + "," +
                " song singer " + this.singer + "," + "composer" + this.composer + "," +
                "song duration" + this.duration + "," + "lang" + this.lang;
    }

    @Override
    public boolean equals(Object obj) {
        SongDTO songDTOleft = this;
        if (obj != null) {
            if (obj instanceof SongDTO) {
                SongDTO songDTOright = (SongDTO) obj;
                if (songDTOleft.name.equals(songDTOright) && songDTOleft.duration == songDTOright.duration) ;

                    System.out.println("both songs are same");
                    return true;
                }
            } else {
                System.out.println("both song are defferent");
            }
        return false;
        }


    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getComposer() {
        return composer;
    }

    public double getDuration() {
        return duration;
    }

    public String getLang() {
        return lang;
    }

    public String getSinger() {
        return singer;
    }

    public String getWriter() {
        return writer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }
}
