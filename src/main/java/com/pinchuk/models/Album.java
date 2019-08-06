package com.pinchuk.models;

import javax.persistence.*;

@Entity
@Table(name = "album")
public
class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "SINGER_ID")
    private Singer singer;

    public Long getId() {
        return id;
    }

    public Album setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Album setName(String name) {
        this.name = name;
        return this;
    }

    public Singer getSinger() {
        return singer;
    }

    public Album setSinger(Singer singer) {
        this.singer = singer;
        return this;
    }

}
