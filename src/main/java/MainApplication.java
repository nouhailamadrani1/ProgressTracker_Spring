import model.User;
import model.Goal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.ServiceProgressTracker;


public class MainApplication {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");


        ServiceProgressTracker progressTracker = context.getBean(ServiceProgressTracker.class);


        progressTracker.createNewUserAndAssignGoal();


    }
}
