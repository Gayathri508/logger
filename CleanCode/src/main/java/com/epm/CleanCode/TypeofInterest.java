package com.epm.CleanCode;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TypeofInterest {
			public static final Logger logger = LogManager.getLogger(TypeofInterest.class);
			public static void main(String[] args){
				TypeofInterest interesttype=new TypeofInterest();
				String filename="resultinterest.ser";
				// TODO Auto-generated method stub
				int principal,timeperiod;
				double rateofinterest;
					Scanner sc = new Scanner(System.in);
					logger.info("Enter Principal: ");
					principal=sc.nextInt();
					logger.info("Enter Rate of interest: ");
					rateofinterest = sc.nextDouble();
					logger.info("Enter Time Period : ");
					timeperiod= sc.nextInt();
				CompoundandSimpleInterest c=new  CompoundandSimpleInterest();
					
				
				try{
					FileOutputStream file = new FileOutputStream(filename);
					ObjectOutputStream out = new ObjectOutputStream(file);
					out.writeObject(interesttype);
					logger.info("SimpleInterest="+c.SimpleInterest(principal, rateofinterest, timeperiod)+"\n");
					logger.info("CompoundInterest="+c.CompoundInterest(principal, rateofinterest, timeperiod));
					out.close();
					file.close();
					logger.info("Object has been serialzed");
				}
				catch(IOException ex){
					logger.info("IOException is caught");
				}

	}

}
