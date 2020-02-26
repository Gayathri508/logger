package com.epm.CleanCode;

class CompoundandSimpleInterest{
	double SimpleInterest(int principal,double rateofinterest,int timeperiod) {
		double SimpleInterest=(principal*rateofinterest*timeperiod)/100;
		return SimpleInterest;	
	}
	double CompoundInterest(int principal,double rateofinterest,int timeperiod) {
		double d=(1+(rateofinterest/100));
		double CompoundInterest=principal*Math.pow(d, timeperiod);
		return CompoundInterest;
	}
}
