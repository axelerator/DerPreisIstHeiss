```java
import java.util.List;
import java.util.ArrayList;

class DerPreisIstHeiss {
  static class Price {
    float amount;

    Price(float amount) {
      this.amount = amount;
    }

    public String toString() {
      return amount + " €";
    }
  }


  public static void main(String[] args) {

    Price p1 = new Price(23.0f);
    Price p2 = new Price(23.0f);

    if (p1.equals(p2)) {
      System.out.println(p1 + " ist gleich " + p2);
    } else {
      System.out.println(p1 + " ist nicht gleich " + p2);
    }
  }
}
```
Ausgabe:
========
23.0 € ist nicht gleich 23.0 €
