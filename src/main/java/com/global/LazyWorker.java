package com.global;

import java.time.LocalDate;

public class LazyWorker extends AbstractWorker {

	LazyWorker(String name, LocalDate dob, String def) {
		super(name, dob, def);
	}

	@Override
	public String getDefinition() {
		return "Lazy worker. " + super.getDefinition();
	}
}
