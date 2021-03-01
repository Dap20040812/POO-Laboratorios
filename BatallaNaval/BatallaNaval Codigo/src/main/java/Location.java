public class Location {

    private int  latitude;
    private int  longitude;

    public Location(int latitude, int longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }


    public int getLatitude() {
        return latitude;
    }
    public void ChageLatitude(int latitudea) {

        latitude=latitude+latitudea;
    }
    public void ChageLongitude(int longitudeA) {

        longitude=longitude+longitudeA;
    }
    public int getLongitude() {
        return longitude;
    }

    @Override
    public boolean equals(Object o){

        //verify not null
        if(o == null){
            return false;
        }

        //Object instance of Student
        if(!(o instanceof Location))
        {
            return false;
        }

        //casteo
        Location location = (Location) o;

        // Validation
        return this.latitude == location.getLatitude() && this.longitude == location.getLongitude();
    }
}
