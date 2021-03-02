package javase;

/**
 * 三层架构（之前我一直觉得三层结构就是MVC，其实两者关系并不大），首先说说三层架构：
 * Web层：负责与用户交互并对外提供服务接口
 * 业务逻辑层：实现业务逻辑模块
 * 数据存储层：将业务层出来的结果持久化，方便后续查找
 *
 * 每个层常用的框架：
 * Web层：SpringMVC，Struts2，Struts1
 * 业务逻辑层：Spring
 * 数据持久层：Hibernate，Mybatis，SpringDataJPA，SpringJDBC
 *
 * MVC是对三层架构中Web层做了进一步的划分，更加细化
 * Model(模型)：模型代表一个存储数据的对象或Java Pojo Entity
 * View(视图)：视图代表模型包含的数据的可视化，比如Html，Jsp，Thymeleaf，FreeMarker等等
 * Controller（控制器）：控制器作用于模型和视图上。它控制数据流向模型对象，并在数据变化时更新视图。它使视图与模型分离开，目前的技术代表是Servlet，Controller
 *
 * 常见的MVC框架：SpringMVC，Struts
 * DispatchServlet：前端控制器，由它来接收客户端的请求，再根据客户端请求的URL的特点，
 * 分发到对应的业务控制器，比如UserController
 *
 *
 * @author 路飞
 * @create 2021/3/2 14:58
 */
public class Test34 {
}
