
class CoordRect {

   private float east, west, north, south;
   private Coord cachedCenter;

   public CoordRect() {}

   public float getEast() {
      return east;
   }

   public void setEast(float east) {
      this.east = east;
      cachedCenter = null;
   }

   /* getters/setters for west, north, south */

   public Coord center() {
      if (cachedCenter == null) {
         cachedCenter = new Coord();
         center.lng = (east + west) / 2.0f;
         center.lat = (north + south) / 2.0f;
      }
      return cachedCenter;
   }

}
