package Operator.SimpleFactory;

public class Factory {
	public OperatorInterface Operator(String operator) {
		OperatorInterface cal=null;
		switch(operator) {
			case "+": cal=new Add(); 
			//=>�p�G�S�����w��cal�ܼƥi��|�X�{nullpointexception
				
				break;
			case "-": cal=new Sub();
				break;
			case "*":
				break;
			case "/":
				break;
		}
		return cal;
	}
}
