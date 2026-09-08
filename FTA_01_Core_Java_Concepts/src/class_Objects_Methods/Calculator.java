package class_Objects_Methods;

public class Calculator {
	
	int add(int a , int b ) {		
		Validator v1 = new Validator();
		boolean flag = v1.validate(a, b);
		int sum = 0;
		if(flag) {
			sum = a+b;
			System.out.println("addition=" + sum);
		}		
		return sum;
	}
	
}


