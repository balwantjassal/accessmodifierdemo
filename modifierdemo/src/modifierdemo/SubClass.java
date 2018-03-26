package modifierdemo;

public class SubClass extends ModifierDemo {

	public SubClass(int def_var, int pr_var, int pub_var, int pro_var) {
		super(def_var, pr_var, pub_var, pro_var);
		
	}
	public void displaySubData() {
		System.out.println("Default Variable def_var " + def_var);
	// Not accessible	System.out.println("Private Variable pr_var " + pr_var);
		System.out.println("Public Variable pub_var " + pub_var);
		System.out.println("Protected Variable pro_var " + pro_var);		
	}

}
