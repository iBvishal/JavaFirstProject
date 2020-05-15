package com.sapient;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BO_student {
		int n;
		Scanner sc=new Scanner(System.in);
		POJO_Student[] student;
		BO_student(){
			n=sc.nextInt();
			student=new POJO_Student[n];
			for(int i=0;i<n;i++){
				student[i]=new POJO_Student();
			}
		}
		public void read(){	
			for(int i=0;i<n;i++){
				int id=sc.nextInt();
				String name=sc.next();
				String city=sc.next();
				student[i].setId(id);
				student[i].setName(name);
				student[i].setCity(city);
			}
			sc.close();
		}
		public void display()
		{
			for(int i=0;i<n;i++)
			{
				System.out.println(student[i].getCity());
				System.out.println(student[i].getId());
				System.out.println(student[i].getName());
			}
		}
		public void display(int id){
			for(int i=0;i<n;i++){
				if(student[i].getId()==id){
					System.out.println(student[i].getId()+" "+student[i].getName()+" "+student[i].getCity());	
					return;
				}		
				
			}
				System.out.println("Not found");
		}
		public void display(String city){
			for(int i=0;i<n;i++){
				if(student[i].getCity().equals(city)){
					System.out.println(student[i].getId()+" "+student[i].getName()+" "+student[i].getCity());				
				}
			}
		}
		public void getNameSorted() throws IOException{
			List <POJO_Student> list = new ArrayList<>(Arrays.asList(student));
			Collections.sort(list,(l, r) -> l.getName().compareTo(r.getName()));
			display();
			
		}
		public void getCitySorted() throws IOException{
			List <POJO_Student> list = new ArrayList<>(Arrays.asList(student));
			Collections.sort(list,(l, r) -> l.getCity().compareTo(r.getCity()));
			display();
			
		}
	
}
