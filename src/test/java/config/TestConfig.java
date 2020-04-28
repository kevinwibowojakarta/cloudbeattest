package config;
import com.gurock.testrail.APIClient;


import com.gurock.testrail.APIException;

import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import io.cloudbeat.testng.CbTestNg;


@Listeners(io.cloudbeat.testng.Plugin.class)
public class TestConfig extends CbTestNg {
	static APIClient testRailClient;
	static Long testrunID;
	static ArrayList<String> sendresulterror;
	static HashSet<Long> testlist;
	static boolean RERUN_FAILED_TEST=true;

	public static AppiumConfig PayfazzAppium;
	
	@BeforeSuite
	public static void initiateTest() throws MalformedURLException, IOException, APIException {
//		connectTestRail();
//		// ini di sesuai dengan testrun ID di testrail
//		testrunID=(long) 491;
//		sendresulterror=new ArrayList<String>();
//		getUntestedTestsfromTestRun(testrunID);
	}
	
	@AfterSuite
	public static void endTest()  {
		System.out.println("Number of send result to test rail failed:"+sendresulterror); 
	}
	
	public static void connectTestRail() throws MalformedURLException, IOException, APIException {
//	System.out.println("Opening connection to testrail");
//	testRailClient = new APIClient(Constant.testRailAddress);
//	testRailClient.setUser(Constant.testRailUser);
//	testRailClient.setPassword(Constant.testRailAPIKey);
	
}
	
	public static void createTestRun() throws MalformedURLException, IOException, APIException {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("suite_id", Constant.payfazzRegressionSuiteID);
		data.put("include_all",true);
		data.put("name","Automation Test");
		JSONObject c = (JSONObject) testRailClient.sendPost("add_run/"+Constant.payfazzProjectID,data);
		testrunID = (Long)c.get("id");
		System.out.println("Starting a new TestRail run:"+testrunID);
	}
	

	public static void getUntestedTestsfromTestRun(Long testRunID) throws MalformedURLException, IOException, APIException {
		//this method retrives all test cases from a test run that hasn't been tested yet in test rail (status id=3/untested)
//		System.out.println("Getting tests for test run:"+testrunID);
//		JSONArray c = (JSONArray) testRailClient.sendGet("get_tests/"+testRunID);
//		testlist=new HashSet<Long>();
//		for (int i=0;i<c.size();i++)
//		{JSONObject x=(JSONObject) c.get(i);
//		Long tempcaseid=(Long) x.get("case_id");
//		Long tempstatus=(Long) x.get("status_id");
//		if(tempstatus==3)
//		{testlist.add(tempcaseid);	
//		} else if (RERUN_FAILED_TEST && tempstatus==4) {
//			 //this will run test that is marked as failed(retest) too
//			 testlist.add(tempcaseid);
//		}	
//		}
////		System.out.println("Test cases id to be tested");
//		System.out.println(testlist);
	
	}

	
	@AfterMethod
	public static void sendResult(ITestResult result, ITestContext ctx) throws MalformedURLException, IOException {
//		// ini di comment aja jika tidak harus terintegrasi ke testrail
//		HashMap<String, Object> data = new HashMap<String, Object>();
//		if(result.getStatus()!=ITestResult.SKIP) {
//		if(result.getStatus()==ITestResult.SUCCESS) {
//			data.put("status_id",1);
//		}
//		else {
//			data.put("status_id", 4);
//			data.put("comment", result.getThrowable().toString());
//		}
//		
//		String caseId = (String)ctx.getAttribute("caseId");
//		System.out.println("----------------------------------------");
//		System.out.println("sending result of case "+caseId+" to testrail.");
//		try {
//		testRailClient.sendPost("add_result_for_case/"+testrunID+"/"+caseId,data);
//		}catch (APIException e)
//		{	sendresulterror.add(caseId);
//			System.out.println(e.getMessage());
//		}
//		
//	}
//		try {PayfazzAppium.Androiddriver.quit();
//		}
//		catch(NullPointerException e)
//		{}
//		System.out.println("========================================");
//		PayfazzAppium.Androiddriver.quit();
	}
	

	
	@BeforeMethod()
	public void beforeTest(ITestContext ctx,Method method) throws NoSuchMethodException {
	
		System.out.println("=============START CASE=================");
//		 if (method.isAnnotationPresent(TestRailInfo.class)) {
//		 TestRailInfo ta = method.getAnnotation(TestRailInfo.class);
//		 ctx.setAttribute("caseId",ta.id());
//		 Long temp=Long.parseLong(ta.id());
//		 if (!testlist.contains(temp)) {
//			 System.out.println("Skipping test caseID:"+ta.id());
//			 throw new SkipException("Testing skip.");
//			 
//			 
//		 }else {	
//				
//				System.out.println(ta.id().toString());
//				System.out.println("----------------------------------------");
//		 }
		
		 }

		 
		
	}
	

