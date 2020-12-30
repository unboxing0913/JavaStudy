package part01.sec01.exam01;

public class Ex08_04 {

	public static void main(String[] args) {
		
		int aa[]= {100,200,300,400}; //중괄호로 직접값을 줄수도있다.
		int[] bb= new int[] {100,200,300}; //값을주면 값이만들어졌기때문에 굳이 []에다 숫자를안줘도된다.
		int cc[]; //선언하고 나중에 줄수도있다. 선언과동시에줄때는 직접값을줬지만 선언하고줄때는 new int[]이렇게 추가
		cc=new int[] {100,200}; //선언하고 줄때는 배열은 이미선언했기때문에 배열명만! 쓰면된다.
		int[] dd=new int[1];//크기를 직접 줄수도있다.
		dd[0]=100;//100이라는숫자를 dd배열 0번째에 넣어라
		
		int i;
		
		for(i=0;i<4;i++) {
			System.out.printf("aa[%d]==>%d\t",i,aa[i]); //배열가장중요한것 위치 위치는항상0부터
		}System.out.println();
		for(i=0;i<3;i++) {
			System.out.printf("bb[%d]==>%d\t",i,bb[i]);
		}System.out.println();
		for(i=0;i<2;i++) {
			System.out.printf("cc[%d]==>%d\t",i,cc[i]);
		}System.out.println();
		for(i=0;i<1;i++) {
			System.out.printf("dd[%d]==>%d\t",i,dd[i]);
		}System.out.println();
	}

}
