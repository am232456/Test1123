package Operator.Factory;

public class addFactory implements FactoryInterface{
	public OperatorInterface Operator(String operator) {
		
		
		return new Add();
	}
}
