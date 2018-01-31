
class Wrappable {

   public float min;
   public float max;

   public float val;

   public Wrappable(float val, float min, float max) {
      this.val = val;
      this.min = min;
      this.max = max;
   }

   public boolean normalized() {
      return min <= val && val < max;
   }

   public void normalize() {
      float delta = max - min;
      if (val < min) {
         val += Math.ceil(-val / delta) * delta;
      } else if (val > max) {
         val -= Math.floor(val / delta) * delta;
      }
      return val;
   }
}
