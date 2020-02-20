package java_design_prcpl;

class SampleDry1 {
	

		public void labclass() {

		System.out.println("I am in 1st floor");
		performOtherTasks();
		}

		public void theoryclass() {

		System.out.println("My friend is in third floor");
		performOtherTasks();
		}

		public void performOtherTasks() {

		System.out.println("I am in second floor");
		System.out.println("Canteen is in second floor");
		System.out.println("Faculty is in seconf floor");
		
		}

		} 

public class Dry1{
	public static void main(String[] args) {
		SampleDry1 obj=new SampleDry1();
		obj.labclass();
		obj.theoryclass();
	}

		
		
	}


