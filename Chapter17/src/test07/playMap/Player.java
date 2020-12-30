package test07.playMap;

public class Player {
	private String name;
	private String club;
	private int salary;
	
	public Player(String name,String club,int salary) {
		this.name=name;
		this.club=club;
	    this.salary=salary;
	}

	public String getName() {
		return name;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getClub() {
		return club;
	}

	public int getSalary() {
		return salary;
	}
	
	public void disp() {
		System.out.println(name+"¥‘¿« ø¨∫¿¿∫ "+salary+"ø¯ ¿‘¥œ¥Ÿ.");
	}
	

}
