package javase;

/**
 * final修饰类，表示类不可变，不可继承
 * String就是用final修设的
 * final修设方法，方法不可重写
 * final修设变量，这个变量就是常量
 * 注意：
 * final修设的是基本数据类型，这个值本身不能修改
 * 修设的是引用类型，引用的指向不能修改
 * @author 路飞
 * @create 2021/2/26 12:00
 */
public class Test02 extends FinalTestClass {

    public static void main(String[] args) {
        final Test02 test02 = new Test02();
        test02.setAge(1);
        test02.setName("luffy");
//        System.out.println(test02);


//        System.out.println(test02.getName());

        //1.当我们的测试类FinalTestClass未加final修设就可以继承
//    @Override
//    public String getName() {
//
//        return super.getName();
//    }
        //2.我们的测试类FinalTestClass加final修设就不能继承了

        //3.我们的测试类FinalTestClass中的getName()被fianl修设就不能被重写了

//
//    @Override
//    public String getName() {
//        return super.getName();
//    }

        //4.需要的变量不可更改
        final int intTemp = 123456789;
//    System.out.println(intTemp);
//    intTemp = 123;

        //5.fin修设的引用类型，引用的指向不可改(即在堆中不可指向另一个引用)
        //以下代码是和法的 可以修改student的值
        final Student student = new Student("Alen", 1);
        student.setAge(123);
        System.out.println(student);

        //不能改变student的引用指向
//        student =  new Student();
    }
}
class Student{
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(){

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


