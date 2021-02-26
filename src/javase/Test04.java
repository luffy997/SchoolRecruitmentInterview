package javase;

/**
 * 常见递归面试题
 * 求阶乘
 * 斐波那契数列
 * 汉洛塔
 * @author 路飞
 * @create 2021/2/26 16:31
 */
public class Test04 {
    public static void main(String[] args) {
//        System.out.println(getJieCheng(0));
//        System.out.println(getFeiBo(8));
        hano('A','B','C',1);
    }

    /**
     * 求阶乘
     * @param n
     * @return
     */
    public static int getJieCheng(int n){
        if (n < 0){
            throw new RuntimeException("参数异常");
        }
        if (n == 1 || n == 0){
            return 1;
        }
        return getJieCheng(n-1)*n;
    }

    /**
     * 求斐波那契数列第n个数是几
     */
    public static int getFeiBo(int n) {
        if (n < 0) {
            throw new RuntimeException("参数异常");
        }
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return getFeiBo(n - 1) + getFeiBo(n - 2);
        }
    }
    /**
     * Hano
     */
    public static void hano(char A,char B,char C,int n){
        if (n < 0) throw new RuntimeException("参数异常");
        if (n > 0){
            hano(A,C,B,n-1);
            System.out.println(A + "->" + C);
            hano(B,A,C,n-1);
        }
    }
}
