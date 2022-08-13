package com.log.other.day2022_8_13;

/**
 * @Author Log
 * @Date 2022/8/13 11:10
 * TODO 排列硬币-三种解法
 * 总共n枚硬币，摆成一个阶梯形状，第k行必须有k枚硬币，返回完整阶梯行的总行数
 *          *      1
 *        *   *    2
 */
public class O08_ArrangeCoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(21));
        System.out.println(arrangeCoins2(21));
        System.out.println(arrangeCoins3(21));
    }
    //迭代(暴力)
    public static int arrangeCoins(int n){
        for (int i = 1; i <= n; i++) {
            n=n-i;
            if(n<=i){
                return i;
            }

        }

        return 0;
    }
    //二分查找
    public static int arrangeCoins2(int n){
        int low=0;
        int high=n;
        while (low<=high){
            int mid =(high-low)/2+low;
            int cost=((mid+1)*mid)/2;
            if(cost==n){
                return mid;
            } else if (cost>n) {
                high=mid-1;
            } else if (cost<n) {
                low=mid+1;
            }
        }
        return high;
    }

    //最优：牛顿迭代 公式：(x+n/x)/2
    public static double arrangeCoins3(int n){
        if(n==0){
            return 0;
        }
        return (int)sqrt(n,n);
    }

    //x预估就可以了
    private static double sqrt(double x, int n) {
        double res=(x+(2*n-x)/x)/2;
        if(res==x){
            return x;
        }else {
            return sqrt(res,n);
        }
    }
}
