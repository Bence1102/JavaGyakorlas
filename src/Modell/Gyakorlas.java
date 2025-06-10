
package Modell;


public class Gyakorlas {

        private String kod;
        private String datum;
        private String fizetesmod;
        private double megtetttav;
        private int osszeg;
        private int borravalo; 
        private boolean etel;

    public Gyakorlas(String kod, String datum, String fizetesmod, double megtetttav, int osszeg, int borravalo, boolean etel) {
        this.kod = kod;
        this.datum = datum;
        this.fizetesmod = fizetesmod;
        this.megtetttav = megtetttav;
        this.osszeg = osszeg;
        this.borravalo = borravalo;
        this.etel = etel;
    }
    
    public Gyakorlas(String sor){
         String[] adatok = sor.split(";");
         this.kod=adatok[0];
         this.datum=adatok[1];
         this.fizetesmod=adatok[2];
         this.megtetttav=Double.parseDouble(adatok[3]);
         this.osszeg=Integer.parseInt(adatok[4]);
         this.borravalo=Integer.parseInt(adatok[5]);
         this.etel=adatok[6].equals("igen");
         
    }
    

    public String getKod() {
        return kod;
    }

    public String getDatum() {
        return datum;
    }

    public String getFizetesmod() {
        return fizetesmod;
    }

    public double getMegtetttav() {
        return megtetttav;
    }

    public int getOsszeg() {
        return osszeg;
    }

    public int getBorravalo() {
        return borravalo;
    }

    public boolean isEtel() {
        return etel;
    }

    

    @Override
    public String toString() {
        return "Gyakorlas{" + "kód=" + kod + ", datum=" + datum + ", fizetesmod=" + fizetesmod + ", megtetttav=" + megtetttav + ", osszeg=" + osszeg + ", borravalo=" + borravalo + ", etel=" + etel + '}';
    }
        
   
  
    
}
