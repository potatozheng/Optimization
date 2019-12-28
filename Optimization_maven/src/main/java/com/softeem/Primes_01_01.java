package com.softeem;
import java.util.Scanner;
/**
 * 时间计数修改
 */
public class Primes_01_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数:");
        int num = sc.nextInt();
        int n = 0;//定义一个变量用来计数，计算一共有多少个素数
        long time1=System.currentTimeMillis();

        for (int i = 2; i <= num; i++) {
            boolean flag = true; //默认它们都是素数
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {//若为true则输出
               // System.out.print(i + "  ");
                n++;
            }
        }

        System.out.println();
        System.out.println(num + "之内的质数的个数是:" + n);

        long time2=System.currentTimeMillis();
        System.out.println("当前程序耗时："+(time2-time1)+"ms");
    }
}