import java.util.ArrayList;
import java.util.List;

public class Board {

    private static final int MIM_LATITUDE = -100;
    private static final int MAX_LATITUDE = 100;
    private static final int MIN_LONGITUDE = -100;
    private static final int MAX_LONGITUDE = -100;
    private ArrayList<Navy> navies;
    private Navy navy;
    public Board() {
        navies = new ArrayList();
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
        return navy.getPlacasenaire(navy);
    }

    /**
     * Consulta la disponibilidad total de los portaaviones
     *
     * @returns: numero de nuevos aviones que podrían cargarse a los portaaviones
     */
    public int disponibilidadEnPortaAviones(AircraftCarrier aircraftCarrier) {
        int x= aircraftCarrier.espaciosdisponibles();
        return x;
    }

    /**
     * Verifica si una ubicación de ataque en agua es adecuado(destruye elementos
     * enemigos sin ocasionar bajas propias)
     *
     * Parameters:
     *   longitud - longitud de la explosion
     *   latitud - latitud de la explosion
     */
    public boolean esBuenAtaque(int longitud, int latitud,Navy MyNAvy, Navy OtherNavy)
    {
        boolean buenataque = false;
        for(int i=0;i< MyNAvy.getLocation().size();i++)
        {
            if(MyNAvy.getLocation().get(i).getLatitude() == latitud && MyNAvy.getLocation().get(i).getLongitude() == longitud)
            {
                buenataque = false;

            }
            if(OtherNavy.getLocation().get(i).getLatitude() == latitud && OtherNavy.getLocation().get(i).getLongitude() == longitud)
            {
                buenataque = true;
            }
        }
        return buenataque;
    }
    /**
     * Mueve todos los barcos la distancia definida
     *
     * Parameters:
     *   deltaLongitud - avance en longitud
     *   deltaLatitud - avance en latitud
     */
    public void muevase(int deltaLongitud,int deltaLatitud,Navy navy)
    {
          for(int i=0;i< navy.getShipInWater().size();i++)
          {
              if((navy.getShipInWater().get(i).getLocation().getLongitude())+deltaLongitud <= 100 || (navy.getShipInWater().get(i).getLocation().getLongitude())+deltaLongitud >= -100 && (navy.getShipInWater().get(i).getLocation().getLatitude())+deltaLatitud <= 100 || (navy.getShipInWater().get(i).getLocation().getLatitude())+deltaLatitud >= -100 )
              {
                  navy.getShipInWater().get(i).getLocation().ChageLatitude(deltaLatitud);
                  navy.getShipInWater().get(i).getLocation().ChageLongitude(deltaLongitud);

              }
          }
    }
    /**
     * Consulta el numero de maquinas que tiene la flota
     *
     * @returns: numero de maquinas de la flota
     */
    public int numeroMaquinas(Navy navy)
    {
        int x=navy.getShipInWater().size() + navy.getAircraftCarrierInWater().size() + navy.getAircraftInWater().size() ;
        return x;
    }
    /**
     * Consulta si puede confundir sus aviones con aviones enemigos considerando
     * las placas
     *
     * @returns: si hay problema en aire
     */
    public boolean problemaEnAire(Navy navy, Navy navy1)
    {
        boolean problem = false;
        for (int i=0; i< navy.getPlacasenaire(navy).size();i++)
        {
         for(int f=0;f<navy1.getPlacasenaire(navy1).size();i++)
         {
             if(navy.getAircraftInWater().get(i).equals(navy.getAircraftInWater().get(f)))
             {
                problem=true;
             }
         }
        }
        return problem;
    }
    /**
     * Consulta si cuenta con suficientes marinos para conducir sus máquinas.
     * Un portaaviones requiere cinco marinos; un barco, 4; y un avión 2.
     *
     * @returns: si hay suficientes marinos
     */
    public boolean suficientesMarinos(String MaquinaAconducir, Navy navy)
    {
        boolean suficientes=false;
        if(navy.getNumOfMarines()>0)
        {
            if(MaquinaAconducir == "portaaviones")
            {
                if(navy.RestNumOfMarines()>=5)
                {
                    suficientes = true;
                }
            }
            if(MaquinaAconducir == "barco")
            {
                if(navy.RestNumOfMarines()>=4)
                {
                    suficientes = true;
                }
            }
            if(MaquinaAconducir == "avión")
            {
                if(navy.RestNumOfMarines()>=2)
                {
                    suficientes = true;
                }
            }
        }
        return suficientes;
    }
    /**
     * Consulta las máquinas que pueden afectarse por una explosion en agua
     *
     * Parameters:
     *   longitud - longitud de la explosion
     *   latitud - latitud de la explosion
     */
    public ArrayList<Object> seranDestruidas(int longitud,int latitud)
    {
        ArrayList<Object> maquinasafectadas = new ArrayList<>();
        for(int i=0;i< navy.getShipInWater().size();i++)
        {
            if(navy.getShipInWater().get(i).getLocation().getLongitude() == longitud  && navy.getShipInWater().get(i).getLocation().getLatitude() == latitud)
            {
                 maquinasafectadas.add(navy.getShipInWater().get(i));
            }
        }
        for(int i=0;i< navy.getAircraftInWater().size();i++)
        {
            if(navy.getAircraftInWater().get(i).getLocation().getLongitude() == longitud  && navy.getAircraftInWater().get(i).getLocation().getLatitude() == latitud)
            {
                maquinasafectadas.add(navy.getAircraftInWater().get(i));
            }
        }
        for(int i=0;i< navy.getAircraftCarrierInWater().size();i++)
        {
            if(navy.getAircraftCarrierInWater().get(i).getLocation().getLongitude() == longitud  && navy.getAircraftCarrierInWater().get(i).getLocation().getLatitude() == latitud)
            {
                maquinasafectadas.add(navy.getAircraftCarrierInWater().get(i));
            }
        }
        return maquinasafectadas;
    }







}



