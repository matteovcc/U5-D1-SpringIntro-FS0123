package matteovaccaspring.d1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import entities.Prodotto;
import entities.ProsciuttoDecorator;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class D1Application {

	public static void main(String[] args) {
		SpringApplication.run(D1Application.class, args);

//		Prodotto pizza1 = new Pizza("Pizza base", 5, "pizza base mozzarella sugo");
//		System.out.println("Prodotto" + pizza1.toString());
//
//		Prodotto pizzaconprosciutto = new ProsciuttoDecorator("Prosciutto", 1.0, "prosciutto di parma", pizza1);
//
//		System.out.println(pizzaconprosciutto.getName() + " di prezzo: " + pizzaconprosciutto.getPrice() + " ,info : "
//				+ pizzaconprosciutto.getInfo());
		configWithConfigurationAnnotation();
	}

	public static void configWithConfigurationAnnotation() {
//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(D1Application.class);
////		log.info(ctx.getBean("getPizzaProsciutto").toString());
//		Prodotto pizzaconprosciutto = ctx.getBean(Prodotto.class);
//		log.info(pizzaconprosciutto.toString());

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeansConfiguration.class);

		Prodotto pizzaGigante = (Prodotto) ctx.getBean("pizzagigante");
		System.out.println("Prodotto: " + pizzaGigante.getName() + " prezzo: " + pizzaGigante.getPrice());
		Prodotto pizzaConProsciutto = (Prodotto) ctx.getBean("prosciutto");
		System.out.println("Il prodotto: " + pizzaConProsciutto.getName() + "prezzo: " + pizzaConProsciutto.getPrice()
				+ " info: " + pizzaConProsciutto.getInfo());

		Prodotto wurstel = (Prodotto) ctx.getBean("wurstel");
		System.out.println(wurstel.getPrice() + " " + wurstel.getName() + " gusto: " + wurstel.getInfo());

		Prodotto wurstelconprosciutto = new ProsciuttoDecorator("", 0, "", wurstel);
		log.info(wurstelconprosciutto.getName() + " prezzo :" + wurstelconprosciutto.getPrice() + " info: "
				+ wurstelconprosciutto.getInfo());
		ctx.close();

	}

}
