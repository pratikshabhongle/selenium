package javaDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;



public class Read {
	public static void main(String[] args) {
		FileInputStream fis =null;
		ObjectInputStream ois=null;
		try {
			fis= new FileInputStream("A1.txt");
			 ois=new ObjectInputStream(fis);
			Object o=ois.readObject();
			ArrayListDemo s=null;
			if(o instanceof ArrayListDemo)
				s=(ArrayListDemo) o;
			System.out.println(s.                                                                                                          );	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
