
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

   public void normalize() {

      if (lng < MIN_LNG) {
         lng += Math.ceil(-lng / MAX_LNG) * MAX_LNG;
      } else if (lng > MAX_LNG) {
         lng -= Math.floor(lng / MAX_LNG) * MAX_LNG;
      }

      if (lat < MIN_LAT) {
         lat += Math.ceil(-lat / (MAX_LAT - MIN_LAT)) * (MAX_LAT - MIN_LAT);
      } else if (lat > MAX_LAT) {
         lat -= Math.floor(lat / (MAX_LAT - MIN_LAT)) * (MAX_LAT - MIN_LAT);
      }

   }

}
