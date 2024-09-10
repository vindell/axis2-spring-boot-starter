package org.apache.axis2.spring.boot;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(Axis2Properties.PREFIX)
public class Axis2Properties {

	public static final String PREFIX = "spring.axis2";

	/**
	 * Enable Axis2.
	 */
	private boolean enabled = true;


	
}