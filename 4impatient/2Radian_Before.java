
class Radian {

   public static final float MIN_RAD = 0;
   public static final float MAX_RAD = 2 * Math.PI;

   public float val;

   public Radian() {}

   public boolean normalized() {
      return MIN_RAD <= val && val < MAX_RAD;
   }

   public void normalize() {
      val = normalize(lng, MIN_RAD, MAX_RAD);
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
