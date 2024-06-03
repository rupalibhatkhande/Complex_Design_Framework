package constructorPkg;

public class ParameterProblemState 
{
     int age;
     
	ParameterProblemState(int age)
	{
		this.age=age;
	}
	
	
	public static void main(String[] args) 
	{
	ParameterProblemState ins=new ParameterProblemState(39);
	System.out.println(ins.age);
	ParameterProblemState inst=new ParameterProblemState(24);
	System.out.println(inst.age);
	}

}
