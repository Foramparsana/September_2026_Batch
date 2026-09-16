package class_Objects_Methods;

/*
 1. handling request/response ==> controller ==> handleNewCustReq(fname, lname, password)
 2. applying business logic ==> service ==> addCustDData(fname, lname, password) {}
 3. database handling ==> repository/dao ==> insertNewCust(fname, lname, password)
 */

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


