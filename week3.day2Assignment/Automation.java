package week3.day2Assignment;

public class Automation extends MultipleLanguage implements Language,TestTool {


	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium is a automation tool for web apps");	
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("Selenium is used to automate many languages like JAVA ");
		
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Selenium is used to automate many languages like Ruby ");
	}

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Automation automate = new Automation();
		automate.selenium();
		automate.java();
		automate.python();
		automate.ruby();
		
	}
}
