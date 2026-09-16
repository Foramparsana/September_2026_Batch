package class_Objects_Methods;

import java.util.Objects;

/**
 * POJO representing a customer.
 */

//byte, short, int, long, float, double, boolean, char
public class Customer {

	
	private int customerId;
	private String name;
	private String address;
	private long phone;
	private String aadharId;

	// No-arg constructor
	public Customer() {
	}

	// All-args constructor
	public Customer(int customerId, String name, String address, long phone, String aadharId) {
		this.customerId = customerId;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.aadharId = aadharId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getAadharId() {
		return aadharId;
	}

	public void setAadharId(String aadharId) {
		this.aadharId = aadharId;
	}

	@Override
	public String toString() {
		return "Customer{" +
				"customerId=" + customerId +
				", name='" + name + '\'' +
				", address='" + address + '\'' +
				", phone=" + phone +
				", aadharId='" + aadharId + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Customer customer = (Customer) o;
		return customerId == customer.customerId &&
				Objects.equals(name, customer.name) &&
				Objects.equals(address, customer.address) &&
				phone == customer.phone &&
				Objects.equals(aadharId, customer.aadharId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(customerId, name, address, phone, aadharId);
	}

}
