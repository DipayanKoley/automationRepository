package Utility;

import org.apache.log4j.Logger;

public class Log
{
	public static Logger Log = Logger.getLogger(Log.class.getName());
	
	public static void startTestCase(String testCaseName)
	{
		Log.info("*************************************************************************************************");
		Log.info("--------------------------------Starting of "+testCaseName+"------------------------------------");
		Log.info("*************************************************************************************************");
	}
	
	public static void endTestCase(String testCaseName)
	{
		Log.info("*************************************************************************************************");
		Log.info("--------------------------------Ending of "+testCaseName+"------------------------------------");
		Log.info("*************************************************************************************************");
	}
	
	public static void info(String message)
	{
		Log.info(message);
	}
	
	public static void warn(String message)
	{
		Log.warn(message);
	}
	
	public static void error(String message)
	{
		Log.error(message);
	}
	
	public static void fatal(String message)
	{
		Log.fatal(message);
	}
	
	public static void debug(String message)
	{
		Log.debug(message);
	}
}
