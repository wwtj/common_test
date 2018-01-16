package com.wtj.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;


public class Log4jTest {
	private Logger logger = LogManager.getLogger("Log4jTest");
	
	@Test
	public void testC3p0(){
		logger.trace("这是�?个log4j的trace日志");
		logger.debug("这是�?个log4j的debug日志");
		logger.info("这是�?个log4j的info日志");
		logger.error("这是�?个log4j的error日志");
		logger.fatal("这是�?个log4j的fatal日志");
	}
}
