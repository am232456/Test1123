package Operator.Factory;
import java.io.*;

public class Client {
	public static void main(String[] args) {
		int num=0;
		int num2=0;
		int answer=0;
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader bufferreader=new BufferedReader(in);
		OperatorDB db1=new OperatorDB();
		 
		
		try {
			num=Integer.parseInt(bufferreader.readLine());
			String operator=bufferreader.readLine();
			num2=Integer.parseInt(bufferreader.readLine());
			db1.setNum(num, num2);
			
			
			//OperatorInterface operatorinterface=new addFactory().Operator(operator);
			//answer=operatorinterface.Cal(db1.getNum(),db1.getNum2());
			FactoryInterface factoryinterface=new addFactory();
			OperatorInterface operatorinterface=factoryinterface.Operator(operator);
			answer=operatorinterface.Cal(num, num2);
			
			System.out.println(answer);
			
		}catch(IOException e) {
			
		}finally {
			try {
				bufferreader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
