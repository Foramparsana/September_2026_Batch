/*
 
 Class : 
 
 */

package class_Objects_Methods;

public class BankingApp {

	public static void main(String[] args) {
		//account no, customer id, balance, type
		
		//8 primitive data types
		//byte, short, int, long, float, double, boolean, char
		
		int a = 10;
		boolean b = true;
		//class ==> datatype
	
		
		Account acc1 = new Account();
		acc1.bal = 10000;
		acc1.accountId = 1001;
		acc1.phone = 67123489;
		acc1.type = "savings";	
		
		int x =acc1.bal + 2000;
		
		Account acc2 = new Account();
		acc1.bal = 20000;
		acc1.accountId = 2001;
		acc1.phone = 67123489;
		acc1.type = "current";		
		
	}
}


//properties/attributes/data
//plain old java object : setters-getters, constructors, toString(), hashcode(), equals()
class Account{
	int bal;
	long phone;
	long accountId;
	String type;
	
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	

}