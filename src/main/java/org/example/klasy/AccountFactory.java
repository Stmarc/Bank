package klasy;

import interfejsyy.Konto;
import org.example.klasy.*;

public class AccountFactory {


    public Konto utworzKonto(String typ)
    {
        System.out.println(typ + "fabryka kont");
        if("1".equals(typ)) {

            KontoBiezace kontoBiezace= new KontoBiezace();
            return kontoBiezace;
        }

        else if("3".equals(typ))
        {
            KontoOszczednosciowe kontoOszczednosciowe = new KontoOszczednosciowe();
            return kontoOszczednosciowe;
        }
        return null;
    }
}
