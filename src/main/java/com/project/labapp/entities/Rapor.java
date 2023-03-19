package com.project.labapp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class Rapor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dosyaNumarasi;
    private String hastaAdi;
    private String hastaSoyadi;
    private String hastaKimlikNo;
    private String koyulanTaniBasligi;
    private String taniDetaylari;
    private LocalDate verilisTarihi;
    private String fotoDosyasiAdi;

    @ManyToOne
    private Laborant laborant;

    // Constructor, Getter and Setter methods

}