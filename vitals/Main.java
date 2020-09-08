package vitals;



public class Main {

   


    public static void main(String[] args) {
    	TestVitals v=new TestVitals();
    	assert(v.vitalsAreOk(100, 95, 70)) == true; //all vitals okay

        assert(v.vitalsAreOk(180, 95, 70))== false;
        

        System.out.println("Some more tests needed");

    }

}