
/**
 *  @author Jan Brandt
 */

public class Robot {
  Movement fortbewegung;

  public Robot(Movement move) {
    this.fortbewegung = move;
  }

  public void bewegen() {
    fortbewegung.ausfuehren();
  }
}

