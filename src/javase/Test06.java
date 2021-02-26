package javase;

/**
 * 方法的重写和重载的区别：
 * 重载：一个类中，方法名相同，参数列表不同，与方法返回类型无关！！！！！
 * 重写：发生在父类和子类之间的，方法名相同，参数列表相同！
 * @author 路飞
 * @create 2021/2/26 17:14
 */
public class Test06 {

    public static void main(String[] args) {

    }

    public int add(int a,int b){
        return a + b;
    }


    public double add(int a){
        return a;
    }

    //上面两个方法构成重载，

//    public double add(int a,int b){
//        return a+b;
//    }
    //该方法则不构成重载，编译都不能通过，因为方法名和参数列表一直，返回类型不一样，是不构成重载的
}
