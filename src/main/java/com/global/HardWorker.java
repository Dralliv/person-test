package com.global;

import java.time.LocalDate;

public class HardWorker extends AbstractWorker{

	HardWorker(String name, LocalDate dob, String def) {
		super(name, dob, def);
	}

	@Override
	public String getName() {
		return "Senior " + super.getName();
	}
}
