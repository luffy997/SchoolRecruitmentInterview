package javase.threadlocal;

/**
 * ThreadLocal的使用场景
 * @author 路飞
 * @create 2021/3/2 10:39
 */
public class UserService {

    //这里省略接口的声明
    private LogDao logDao = new LogDao();
    private UserDao userDao = new UserDao();

    //事务的边界放在业务层
    //JDBC的封装，connection
    //所有操作Dao的框架，底层都是对JDBC的封装，都是公用Connetion
    public void add(){
        userDao.setUser();
        logDao.setLog();
    }

    //这样的代码是不能控制到事务的边界，原因是userdao和logdao是不同的connection
    //假如userdao没问题，提交成功
    //logdao出现问题，事务问题，是没办法回滚到userdao
    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.add();
    }
}
