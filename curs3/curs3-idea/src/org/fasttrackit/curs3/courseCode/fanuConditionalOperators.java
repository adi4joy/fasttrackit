package org.fasttrackit.curs3;

public class fanuConditionalOperators {
    public static void main(String[] args) {
        useAnd();
        useOr();
    }

    public static void useOr() {
        boolean correctPin = true;
        boolean hasMoney = false;
        boolean bankManager = true;

        boolean authorized = correctPin && hasMoney || bankManager;
        System.out.println(authorized);

        correctPin = false;
        hasMoney = true;
        boolean canBorrow = true;
        authorized = correctPin && (hasMoney || canBorrow);
        System.out.println(authorized);
    }

    public static void useAnd() {
        int availableMoney = 10;
        boolean correctPin = true;
        int wantedMoney = 30;

        boolean authorized = correctPin && availableMoney >= wantedMoney;
        System.out.println(authorized);
    }
}
