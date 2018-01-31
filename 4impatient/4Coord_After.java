
class Coord {

   public static final float MIN_LNG = 0;
   public static final float MAX_LNG = 360;
   public static final float MIN_LAT = -90;
   public static final float MAX_LAT = 90;

   public Wrappable lng;
   public Wrappable lat;

   public Coord(float lng, float lat) {
      this.lng = new Wrappable(lng, MIN_LNG, MAX_LNG);
      this.lat = new Wrappable(lat, MIN_LAT, MAX_LAT);
   }

   public boolean normalized() {
      return lng.normalized() && lat.normalized();
   }

   public void normalize() {
      lng.normalize();
      lat.normalize();
   }
}
