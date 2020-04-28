package config;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

import io.cloudbeat.testng.CbTestNg;
public class AppiumConfig extends CbTestNg {

	public AppiumDriver<MobileElement> Androiddriver;
	public AppiumDriverLocalService service;
	public int screenHeight;
	public int screenWidth;
	WebDriverWait wait;

	public AppiumConfig(boolean loggedin) throws Exception {
		// service = AppiumDriverLocalService.buildDefaultService();
		// service.start();
		System.out.println("INITIATING APPIUM DRIVER");


		Constant.DefaultValue();



		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", Constant.DEVICENAME);
		caps.setCapability("udid", Constant.UDID);
		caps.setCapability("platformName", Constant.PLATFORMNAME);
		caps.setCapability("platformVersion", Constant.PLATFORMVERSION);
		caps.setCapability("skipUnlock", "true");
		caps.setCapability("appPackage", Constant.APPPACKAGE);
		caps.setCapability("appActivity", Constant.APPACTIVITY);
		if (loggedin) {
			caps.setCapability("noReset", "true");
		} else {
			caps.setCapability("noReset", "false");
		}
		caps.setCapability("automationName", Constant.AUTOMATIONNAME);
		
		 initMobileDriver(caps);
		 
		Androiddriver = (AndroidDriver) driver;
		
	}

	public void waitUntilVisible(By locator) {
		this.wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public void waitUntilInvisible(By locator) {
		this.wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
	}

	public void waitUntilEnabled(By locator) {
		this.wait = new WebDriverWait(driver, 200);
		this.wait.until(ExpectedConditions.elementToBeClickable(locator));
		this.wait = new WebDriverWait(driver, 10);
	}

	public void waitTime120(By locator) {
		this.wait = new WebDriverWait(driver, 120);
		this.wait.until(ExpectedConditions.elementToBeClickable(locator));
		this.wait = new WebDriverWait(driver, 10);
	}

	public void clickLanjutOnCustomkeyboard() {
		TouchAction ts = new TouchAction(Androiddriver);
		int lanjutX = (int) (this.screenWidth * 0.9);
		int lanjutY = (int) (this.screenHeight * 0.98);
		ts.longPress(PointOption.point(lanjutX, lanjutY)).release().perform();
	}

    public void clickSearchOnKeyboard() {
        TouchAction ts = new TouchAction(Androiddriver);
        int lanjutX = (int) (this.screenWidth * 0.9);
        int lanjutY = (int) (this.screenHeight * 0.92);
        ts.tap(PointOption.point(lanjutX, lanjutY)).release().perform();
    }

    public void clickKameraMoto() {
        TouchAction ts = new TouchAction(Androiddriver);
        int lanjutX = (int) (this.screenWidth * 0.45);
        int lanjutY = (int) (this.screenHeight * 0.9);
        ts.longPress(PointOption.point(lanjutX, lanjutY)).release().perform();
    }

    public void clickCeklisMoto() {
        TouchAction ts = new TouchAction(Androiddriver);
        int lanjutX = (int) (this.screenWidth * 0.6);
        int lanjutY = (int) (this.screenHeight * 0.85);
        ts.longPress(PointOption.point(lanjutX, lanjutY)).release().perform();
    }

	public void clickButtonCekAkun() {
		TouchAction ts = new TouchAction(Androiddriver);
		int lanjutX=(int)(this.screenWidth*0.9);
		int lanjutY=(int)(this.screenHeight*0.9);
		ts.tap(PointOption.point(lanjutX, lanjutY)).perform();
	}
	public void clickContactFirstLine() {
		TouchAction ts = new TouchAction(Androiddriver);
		int lanjutX=(int)(this.screenWidth*0.5);
		int lanjutY=(int)(this.screenHeight*0.28);
		ts.tap(PointOption.point(lanjutX, lanjutY)).perform();
	}


	public void swipeUp() {
		TouchAction ts = new TouchAction(Androiddriver);
		int startX = (int) (this.screenWidth * 0.5);
		int startY = (int) (this.screenHeight * 0.75);
		int endX = (int) (this.screenWidth * 0.5);
		int endY = (int) (this.screenHeight * 0.25);

		ts.longPress(PointOption.point(startX, startY)).moveTo(PointOption.point(endX,endY)).release().perform();

	}

	public void swipeUpVirtualAccount () {
		TouchAction ts = new TouchAction(Androiddriver);
		int startX = (int) (this.screenWidth * 0.5);
		int startY = (int) (this.screenHeight * 0.55);
		int endX = (int) (this.screenWidth * 0.5);
		int endY = (int) (this.screenHeight * 0.25);

		ts.longPress(PointOption.point(startX, startY)).moveTo(PointOption.point(endX,endY)).release().perform();
	}

	public void swipeUpOneScreen() {
		TouchAction ts = new TouchAction(Androiddriver);
		int startX=(int)(this.screenWidth*0.5);
		int startY=(int)(this.screenHeight*0.8);
		int endX=(int)(this.screenWidth*0.5);
		int endY=(int)(this.screenHeight*0.2);
		ts.longPress(PointOption.point(startX, startY)).moveTo(PointOption.point(endX,endY)).release().perform();

	}

	public void swipeDownOneScreen() {
		TouchAction ts = new TouchAction(Androiddriver);
		int startX=(int)(this.screenWidth*0.5);
		int startY=(int)(this.screenHeight*0.2);
		int endX=(int)(this.screenWidth*0.5);
		int endY=(int)(this.screenHeight*0.8);
		ts.longPress(PointOption.point(startX, startY)).moveTo(PointOption.point(endX,endY)).release().perform();

	}

	public void swipeDown() {
		TouchAction ts = new TouchAction(Androiddriver);
		int startX = (int) (this.screenWidth * 0.5);
		int startY = (int) (this.screenHeight * 0.25);
		int endX = (int) (this.screenWidth * 0.5);
		int endY = (int) (this.screenHeight * 0.75);
		ts.longPress(PointOption.point(startX, startY)).moveTo(PointOption.point(endX, endY)).release().perform();
	}

	public void swipeLeft() {
		TouchAction ts = new TouchAction(Androiddriver);
		int startX = (int) (this.screenWidth * 0.85);
		int startY = (int) (this.screenHeight * 0.5);
		int endX = (int) (this.screenWidth * 0.15);
		int endY = (int) (this.screenHeight * 0.5);
		ts.longPress(PointOption.point(startX, startY)).moveTo(PointOption.point(endX, endY)).release().perform();
	}

	public void swipeLeftKlaimUmrohMobil() {
		TouchAction ts = new TouchAction(Androiddriver);
		int startX = (int) (this.screenWidth * 0.95);
		int startY = (int) (this.screenHeight * 0.65);
		int endX = (int) (this.screenWidth * 0.15);
		int endY = (int) (this.screenHeight * 0.65);
		ts.longPress(PointOption.point(startX, startY)).moveTo(PointOption.point(endX, endY)).release().perform();
	}

	public void swipeRight() {
		TouchAction ts = new TouchAction(Androiddriver);
		int startX = (int) (this.screenWidth * 0.15);
		int startY = (int) (this.screenHeight * 0.5);
		int endX = (int) (this.screenWidth * 0.85);
		int endY = (int) (this.screenHeight * 0.5);
		ts.longPress(PointOption.point(startX, startY)).moveTo(PointOption.point(endX, endY)).release().perform();
	}

	public void swipeUpUntilElementFound(By id) {
		TouchAction ts = new TouchAction(Androiddriver);
			int startX = (int) (this.screenWidth * 0.5);
			int startY = (int) (this.screenHeight * 0.6);
			int endX = (int) (this.screenWidth * 0.5);
			int endY = (int) (this.screenHeight * 0.3);
			int iter = 0;
			ts.longPress(PointOption.point(startX, startY)).moveTo(PointOption.point(endX, endY)).release().perform();
			while (Androiddriver.findElements(id).size() == 0) {
				ts.longPress(PointOption.point(startX, startY)).moveTo(PointOption.point(endX, endY)).release().perform();
				iter++;
			if (iter > 19) {
				new Exception("Element not found after 20 time scrolling or Something wrong happened with scrolling");
				break;
			}

			
		}
		endY = (int) (this.screenHeight * 0.35);
		ts.longPress(PointOption.point(startX, startY)).moveTo(PointOption.point(endX, endY)).release().perform();
		while (Androiddriver.findElements(id).size() == 0) {
			ts.longPress(PointOption.point(endX, endY)).moveTo(PointOption.point(startX, startY)).release().perform();
			iter++;
			if (iter > 19) {
				new Exception("Element not found after 20 time scrolling or Something wrong happened with scrolling");
				break;
			}
		}
	}

	public void swipeUpUntilElementFoundSecond(By id) {
		TouchAction ts = new TouchAction(Androiddriver);
		int startX = (int) (this.screenWidth * 0.5);
		int startY = (int) (this.screenHeight * 0.6);
		int endX = (int) (this.screenWidth * 0.5);
		int endY = (int) (this.screenHeight * 0.3);
		int iter = 0;
		while (Androiddriver.findElements(id).size() == 0) {
			ts.longPress(PointOption.point(startX, startY)).moveTo(PointOption.point(endX, endY)).release().perform();
			iter++;
			if (iter > 19) {
				new Exception("Element not found after 20 time scrolling or Something wrong happened with scrolling");
			}
		}
	}
	
	public void swipeDownUntilElementFound(By id) {
		TouchAction ts = new TouchAction(Androiddriver);
		int startX = (int) (this.screenWidth * 0.5);
		int startY = (int) (this.screenHeight * 0.3);
		int endX = (int) (this.screenWidth * 0.5);
		int endY = (int) (this.screenHeight * 0.75);
		int iter = 0;
		while (Androiddriver.findElements(id).size() == 0) {
			ts.longPress(PointOption.point(startX, startY)).moveTo(PointOption.point(endX, endY)).release().perform();
			iter++;
			if (iter > 19) {
				new Exception("Element not found after 20 time scrolling or Something wrong happened with scrolling");
				break;
			}
		}
	}

	public void swipeDownUntilElementFoundYear(By id) {
		TouchAction ts = new TouchAction(Androiddriver);
		int startX = (int) (this.screenWidth * 0.5);
		int startY = (int) (this.screenHeight * 0.4);
		int endX = (int) (this.screenWidth * 0.5);
		int endY = (int) (this.screenHeight * 0.75);
		int iter = 0;
		while (Androiddriver.findElements(id).size() == 0) {
			ts.press(PointOption.point(startX, startY)).moveTo(PointOption.point(endX, endY)).release().perform();
			iter++;
			if (iter > 19) {
				new Exception("Element not found after 20 time scrolling or Something wrong happened with scrolling");
				break;
			}
		}
	}

    public void backTo(By id) {
		int iter = 0;
		while (Androiddriver.findElements(id).size() == 0) {
			driver.navigate().back();
			iter++;
			if (iter > 19) {
				new Exception("Element not found after 20 time clicking back or Something wrong happened with back");
			}
		}
	}

	public int countFromScrolledList(By by)
	{    int count=-1;
		int prevcount=-1;
		List<MobileElement> listelement=Androiddriver.findElements(by);
		Set<String> listnamaunik= new HashSet<String>();

		while (listnamaunik.size()!=prevcount)
		{    listelement=Androiddriver.findElements(by);
			//System.out.println("jumlah:" +listelement.size());
			if (listelement.size()==0) { count=0;break;}


			for (int i=0;i<listelement.size();i++) {
				listnamaunik.add(listelement.get(i).getText());
				System.out.println("LIST"+listnamaunik);
			}
			prevcount=count;
			count=listnamaunik.size();
			this.swipeUpOneScreen();
		}
		System.out.println("COUNT :"+count);
		return count;
	}




}
