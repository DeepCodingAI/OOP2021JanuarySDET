package oop.encapsulation;

public class Trainee {
	
	private int stId;
	private String stName;
	private String stDOB;
	private String stGrade;
	
	public Trainee() {}

	public Trainee(int stId, String stName, String stDOB, String stGrade) {
		this.stId = stId;
		this.stName = stName;
		this.stDOB = stDOB;
		this.stGrade = stGrade;
	}
	
	public int getStId() {
		return stId;
	}
	public void setStId(int stId) {
		this.stId = stId;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getStDOB() {
		return stDOB;
	}
	public void setStDOB(String stDOB) {
		this.stDOB = stDOB;
	}
	public String getStGrade() {
		return stGrade;
	}
	public void setStGrade(String stGrade) {
		this.stGrade = stGrade;
	}

}
