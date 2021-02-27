package javase;

/**
 * throw 和 throws的区别
 * throw作用与方法内，用于主动抛出异常
 * throws作用于方法声明上，声明该方法有可能会抛出某些异常
 *
 * 针对项目中，异常的处理方式，我们一般采用层层往上抛，最终通过异常处理机制统一处理，
 * （展示异常页面，或者统一返回json信息），自定义异常一般继承RuntimeException,w我们
 * 去看Hibernate等框架，他们的异常体系都是最终继承自RuntimeException
 * @author 路飞
 * @create 2021/2/27 12:47
 */
public class Test21 {

}
