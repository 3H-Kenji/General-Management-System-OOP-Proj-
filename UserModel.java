
package cite.oop;

import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class UserModel{

	String name;
	String middleName;
	String lastName;
	String username;
	String password;
	String address;
	String contactNo;
	String age;
	String birthdate;
	String emailadd;
	String role = "employee";

	void setName(String name){
		this.name = name;
	}
	void setMiddleName(String middlename){
		this.middleName = middlename;
	}

	void setLastName(String lastname){
		this.lastName = lastname;
	}

	void setUserName(String username){
		this.username = username;
	}
	void setPassword(String password){
		this.password = password;
	}

	void setAddress(String address){
		this.address = address;
	}

	void setContactNo(String contactNo){
		this.contactNo = contactNo;
	}
	void setAge(String age){
		this.age = age;
	}
	void setBirthdate(String birthdate){
		this.birthdate = birthdate;
	}	
	void setEmailadd(String emailadd){
		this.emailadd = emailadd;
	}

	void setRole(String role){
		this.role = role;
	}


	void saveData(){
		File file = new File("users.dat");

		writeData(file);

	}

	public void writeData(File file){

		try{
			FileWriter writer = new FileWriter(file,true);
			writer.write(this.username + "\t" + this.password + "\t" + this.name + "\t" + this.middleName + "\t" + this.lastName + "\t" + this.address + "\t" + this.contactNo + "\t" + this.age + "\t" + this.birthdate + "\t" + this.emailadd + "\t" + this.role + "\n" );
			writer.close();

		}catch(IOException e){

		System.out.println("An Error Occured");

		}

	}
	
	public int readDataFile(String username , String password){
		File file = new File("users.dat");

		try{

			Scanner scanLine = new Scanner(file);
			while(scanLine.hasNextLine()){

				String data = scanLine.nextLine();
				Scanner scanData = new Scanner(data);
				scanData.useDelimiter("\t");

				
				this.username = scanData.next();
				this.password = scanData.next();
				this.name = scanData.next();
				this.middleName = scanData.next();
				this.lastName = scanData.next();
				this.address = scanData.next();
				this.contactNo = scanData.next();
				this.age = scanData.next();
				this.birthdate = scanData.next();
				this.emailadd = scanData.next();
				this.role = scanData.next();

				if(this.username.equals(username)){

					if(this.password.equals(password)){

						return 1;

					}else{

						return 2;
					}
				}else{

					continue;
				}

			}

			return 3;

		}catch(IOException e){

			return 4;
		}


	}

	public boolean verifyUsername(String username){

		File file = new File("users.dat");

		try{

			Scanner scanLine = new Scanner(file);
			while(scanLine.hasNextLine()){

				String data = scanLine.nextLine();
				Scanner scanData = new Scanner(data);
				scanData.useDelimiter("\t");

				
				
				this.username = scanData.next();
				this.password = scanData.next();
				this.name = scanData.next();
				this.middleName = scanData.next();
				this.lastName = scanData.next();
				this.address = scanData.next();
				this.contactNo = scanData.next();
				this.age = scanData.next();
				this.birthdate = scanData.next();
				this.emailadd = scanData.next();
				this.role = scanData.next();


				if(this.username.equals(username)){
					return true;
				}else{

					continue;
				}

			}

			return false;

		}catch(IOException e){

			return false;
		}

	}

	public int verifyRole(String username){

		File file = new File("users.dat");

		try{

			Scanner scanLine = new Scanner(file);
			while(scanLine.hasNextLine()){

				String data = scanLine.nextLine();
				Scanner scanData = new Scanner(data);
				scanData.useDelimiter("\t");

				
				
				this.username = scanData.next();
				this.password = scanData.next();
				this.name = scanData.next();
				this.middleName = scanData.next();
				this.lastName = scanData.next();
				this.address = scanData.next();
				this.contactNo = scanData.next();
				this.age = scanData.next();
				this.birthdate = scanData.next();
				this.emailadd = scanData.next();
				this.role = scanData.next();


				if(this.username.equals(username)){
					
					switch(this.role){

						case "employee":
							return 1;
							
						case "manager":
							return 2;
							

						case "admin":
							return  3;
							
						default:
							return 3;
							
					}

				}else{

					continue;
				}

			}

			return 3;

		}catch(IOException e){

			return 3;
		}

	}

	public boolean verifyName(String fullName){

		File file = new File("users.dat");

		try{

			Scanner scanLine = new Scanner(file);
			while(scanLine.hasNextLine()){

				String data = scanLine.nextLine();
				Scanner scanData = new Scanner(data);
				scanData.useDelimiter("\t");

				
				
				this.username = scanData.next();
				this.password = scanData.next();
				this.name = scanData.next();
				this.middleName = scanData.next();
				this.lastName = scanData.next();
				this.address = scanData.next();
				this.contactNo = scanData.next();
				this.age = scanData.next();
				this.birthdate = scanData.next();
				this.emailadd = scanData.next();
				this.role = scanData.next();

				String userfullname = this.name + " " + this.middleName.charAt(0) + "." + " " + this.lastName;
				if(userfullname.equals(fullName)){
					return true;
				}else{

					continue;
				}

			}

			return false;

		}catch(IOException e){

			return false;
		}

	}

	
    public Object[][] getCompanyMemberList() {


        ArrayList<CompanyMember> memberList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("users.dat"))) {

            String line;

            while ((line = reader.readLine()) != null) {
                
                String[] parts = line.split("\t");

               
                if (parts.length == 11) {

                    String name = parts[2];
                    String middleName = parts[3];
                    String lastName = parts[4];
					int age = Integer.parseInt(parts[7]);;
					String address = parts[5];
					long contactNo =  Long.parseLong(parts[6]);
					String emailadd = parts[9];
					String role = parts[10];

                    if(role.equals("employee")){
                    	CompanyMember person = new CompanyMember(name, middleName, lastName, age, address, contactNo, emailadd, role);
                    	memberList.add(person);
                    }
                    
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        Object[][] data = new Object[memberList.size()][5];

		for (int i = 0; i < memberList.size(); i++) {

		    CompanyMember person = memberList.get(i);

		    data[i][0] = person.getName();
		    data[i][1] = person.getAge();
		    data[i][2] = person.getAddress();
		    data[i][3] = person.getContactNo();
		    data[i][4] = person.getEmailadd();
		    //data[i][5] = person.getRole();
		}
        
        return data;
    }

    public Object[][] getCompanyManagerList() {


        ArrayList<CompanyMember> memberList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("users.dat"))) {

            String line;

            while ((line = reader.readLine()) != null) {
                
                String[] parts = line.split("\t");

               
                if (parts.length == 11) {

                    String name = parts[2];
                    String middleName = parts[3];
                    String lastName = parts[4];
					int age = Integer.parseInt(parts[7]);;
					String address = parts[5];
					long contactNo =  Long.parseLong(parts[6]);
					String emailadd = parts[9];
					String role = parts[10];

                    if(role.equals("manager")){
                    	CompanyMember person = new CompanyMember(name, middleName, lastName, age, address, contactNo, emailadd, role);
                    	memberList.add(person);
                    }
                    
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        Object[][] data = new Object[memberList.size()][5];

		for (int i = 0; i < memberList.size(); i++) {

		    CompanyMember person = memberList.get(i);

		    data[i][0] = person.getName();
		    data[i][1] = person.getAge();
		    data[i][2] = person.getAddress();
		    data[i][3] = person.getContactNo();
		    data[i][4] = person.getEmailadd();
		    //data[i][5] = person.getRole();
		}
        
        return data;
    }

}