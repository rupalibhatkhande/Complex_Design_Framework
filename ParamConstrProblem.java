package constructorPkg;

public class ParamConstrProblem 
{
 String driver;
 ParamConstrProblem(String driver)
 {
	this.driver=driver;
 }
	public static void main(String[] args) {
		ParamConstrProblem ins=new ParamConstrProblem ("Chrome");
		System.out.println(ins.driver);
		ParamConstrProblem in=new ParamConstrProblem ("Edge");
		System.out.println(in.driver);

	}

}
