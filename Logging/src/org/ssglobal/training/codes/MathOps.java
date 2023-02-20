package org.ssglobal.training.codes;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MathOps {
	
	// Step 1: create or build the private logger object
	
	private Logger log = Logger.getLogger(MathOps.class.getName());
	
	public MathOps() {
		// Step 2: set the level of the logging
		log.setLevel(Level.ALL);
		
		// Step 3: create another handler
		try {
			FileHandler fileHandler = new FileHandler("./src/config/math.log", true);
			fileHandler.setLevel(Level.ALL);
			fileHandler.setEncoding("UTF-8");
			
		// Step 4: create format
			SimpleFormatter formatter = new SimpleFormatter();
			fileHandler.setFormatter(formatter);
			// Writing to log file
			log.addHandler(fileHandler);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public MathOps(int x, int y) {
		// Step 2: set the level of the logging
		log.setLevel(Level.ALL);
		
		// Step 3: create another handler
		try {
			FileHandler fileHandler = new FileHandler("./src/config/math.log", true);
			fileHandler.setLevel(Level.ALL);
			fileHandler.setEncoding("UTF-8");
			// Step 4: create format
			SimpleFormatter formatter = new SimpleFormatter();
			fileHandler.setFormatter(formatter);
			// Writing to log file
			log.addHandler(fileHandler);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

	public int add(int x, int y) {
		log.info("Start of method add() with parameters x=%d y=%d".formatted(x, y));
		log.warning("Using custom Date() object");
		Date xmas = new Date(123, 1, 32);
		int sum = x + y;
		log.info("End of method add() with parameters x=%d y=%d".formatted(x, y));
		return sum;
	}

	public int div(int x, int y) throws ArithmeticException, Exception{
		log.info("Start of method div() with parameters x=%d y=%d".formatted(x, y));
		if(y == 0) {
			log.severe("Division by zero error");
			throw new ArithmeticException();
		}
		log.info("End of method div() with parameters x=%d y=%d".formatted(x, y));
		return x / y;
	}

	public int[] displayArray(int[] arrData) {
		log.info("Start of method displayArray() with arrData= %s".formatted(Arrays.toString(arrData)));
		try {
			int len = arrData.length;
			System.out.println("Length or array: %d".formatted(len));
			System.out.println(Arrays.toString(arrData));
		} catch (NullPointerException e) {
			log.severe(e.getMessage());
		}
		log.info("End of method displayArray() with arrData= %s".formatted(Arrays.toString(arrData)));
		return arrData;
	}

}
