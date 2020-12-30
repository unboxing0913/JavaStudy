package part01.sec01.exam01;

public class Program_9 {

	public static void main(String[] args) {
		Object[] arr=new Object[5];//모든클래스의 조상 Object[] 부모타입으로 다형성원리에 의해서 가능하다(객체일경우)
		arr[0]="오렌지";
		arr[1]=new Integer(52);
		arr[2]=3.14;
		arr[3]=new Character('귤');
		arr[4]=true;
		
		for(int cnt=0;cnt<arr.length;cnt++) {
			System.out.println(arr[cnt]);
		}
	}

}
