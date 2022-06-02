import com.jiang.service.UserService;
import com.jiang.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        //动态代理代理的是一类接口，这里是spring生成的代理
        UserService userService = (UserService) context.getBean("userService");
        userService.add();//执行顺序：环绕前、@before、方法本体、@after、环绕后
    }
}
