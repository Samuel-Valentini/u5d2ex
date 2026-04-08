package samuelvalentini.u5d2ex.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import samuelvalentini.u5d2ex.config.MenuConfig;

import java.util.List;

@Component
@PropertySource("application.properties")
public class Runner implements CommandLineRunner {
    @Value("${order.coverCharge}")
    private double coverCharge;


    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MenuConfig.class);
        Menu menu = ctx.getBean(Menu.class);
        System.out.println(menu);
        Order order = new Order(List.of(ctx.getBean("salamiPizzaXL", Pizza.class), ctx.getBean("doubleHamPizza", Pizza.class), ctx.getBean("lemonade", Drink.class), ctx.getBean("water", Drink.class)), coverCharge, 2, OrderStatus.IN_PROGRESS, ctx.getBean("table2", Table.class));
        System.out.println(order);

    }

}
