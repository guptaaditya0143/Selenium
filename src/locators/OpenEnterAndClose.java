package locators;

import Basic.BaseClass;

public class OpenEnterAndClose extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		chromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
        quitDriver();
	}

}
