package com.example.animal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnimalResult {
			
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int count=0;
	static Animal[] animal = new Animal[100];
	public static void main(String []args) throws IOException {
		String condition ;
		do {
		inputData();
		
		System.out.println("Do you want to enter another animal? ");
		condition = br.readLine();
		}while(condition.equalsIgnoreCase("yes"));
		System.out.println("Total number of animals :"+count+"\n");
		for(int i=0;i<count;i++) {
		
		System.out.println("Animal  "+(i+1));
		animal[i].display();
		}
		
	}
	public static void inputData() throws IOException {
		System.out.print("Enter animal name :");
		String na=br.readLine();
		
		System.out.print("Enter animal age : ");
		int age = Integer.parseInt(br.readLine());
		
		System.out.print("Enter animal species :");
		String sp=br.readLine();
		
		Animal animals= new Animal();
		
		animals.name=na;		
		animals.age=age;
		animals.species=sp;
		
		animal[count]=animals;
		count++;
		
		}
	
	}
