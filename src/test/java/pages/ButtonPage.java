package pages;

import aquality.selenium.elements.ElementType;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IElement;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;
import utils.BrowserUtils;

import java.util.List;

public class ButtonPage extends Form {

    private final IButton downloadButton = getElementFactory().getButton(By.cssSelector("button[type='submit']"), "Download");
    private final By locator = By.xpath("");
    private final IElement iframe = getElementFactory().getLabel(By.id("mce_0_ifr"), "I-Frame");

    public ButtonPage() {
        super(By.className("button"), "Button Page");
    }

    public boolean checkButton() {
        BrowserUtils.switchToIframe(iframe.getElement());
        return downloadButton.state().isDisplayed();
    }

    private List<IButton> getButtonList() {
        return getElementFactory().findElements(locator, ElementType.BUTTON);
    }

    public void clickList(int index) {
        getButtonList().get(index).click();
    }
}
