package com.global;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		getWorkers().forEach(worker -> worker.printInfo());
	}
	
	
	static List<Worker> getWorkers() {
		List<Worker> workers = new ArrayList<>();
		workers.add(new HardWorker("gökhan", LocalDate.of(1981, 10, 5), "Gokhan is a good eng."));
		workers.add(new HardWorker("efkan", LocalDate.of(1986, 10, 5), "Efkan is not here"));
		workers.add(new LazyWorker("murat", LocalDate.of(1982, 10, 5), "Murat is sleeping"));
		workers.add(new HardWorker("furkan", LocalDate.of(1991, 10, 5), "Furkan is here"));
		workers.add(new LazyWorker("idris", LocalDate.of(1978, 10, 5), "Idris is not available"));
		return workers;
		
	}
}
