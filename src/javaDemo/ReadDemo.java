package javaDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;



public class ReadDemo {
	public static void main(String[] args) {
		FileInputStream fis =null;
		ObjectInputStream ois=null;
		try {
			fis= new FileInputStream("Sdata.txt");
			 ois=new ObjectInputStream(fis);
			Object o=ois.readObject();
			student s=null;
			if(o instanceof student)
				s=(student) o;
			System.out.println(s.name + " " +  s.dept + " " + s.per);	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			if(fis !=null)
				try {
					fis.close();
				} catch (IOException e) {
				e.printStackTrace();
				}
			if(ois !=null)
				try {
					ois.close();
				} catch (IOException e) {
				e.printStackTrace();
				}
				
		}
		
	}

}
