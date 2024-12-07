package pages;

import aquality.selenium.elements.ElementType;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

import java.util.List;

public class DownloadPage extends Form {
    private final IButton downloadButton = getElementFactory().getButton(By.cssSelector("button[type='submit']"), "Download");
    private final ILabel pdfFileNameLabel = getElementFactory().getLabel(By.xpath("//div[@class='mw-electronpdfservice-selection-label-desc']"), "Download File Name");

    public DownloadPage() {
        super(By.className("oo-ui-labelElement-label"), "Download Page");
    }

    public void downloadFile() {
        downloadButton.click();
    }

    public String getFileName() {
        return pdfFileNameLabel.getText();
    }

}
