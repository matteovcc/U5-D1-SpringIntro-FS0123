package entities;

public class PizzaGiganteDecorator extends ExtraAddictionDecorator {
	public Prodotto pizza;

	public PizzaGiganteDecorator(Prodotto pizza, String name, double price, String info) {
		super(name, price, info);
		this.pizza = pizza;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "La Pizza gigante " + pizza.getName();
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return pizza.getPrice() + 1.50;
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return pizza.getInfo() + " (GIGANTE)";
	}

}
