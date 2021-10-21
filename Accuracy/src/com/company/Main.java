package com.company;

// import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
	    double result1 = 0.1 * 7;
	    double result2 = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;

        System.out.printf("result1 is %.99f %n", result1);
        System.out.printf("result2 is %.99f %n", result2);

        double difference = result1 - result2;
        System.out.printf("The difference is %.99f %n", difference);

        boolean checkResult = result1 - result2 == 0;
    /*    BigDecimal oneTenth = BigDecimal.valueOf(0.1);

        BigDecimal result1 = oneTenth.multiply(BigDecimal.valueOf(7));
        BigDecimal result2 = oneTenth.add(oneTenth
                .add(oneTenth)
                .add(oneTenth)
                .add(oneTenth)
                .add(oneTenth)
                .add(oneTenth));

        BigDecimal difference = result1.subtract(result2);
        System.out.printf(" The difference is %.99f %n", difference);
    */
    }

}
