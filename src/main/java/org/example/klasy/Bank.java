package klasy;

import interfejsyy.Konto;
import Enum.AccountType;
import org.example.*;
public class Bank {



    public Konto StworzKonto(String typ, klasy.FabrykaKont fabrykaKont)
    {
        System.out.println(typ + "Bank");

        if("1".equals(typ))
        {
            Konto kontoBiezace =fabrykaKont.utworzKonto(AccountType.RodzajKont.BIEZACE.getNumber());
            return kontoBiezace;

        }
        else if("2".equals(typ))
        {
            Konto kontoEmerytalne= fabrykaKont.utworzKonto((AccountType.RodzajKont.EMERYTALNE.getNumber()));
            return kontoEmerytalne;
        }
        else if("3".equals(typ))
        {
            Konto kontoOszczedniosciowe = fabrykaKont.utworzKonto((AccountType.RodzajKont.OSZCZEDNIOSCIOWE.getNumber()));
            return kontoOszczedniosciowe;

        }
        return null;
    }
}

