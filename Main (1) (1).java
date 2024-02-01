package main.lesson20231009.problems;

public class ConditionalProblemSet {

    public static void main(String[] args) {

    }

public static boolean oneOrTwoMoreThanMultipleOfTen(int input) {
    return (input % 10 == 1 || input % 10 == 2);
}
public static String coffeeBreak(int coffee, int cake) {
    if (coffee >= 6 && cake >= 6) {
        if (coffee >= 2 * cake || cake >= 2 * coffee) {
            return "great";
        } else {
            return "okay";
        }
    } else {
        return "bad";
    }
}
public static int caughtSpeeding(int speed) {
    if (speed <= 60) {
        return 0;
    } else if (speed >= 61 && speed <= 80) {
        return 1
    } else {
        return 2;
    

public static boolean luckySeven(int a, int b) {
    return (a == 7 || b == 7 || a + b == 7 || Math.abs(a - b) == 7);
}
public static int kidOfSum(int a, int b) {
    int sum = a + b;
    if (sum >= 11 && sum <= 20) {
        return 20
    } else {
        return sum
    }
}

