package test05.sungMap;

public class SungJuk {
	private String name;
	private int kor;
	private int eng;
	private int tot;
	private int rank;
	
	  public SungJuk(String name,int kor,int eng) {
	    	 this.name=name;
	    	 this.kor=kor;
	    	 this.eng=eng;
	    	 this.tot=kor+eng;
	    	 this.rank=1;
	         
	     }

		public String getName() { //
	 		return name;
		}

		public int getKor() { //
			return kor;
		}

		public void setKor(int kor) { //
			this.kor = kor;
		}

		public int getEng() {
			return eng;
		}

		public void setEng(int eng) {
			this.eng = eng;
		}

		public int getTot() { //
			return tot;
		}

		public void setTot() {
			this.tot = kor+eng;
		}

		public int getRank() { //
			return rank;
		}

		public void clearRank() { //
			rank=1;
		}
		
		public void plusRank() { //
			rank++;
		}
		public void disp() { //
			System.out.println(name+"���� ������"+tot+"���̰�, ������"+rank+"�� �Դϴ�.");
		}			
 			

	
}
