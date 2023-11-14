package org.example.Engine;


import org.example.CRUD.PracownikCRUD;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.example.Enum.AccountType;
import org.example.klasy.Bank;

public class Engine {

    public Engine() {

    }



    public  void RunBank(){
        Scanner scan = new Scanner(System.in);

        Bank bank = new Bank();
        klasy.AccountFactory accountFactory = new klasy.AccountFactory();
        boolean programWorking = true;
        boolean userChoosing =false;
        while(!userChoosing)
        {
            int UserChoose= ChooseTypeOfUser();
            System.out.println(UserChoose);


            switch(UserChoose){

                case 1:
                    Map loginAndPassword = GetLoginAndPassword();
                    PracownikCRUD pracownikCRUD=new PracownikCRUD();

                    if (pracownikCRUD.getKonta((String) loginAndPassword.get("password"),(String) loginAndPassword.get("login")))
                    {

                        while (programWorking) {


                            int employeeChoose = EmployeeChoose();

                            switch (employeeChoose) {
                                case 1:
                                    int whichAccountCreate = WhichAccountCreate();

                                    switch (whichAccountCreate)
                                    {
                                        case 1:
                                            interfejsyy.Konto kontobiezace= bank.StworzKonto(AccountType.AccountTypes.BIEZACE.getNumber(), accountFactory);
                                            kontobiezace.JakieKonto();

                                            break;
                                        case 3:
                                            interfejsyy.Konto kontooszczednosciowe=bank.StworzKonto(AccountType.AccountTypes.OSZCZEDNIOSCIOWE.getNumber(), accountFactory);
                                            kontooszczednosciowe.JakieKonto();
                                            break;
                                        default:
                                            break;

                                    }

                                    break;
                                case 2:

                                    break;
                                case 3:
                                    programWorking = false;
                                    System.out.println("Koniec programu.");
                                    break;
                                default:
                                    System.out.println("Niepoprawny employeeChoose. Spróbuj ponownie.");
                            }
                        }
                    }
                    break;

                case 2:
                    System.out.println("2.Użytkownik");
                    userChoosing = true;
                    break;
            }

        }




    }


    public static int ChooseTypeOfUser()
    {Scanner scan = new Scanner(System.in);
        System.out.println("Podejmij akcjeaaaaaaaaaa");
        System.out.println("1. Pracownik");
        System.out.println("2. Użytkownik");
        int UserChoose = scan.nextInt();
        return UserChoose;
    }

    public static int EmployeeChoose()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podejmij akcje");
        System.out.println("1. Stwórz konto");
        System.out.println("4. Wróć do menu");
        int employeeChoose = scan.nextInt();

        return employeeChoose;
    }

    public static int WhichAccountCreate()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Jakie konto chcesz stworzyć");
        System.out.println("1. Konto bieżące");
        System.out.println("3. konto oszczędnościowe");
        int whichAccountCreate = scan.nextInt();
        return whichAccountCreate;
    }
    public static Map GetLoginAndPassword()
    {
        Map<String,String> loginAndPassword = new HashMap<>();

        Scanner scan = new Scanner(System.in);
        System.out.println("1. Pracownik");
        System.out.println("Podaj login");
        String login=scan.nextLine();
        loginAndPassword.put("login",login);
        System.out.println("Podaj hasło");
        String password =scan.nextLine();
        loginAndPassword.put("password",password);

        return loginAndPassword;
    }




}

