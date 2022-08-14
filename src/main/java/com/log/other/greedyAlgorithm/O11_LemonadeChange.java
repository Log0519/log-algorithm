package com.log.other.greedyAlgorithm;

/**
 * @Author Log
 * @Date 2022/8/14 10:34
 * TODO 柠檬水找零 --贪心算法
 * 局部最优（收到20的时候首选10+5，而不是5+5+5）
 * 在柠檬水摊上，每一杯柠檬水的售价为5美元。顾客排队购买你的产品，（按账单 bills 支付的顺序）一次购买一杯。
 * 每位顾客只买一杯柠檬水，然后向你付 5 美元、10 美元或 20 美元。你必须给每个顾客正确找零，
 * 也就是说净交易是每位顾客向你支付 5 美元。
 * 注意，一开始你手头没有任何零钱。
 * 给你一个整数数组 bills ，其中 bills[i] 是第 i 位顾客付的账。如果你能给每位顾客正确找零，返回true，否则返回 false。
 */
public class O11_LemonadeChange {
    public static void main(String[] args) {
        System.out.println(lemonadeChange(new int[]{5,5,10}));

    }
    public static boolean lemonadeChange(int[] bills) {
        //手中零钱
        int five=0;
        int ten=0;
        if(bills[0]!=5){
            return false;
        }
        for (int bill : bills) {
            if(bill==5){
                five++;
            } else if (bill == 10) {
                if(five==0){
                    return false;
                }
                five--;
                ten++;
            }else {
                //贪心算法，局部最优
                if(five>0&&ten>0){
                    //优先
                    five--;
                    ten--;
                } else if (five>=3) {
                    five-=3;
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}
