package com.global;

import java.time.LocalDate;

public abstract class AbstractWorker implements Worker {

	private String name;
	private LocalDate dob;
	private String def;
	
	AbstractWorker(String name, LocalDate dob, String def) {
		this.name = name;
		this.dob = dob;
		this.def = def;
	}
	
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public LocalDate getDOB() {
		return dob;
	}

	@Override
	public String getDefinition() {
		return def;
	}

}
