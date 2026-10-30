package p01;

/*  1번
num,name,kor,eng,mat
번호,이름,국어,영어,수학
1,a,70,80,90
2,b,0,70,100
3,c,70,90,90
4,d,80,90,70
5,e,90,90,89
6,f,100,100,100
*/

class Sc {
	
	// fields
	
	private	int		num;
	private	String	name;
	private	int		kor;
	private	int		eng;
	
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
	
	
	// 함수 기능 : 입력 / 처리 / 출력
	// method
	public	void	input() {}
	public	void	process() {}
	public	void	output() {}
	
}


public class TestSc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
