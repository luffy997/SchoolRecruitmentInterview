package javase;

/**
 * 接口和抽象类的区别：
 * 这个问题，要分JDK版本来区分回答：
 *
 * JDK1.8之前：
 * 语法：
 * 抽象类：方法可以有抽象的，也可以有非抽象, 有构造器
 * 接口：方法都是抽象，属性都是常量，默认有public static final修饰
 * 设计：
 * 抽象类：同一类事物的抽取，比如针对Dao层操作的封装，如，BaseDao，BaseServiceImpl
 * 接口：通常更像是一种标准的制定，定制系统之间对接的标准
 * 例子：
 * 1，单体项目，分层开发，interface作为各层之间的纽带，在controller中注入IUserService，在Service注入IUserDao
 * 2，分布式项目，面向服务的开发，抽取服务service，这个时候，就会产生服务的提供者和服务的消费者两个角色
 * 这两个角色之间的纽带，依然是接口
 * JDK1.8之后：
 * 接口里面可以有实现的方法，注意要在方法的声明上加上default或者static
 * 最后区分几个概念：
 *
 * 多继承，多重继承，多实现
 * 多重继承：A->B->C（爷孙三代的关系）
 * 多实现：Person implements IRunable,IEatable（符合多项国际化标准）
 * 多继承：接口可以多继承，类只支持单继承
 *
 * @author 路飞
 * @create 2021/2/26 17:32
 */
public class Test08 {
}
