package LockedMe;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;



public class LockedMe {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		methodsoffile mof=new methodsoffile();
		System.out.println("*Welcome to LockedMe.com Developed By Mardhiyyah*");
		
		int choose,option;
		
		
		do {
			System.out.println("-------- Please Choose one number --------");
			System.out.println("1- Show Files 2- Deal with files 3- Exit");
			choose= input.nextInt();
			
			if(choose==1) {
				System.out.println("Please, write the directory path to show file.");
				String path=input.next();
				File f = new File(path);
				mof.showfile(f);
			}
			else if(choose == 2) {
				
				
				do {
					System.out.println("-------- Please Choose one number --------");
					System.out.println("1- ADD File 2- Search For File 3- Delet File 4- Back");
					option= input.nextInt();
					
					if(option == 1) {
						System.out.println("Please, write the directory path to creat a file in it.");
						String path=input.next();
						System.out.println("Please, write the name of new file.");
						String newname=input.next();
						mof.creatfile(path, newname);
					}
					
					else if(option == 2) {
						System.out.println("Please, write the directory path to search about a file in it.");
						String path=input.next();
						System.out.println("Please, write the name of file.");
						String name=input.next();
						
						File f = new File(path);
						mof.searchfile(path,name,f);
						
					}
					
					else if(option == 3) {
						System.out.println("Please, write the directory path to delete a file in it.");
						String path=input.next();
						System.out.println("Please, write the name of file.");
						String name=input.next();
						
					
						mof.deletefile(path,name);
						
					}
					
				}while(option!=4);
				
			}
			
			
		}while(choose!=3);
	}

	
}

