package org.hcl;

import java.io.File;

public class Employee {
	
	
		public static void main(String[] args) {
			File f=new File("C:\\sakthi\\file\\open");
			boolean b = f.mkdirs();
			System.out.println(b);
		}
	}

