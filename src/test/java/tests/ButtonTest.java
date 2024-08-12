package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ButtonPage;
import utils.BrowserUtils;

public class ButtonTest extends BaseTest {
    private static final int INDEX = 0;

    @Test
    public void buttonTest() {
        ButtonPage buttonPage = new ButtonPage();
        Assert.assertTrue(buttonPage.checkButton(), "Button did not appear");
        BrowserUtils.switchToDefault();
        Assert.assertTrue(buttonPage.state().isDisplayed(), "Page did not load");
        buttonPage.clickList(INDEX);
        BrowserUtils.refreshPage();
    }
}
