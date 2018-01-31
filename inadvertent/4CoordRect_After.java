
class CoordRect {

   public float east, west, north, south;

   public CoordRect() {}

   public Coord center() {
      Coord center = new Coord();
      center.lng = (east + west) / 2.0f;
      center.lat = (north + south) / 2.0f;
      return center;
   }

}
