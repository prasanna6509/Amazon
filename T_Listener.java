package takingscreenshot;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class T_Listener implements ITestListener{

	@Override
	public void onTestStart(ITestResult p) 
	{
	System.out.println("the output is" +p);	
		
	}

	@Override
	public void onTestSuccess(ITestResult r) 
	{
	System.out.println(r);
	}

	@Override
	public void onTestFailure(ITestResult a) 
	{
	
		System.out.println(a);
	}

	@Override
	public void onTestSkipped(ITestResult s) 
	{
		System.out.println(s);
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult a) 
	{
	System.out.println(a);
		
	}

	@Override
	
	public void onStart(ITestContext n) 
	{
	System.out.println(n);	
		
	}

	@Override
	public void onFinish(ITestContext n) 
	{
	System.out.println(n);
		
	}
	


	
	

}
