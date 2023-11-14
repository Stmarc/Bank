package org.example.klasy;


import javax.persistence.*;

@Entity
@Table(name="pracownicy")
public class pracownik {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String login,haslo;
    public pracownik(){}

    public pracownik(int id, String login, String haslo) {
        this.id = id;
        this.login = login;
        this.haslo = haslo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

    @Override
    public String toString() {
        return "pracownik{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", haslo='" + haslo + '\'' +
                '}';
    }

    public boolean Sprawdzeniehaslo(String hasloPodanePrzezUzytkownika,String login){
        String hasloWbazie= this.getHaslo();
        if(hasloWbazie==hasloPodanePrzezUzytkownika)
        {
            return  true;
        }
        else {


            return false;
        }
    }
}
