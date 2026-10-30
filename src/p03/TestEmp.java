package p03;


import java.time.LocalDate;
import java.util.Scanner;

//입력 1줄 -> 결과 1줄
//입력datprivate String : 사번,이름,입사일,월급,부서번호

//출력     : 사번,이름,입사일,월급,보너스,수령액,부서명


//금액은 소수이하 두자리로 반올림
//보너스   =  근무연수에 따라 월급의 0.5% 로 계산한다
//수령액   =  월급 + 보너스 
//부서명   =  10:인사,20:자재,30:총무,40:연구개발,50:생산,60:서비스

//모든기능은 class에 구현한다.
//입력 data
//사번,이름,입사일,월급,부서번호 
/*
100,a,20110101,300.0,10      
200,b,20120301,270.0,20      
300,c,20091003,250.0,30      
400,d,20110105,220.0,40      
500,e,20180401,170.0,60      
600,f,20150801,200.0,50      
*/

interface	Ipo{
	void	input();
	void	process();
	void	output();
	

class	Emp {
	// fields
	private	int		num;
	private	String	name;
	private	String	day;
	private	double	amount;
	private	int		deptno;
	
	private	double	plus;
	private	double	pay;
	private	String	deptname;
	
	
	
	// constructor
	public	Emp() {}
	public Emp(int num, String name, String day, double amount, 
			int deptno ) 	// double plus, double pay, String deptname
	{
		super();
		this.num = num;
		this.name = name;
		this.day = day;
		this.amount = amount;
		this.deptno = deptno;
		
		/*
		this.plus = plus;
		this.pay = pay;
		this.deptname = deptname;
		*/
		
	}

	
	// getter / setter

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public double getPlus() {
		return plus;
	}
	public void setPlus(double plus) {
		this.plus = plus;
	}
	public double getPay() {
		return pay;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	
	//toString

	@Override
	public String toString() {
		return "Emp [num=" + num + ", name=" + name + ", day=" + day + ", amount=" + amount + ", deptno=" + deptno
				+ ", plus=" + plus + ", pay=" + pay + ", deptname=" + deptname + "]";
	}
	
	
	
	}
	
	
}

//class Emp

class Emp implements Ipo {
	
	//fields
	private	Emp		emp;
	private int		amount;

	@Override
	public void input() {
		// TODO Auto-generated method stub
		Scanner	in	=	new Scanner(System.in);
		
		
		System.out.println("사번,이름,입사일,월급,부서번호 ");
		// line "  100,a,20110101,300.0,10  " 
		String	line	=	in.nextLine().trim();
		// line "100,a,20110101,300.0,10" 		
		String	[]	li	=	line.split(",");
		// li "100","a","20110101","300.0",10"
		int		num		=	Integer.parseInt(li[0].trim());
		String	name	=	li[1].trim();
		String	day		=	li[2].trim();
		double	amount	=	Double.parseDouble(li[3].trim());
		int		deptno	=	Integer.parseInt(li[4].trim());
		
		emp		=	new Emp (num, name, day, amount, deptno);
	}
	
	
	//금액은 소수이하 두자리로 반올림
	//보너스   =  근무연수에 따라 월급의 0.5% 로 계산한다
	//수령액   =  월급 + 보너스 
	//부서명   =  10:인사,20:자재,30:총무,40:연구개발,50:생산,60:서비스
	@Override
	public void process() {
		// TODO Auto-generated method stub
		
		int		thisYear	=	LocalDate.now().getYear();
				// 2026;
		String	day			=	emp.getDay();
		int		Year		=	Integer.parseInt(day.substring(0,3+1));
		int		Years		=	thisYear-Years;
		double	plus		=	Years * amount	*	0.005;
				// 0.0;
		double	amount		=	emp.getAmount();
		// 0.5% = 월급 * 0.005%
		double	pay			=	amount + plus;
				// 0.0;
		
		
		String	deptname	=	"";
		int	deptno		=	emp.getDeptno();
		switch (deptno) {
		case 10:	deptname	=	"인사"; break;
		case 20:	deptname	=	"자재"; break;
		case 30:	deptname	=	"총무"; break;
		case 40:	deptname	=	"연구개발"; break;
		case 50:	deptname	=	"생산"; break;
		case 60:	deptname	=	"서비스"; break;
		
		}
		
		
		
		emp.setPlus(plus);
		emp.setPay(pay);
		emp.setDeptname(deptname);
		
		
	}

	private String substring(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void output() {
		// TODO Auto-generated method stub
		
		int		num			= emp.getNum();
		String	name		= emp.getName();
		String	day			= emp.getDay();
		double	amount		= emp.getAmount();
		double	plus		= emp.getPlus();
		double	pay			= emp.getPay();
		String	deptname	= emp.getDeptname();
		
		System.out.println("사번,이름,입사일,월급,보너스,수령액,부서명");
		System.out.printf("%d	%s	%s	%.2f	%.2f	%.2f	%s",
				num, name, day, amount, plus, pay, deptname);
		
		
	}
	
	
	
}



// TestEmp : main ()

public class TestEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp	emp	=	new	Emp();
		emp.input();
		emp.process();
		emp.output();
		
		
	}

}
