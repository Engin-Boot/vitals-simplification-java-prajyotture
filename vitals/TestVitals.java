package vitals;
public class TestVitals implements AlertVitals{
	
	public  boolean vitalsAreOk(int bpm, int spo2, int respRate) {
		 //	System.out.println("Hello");
	        boolean bpmVal=bpmChecker(bpm);
	        boolean spo2Val=spo2Checker(spo2);
	        boolean respVal=respChecker(respRate);
	        System.out.println(bpmVal);
			return bpmVal && spo2Val && respVal;

	    }
     
	public boolean bpmChecker(int bpm) {
		if (bpm<70) {
			alertVital("bpm",bpm);
			return false;
			
		}
		else if(bpm>150) {
			alertVital("bpm",bpm);
		return false;
		
	}
		return true;
	}
	private boolean spo2Checker(int spo2) {
		if(spo2<90) {
			alertVital("spo2",spo2);
		return false;
	}
		return true;
	}
	
	private boolean respChecker(int respRate) {
		if (respRate<30) {
			alertVital("respRate",respRate);
			return false;
		}
		else if(respRate>95) {
			alertVital("respRate",respRate);
		return false;
	}
		return true;
	}

	@Override
	public void alertVital(String vital,int val) {
		
		System.out.println("The vital " +vital+  "  has high value that is "+val);
	}

	

}
