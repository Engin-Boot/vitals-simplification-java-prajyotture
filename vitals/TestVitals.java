package vitals;
public class TestVitals {
	 public  boolean vitalsAreOk(int bpm, int spo2, int respRate) {

	        boolean bpmVal=bpmChecker(bpm);
	        boolean spo2Val=spo2Checker(spo2);
	        boolean respVal=respChecker(respRate);
	        System.out.println();
			return bpmVal && spo2Val && respVal;

	    }

	private boolean bpmChecker(int bpm) {
		if (bpm<70) {
			return false;
		}
		else if(bpm>150) {
		return false;
	}
		return true;
	}
	private boolean spo2Checker(int spo2) {
		if(spo2<90) {
		return false;
	}
		return true;
	}
	
	private boolean respChecker(int respRate) {
		if (respRate<30) {
			return false;
		}
		else if(respRate>95) {
		return false;
	}
		return true;
	}

	


}
