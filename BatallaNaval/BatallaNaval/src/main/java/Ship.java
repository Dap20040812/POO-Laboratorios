import java.util.ArrayList;
import java.util.List;

public class Ship {
    private int numberId;
    private int puntajeS;
    private Marine[] marines;
    private Navy navy;
    private Location location;


    public Ship(int numberId, int puntajeS, Location location,Navy navy) {
        this.numberId = numberId;
        this.puntajeS = puntajeS;
        marines = new Marine[4];
        this.location = location;
        this.navy = navy;




    }

    public Location getLocation() {
        return location;
    }

    public Marine[] getMarines() {
        return marines;
    }

    /**
     * Crea los marinos
     *
     *
     */


    public int getNumberId() {
        return numberId;
    }

   public boolean addMarine(Ship ship,Marine marine)
   {
       boolean Exist = false,result=false;
       int x=0;
       if(navy.getNumOfMarines() > 0) {
           if (marine.isEnUso() == false) {
               for (int i = 0; i < marines.length && !Exist; i++) {
                   ship.getMarines()[i] = null;
                   Exist = true;
                   x = i;
               }
               if (Exist) {
                   marine.isEnUsoCambiar();
                   navy.RestNumOfMarines();
                   ship.getMarines()[x] = marine;
                   result = true;
               }
           }
       }
       return result;
   }

    @Override
    public boolean equals(Object o){

        //verify not null
        if(o == null){
            return false;
        }

        //Object instance of Student
        if(!(o instanceof Ship)){
            return false;
        }

        //casteo
        Ship ship = (Ship)o;

        // Validation
        return this.numberId == ship.getNumberId();
    }





}
