package org.example.klasy;

import interfejsyy.Konto;
import org.example.Enum.AccountType;

public class Bank {



    public Konto StworzKonto(String typ, klasy.AccountFactory accountFactory)
    {
        System.out.println(typ + "Bank");

        if("1".equals(typ))
        {
            Konto kontoBiezace = accountFactory.utworzKonto(AccountType.AccountTypes.BIEZACE.getNumber());
            return kontoBiezace;

        }

        else if("3".equals(typ))
        {
            Konto kontoOszczedniosciowe = accountFactory.utworzKonto((AccountType.AccountTypes.OSZCZEDNIOSCIOWE.getNumber()));
            return kontoOszczedniosciowe;

        }
        return null;
    }
}

