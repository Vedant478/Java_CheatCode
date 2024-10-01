package com.cdac.studentmanagement;

import java.util.Comparator;

public class FeesComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.Fee>s2.Fee)
		{
			return 1;
			
		}
		if(s1.Fee<s2.Fee)
		{
			return -1;
			
		}
		return 0;
	}

}
