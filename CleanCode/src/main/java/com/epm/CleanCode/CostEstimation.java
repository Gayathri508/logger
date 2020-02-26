package com.epm.CleanCode;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Logger;

class CostDetection{
	int materialstandard;
	int squarefeet;
	int totalarea;
	private static Logger logger = LogManager.getLogger(CostDetection.class);
	public void readInput(){
		Scanner read = new Scanner(System.in);
		 logger.info("Press 1 for standard materials \n Press 2 for above standard materials \n Press 3 for high standard materials");
		materialstandard = read.nextInt();
		 logger.info("Enter total area of your house");
		totalarea = read.nextInt();
		switch(materialstandard){
		case 1:
			squarefeet = 1200;
			break;
		case 2:
			squarefeet= 1500;
			break;
		case 3:
			 logger.info("press y if you require automated home else press n:");
			char automated = read.next().charAt(0);
			if(automated == 'n'){
				squarefeet = 1800;
			}
			else{
				squarefeet = 2500;
			}
			break;
		default :  logger.info("Press a valid option");
		}
	}
		public int totalCost(){
			return squarefeet*totalarea;
		}
		
	
	}
	

