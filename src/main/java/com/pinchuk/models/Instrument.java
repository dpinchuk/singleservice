package com.pinchuk.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "instrument")
public class Instrument {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int price;

    @ManyToMany
    @JoinTable(name = "singer_instruments",
            joinColumns = @JoinColumn(name = "INSTRUMENT_ID"),
            inverseJoinColumns = @JoinColumn(name = "SINGER_ID")
    )
    private Set<Singer> singers;

    public Instrument() {
    }


    public Long getId() {
        return id;
    }

    public Instrument setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Instrument setName(String name) {
        this.name = name;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public Instrument setPrice(int price) {
        this.price = price;
        return this;
    }

}
