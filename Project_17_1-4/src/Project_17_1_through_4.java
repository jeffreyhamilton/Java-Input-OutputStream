import java.io.*;
import java.util.*;

public class Project_17_1_through_4 {
	  public static void main(String[] args) throws IOException {
		  int count = 0;
		  int add = 0;
		  int average = 0;
		     try (
			Formatter outputf = new Formatter(new FileOutputStream("inttextfile.txt", true));
			DataOutputStream outputd = new DataOutputStream(new FileOutputStream("intbinfile.dat", true));
		    		 DataInputStream input = new DataInputStream(new FileInputStream("intbinfile.dat"));
		  ) {
		      for (int i = 0; i < 100; i++) {
		    	int d = (int)(Math.random() * 100000);
		        outputd.writeInt(d);
		        outputf.format("%d ", d);}
		      int total = 0;
		    	while (input.available() > 0) {
		    		add = input.readInt();
		    		total += add;
		    		count++;
		    	}
		    	average = total / count;
		    	System.out.println("The sum of the integers: " + total);
		    	System.out.println("The average of the integers: " + average);      
		    }
		  System.out.println("Done");
		  }
}
