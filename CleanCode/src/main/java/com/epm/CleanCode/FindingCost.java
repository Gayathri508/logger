package com.epm.CleanCode;

import java.io.IOException;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FindingCost {
	private static Logger logger = LogManager.getLogger(FindingCost.class);
		public static void main(String[] args){
			CostDetection c=new  CostDetection();
			 c.readInput();
			logger.info("Total construction cost="+c.totalCost());
		}

	}

