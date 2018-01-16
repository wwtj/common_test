package com.wtj.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jNamedHierarchy {
	private static final Logger logger = LogManager.getLogger(Log4jNamedHierarchy.class);

	public static void main(String[] args) {
		String nh = "Named Hierarchy";
		logger.getLevel();
		logger.trace("TRACE: " + nh + " " + logger.getLevel());
		Log4jNamedHierarchy n = new Log4jNamedHierarchy();
		n.run();
		logger.error("ERROR: " + nh + " " + logger.getLevel());

	}

	public void run() {
		String nh = "NamedHierarchy.run";
		logger.debug("DEBUG: " + nh + " " + logger.getLevel());
	}
}
