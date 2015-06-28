```java
import java.util.List;
import java.util.ArrayList;

class DerPreisIstHeiss {
  static class Price {
    private long amount;
    private char currency;

    Price(long amount, char currency ) {
      this.amount = amount;
      this.currency = currency;
    }

    public String toString() {
      long cents = amount % 100;
      return (amount / 100) +
        "." + (cents < 10 ? "0" + cents :  cents)
        + " " + currency;
    }

    public boolean equals(Object other) {
      return (other instanceof Price)
        && ((Price)other).amount == this.amount;
    }

    public Price sum(Price other) {
      return new Price(this.amount + other.amount, this.currency);
    }
  }


  public static void main(String[] args) {

    Price euro1 = new Price(23000001, '€');
    Price euro2 = new Price(23000001, '€');

    Price euro3 = euro1.sum(euro2);
    System.out.println(euro3);

    System.out.println(new Price(4200, '$'));
  }
}
```
Ausgabe:
========
```
460000.02 €
42.00 $
```
