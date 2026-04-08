package samuelvalentini.u5d2ex.model;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import samuelvalentini.u5d2ex.config.MenuConfig;

@Component
public class Runner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MenuConfig.class);
        Menu menu = ctx.getBean(Menu.class);
        System.out.println(menu);
    }
}
