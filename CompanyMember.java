package cite.oop;

import java.io.*;
import java.util.*;

class CompanyMember {

	String name;
	int age;
	String address;
	long contactNo;
	String emailadd;
	String role;

	CompanyMember(String name, String middleName, String lastName, int age, String address, long contactNo, String emailadd, String role) {

		this.name = name + " " + middleName.charAt(0) + "." + " " + lastName;
		this.age = age;
		this.address = address;
		this.contactNo = contactNo;
		this.emailadd = emailadd;
		this.role = role;

	}

	String getName(){

		return this.name;
	}
    int getAge(){
	 	
		return this.age;
	}
	String getAddress(){
	 	
	 	return this.address;
	}
	long getContactNo(){
	 	
	 	return this.contactNo;
	}
	String getEmailadd(){
	 	
	 	return this.emailadd;
	 }
	String getRole(){
	 	
	 	return this.role;
	}



}