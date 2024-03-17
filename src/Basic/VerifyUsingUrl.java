package Basic;

public class VerifyUsingUrl extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String given_url="https://demowebshop.tricentis.com/";
		chromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		String current_url=driver.getCurrentUrl();
		if(given_url.equalsIgnoreCase(current_url))
		{
			System.out.println("I am in DWS PAge");
			closeDriver();
		}
		else
		{
			System.out.println("I am notin DWS Page");
		}

	}

}
