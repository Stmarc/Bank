package org.example.klasy;

import javax.persistence.*;

@Entity
@Table(name="kontaOszczednosciowe")
public class KontoOszczednosciowe implements interfejsyy.Konto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int id_wlasciciela;
    @Column(name="kwota")
    private float kwota;

    private float oprocentowanie;

    public KontoOszczednosciowe()
    {

    }

    public KontoOszczednosciowe(int id, int id_wlasciciela, float kwota, float oprocentowanie) {
        this.id = id;
        this.id_wlasciciela = id_wlasciciela;
        this.kwota = kwota;
        this.oprocentowanie = oprocentowanie;
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

    public float getOprocentowanie() {
        return oprocentowanie;
    }

    public void setOprocentowanie(float oprocentowanie) {
        this.oprocentowanie = oprocentowanie;
    }

    @Override
    public String toString() {
        return "KontoOszczednosciowe{" +
                "id=" + id +
                ", id_wlasciciela=" + id_wlasciciela +
                ", kwota=" + kwota +
                ", oprocentowanie=" + oprocentowanie +
                '}';
    }

    @Override
    public void JakieKonto() {
        System.out.println("KontoOszczednosciowe");
    }
}
