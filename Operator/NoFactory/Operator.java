package Operator.NoFactory;
import java.io.*;
public class Operator {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader bufferreader=new BufferedReader(in);
		try {
			
			while(true)
			{
			int num=Integer.parseInt(bufferreader.readLine());
			String operator=bufferreader.readLine();
			int num2=Integer.parseInt(bufferreader.readLine());
			
			
			switch(operator) {
				case "+":System.out.println("answer "+(num+num2));
					break;
				case "-":System.out.println("answer "+(num-num2));
					break;
				case "*":System.out.println("answer "+(num*num2));
					break;
				case "/":System.out.println("answer "+(num/num2));
					break;
				
				}
			}
		}
		catch(IOException e) {
			
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
