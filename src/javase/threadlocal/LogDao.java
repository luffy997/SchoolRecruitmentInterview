package javase.threadlocal;

/**
 * @author 路飞
 * @create 2021/3/2 10:39
 */
public class LogDao {

    public void setLog(){
        System.out.println("log");
        Connection connection = ConnectionUtils.getConnection();
        System.out.println("logdao"+connection);
        //创建connection对象
        //connection.commit();
        //connection.rollback();
    }
}
