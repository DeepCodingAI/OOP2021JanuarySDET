package oop.encapsulation;

public class TraineeInformationSystem {

	public static void main(String[] args) {
		Trainee st1 = new Trainee();
		st1.setStId(101);
		st1.setStName("Jon");
		st1.setStDOB("09-18-1995");
		st1.setStGrade("A+");
		
		Trainee st2 = new Trainee();
		st2.setStId(102);
		st2.setStName("Doe");
		st2.setStDOB("02-18-1999");
		st2.setStGrade("B+");
		
		System.out.println(st1.getStId()+ " "+st1.getStName()+ " "+st1.getStDOB()+" "+st1.getStGrade());
		
		System.out.println(st2.getStId()+ " "+st2.getStName()+ " "+st2.getStDOB()+" "+st2.getStGrade());
		
	}

}
