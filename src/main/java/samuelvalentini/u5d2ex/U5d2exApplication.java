package samuelvalentini.u5d2ex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import samuelvalentini.u5d2ex.model.Table;

@SpringBootApplication
public class U5d2exApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx2 = SpringApplication.run(U5d2exApplication.class, args);

        System.out.println(ctx2.getBean("table3", Table.class));

    }

}
