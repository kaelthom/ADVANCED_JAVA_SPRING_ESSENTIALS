import com.advancedjava.springtraining.model.InstrumentPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.AbstractApplicationContext;

import java.util.Scanner;

public class SpringApplication {

    @Autowired
    @Qualifier("pianoPlayer")
    InstrumentPlayer player;

    public void run(AbstractApplicationContext context) {
        if (player == null) {
            Scanner sc = new Scanner(System.in);
            player = (InstrumentPlayer) context.getBean(sc.nextLine());
        }

        System.out.println(player);

        player.play();
    }
}
