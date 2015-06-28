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

    public boolean equals(Object other) {
      return (other instanceof Price)
        && ((Price)other).amount == this.amount;
    }
  }


  public static void main(String[] args) {

    Price p1 = new Price(230000.01f);
    Price p2 = new Price(230000.01f);

    Price p3 = new Price(p1.amount + p2.amount);
    System.out.println(p3);

  }
}
```
Ausgabe:
========
460000.03 €
