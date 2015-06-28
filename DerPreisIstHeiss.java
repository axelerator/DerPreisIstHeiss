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

    Price oneEuro = new Price(100, '€');
    Price oneDollar = new Price(100, '$');

    Price deuro = oneEuro.sum(oneDollar);

    System.out.println(oneEuro + " equals " + oneDollar + ": " + oneEuro.equals(oneDollar));
    System.out.println(oneEuro + " + " + oneDollar + "= " + deuro);

  }
}
