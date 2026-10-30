package p02;
//2번 ========================================
/* csv format- commprivate String seperator variable
1,P01,10,1250.0
2,P02,15,2000.0
3,P03,30,1500.0
5,P04,25,2000.0
4,P05,28,1900.0
*/
// 입력:번호,제품코드,수량,단가
//      num, code, amount, price
// P01:aa, P02:ab, P03:ac, P04:ad, P05:ae
// 출력:번호,제품명,수량,단가,금액(수량*단가)
//      num, name, amount, price, kum

import java.util.Scanner;

interface	Ipo{
	void	input();
	void	process();
	void	output();
	
	
}
		// data class : DTO - Data Transfer Object
		// 	Entity	/	VO - Value Object
		// fields
class	ProductDta {
		private	int		num;
		private	String	code;
		private	int		amount;
		private	double	price;
		
		private	String	name;
		private	double	kum;
		
		// constructor
		
		public ProductDta() {}
		/*
		public ProductDta(int num, String code, int amount, 
				double price, String name, double kum) {
			super();
			this.num = num;
			this.code = code;
			this.amount = amount;
			this.price = price;
			this.name = name;
			this.kum = kum;
		}

		public ProductDta(int num, String code, int amount, double price) {
			super();
			this.num = num;
			this.code = code;
			this.amount = amount;
			this.price = price;
		}
		*/
		
		public ProductDta(int num, String code, int amount, double price) {
			super();
			this.num = num;
			this.code = code;
			this.amount = amount;
			this.price = price;
		}
		
		// getter / setter
		

		public int getNum() {
			return num;
		}

		public void setNum(int num) {
			this.num = num;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public int getAmount() {
			return amount;
		}

		public void setAmount(int amount) {
			this.amount = amount;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getKum() {
			return kum;
		}

		public void setKum(double kum) {
			this.kum = kum;
		}
		
		
		// toString
		@Override
		public String toString() {
			return "ProductDta [num=" + num + ", code=" + code + ", amount=" + amount + ", price=" + price + ", name="
					+ name + ", kum=" + kum + "]";
		}
		
}


// 기능 class
class	Product implements Ipo {
	
	// fields
	private	ProductDta	p;
	
	
	//method
	@Override
	public void input() {
		// TODO Auto-generated method stub
		Scanner		in	=	new	Scanner(System.in);
		
		
		
		System.out.println("번호,제품코드,수량,단가");
		String		line	=	in.nextLine();		
		// line : "2,P02,15,2000.0"
		//			0	1	2	3
		// li[] : "2","P02","15","2000.0"
		String	[]	li		=	line.trim().split(",");
		int			num		=	Integer.parseInt(li[0].trim());		
		// num, code, amount, price
		String		code	=	li[1].trim();
		int			amount	=	Integer.parseInt(li[2].trim());
		double		price	=	Double.parseDouble(li[3].trim());
		
		p	=	new	ProductDta(num, code, amount, price);
		
	}

	@Override
	public void process() {
		// TODO Auto-generated method stub
		//	name P01:aa, P02:ab, P03:ac, P04:ad, P05:ae
			String	name	=	"aa";
			if(p.getCode() == "P01");	// code == "p01" / == .equals("P01")
			p.setName("aa");
			p.setName(name);
		
			
			if (p.getCode().equals("P02"))	//== .equals("P02")
				p.setName(name);
			else
			if (p.getCode().equals("P03"))
				p.setName("ac");
			else
			if(p.getCode().equals("P04"))
				p.setName("ad");

			
		//	price	금액(수량*단가)
			// double	kum	=	10000.0;
			double	kum	=	p.getAmount() * p.getPrice();
			
			p.setKum(kum);
		
		
		
	}

	@Override
	public void output() {
		// TODO Auto-generated method stub
		// System.out.println(p);	// p.toString()
		System.out.println("번호,제품명,수량,단가,금액");
		String	format = "%05d	%s	%d	%.3f	%.3f";
		String	msg	=	String.format(format, 
				p.getNum(), p.getName(), p.getAmount(), p.getPrice(),
				p.getKum());
		System.out.println(msg);
		
	}
		
	
}

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product		p1	=	new	Product();
		p1.input();
		p1.process();
		p1.output();
		
	}

}
