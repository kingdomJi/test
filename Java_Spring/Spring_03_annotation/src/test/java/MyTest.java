import com.jiang.config.JiangConfig;
import com.jiang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {

            ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
            User user=context.getBean("user",User.class);//注解实现装配,由于没有命名，
            //System.out.println(user);
            System.out.println(user.getName());


    }
    @Test
    public void myTest(){//JavaConfig配置类驱动,当用纯Java配置类来做处理时，要用AnnotationConfig上下文来获取容器，通过配置类的class对象加载。
    ApplicationContext context=new AnnotationConfigApplicationContext(JiangConfig.class);
        User getUser = (User)context.getBean("getUser");
        System.out.println(getUser.getName());
    }
}
