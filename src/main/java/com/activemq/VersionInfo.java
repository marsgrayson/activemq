/**
 * 
 */
package com.activemq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;

/**
 * @author zhengyi
 * 2014年1月23日
 */

@ContextConfiguration(locations = { "classpath:/spring/applicationContext.xml" })
public class VersionInfo {
	/**
	 * @param args
	 */
    @Value("${version}")
    private String version;
    @Value("${versionInfo}")
    private String versionInfo;
	public static void main(String[] args) {
		new VersionInfo().printVersionInfo();
	}
	private void printVersionInfo(){
		System.out.println(version+":"+versionInfo);
	}
}
