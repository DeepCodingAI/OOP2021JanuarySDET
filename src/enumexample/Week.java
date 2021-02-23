package enumexample;

public class Week {

	Day day;
	
	public Week() {}
	
	public Week(Day day) {
		this.day = day;
	}
	
	public void whatIsMyTask() {
		switch(day){
		
		case Monday:
			System.out.println("Live class-1");
		    break;
		case Tuesday:
			System.out.println("Start working on Codelab");
		    break;
		case Wednesday:
			System.out.println("Start working on Home Work");
		    break;
		case Thursday:
			System.out.println("Live class-2");
		    break;
		case Friday:
			System.out.println("Start practicing git-github");
		    break;
		case Saturday:
			System.out.println("Join group discussion");
		    break; 
		case Sunday:
			System.out.println("Continue Group discussion");
		    break;
		default:
			System.out.println("not a valid day");
			break;
		
		}
	}
	
	public void whatIsMyRole(int role) {
		switch(role){
		
		case 1:
			System.out.println("I am a Project manager");
		    break;
		case 2:
			System.out.println("Business Analyst");
		    break;
		case 3:
			System.out.println("QA");
		    break;
		case 4:
			System.out.println("FrontEnd Dev");
		    break;
		case 5:
			System.out.println("BackEnd Dev");
		    break;
		case 6:
			System.out.println("DevOps");
		    break; 
		case 7:
			System.out.println("CTO");
		    break;
		default:
			System.out.println("not a valid role");
			break;
		
		}
	}
}
