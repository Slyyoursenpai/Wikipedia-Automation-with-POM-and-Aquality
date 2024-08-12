package utils;

import aquality.selenium.browser.AqualityServices;
import lombok.experimental.UtilityClass;
import org.openqa.selenium.WebElement;

@UtilityClass
public class BrowserUtils {

    public void switchToIframe(WebElement x) {
        AqualityServices.getBrowser().getDriver().switchTo().frame(x);
    }

    public void switchToDefault(){
        AqualityServices.getBrowser().getDriver().switchTo().defaultContent();
    }

    public void refreshPage(){
        AqualityServices.getBrowser().refresh();
    }

    public void openNewTabAndSwitch(String url) {
        AqualityServices.getBrowser().tabs().openInNew(url);

    }
    public void switchToTab(int index){
        AqualityServices.getBrowser().tabs().switchTo(index);
    }

    public void closeCurrentTab() {
        AqualityServices.getBrowser().tabs().close();
        AqualityServices.getBrowser().tabs().switchTo(0);

    }
}
