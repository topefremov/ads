package com.github.topefremov.algs.week3.maximizingloot;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FractionalKnapsackTest {

    @Test
    public void getBestItemTest1() {
        int[] values = new int[]{60, 100, 120};
        int[] weights = new int[]{20, 50, 30};
        int bestItem = FractionalKnapsack.getBestItem(values, weights);
        assertEquals(2, bestItem);
    }

    @Test
    public void getBestItemTest2() {
        int[] values = new int[]{500};
        int[] weights = new int[]{30};
        int bestItem = FractionalKnapsack.getBestItem(values, weights);
        assertEquals(0, bestItem);
    }

    @Test
    public void testCase1() {
        int[] values = new int[]{60, 100, 120};
        int[] weights = new int[]{20, 50, 30};
        int capacity = 50;
        assertEquals(180.0000, FractionalKnapsack.getOptimalValue(capacity, values, weights), 0.001);
    }

    @Test
    public void testCase2() {
        int[] values = new int[]{500};
        int[] weights = new int[]{30};
        int capacity = 10;
        assertEquals(166.6667, FractionalKnapsack.getOptimalValue(capacity, values, weights), 0.001);
    }

    @Test
    public void testCase3() {
        int[] values = new int[]{
                1347,
                3494,
                4257,
                2741,
                5711,
                1562,
                4116,
                7471,
                5833,
                5989,
                416,
                5515,
                2016,
                2442,
                3905,
                3404,
                9100,
                6207,
                1644,
                2240,
                5231,
                1335,
                673,
                393,
                6964,
                5535,
                6252,
                89,
                8073,
                7775,
                2053,
                2226,
                3563,
                693,
                9315,
                5007,
                1829,
                9173,
                8908,
                2625,
                5008,
                7867,
                7532,
                7824,
                435,
                4403,
                6028,
                5586,
                5289,
                5541,
                2234,
                4306,
                2299,
                8374,
                4343,
                7359,
                8939,
                6261,
                7100,
                8205,
                982,
                6358,
                3990,
                570,
                2200,
                4519,
                5251,
                5209,
                1239,
                6045,
                8871,
                3897,
                3756,
                143,
                7592,
                7106,
                4762,
                1218,
                2520,
                5230,
                1403,
                8540,
                3841,
                6265,
                908,
                5881,
                3717,
                8574,
                8037,
                3239,
                4442,
                6518,
                6564,
                4138,
                4041,
                7052,
                2738,
                1924,
                3326,
                6057
        };
        int[] weights = new int[] {
                8254,
                9484,
                2934,
                7521,
                5054,
                4629,
                3648,
                2124,
                3039,
                8661,
                9916,
                3740,
                8876,
                3138,
                7136,
                9804,
                2398,
                7744,
                9785,
                5399,
                5351,
                7907,
                8511,
                5524,
                9136,
                5894,
                118,
                5494,
                87,
                6297,
                4437,
                7777,
                3549,
                2956,
                5477,
                5542,
                7290,
                3291,
                3019,
                7229,
                7430,
                4829,
                7996,
                5708,
                6681,
                7195,
                4428,
                4293,
                7030,
                857,
                5725,
                6936,
                7497,
                3161,
                7268,
                9172,
                2888,
                6389,
                7087,
                4136,
                147,
                5791,
                1100,
                9317,
                3256,
                3074,
                9226,
                1652,
                4033,
                1004,
                9477,
                2245,
                1859,
                8303,
                3872,
                9526,
                1678,
                5881,
                5272,
                7923,
                6299,
                9238,
                2039,
                7903,
                4283,
                7011,
                6773,
                5543,
                8704,
                1786,
                5498,
                9117,
                7320,
                2403,
                4692,
                4411,
                8,
                272,
                5588,
                8540
        };
        int capacity = 12619;
        assertEquals(66152.5720, FractionalKnapsack.getOptimalValue(capacity, values, weights), 0.001);
    }


    @Test
    public void testDivision() {
        assertEquals(16.6667, (double) 500 / 30, 0.001);
    }
}
