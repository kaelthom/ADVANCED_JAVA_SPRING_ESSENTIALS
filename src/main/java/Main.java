import com.advancedjava.springtraining.model.InstrumentPlayer;
import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Scanner sc = new Scanner(System.in);
        InstrumentPlayer player = (InstrumentPlayer) context.getBean(sc.nextLine());

        System.out.println(player);
    }
}
