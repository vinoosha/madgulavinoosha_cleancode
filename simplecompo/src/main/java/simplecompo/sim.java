package simplecompo;

import java.util.*;
import java.io.PrintStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
abstract class sim extends javafx.application.Application{
public sim(String testName) {
		super(testName);
		// TODO Auto-generated constructor stub
	}

static{
PrintStream my=new PrintStream(new FileOutputStream(FileDescriptor.out));
Scanner sc=new  Scanner(System.in);
Double PrincipalAmount;
Double Time;
Double Rate;
my.print("Enter PrincipalAmount\n");
PrincipalAmount=sc.nextDouble();
my.print("Enter Time\n");
Time=sc.nextDouble();
my.print("Enter Rate\n");
Rate=sc.nextDouble();
Double SimpleInterest;
SimpleInterest=((PrincipalAmount*Time*Rate)/100);
my.print("Simple Interest is"+SimpleInterest);
my.print("\n");
Double CompoundInterest;
CompoundInterest=PrincipalAmount*(Math.pow((1+Rate/100),Time));
my.print("CompoundInterst is "+CompoundInterest);
System.exit(0);
}
}