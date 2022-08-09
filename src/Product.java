
public class Product implements Comparable<Product>, Cloneable {
	private String name, maker;
	private int price;
	
	public void setPrice(int price) {
		this.price= price;
	}
	
	Object copy(){
		Object obj = null;
		try {
			obj = this.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("이 객체는 복제를 지원하지 않습니다.");
		}
		return obj;
	}
	public Product(String name, int price, String maker) {
		this.name = name;
		this.price = price;
		this.maker = maker;
		}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price =" + price + ",maker=" + maker + "]";
	}

	@Override
	public int compareTo(Product obj) {		// obj.name가 뒤의 객체가 된다
		return this.name.compareTo(obj.name);	// 오름차순
	}
}
