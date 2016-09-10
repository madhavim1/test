package com.training.test;

import com.training.general.TestAccessModifiers;

//Sub class in another package
public class TestModifiersOutSidePkg extends TestAccessModifiers{

	public static void main(String[] args) {
		TestAccessModifiers.getTimeInMillis(); //public
		TestAccessModifiers.getTimeZone(); //protected
	}
}
