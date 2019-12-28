package com.softeem;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 素数：
 * 除了1和它本身之外没有其他的因素存在
 *
 * 题目要求：
 * 调用Scanner函数，让用户向控制台输入一个数（num）,然后由程序计算出从2 - num之间有多少个素数存在，并输出所使用的时间的长度
 * 基本思想：
 * 使用两个for循环。
 * 第一层for循环用来遍历2 - num之间的每一个数。
 * 第二层for循环用来测试这个数是否是素数
 *
 */
public class Primes {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一个数:");
            int num = sc.nextInt();
            int n = 0;//定义一个变量用来计数，计算一共有多少个素数

            Date nowTime = new Date();
            System.out.println(nowTime);//方法二：Date方式，输出现在时间
            SimpleDateFormat matter = new SimpleDateFormat("现在时间:yyyy年MM月dd日E HH时mm分ss秒");
            System.out.println(matter.format(nowTime));//方法三：SimpleDateFormat方式，完整输出现在时间

            for (int i = 2; i <= num; i++) {
                boolean flag=true; //默认它们都是素数
                //将i 和 [2~(i-1)] 求余数运算，一旦发现余数为0，则修改它的身份，表明它不是素数
                for( int j=2;j<=i-1;j++) {
                    if(i % j == 0) {
                        flag=false;
                        break;
                    }
                }
                if(flag) {//若为true则输出
                    System.out.print(i + "  ");
                    n++;
                }
            }
            System.out.println();
            System.out.println(num + "之内的质数的个数是:" + n);

            Date nowTime1 = new Date();
            System.out.println(nowTime1);//方法二：Date方式，输出现在时间
            SimpleDateFormat matter1 = new SimpleDateFormat("现在时间:yyyy年MM月dd日E HH时mm分ss秒");
            System.out.println(matter1.format(nowTime1));//方法三：SimpleDateFormat方式，完整输出现在时间
    }
}
