package clientwsfootball;

import eu.dataaccess.footballpool.ArrayOfString;
import eu.dataaccess.footballpool.ArrayOftCountryInfo;
import eu.dataaccess.footballpool.ArrayOftPlayersWithCards;
import eu.dataaccess.footballpool.TCountryInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClientWsFootball {

    public static void main(String[] args) {
            System.out.println("Yellow Cards: " + yellowCardsTotal());
            System.out.println("All Defenders in Spain: " + allDefenders("spain").getString());
            List <TCountryInfo> countries = countryNames(true).getTCountryInfo();
            
            for(TCountryInfo i : countries){
                System.out.println("Pais: " + i.getSName());
                System.out.println(allDefenders(i.getSName()).getString());
            }
    }

    private static int yellowCardsTotal() {
        eu.dataaccess.footballpool.Info service = new eu.dataaccess.footballpool.Info();
        eu.dataaccess.footballpool.InfoSoapType port = service.getInfoSoap();
        return port.yellowCardsTotal();
    }

    private static ArrayOfString allDefenders(java.lang.String sCountryName) {
        eu.dataaccess.footballpool.Info service = new eu.dataaccess.footballpool.Info();
        eu.dataaccess.footballpool.InfoSoapType port = service.getInfoSoap();
        return port.allDefenders(sCountryName);
    }

    private static ArrayOftCountryInfo countryNames(boolean bWithCompetitors) {
        eu.dataaccess.footballpool.Info service = new eu.dataaccess.footballpool.Info();
        eu.dataaccess.footballpool.InfoSoapType port = service.getInfoSoap();
        return port.countryNames(bWithCompetitors);
    }

    
    
}
