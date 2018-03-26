package modifierdemo;

public class ExecuteModifier {
	
	public static void main(String[] args) {
		ModifierDemo obj = new ModifierDemo(100,200,300,400);
		//obj.showData();
		obj.def_var = 1000;
	//	obj.pr_var = 2000;
		obj.pub_var = 3000;
        obj.pro_var = 40000;
		obj.showData();
		SubClass subObj = new SubClass(500,600,700,900);
		subObj.showData();
		subObj.displaySubData();
	}

}
