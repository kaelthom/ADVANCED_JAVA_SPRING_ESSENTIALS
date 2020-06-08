import com.advancedjava.springtraining.model.GuitarPlayer;
import com.advancedjava.springtraining.model.InstrumentPlayer;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("classpath:application-context.xml");

        Scanner sc = new Scanner(System.in);
        InstrumentPlayer player = (InstrumentPlayer) context.getBean(sc.nextLine());

        System.out.println(player);
    }
}
