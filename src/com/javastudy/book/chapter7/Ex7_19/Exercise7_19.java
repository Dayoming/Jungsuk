package com.javastudy.book.chapter7.Ex7_19;

class Exercise7_19 {
	public static void main(String args[]) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		b.summary();
	}
}

class Buyer {             
	int money = 1000; 
	Product[] cart = new Product[3];
	int i = 0;
	boolean buyFlag;

	void buy(Product p) {
		if (buyFlag) {
			return;
		}
		if (money < p.price) {
			System.out.println("잔액이 부족하여 " + p + "을/를 살수 없습니다.");
			buyFlag = true;
			return;
		}
		money = money - p.price;
		add(p);
	} 

	void add(Product p) {
		if (i >= cart.length) {
			Product[] cart2 = new Product[cart.length * 2];
			System.arraycopy(cart, 0, cart2, 0, cart.length);
			cart = cart2;
		}
		cart[i] = p;
		i++;
	} // add(Product p)

	void summary() {
		int summaryInt = i-1;
		System.out.print("구입한 물건: ");
		for (int x = 0; x < cart.length; x++) {
			if (cart[x] != null) {
				System.out.print(cart[x] + ", ");
			}
		}

		System.out.println();

		System.out.print("사용한 금액: ");
		int sum = 0;
		for (int y = 0; y < cart.length; y++) {
			Product product = cart[y];
			if (product != null) {
				sum += product.price;
			}
		}

		System.out.print(sum);

		System.out.println();

		System.out.print("남은 금액: ");
		System.out.print(money);

	} // summary()
} 

class Product {
	int price;

	Product(int price) {
		this.price = price;
	}
}

class Tv extends Product {
	Tv() { super(100); }

	public String toString() { return "Tv"; }
}

class Computer extends Product {
	Computer() { super(400); }

	public String toString() { return "Computer";}
}

class Audio extends Product {
	Audio() { super(50); }

	public String toString() { return "Audio"; }
}
