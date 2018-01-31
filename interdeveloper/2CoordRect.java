
class CoordRect {

   public float east, west, north, south;

   public Coord center;
   public float area;

   public CoordRect() {}

   public boolean contains(Coord c) {
      assert c.normalized : "coord must be normalized";
      return west <= c.lng && c.lng <= east
         && south <= c.lat && c.lat <= north;
   }

}
