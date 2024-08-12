package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ArticlePage;
import pages.DownloadPage;
import pages.MainPage;
import utils.FileUtils;

import java.io.File;
import java.nio.file.Paths;

import static aquality.selenium.browser.AqualityServices.getBrowser;

public class WikiTest extends BaseTest {
    private final static String SEARCH_NAME = "Albert Einstein";
    private final static String SEARCH_NAME2 = System.getProperty("searchName","Albert Einstein");

    @Test
    public void wikiTest() {
        System.out.println("\nSearch String used:"+SEARCH_NAME2);
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.state().waitForDisplayed(), "Main page is not displayed");
        mainPage.searchFor(SEARCH_NAME2);

        ArticlePage articlePage = new ArticlePage();
        articlePage.openToolsMenu();
        articlePage.downloadPdf();

        DownloadPage downloadPage = new DownloadPage();
        downloadPage.downloadFile();
        String fileName = downloadPage.getFileName();

        File downloadedFile = Paths.get(getBrowser().getDownloadDirectory(), fileName).toFile();
        Assert.assertTrue(FileUtils.isFileExist(downloadedFile), "File is not Downloaded");

        System.out.println("Running tests on browser: " + System.getProperty("browserName"));
        System.out.println("Search String used:"+SEARCH_NAME2);
    }
}
