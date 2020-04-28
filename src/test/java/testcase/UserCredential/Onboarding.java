package testcase.UserCredential;

import config.AppiumConfig;
import config.TestConfig;
import config.TestRailInfo;

import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobject.OnboardingPage;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import org.testng.annotations.Listeners;

public class Onboarding extends TestConfig{
	
	
	@TestRailInfo(id="72700")
    @Test (description = "Onboarding : C72700 - Slide left/right on onboarding page")
    public static void slideLeftAndRight () throws Exception {
        System.out.println("Start Run Testcase : slideLeftAndRight");
         PayfazzAppium = new AppiumConfig(false);

            PayfazzAppium.waitUntilVisible(OnboardingPage.view_image_screen);
            PayfazzAppium.swipeLeft();
            PayfazzAppium.waitUntilVisible(OnboardingPage.view_image_screen);
            PayfazzAppium.swipeLeft();
            PayfazzAppium.waitUntilVisible(OnboardingPage.view_image_screen);
            PayfazzAppium.swipeLeft();
        
            PayfazzAppium.waitUntilVisible(OnboardingPage.view_image_screen);
            PayfazzAppium.swipeRight();
            PayfazzAppium.waitUntilVisible(OnboardingPage.view_image_screen);
            PayfazzAppium.swipeRight();
            PayfazzAppium.waitUntilVisible(OnboardingPage.view_image_screen);
            PayfazzAppium.swipeRight();
           
        

        
        System.out.println("Success Run Testcase : slideLeftAndRight");
    }

}
