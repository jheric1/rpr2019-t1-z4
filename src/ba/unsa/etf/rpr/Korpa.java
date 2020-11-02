package ba.unsa.etf.rpr;


public class Korpa {
    int max_br=50;
    int trenutno=0;
    Artikl[] artikli1= new Artikl[50];
    Artikl[] getArtikli(){
        return artikli1;
    }
    int getTrenutno(){
        return trenutno;
    }
    int getMax_br(){
        return max_br;
    }
    boolean dodajArtikl(Artikl a){
        if(trenutno>=max_br) return false;
        artikli1[trenutno]=a;
        trenutno=trenutno+1;
        return true;
    }
    Artikl izbaciArtiklSaKodom(String kodi){
        Artikl a= new Artikl();
        for(int i=0; i<trenutno; i++){
            if (artikli1[i].kod.equals(kodi)) {
                a=artikli1[i];
                int pom=i;
                for(int j=i+1; j<trenutno; j++) {
                    artikli1[i]=artikli1[j];
                    i++;
                }
                trenutno=trenutno-1;
                i=pom;
            }
        }
        return a;
    }
    int dajUkupnuCijenuArtikala(){
        int suma=0;
        for(int i=0; i<trenutno; i++){
            suma=suma+artikli1[i].cijena;
        }
        return suma;
    }

}
