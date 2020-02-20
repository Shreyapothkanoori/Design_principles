package java_design_prcpl;

public class OOO {
	
		



	    public int power;
	    public int suspensionHeight;

	    public int getPower() {
	        return power;
	    }

	    public int getSuspensionHeight() {
	        return suspensionHeight;
	    }

	    public void setPower(final int power) {
	        this.power = power;
	    }

	    public void setSuspensionHeight(final int suspensionHeight) {
	        this.suspensionHeight = suspensionHeight;
	    }

	}








 class EventHandler extends OOO {

	    private OOO vehicle;

	    public EventHandler(final OOO vehicle) {
	        this.vehicle = vehicle;
	    }

	    public void changeDrivingMode(final DrivingMode drivingMode){
	        vehicle.setPower(drivingMode.getPower());
	        vehicle.setSuspensionHeight(drivingMode.getSuspensionHeight());
	        // now, when we need to add another mode (e.g. ECONOMY) just create a new class: Economy.
	    }
	}


