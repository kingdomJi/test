import com.jiang.dao.UserDaoImpl;
import com.jiang.service.UserService;
import com.jiang.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //用户调用service层，不实际接触Dao层
        //这里是spring之前的代码
//        UserService userService =new UserServiceImpl();//new一个业务层，不直接newDao层
//        ((UserServiceImpl)userService).setUserDao(new UserDaoImpl());
//        userService.getUser();

        //获取ApplicationContext，拿到spring的容器,容器在手，需要什么就get什么
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");//alt+enter,创造对象的快捷键
        //容器在手，需要什么就get什么
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("userService");//这里填spring里的对象名
        userServiceImpl.getUser();
    }
}
