package com.CCstudent.whiskey_lab.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="distilleries")
public class Distillery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String region;

    @OneToMany(mappedBy = "distillery") // denotes the FK in whiskey table
    @JsonIgnoreProperties({"distillery"})
    private List<Whiskey> whiskeys;

    public Distillery(String name, String region) {
        this.name = name;
        this.region = region;
        this.whiskeys = new ArrayList<>();
    }

    public Distillery(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public List<Whiskey> getWhiskeys() {
        return whiskeys;
    }

    public void setWhiskeys(List<Whiskey> whiskeys) {
        this.whiskeys = whiskeys;
    }
}
