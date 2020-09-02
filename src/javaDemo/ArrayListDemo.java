package javaDemo;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) throws Exception {
		List<String> lst= new ArrayList<String>();
		lst.add("ankur");
		lst.add("abc");
		lst.add("def");
		lst.add("ghi");
		lst.add("jkl");
		lst.add("mno");
		FileOutputStream fos=new FileOutputStream("Al.txt");
		ObjectOutputStream ops=new ObjectOutputStream(fos);
		ops.writeObject(lst);
		ops.close();
		System.out.println("App End");
	}



}
