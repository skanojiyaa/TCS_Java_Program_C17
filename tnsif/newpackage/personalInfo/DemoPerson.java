package tnsif.newpackage.personalInfo;

import tnsif.newpackage.countryInfo.*;
//import tnsif.newpackage.personalInfo.*;

public class DemoPerson {
	public static void main(String args[])
	{
		Country c = new Country("India");
		State s = new State("Gujarat");
		Person p = new Person("Sakshi",c,s);
	
		System.out.println(p);
		
		
	}
}
