package LockedMe;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public  class methodsoffile {

	public void showfile(File f) {
		File filelist[]=f.listFiles();
		Arrays.sort(filelist);
		for(int i=0;i<filelist.length;i++) {
			System.out.println(i+1 +"- "+filelist[i].getName());
		}	
	}
	
	public void creatfile(String path ,String newname) {
		
		File f = new File(path,newname);
		
		try {
			
			boolean result =f.createNewFile();	
			if(result) {
				System.out.println("Successfully added");
			}else {System.out.println("File is not added, try again");
		}
			
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	public void searchfile(String path ,String name,File f) {
		int find =0;String foundfile=null;
		
		File filelist[]=f.listFiles();
		for(int i=0;i<filelist.length;i++) {
			if (filelist[i].getName().equals(name)) {
				find=1;
				foundfile = filelist[i].getName();
				break;
			}
		}
		if(find == 1) {
			System.out.println(foundfile+" is found");
		}else {
			System.out.println("File not found");
		}
	}
	
	public void deletefile(String path ,String newname) {
		
		File f = new File(path,newname);
		boolean result =f.delete();	
		if(result) {
			System.out.println("Successfully deleted");
		}else {System.out.println("File is not deleted");
	}

}
}
