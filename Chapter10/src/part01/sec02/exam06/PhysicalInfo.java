package part01.sec02.exam06;

public class PhysicalInfo {
   String name;
   int age;
   float height,weight;
   
   PhysicalInfo(String name,int age,float height,float weight){
	   this.name=name;
	   this.age=age;
	   this.height=height;
	   this.weight=weight;
   }
   //method overloading 메소드 오버로딩: 메소드명은 같으면서 매개변수(파라미터변수) 갯수,타입,순서가 다른것
   void update(int age) {
	 this.age=age;   
   }
   void update(int age,float height) {
	   this.age=age;
	   this.height=height;
   }
   void update(int age,float height,float weight) {
	   this.age=age;
	   this.height=height;
	   this.weight=weight;
   }
   
}
