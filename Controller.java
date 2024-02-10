
package cite.oop;

class Controller{

	

	void registerUser(String name, String middlename, String lastname, String username, String password , String address , String contactNo , String age , String birthdate , String emailadd){
		
		UserModel user = new UserModel();
		
		user.setName(name);
		user.setMiddleName(middlename);
		user.setLastName(lastname);
		user.setUserName(username);
		user.setPassword(password);
		user.setAddress(address);
		user.setContactNo(contactNo);
		user.setAge(age);
		user.setBirthdate(birthdate);
		user.setEmailadd(emailadd);

		user.saveData();

	}

	void registerUser(String name, String middlename, String lastname, String username, String password , String address , String contactNo , String age , String birthdate , String emailadd , String role){
			
		UserModel user = new UserModel();
		user.setName(name);
		user.setMiddleName(middlename);
		user.setLastName(lastname);
		user.setUserName(username);
		user.setPassword(password);
		user.setAddress(address);
		user.setContactNo(contactNo);
		user.setAge(age);
		user.setBirthdate(birthdate);
		user.setEmailadd(emailadd);
		user.setRole(role);
		user.saveData();

	}

	int verifyUser(String username, String password){

		UserModel user = new UserModel();

		return user.readDataFile(username,password);
	}

	boolean isUsernameAlreadyExist(String username){

		UserModel user = new UserModel();

		return user.verifyUsername(username);
	}

	boolean isNameAlreadyExist(String name, String middleName , String lastName){

		UserModel user = new UserModel();
		String userfullname = name + " " + middleName.charAt(0) + "." + " " + lastName;

		return user.verifyName(userfullname);

	}


	int scanRole(String username){

		UserModel user = new UserModel();

		return user.verifyRole(username);

	}

	String getUserInfo(String username){

		UserModel user = new UserModel();

		if(user.verifyUsername(username)){

			String userfulname = user.name + " " + user.middleName.charAt(0) + "." + " " + user.lastName;
 			String userInfo = userfulname + "^" + user.address + "^" + user.contactNo + "^" + user.age + "^" + user.birthdate + "^" + user.emailadd;

			return userInfo;
		}


		return "ERRROR";
		
		
	}

	 Object[][] getMemberList(){

	 	UserModel user = new UserModel();
	 	return user.getCompanyMemberList();
	 }

	 Object[][] getManagerList(){

	 	UserModel user = new UserModel();
	 	return user.getCompanyManagerList();
	 }

}