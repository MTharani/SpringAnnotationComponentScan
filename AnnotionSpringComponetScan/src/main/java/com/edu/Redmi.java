package com.edu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Redmi 
{
@Autowired
MobileProcessor cpu;

public MobileProcessor getCpu() {
	return cpu;
}

public void setCpu(MobileProcessor cpu) {
	this.cpu = cpu;
}
public void mobileConf()
{
	System.out.println("8GB Ram,64GB Rom,6000Mbz");
	cpu.processor();
	
}
}
