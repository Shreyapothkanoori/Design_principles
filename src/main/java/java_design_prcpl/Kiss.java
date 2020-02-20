package java_design_prcpl;

 class Kiss11 {
	
		
		public void weekday2(int day) {
			if ((day < 1) || (day > 12)) 
				System.out.println("Enter months in range");
			else {
			String[] days = {
			"jan",
			"feb",
			"march",
			"april",
			"may",
			"june",
			"july",
			"aug",
			"sep",
			"oct",
			"nov",
			"dec"
			};
			System.out.println(days[day-1]);
			}
			
			
		}
	}
	class Kiss{
		public static void main(String[] args) {
			Kiss11 obj=new Kiss11();
			obj.weekday2(4);
			
		}
	}


