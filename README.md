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
      return other.amount == this.amount;
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
Kompilierfehler:
================
```
DerPreisIstHeiss.java:17: error: cannot find symbol
      return other.amount == this.amount;
                  ^
  symbol:   variable amount
  location: variable other of type Object
1 error
```
