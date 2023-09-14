/**
 * Основний клас Fibonacci з полями {@link Fibonacci#number} - для визначення номеру числа та
 * {@link Fibonacci#value} для значення цього числа
 */
public class Fibonacci {
    int number;
    int value;

    public Fibonacci() {
    }

    public Fibonacci(int number, int value) {
        this.number = number;
        this.value = value;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
