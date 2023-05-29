package matteovaccaspring.d1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import entities.Pizza;
import entities.PizzaGiganteDecorator;
import entities.Prodotto;
import entities.ProsciuttoDecorator;
import entities.WurstelDecorator;

@Configuration
public class BeansConfiguration {
//	@Bean(name = "getPizzaProsciutto")
//	public Prodotto pizzaprosciutto(Pizza p) {
//		return new ProsciuttoDecorator("Prosciutto", 1.0, "prosciutto di parma", p);
//	}

	@Bean
	@Primary
	public Prodotto pizza() {
		return new Pizza("Pizza", 5.00, "Base : mozzarella e pomodoro");
	}

	@Bean(name = "pizzagigante")
	public Prodotto pizzagigante(Prodotto pizza) {
		return new PizzaGiganteDecorator(pizza, "pizza gigante", 1.50, "aggiunta pizza gigante");
	}

	@Bean(name = "prosciutto")
	public Prodotto prosciutto(Prodotto prodotto) {
		return new ProsciuttoDecorator("Prosciutto", 1.00, "Aggiunta di prosciutto", prodotto);
	}

	@Bean(name = "wurstel")
	public Prodotto wurstel(Prodotto prodotto) {
		return new WurstelDecorator("Wurstel", 1.30, "Aggiunta di wurstel", prodotto);
	}

}
