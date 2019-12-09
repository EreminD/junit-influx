package com.otus.open.test;

import org.junit.runner.JUnitCore;

import java.util.Random;

class Util {
//    public static void main(String[] args) {
//        for (int i = 200; i<=205; i++){
//            System.out.println("@Test\n" +
//                    "    public void numberIsGreaterThan"+i+"(){\n" +
//                    "        assertTrue(NUMBER > "+i+");\n" +
//                    "    }\n\n");
//        }
//    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i <= 400; i++) {
            int number = new Random().nextInt(101);
            Number.NUMBER = number;
            JUnitCore core = new JUnitCore();
            core.run(Number2Tests.class, NumberTests.class);
            Thread.sleep((long) Math.pow(number, 2));
        }
    }
}
