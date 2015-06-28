import java.util.List;
import java.util.ArrayList;

class DerPreisIstHeiss {
  static class Price {
    float amount;
  }


  public static void main(String[] args) {

    Price p1 = new Price();
    p1.amount = 23.0f;

    Price p2 = new Price();
    p2.amount = 23.0f;

    if (p1 == p2) {
      System.out.println(p1 + " ist gleich " + p2);
    } else {
      System.out.println(p1 + " ist nicht gleich " + p2);
    }
  }
}
