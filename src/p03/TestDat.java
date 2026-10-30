package p03;
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



// field
class Dat {
	
	private	int		num;
	private	String	name;
	private int		day;
	private	String	comp;
	
	
	private	int		price;
	private	int		plus;
	

// constructor


public	Dat () {}

public Dat(int num, String name, int day, int price, String comp) {
	super();
	this.num = num;
	this.name = name;
	this.day = day;
	this.price = price;
	this.comp = comp;
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

public int getDay() {
	return day;
}

public void setDay(int i) {
	this.day = i;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public String getComp() {
	return comp;
}

public void setComp(String comp) {
	this.comp = comp;
}



// toString


@Override
public String toString() {
	return "Dat [num=" + num + ", name=" + name + ", day=" + day + ", comp=" + comp + ", price=" + price + ", plus="
			+ plus + "]";
}


// method
public void input() {
	// TODO Auto-generated method stub
}


public void process() {
	// TODO Auto-generated method stub
	
}

public void output() {
	// TODO Auto-generated method stub

}

public class TestDat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//사번,이름,입사일,월급,부서번호 
		

	}

}
}