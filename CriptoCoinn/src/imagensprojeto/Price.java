package imagensprojeto;

public class Price {

	private int price;
	private int volume;
	private int data;
	
	public Price(int price, int volume,int data) {
		super();
		this.price = price;
		this.volume = volume;
		this.data = data;
	}

	public Price(String string, String string2, Object object) {
		// TODO Auto-generated constructor stub
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
}
