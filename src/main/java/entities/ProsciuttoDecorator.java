package entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Slf4j
@ToString
public class ProsciuttoDecorator extends ExtraAddictionDecorator {
	public Prodotto prodotto;

	@Override
	public String getName() {
		return prodotto.getName() + " con prosciutto";
	}

	@Override
	public double getPrice() {
		return prodotto.getPrice() + 1.00;
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return prodotto.getInfo() + " con aggiunta di prosciutto";
	}

	public ProsciuttoDecorator(String name, double price, String info, Prodotto prodotto) {
		super(name, price, info);
		this.prodotto = prodotto;
	}

}
