package javase;

/**
 * final 测试类
 * @author 路飞
 * @create 2021/2/26 12:05
 */
 public class FinalTestClass {
     private String name;
     private int age;

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public FinalTestClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public FinalTestClass() {
    }

    @Override
    public String toString() {
        return "FinalTestClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    final public String getName(){
        return "123";
    }
}
