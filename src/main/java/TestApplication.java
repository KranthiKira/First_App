import com.first_project.kranthi_kiran.Car;
import com.first_project.kranthi_kiran.Engine;

import com.first_project.kranthi_kiran.Engine;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApplication {
    public static void main(String[] args){
        ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("spring-beans.xml");

        Car car = cxt.getBean(Car.class);
        car.start();

    }
}

