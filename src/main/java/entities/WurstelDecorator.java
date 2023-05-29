package entities;

public class WurstelDecorator extends ExtraAddictionDecorator {
	public Prodotto prodotto;

	public WurstelDecorator(String name, double price, String info, Prodotto prodotto) {
		super(name, price, info);
		this.prodotto = prodotto;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return prodotto.getName() + "con wurstel";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return prodotto.getPrice() + 1.30;
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return prodotto.getInfo() + " e aggiunta di wurstel";
	}

}
