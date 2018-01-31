
class Radian implements Wrappable {

   public static final float MIN_RAD = 0;
   public static final float MAX_RAD = 2 * Math.PI;

   public Radian(float val) {
      super(val, MIN_RAD, MAX_RAD);
   }
}
