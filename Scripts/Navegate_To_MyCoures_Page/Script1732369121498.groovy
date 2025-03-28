import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.By
import java.util.Random
WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.joacademy.com/login')

WebUI.click(findTestObject('Object Repository/Lenaattoun/lgoin and go to the my courese/Page_- joacademy.com/span_'))

WebUI.setText(findTestObject('Object Repository/Lenaattoun/lgoin and go to the my courese/Page_- joacademy.com/input__email'), 'lena_test_qa@joacademy.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Lenaattoun/lgoin and go to the my courese/Page_- joacademy.com/input__password'), 
    'aeHFOx8jV/A=')

WebUI.sendKeys(findTestObject('Object Repository/Lenaattoun/lgoin and go to the my courese/Page_- joacademy.com/input__password'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Lenaattoun/lgoin and go to the my courese/Page_UserView Page - joacademy.com/my courses'))

WebUI.click(findTestObject('Object Repository/Lenaattoun/lgoin and go to the my courese/Page_- joacademy.com/button_Close'))

List<WebElement> startCourseButtons = DriverFactory.getWebDriver().findElements(By.xpath("//button[contains(text(),'ابدأ الدورة')]"))

if (startCourseButtons.size() > 0) {
    Random random = new Random()
    int randomIndex = random.nextInt(startCourseButtons.size())  
    WebElement randomButton = startCourseButtons.get(randomIndex)

    randomButton.click()
    WebUI.comment("Clicked on a random course start button at index: " + randomIndex)
} else {
    WebUI.comment("No 'start course' buttons found on the page.")
}
