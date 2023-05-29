package entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Slf4j
@ToString
public abstract class ExtraAddictionDecorator extends Prodotto {
	public ExtraAddictionDecorator(String name, double price, String info) {
		super(name, price, info);
		// TODO Auto-generated constructor stub
	}

	protected Prodotto prodotto;

	@Override
	public abstract String getName();

	@Override
	public abstract double getPrice();

	@Override
	public abstract String getInfo();

}
