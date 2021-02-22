import java.util.ArrayList;
import java.util.List;

public class Board {

    private static final int MIM_LATITUDE = -100;
    private static final int MAX_LATITUDE = 100;
    private static final int MIN_LONGITUDE = -100;
    private static final int MAX_LONGITUDE = -100;
    private ArrayList<Navy> navies;
    public Board() {
        navies = new ArrayList();
    }

    /**
     * Crea el tablero con todos sus flotas
     *
     *
     */
    public void setBackground() {


    }
    /**
     * Agrega las flotas al tablero
     *
     * @returns: results if false: no agrego la floata true: agrego la flota
     */

    public boolean AddsNavy(Navy navy)
    {
        boolean exist=false;
        boolean result=false;
        if(navies.contains(navy))
        {
           exist=true;
        }
        if(!exist){
            this.navies.add(navy);
            result=true;
        }
        return result;
    }
    /**
     * Consulta el número de flotas que tienen su mismo nombre
     *
     * @returns: numero de flotas con el mismo nombre
     */
    public int alias(Navy navy)
    {
        int c=0;
        for(int i=0;i < this.navies.size();i++)
        {
          if(this.navies.get(i).equals(navy))
          {
              c++;
          }
        }

        return c;
    }
    /**
     * Consulta la placa de los aviones enemigos que están en el aire
     *
     * @returns: la placa de los aviones enemigos que están en el aire
     */
    public ArrayList<String> enAire(Navy navy)
    {
        return navy.getPlacasenaire();

    }



}



