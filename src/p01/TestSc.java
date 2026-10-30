package p01;

import java.nio.charset.Charset;

// import java.util.Scanner;

/*  1번
num,name,kor,eng,mat
번호,이름,국어,영어,수학
1,"a",70,80,90
2,"b",0,70,100
3,"c",70,90,90
4,"d",80,90,70
5,"e",90,90,89
6,"f",100,100,100
*/

class Sc {
	
	// fields
	// 입력
	private	int		num;
	private	String	name;
	private	int		kor;
	private	int		eng;
	// 출력
	
	private	int		tot;
	private	double	avg;
	private	char	grade;
	
	
	// constructor : new 입력단계 : 초기화
	public	Sc() {}
	public	Sc(int num, String name, int kor, int eng, 
			int tot, double avg, char grade) {
		super();
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;

		this.tot = 0;
		this.avg = 0.0;
		this.grade = 'f';
	}
	
	public Sc(int i, String string, int j, int k, int l) {
		// TODO Auto-generated constructor stub
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
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	
	// 함수 기능 : 입력 / 처리 / 출력
	// method
	/*
	public	void	input() {
		Scanner		in	=	new	Scanner(System.in);
		System.out.println("번호,이름,국어,영어");
		sc.setNum()	
	}
	public	void	process() {}
	public	void	output() {}
	 */
	// toString : 중간 확인
	@Override
	public String toString() {
		return "Sc [num=" + num + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", tot=" + tot + ", avg=" + avg
				+ ", grade=" + grade + "]";
	}
	
	// method
	public int calcTot() {
		// TODO Auto-generated method stub
		this.tot		=	kor	+ eng;
		return tot;
		// return null;
	
	}
	
	public double calcAvg() {
		// avg	=	tot / 3.0;	// total 계산x 0	
		avg	=	calcTot()	/	3.0;
		// == avg	=	(kor	+	eng) / 3.0;
		return	avg;
		
	}
	public char calcGrade() {
		// TODO Auto-generated method stub
		// average 
		// 90~100 : "A" 
		// 80~90 미만 : "B" 
		// 70~90 : "C"
		// 60~70 : "D"
		// 0~60 : "F"
		
		avg	=	calcAvg();
		if (90 <= avg && avg <= 100) grade = 'A';
		else if (80 <= avg && avg < 90) grade = 'B';
		else if (70 <= avg && avg < 80) grade = 'C';
		else if (60 <= avg && avg < 70) grade = 'D';
		else if (0 <= avg && avg < 60) grade = 'F';
		
		
		return grade;		// Type mismatch: cannot convert from char to String
		// return null;
	}
	
	
}


public class TestSc {

	private static String totStr;
	private static Sc sc2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		Sc	sc	= new	Sc();
		sc.input();
		sc.process();
		sc.output();
		*/
		
		
		Sc	sc1	=	new	Sc(1,"a",70,80,90);
		System.out.println(sc1.toString());
		// System.out.println(sc1);
		int	tot	=	sc1.calcTot();
		String totStr	=	String.valueOf(tot);
		System.out.println("total" + sc1.calcTot());
		System.out.println("total" + totStr);
		System.out.println("average" + sc1.calcAvg());
		System.out.println("grade" + sc1.calcGrade());
		
		
		
		Sc	sc2	=	new Sc(2,"b",0,70,100);
		sc2.setNum(5);
		sc2.setName("b");
		sc2.setKor(70);
		sc2.setEng(100);
		sc2.calcTot();
		sc2.calcAvg();
		sc2.calcGrade();
		
		/*
		System.out.println(sc2);
		System.out.println("num name kor eng total average grade");
		System.out.printf("%d %s %d %d %d %.3f %c", 
				sc2.getNum(), sc2.getName(), sc2.getKor(), sc2.getEng(),
				sc2,getTot(), sc2.getAvg(), sc2.getGrade());
		*/
		
		System.out.println(sc2.toString());
		// System.out.println(sc2);
		// int	tot	=	sc2.calcTot();
		System.out.println("total" + sc2.calcTot());
		System.out.println("total" + totStr);
		System.out.println("average" + sc2.calcAvg());
		System.out.println("grade" + sc2.calcGrade());
		
		Sc	sc3	=	new Sc(3,"c",70,90,90);
		sc3.setNum(5);
		sc3.setName("c");
		sc3.setKor(90);
		sc3.setEng(90);
		sc3.calcTot();
		sc3.calcAvg();
		sc3.calcGrade();
	
		System.out.println(sc3.toString());
		// System.out.println(sc3);
		// int	tot	=	sc3.calcTot();
		System.out.println("total" + sc3.calcTot());
		System.out.println("total" + totStr);
		System.out.println("average" + sc3.calcAvg());
		System.out.println("grade" + sc3.calcGrade());
		
		
		Sc	sc4	=	new Sc(4,"d",80,90,70);
		sc4.setNum(5);
		sc4.setName("d");
		sc4.setKor(90);
		sc4.setEng(70);
		sc4.calcTot();
		sc4.calcAvg();
		sc4.calcGrade();
		
		System.out.println(sc4.toString());
		// System.out.println(sc4);
		// int	tot	=	sc4.calcTot();
		System.out.println("total" + sc4.calcTot());
		System.out.println("total" + totStr);
		System.out.println("average" + sc4.calcAvg());
		System.out.println("grade" + sc4.calcGrade());
		
		
		
	}

	private static Object getTot() {
		// TODO Auto-generated method stub
		return null;
	}

}
