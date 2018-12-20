package Operator.SimpleFactory;

public class Factory {
	public OperatorInterface Operator(String operator) {
		OperatorInterface cal=null;
		switch(operator) {
			case "+": cal=new Add(); 
			//=>如果沒有指定給cal變數可能會出現nullpointexception
				
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
