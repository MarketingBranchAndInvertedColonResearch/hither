import java.util.Scanner;
import java.util.List*;

public class user {
	
	//private variables
	private String name, username, email, idNum;
	private int age;
	private Scanner console;
	
	//public variables
	public int counter;
	public Database db;
	
	//constructor(s)
	
	public user(){
		
		db = new Database();
		console = new Scanner(System.in);
	}
	
	//String methods
	
	public String returnName(){
		return name;
	}
	
	public String returnUsername(){
		return username;
	}
	
	public String returnEmailAddress(){
		return "@" + email;
	}
	
	public String inStringForm(){
		return idNum;
	}
	
	public String Stringinput(){
		return console.next();
	}
	
	//integer methods
	
	public int returnAge(){
		return age;
	}
	
	public int inIntForm(){
		String temp = idNum.substring(1);
		int temp2 = Integer.parseInt(idNum);
		return temp2;
	}
	
	public int Integerinput(){
		return console.next();
	}
	
	public int lastIdNum(){
		return db.getList().get(db.getList().size() - 1).idNum();
	}
	
	//void methods
	
	public void getIDNum(boolean check){
		if(check){
			inIntForm();
		} else {
			inStringForm();
		}
	}
	
	public void assignID(int num){
		idNum = "#" + num;
	}
	
	public void error(boolean check){
		if(check){
			System.out.println("Please enter a word or words");
		} else {
			System.out.println("Please enter a number");
		}
	}	
	
	public void updateName(String name){
		this.name = name;
	}
	
	public void updateUsername(String username){
		this.username = username;
	}
	
	public void updateEmail(String email){
		this.email = email;
	}
	
	public void updateAge(int age){
		this.age = age;
	}
	
	//static methods
	
	public static void prompt(String message){
		
		if(message.equals("Name")){
			name = Stringinput();
		} else if(message.equals("Username")){
			username = Stringinput();
		} else if(message.equals("Email Address")){
			email = Stringinput();
		} else {
			error(true);
		}
	}
	
	public static void prompt(String message, boolean integer){
		
		if(message.equals("Age")){
			age = Integerinput();
		} else {
			error(false);
		}
	}
	
	public String toString(){
		return "Name: " + name +
			"Username: " + username +
			"Email: " + email +
			"Age: " + age;
	}
	
	public int compareTo(User other){
		if(other.getIDNum(true)) <= getIDNum(true)){
			return 1;
		} else {
			return -1;
		}
	}
}
		
	
