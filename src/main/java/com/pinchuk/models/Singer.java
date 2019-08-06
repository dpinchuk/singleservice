package com.pinchuk.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "SINGER")
public class Singer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SINGER_ID")
    private Long id;
    private String name;

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            orphanRemoval = true)
    @JoinColumn(name = "SINGER_ID", referencedColumnName = "SINGER_ID")
    private Set<Album> albums;

    @ManyToMany
    @JoinTable(name = "singer_instruments",
            joinColumns = @JoinColumn(name = "SINGER_ID"),
            inverseJoinColumns = @JoinColumn(name = "INSTRUMENT_ID")
    )
    private Set<Instrument> instruments;

    public Long getId() {
        return id;
    }


    public Singer setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Singer setName(String name) {
        this.name = name;
        return this;
    }


    public Set<Album> getAlbums() {
        return albums;
    }

    public Singer setAlbums(Set<Album> albums) {
        this.albums = albums;
        return this;
    }

}
