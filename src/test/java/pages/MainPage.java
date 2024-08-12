package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class MainPage extends Form {
    private final ITextBox searchField = getElementFactory().getTextBox(By.name("search"), "Search Field");
    private final IButton submitButton = getElementFactory().getButton(By.xpath("//button[@type='submit']"), "Submit Button");

    public MainPage() {
        super(By.className("central-featured-logo"), "Main Page");
    }

    public void searchFor(String search) {
        searchField.clearAndType(search);
        submitButton.click();
    }

}
