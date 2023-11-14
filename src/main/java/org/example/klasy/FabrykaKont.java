package klasy;

import interfejsyy.Konto;
import org.example.klasy.*;

public class FabrykaKont {


    public Konto utworzKonto(String typ)
    {
        System.out.println(typ + "fabryka kont");
        if("1".equals(typ)) {

            KontoBiezace kontoBiezace= new KontoBiezace();
            return kontoBiezace;
        }
        else if("2".equals(typ))
        {

            KontoEmerytalne kontoEmerytalne = new KontoEmerytalne();
            return kontoEmerytalne;
        }
        else if("3".equals(typ))
        {
            KontoOszczednosciowe kontoOszczednosciowe = new KontoOszczednosciowe();
            return kontoOszczednosciowe;
        }
        return null;
    }
}
