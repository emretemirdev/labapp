package com.project.labapp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
@Entity
public class Laborant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ad;
    private String soyad;
    private String kimlikNo;

    @OneToMany(mappedBy = "laborant", cascade = CascadeType.ALL)
    private List<Rapor> raporlar = new ArrayList<>();

    // Constructor, Getter and Setter methods

}