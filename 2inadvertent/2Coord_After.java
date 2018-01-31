
class Coord {

   public static final float MIN_LNG = 0;
   public static final float MAX_LNG = 360;
   public static final float MIN_LAT = -90;
   public static final float MAX_LAT = 90;

   public float lng;
   public float lat;

   public Coord() {}

   public boolean normalized() {
      return MIN_LNG <= lng && lng < MAX_LNG
         && MIN_LAT <= lat && lat < MAX_LAT;
   }

}
