
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
      lng = normalize(lng, MIN_LNG, MAX_LNG);
      lat = normalize(lat, MIN_LAT, MAX_LAT);
   }

   private float normalize(float val, float min, float max) {
      float delta = max - min;
      if (val < min) {
         val += Math.ceil(-val / delta) * delta;
      } else if (val > max) {
         val -= Math.floor(val / delta) * delta;
      }
      return val;
   }

}
