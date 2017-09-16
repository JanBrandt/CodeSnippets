
/**
 *  @author Jan Brandt
 */

public class Robot {
  Bewegung fortbewegung;

  public Robot(Bewegung bewegung) {
    this.fortbewegung = bewegung;
  }

  public void bewegen() {
    fortbewegung.ausfuehren();
  }

  public void setBewegung(Bewegung bewegung) {
    this.fortbewegung = bewegung;
  }
}

