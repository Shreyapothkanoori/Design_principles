package java_design_prcpl;


	public class Solid1 implements Vehicle1{

	    final int maxFuel;
	   int remainingFuel;
	     int power;

	    public Solid1(final int maxFuel) {
	        this.maxFuel = maxFuel;
	        remainingFuel = maxFuel;
	    }
	    //@Override
	    public void accelerate1() {
	        power++;
	        remainingFuel--;
	    }
	}





	 class Driver {

	    private Vehicle1 veh;

	    public Driver(final Vehicle1 veh){
	        this.veh = veh;
	    }

	    public void increaseSpeed(){
	        veh.accelerate1();
	    }
	}


