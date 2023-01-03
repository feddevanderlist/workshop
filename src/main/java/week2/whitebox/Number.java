package week2.whitebox;

public class Number {

    final int number;

    public int getNumber() {
        return number;
    }

    public Number(final int number) {
        this.number = number;
    }

    public boolean isEven() {
        return number % 2 == 0;
    }

    public boolean isOdd() {
        return !isEven();
    }

    public boolean isPrime() {
        if (this.isEven()) {
            return false;
        }
        for (int i = 3; i < number / 2; i = +2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isPositive() {
        return number > 0;
    }

    public boolean isNegative() {
        return number < 0;
    }


}
