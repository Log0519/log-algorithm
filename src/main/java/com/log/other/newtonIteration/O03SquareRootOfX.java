package com.log.other.newtonIteration;

/**
 * @Author Log
 * @Date 2022/8/12 9:12
 * TODO X的平方根
 * 重点考察：牛顿迭代 公式：(x+n/x)/2
 */
public class O03SquareRootOfX {
    public static void main(String[] args) {
        System.out.println(binarySearch(25));
        System.out.println(newton(1600));
    }
    //二分查找
    public static int binarySearch(int x){
        int index=-1;
        int l=0;
        int r=x;
        while (l<=r){
            int mid=l+(r-l)/2;
            if(mid*mid <=x){
                index=mid;
                l=mid+1;
            }else {
                r=mid-1;
            }

        }
        return index;
    }

    //牛顿迭代
    public static int newton(int x){
        if(x==0){
            return 0;
        }
        return (int) sqrt(x, x);
    }
    public static double sqrt(double i,int x){
        double res=(i+x/i)/2;
        if(res==i){
            return i;
        }else {
            return sqrt(res,x);
        }
    }





}
