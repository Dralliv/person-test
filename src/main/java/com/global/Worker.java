package com.global;

import java.time.LocalDate;

public interface Worker {

	String getName();
	
	LocalDate getDOB();
	
	String getDefinition();
	
	default void printInfo() {
		System.out.println("Worker " + getName() + " is born at: " + getDOB() + ".\n Some additional info: " + getDefinition());
	}
}
