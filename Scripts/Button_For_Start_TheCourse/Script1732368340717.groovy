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

WebUI.openBrowser("https://www.joacademy.com/login")

//WebUI.navigateToUrl('https://www.joacademy.com/login')
WebUI.maximizeWindow()
WebUI.click(findTestObject('Object Repository/lgoin and go to the my courese/Page_- joacademy.com/span_'))

WebUI.setText(findTestObject('Object Repository/lgoin and go to the my courese/Page_- joacademy.com/input__email'), 'lena_test_qa@joacademy.com')

WebUI.setEncryptedText(findTestObject('Object Repository/lgoin and go to the my courese/Page_- joacademy.com/input__password'), 
    'aeHFOx8jV/A=')

WebUI.sendKeys(findTestObject('Object Repository/lgoin and go to the my courese/Page_- joacademy.com/input__password'), 
    Keys.chord(Keys.ENTER))
WebUI.click(findTestObject('Object Repository/lgoin and go to the my courese/Page_UserView Page - joacademy.com/my courses'))

//close page 
WebUI.click(findTestObject('Object Repository/lgoin and go to the my courese/Page_- joacademy.com/button_Close'))
//WebUI.scrollToElement(findTestObject('Object Repository/StartCourseButton'), 10)

WebUI.delay(5)	

//WebUI.scrollToElement(button_start the coures, 10) // 10 is the timeout in seconds

WebUI.click(findTestObject('Object Repository/Button_For_Start_TheCourse/Page_- joacademy.com/button_start the coures'))
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// تحديد اسم الكورس من صفحة الكورسات
TestObject courseNameInList = findTestObject('Object Repository/CourseNameInList')
String courseNameList = WebUI.getText(courseNameInList)

// طباعة اسم الكورس للتحقق
println("ياضيات - الصف السادس - الفصل الاول - علا شحادة " + courseNameList)

// الضغط على الكورس للدخول إلى صفحة التفاصيل
WebUI.click(courseNameInList)

// تحديد اسم الكورس من صفحة التفاصيل
TestObject courseNameInDetails = findTestObject('Object Repository/CourseNameInDetails')
String courseNameDetails = WebUI.getText(courseNameInDetails)

// طباعة اسم الكورس من صفحة التفاصيل
println("Course name in details page: " + courseNameDetails)

// مقارنة الاسمين
if (courseNameList.equals(courseNameDetails)) {
	println("The course names match.")
} else {
	println("The course names do not match!")
}

// تحقق إذا كان اسم الكورس متطابقاً:
assert courseNameList.equals(courseNameDetails) : "Course names are not matching!"


WebUI.doubleClick(findTestObject('Object Repository/Button_For_Start_TheCourse/Page_- joacademy.com/Button_close_the_unit'))




WebUI.click(findTestObject('Object Repository/Button_For_Start_TheCourse/Page_- joacademy.com/Enter_to_TheLesson'))

// Step 1: Switch to the iframe
WebUI.switchToFrame(findTestObject('Object Repository/Button_For_Start_TheCourse/Page_- joacademy.com/iframe'), 10)

//click start video
WebUI.click(findTestObject('Object Repository/Button_For_Start_TheCourse/Page_- joacademy.com/button_for_start_to_watch'))

// Step 3: Switch back to the main page
WebUI.switchToDefaultContent()

//click stop video
WebUI.click(findTestObject('Object Repository/Button_For_Start_TheCourse/Page_- joacademy.com/button_for_stop_to_watch'))

WebUI.click(findTestObject('Object Repository/Button_For_Start_TheCourse/Page_- joacademy.com/Button_for_arrow_left'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Button_For_Start_TheCourse/Page_- joacademy.com/Button_for_arrow_Right'))

WebUI.click(findTestObject('Object Repository/Button_For_Start_TheCourse/Page_- joacademy.com/Button_For_Back_To_The_Course'))

WebUI.click(findTestObject('Object Repository/Button_For_Start_TheCourse/Page_- joacademy.com/p__1'))

WebUI.click(findTestObject('Object Repository/lgoin and go to the my courese/Page_- joacademy.com/button_Close'))

