package javase.threadlocal;

/**
 * @author 路飞
 * @create 2021/3/2 10:39
 */
public class UserDao {

    public void setUser(){
        System.out.println("user");
        Connection connection = ConnectionUtils.getConnection();
        System.out.println("userdao"+connection);
        //创建connection对象
        //connection.commit();
        //connection.rollback();
    }
}
