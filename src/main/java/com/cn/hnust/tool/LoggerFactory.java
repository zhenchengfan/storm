package com.cn.hnust.tool;

import org.slf4j.Logger;


public class LoggerFactory {
	  public static Logger getLogger()
	  {
	    String name = new java.lang.Exception().getStackTrace()[1].getClassName();
	    Logger logger = org.slf4j.LoggerFactory.getLogger(name);
	    return logger;
	  }
}
