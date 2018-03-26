package modifierdemo;

public class ModifierDemo {
	int def_var;
	private int pr_var;
	public int pub_var;	
	protected int pro_var;
	public ModifierDemo(int def_var, int pr_var, int pub_var, int pro_var) {
		super();
		this.def_var = def_var;
		this.pr_var = pr_var;
		this.pub_var = pub_var;
		this.pro_var = pro_var;
	}
	public void showData() {
		System.out.println("Default Variable def_var " + def_var);
		System.out.println("Private Variable pr_var " + pr_var);
		System.out.println("Public Variable pub_var " + pub_var);
		System.out.println("Protected Variable pro_var " + pro_var);
		
	}
	

}
