package org.example.klasy;

import javax.persistence.*;
import interfejsyy.Konto;
@Entity
@Table(name="kontaBiezace")
 public class KontoBiezace implements Konto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int id_wlasciciela;

    @Column(name="kwota")
    private float kwota;

    public KontoBiezace() {

    }

    public KontoBiezace(int id, int id_wlasciciela, int rodzaj_konta, float kwota) {
        this.id = id;
        this.id_wlasciciela = id_wlasciciela;

        this.kwota = kwota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_wlasciciela() {
        return id_wlasciciela;
    }

    public void setId_wlasciciela(int id_wlasciciela) {
        this.id_wlasciciela = id_wlasciciela;
    }





    public float getKwota() {
        return kwota;
    }

    public void setKwota(float kwota) {
        this.kwota = kwota;
    }

    @Override
    public String toString() {
        return "KontoBiezace{" +
                "id=" + id +
                ", id_wlasciciela=" + id_wlasciciela +

                ", kwota=" + kwota +
                '}';
    }

    @Override
     public void JakieKonto() {
         System.out.println("KontoBiezace");
     }
 }


