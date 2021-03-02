package javase;

/**
 * Cookie 和 Session的区别
 *1.存储的位置不同
 * Session：服务端
 * Cookie：客户端
 *
 * 2.存储的数据格式不一样
 * Session：value为对象，Object类型
 * Cookie：value为字符串，如果我们存储一i个对象，就需要把对象转成JSON
 *
 * 3.存储的数据大小：
 * Session：受服务器内存的控制
 * Cookie：一般来说，最多为4K
 *
 * 4.生命周期不同：
 * Session：服务端控制，默认是30分钟，注意，当用户关闭浏览器，session并不会消失
 * Cookie:客户端控制，其实是一个客户端的文件：
 * 1).默认是会话级别的cookie，这种随着浏览器的关闭而消失，比如保存sessionId
 * 的cookie
 * 2).非会话级cookie，通过设置有效期来控制，比如这种“7天免登录”的功能就需要设置有效期，setMaxAge
 *
 * 5.Cookie的其他配置
 * httpOnly:true:防止客户端的XSS攻击（跨网站脚本攻击）
 * path:"/"：访问路径
 * domain：""设置cookie的域名
 *
 * 6.cookie跟session的联系
 * http协议是一种无状态协议，服务器为了记住用户的状态，我们采用的是Session的机制
 * 而Session机制背后的原理是，服务器会自动生成会话级的cookie来保存session的标识。
 *
 *
 * @author 路飞
 * @create 2021/3/2 13:54
 */
public class Test32 {
}
