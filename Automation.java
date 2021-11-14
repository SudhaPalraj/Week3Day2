package week3.day2;

public class Automation extends MultipleLangauge implements TestTool {

	public void ownAutomation() {

		System.out.println("Own method");
	}

	@Override
	public void ruby() {

		System.out.println("RUBY Abstract class unimplemented method implemented in class");

	}

	public void Java() {

		System.out.println("JAVA unimplemented method in interface Language");

	}

	public void Selenium() {
		System.out.println("SELENIUM unimplemented method in interface TESTTOOL");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Automation at = new Automation();
		at.python();// abstract implemented method
		at.ruby();// abstract unimplemented method
		at.ownAutomation();// normal method
		at.Java();// interface unimplemented method
		at.Selenium();// interface unimplemented method

	}

}
