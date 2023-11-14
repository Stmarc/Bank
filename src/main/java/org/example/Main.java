package org.example;
import interfejsyy.Konto;
import klasy.Bank;
import klasy.FabrykaKont;
import Enum.AccountType;
import Enum.UserType;
import org.example.CRUD.KontoBiezaceCRUD;
import org.example.CRUD.KontoOszczednioscioweCRUD;
import org.example.CRUD.PracownikCRUD;
import org.example.klasy.pracownik;

import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Bank bank = new Bank();
        FabrykaKont fabrykaKont = new FabrykaKont();


        boolean programDziała = true;
        String wybrano = null;
        boolean wybranieUzytkownika=false;
        while(!wybranieUzytkownika)
        {
            System.out.println("Podejmij akcje");
            System.out.println("1. Administrator");
            System.out.println("2. Użytkownik");
            int wyborUzytkownika = scan.nextInt();

            switch(wyborUzytkownika){

                case 1:
                    System.out.println("1. Pracownik");
                    wybranieUzytkownika=true;
                    wybrano = UserType.RodzajeUzytkownikow.ADMINISTRATOR.getNumber();
                    scan.nextLine();
                    System.out.println("Podaj login");
                    String login=scan.nextLine();
                    System.out.println("Podaj hasło");
                    String haslo=scan.nextLine();
                    PracownikCRUD pracownikCRUD=new PracownikCRUD();
                    if (pracownikCRUD.getKonta(haslo,login))
                    {
                        while (programDziała) {

                            System.out.println("Podejmij akcje");
                            System.out.println("1. Stwórz konto");
                            System.out.println("4. Wróć do menu");
                            int wybór = scan.nextInt();

                            switch (wybór) {
                                case 1:
                                    System.out.println("Jakie konto chcesz stworzyć");
                                    System.out.println("1. Konto bieżące");
                                    System.out.println("2. konto emerytalne");
                                    System.out.println("3. konto oszczędnościowe");

                                    int JakieKontoStworzyc = scan.nextInt();

                                    switch (JakieKontoStworzyc)
                                    {
                                        case 1:
                                            Konto kontobiezace= bank.StworzKonto(AccountType.RodzajKont.BIEZACE.getNumber(),fabrykaKont);
                                            kontobiezace.JakieKonto();

                                            break;
                                        case 2:
                                            Konto kontoemerytalne=bank.StworzKonto(AccountType.RodzajKont.EMERYTALNE.getNumber(),fabrykaKont);
                                            kontoemerytalne.JakieKonto();
                                            break;
                                        case 3:
                                            Konto kontooszczednosciowe=bank.StworzKonto(AccountType.RodzajKont.OSZCZEDNIOSCIOWE.getNumber(),fabrykaKont);
                                            kontooszczednosciowe.JakieKonto();
                                            break;
                                        default:
                                            break;

                                    }

                                    break;
                                case 2:

                                    break;
                                case 3:
                                    programDziała = false;
                                    System.out.println("Koniec programu.");
                                    break;
                                default:
                                    System.out.println("Niepoprawny wybór. Spróbuj ponownie.");
                            }
                        }
                    }
                    break;

                case 2:
                    System.out.println("2.Użytkownik");
                    wybranieUzytkownika= true;
                    wybrano= UserType.RodzajeUzytkownikow.KLIENT.getNumber();
                    break;
            }

        }

















    }



}







