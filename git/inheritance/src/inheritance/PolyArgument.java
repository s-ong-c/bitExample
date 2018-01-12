package inheritance;
class Product{
	int price;
	int bonusPoint;
	public Product(int price) {
		this.price = price;
		
		bonusPoint =(int)(price/10.0);
	}
	public Product() {
		price= 0;
		bonusPoint= 0;
	}
	
	
}
class Tv extends Product{
	Tv(){super(100);}

	public String toString() {
		return "Tv []";}
	
}
class Computer extends Product{
	public Computer() {
		super(100);
	}

	@Override
	public String toString() {
		return "Computer []";
	}
	
}
class Audio extends Product{
	public Audio() {
		super(50);
		
	}
	@Override
	public String toString() {
		return "Audio []";
	
	}
	
	
}
class Buy{
	
}
public class PolyArgument {

}
