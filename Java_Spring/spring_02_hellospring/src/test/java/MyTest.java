import com.jiang.pojo.Hello;
import com.jiang.pojo.Human;
import com.jiang.pojo.Student;
import com.jiang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //获取spring的上下文对象，这一条是必须要有的
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    //对象都在spring中管理了，需要用时直接就取出来
        Hello hello = (Hello) context.getBean("hello");//取出是object对象，需要强转
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());

    }
@Test
    public void test2(){
    ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
      //  User user=context.getBean("user2",User.class);
    //System.out.println(user);
    /*
    ApplicationContext context2=new ClassPathXmlApplicationContext("beanHuman.xml");
    Human human=context2.getBean("human", Human.class);
    human.getCat().shout();
    human.getDog().shout();
    */
    ////注解实现装配
    ApplicationContext context1=new ClassPathXmlApplicationContext("beanzhujie.xml");
    Human human = context1.getBean("human", Human.class);
    human.getDog().shout();
    human.getCat().shout();
    }

}


