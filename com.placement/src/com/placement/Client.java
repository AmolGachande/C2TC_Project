package com.placement;

import java.util.Scanner;

import com.placement.entities.College;
import com.placement.service.CollegeService;
import com.placement.service.CollegeServiceImpl;


public class Client {
public static void main(String[] args) {
	College c=new College();
	CollegeService cs=new CollegeServiceImpl();
	
	//AddCollege
	c.setCollegeName("jspm");
	c.setId(1);
	c.setLocation("pune");
	c.setCollegeAdmin("ravi");
	cs.addCollege(c);
//	
//	System.out.println("add succesful");
//	
	//RemoveCollege
//	cs.deleteCollege(1);
//	System.out.println("remove succesful");
	
	//get user
	//System.out.println("college"+cs.getCollegeById(1));
	
//	Scanner sc=new Scanner(System.in);
//	int id=sc.nextInt();
//	String collegeName=sc.next();
//	String collegeAdmin=sc.next();
//	String location=sc.next();
//	CollegeService cs=new CollegeServiceImpl();
//	c.setId(id);
//	c.setCollegeName(collegeName);
//	c.setCollegeAdmin(collegeAdmin);
//	c.setLocation(location);
//	cs.updateCollege(c);
//	
}
}