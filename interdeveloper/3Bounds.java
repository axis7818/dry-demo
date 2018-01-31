
class Bounds {

   public Coord min;
   public Coord max;

   public Bounds() {}

   public boolean contains(Coord c) {
      return west < c.lng && c.lng < east
         && south < c.lat && c.lat < north;
   }
}
