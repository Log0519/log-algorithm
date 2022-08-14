package com.log.array;

/**
 * @Author Log
 * @Date 2022/8/8 15:06
 * TODO 买卖股票的最佳时机
 * 给你一个整数数组 prices ，其中prices[i] 表示某支股票第 i 天的价格。
 * 在每一天，你可以决定是否购买和/或出售股票。你在任何时候最多只能持有 一股 股票。
 * 你也可以先购买，然后在 同一天 出售。
 * 返回 你能获得的 最大 利润。
 *
 */
public class L02_TheBestTimeToBuyAndSellStocks {
    public class Solution {
        public int MaxProfit(int[] prices) {
            int n = prices.length;
            if (n <= 1) return 0;
            int max = 0;
            int d;
            for (int i = 1; i < n; i++) {
                d = prices[i] - prices[i-1];
                if (d > 0) max += d;
            }
            return max;
        }
    }
}
