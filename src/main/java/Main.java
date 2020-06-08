import com.advancedjava.springtraining.GuitarPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:application-context.xml");

        GuitarPlayer guitarPlayer = context.getBean("guitarplayerbean", GuitarPlayer.class);

        guitarPlayer.getGuitar().play();
    }
}
