package nyugta_v4;


public class verziok {
     /* formázott kiírás */
    public static void main(String[] args) {
        String csillagok = "***********************";
        System.out.println(csillagok);
        System.out.println("     Nyugta 4");
        System.out.println(csillagok);
        int ar1 = 350, ar2 = 110, ar3 = 1325;
        String huf = "Ft";
        //System.out.println("Tétel 1:      " + ar1 + huf);
        //System.out.prinNtln("Tétel 2:       " + ar2 + huf);
        //System.out.println("Tétel 3:     " + ar3 + huf);
        System.out.printf("%10s: %5d %s\n","Tétel 1",ar1, huf);
        System.out.printf("%10s: %5d %s\n","Tétel 2",ar2, huf);
        System.out.printf("%10s: %5d %s\n", "Tétel 3", ar3, huf);
        
        String duplaVonal = "=======================";
        System.out.println(duplaVonal);
        
        int osszesenHuf = ar1 + ar2 + ar3;
        //System.out.println("Összesen:    " + osszesenHuf + huf); 
        System.out.printf("%10s: %5d %s\n","Összesen",osszesenHuf, huf); 
        System.out.println("-----------------------");
        int szazalek = 10;
        double szervizdij = osszesenHuf * szazalek/100.0;
        //System.out.println("Szervízdíj:   " + szervizdij + huf);
        System.out.printf("%10s: %8.2f %s\n","Szervízdíj",szervizdij, huf);
        
        System.out.println("(" + szazalek + "%)");
        System.out.println(duplaVonal);
        double fizetendoHuf = osszesenHuf + szervizdij;
        //System.out.println("Fizetendő:   "  + fizetendoHuf + huf);
        System.out.printf("%10s: %8.2f %s\n","Fizetendő",fizetendoHuf, huf);
        String eur = "\u20ac";
        double eurArfolyam = 473.0;
        double fizetendoEur = fizetendoHuf / eurArfolyam;
        //System.out.println(fizetendoEur + eur);
        System.out.printf("%20.2f %s\n",fizetendoEur,eur);
        
        System.out.println("");
        
        System.out.println("_______         _______");
        System.out.println(" Dátum            Név");   
        System.out.println(csillagok);
        System.out.println("         CÉG");
        System.out.println(csillagok);
    }
    
    
}
