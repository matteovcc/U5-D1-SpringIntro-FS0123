package entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Slf4j
@ToString
public class Pizza extends Prodotto {

	public Pizza(String name, double price, String info) {
		super(name, price, info);
		name = getName();
		price = getPrice();
		info = getInfo();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Pizza";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return "Base : mozzarella e pomodoro";
	}

}
