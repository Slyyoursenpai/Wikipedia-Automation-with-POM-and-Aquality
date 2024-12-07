package pages;

import aquality.selenium.elements.interfaces.*;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class ArticlePage extends Form {
    private final IButton toolsMenu = getElementFactory().getButton(
            By.xpath("//nav[contains(@class, 'tools-landmark')]"), "Tools Button");
    private final ILink downloadButton = getElementFactory().getLink(
            By.id("coll-download-as-rl"), "Download as PDF");

    public ArticlePage() {
        super(By.className("mw-page-title-main"), "Article Page");
    }

    public void openToolsMenu() {
        toolsMenu.click();
    }

    public void downloadPdf() {
        downloadButton.click();
    }
}
