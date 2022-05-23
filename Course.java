package com.eval;

public class Course {
	int courseId = 123;
	String courseName = "FSWD";
	int courseFee = 5000;
	
	static String username = "Admin";
	static String password = "1234";
	
	void authenticate() {
		if(username.equals("Admin")  &&  password.equals("1234")) {
			System.out.println("courseId");
			System.out.println(courseName);
			System.out.println(courseFee);
		}
		else {
			System.out.println("Invalid Username or password");
		}
	}
	
	void displayCourseDetails() {
		System.out.println("courseId");
		System.out.println(courseName);
		System.out.println(courseFee);
	}
	
	public static void main(String[] args) {
		Course c = new Course();
		c.displayCourseDetails();
		
		c.authenticate();
		c.username = "Admin2";
		c.password = "2345";
		c.authenticate();
	}
}
