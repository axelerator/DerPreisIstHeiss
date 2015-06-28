```java
import java.util.List;
import java.util.ArrayList;

class DerPreisIstHeiss {
  static class Price {
    private long amount;

    Price(long amount) {
      this.amount = amount;
    }

    public String toString() {
      long cents = amount % 100;
      return (amount / 100) + "." + (cents < 10 ? "0" + cents :  cents) + " €";
    }

    public boolean equals(Object other) {
      return (other instanceof Price)
        && ((Price)other).amount == this.amount;
    }

    public Price sum(Price other) {
      return new Price(this.amount + other.amount);
    }
  }


  public static void main(String[] args) {

    Price p1 = new Price(23000001);
    Price p2 = new Price(23000001);

    Price p3 = p1.sum(p2);
    System.out.println(p3);

  }
}
```
Ausgabe:
========
460000.02 €
