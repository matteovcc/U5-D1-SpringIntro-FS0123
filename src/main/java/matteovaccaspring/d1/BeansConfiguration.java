package matteovaccaspring.d1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import entities.Pizza;
import entities.PizzaGiganteDecorator;
import entities.Prodotto;
import entities.ProsciuttoDecorator;

@Configuration
public class BeansConfiguration {
//	@Bean(name = "getPizzaProsciutto")
//	public Prodotto pizzaprosciutto(Pizza p) {
//		return new ProsciuttoDecorator("Prosciutto", 1.0, "prosciutto di parma", p);
//	}

	@Bean
	public Prodotto pizza() {
		return new Pizza("Pizza", 5.00, "Base : mozzarella e pomodoro");
	}

	@Primary
	@Bean(name = "pizzagiganteDecorator")
	public Prodotto pizzagiganteDecorator(Prodotto pizza) {
		return new PizzaGiganteDecorator(pizza, "pizza gigante", 1.50, "aggiunta pizza gigante");
	}

	@Bean(name = "prosciuttoDecorator")
	public Prodotto prosciuttoDecorator(Prodotto prodotto) {
		return new ProsciuttoDecorator("Prosciutto", 1.00, "Aggiunta di prosciutto", prodotto);
	}

}
