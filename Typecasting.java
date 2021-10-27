public class Main {
	public static void main(String args[]) {
		
		byte age = 21;
		int new_age = age; 
		System.out.println(new_age);
		
		int salary =30000;
		short new_salary = (short) salary;
		System.out.println(new_salary);
		
		float percentage = 64.3f;
		//int new_percentage = percentage;    will not work
		int new_percentage = (int) percentage;
		System.out.println(new_percentage);
	}

}