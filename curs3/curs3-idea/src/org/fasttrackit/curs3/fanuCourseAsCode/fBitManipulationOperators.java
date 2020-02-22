package org.fasttrackit.curs3;

public class fBitManipulationOperators {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------");
        System.out.println("AND Operator: &");
        int number = 0B0101;
        int mask = 0B0001;
        int result = number & mask;
        System.out.println("0101 & 0001 = " + Integer.toBinaryString(result));

        System.out.println("------------------------------------------------------");
        System.out.println("OR  Operator: |");
        result = number | mask;
        System.out.println("0101 | 0001 = " + Integer.toBinaryString(result));

        System.out.println("------------------------------------------------------");
        System.out.println("XOR Operator: ^");
        result = number ^ mask;
        System.out.println("0101 ^ 0001 = " + Integer.toBinaryString(result));

        System.out.println("------------------------------------------------------");
        System.out.println("Shift Right Operator: >>");
        result = number >> 2;
        System.out.println("0101>>2 - will move the bits two positions to right, losing the moved bits = " + Integer.toBinaryString(result));

        System.out.println("------------------------------------------------------");
        System.out.println("Shift Left Operator: <<");
        result = number << 2;
        System.out.println("0101<<2 - will move the bits two positions to left, adding 0 to the new positions = " + Integer.toBinaryString(result));
    }
}
