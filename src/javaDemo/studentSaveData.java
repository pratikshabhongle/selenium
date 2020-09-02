
package javaDemo;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class studentSaveData {
	public static void main(String[] args) throws Exception {
		student s=new student();
		s.name="Binod";
		s.dept="CS";
		s.per=85.5;
		FileOutputStream fos=new FileOutputStream("Sdata.txt");
		ObjectOutputStream ops=new ObjectOutputStream(fos);
		ops.writeObject(s);
		ops.close();
		System.out.println("App End");
		//pratiksha
	}

}
