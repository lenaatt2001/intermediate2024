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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.joacademy.com/courses/intermediate?grade=855')


// تحديد الكلمة المفتاحية للبحث
String searchKeyword = 'علوم'

// إدخال الكلمة المفتاحية في خانة البحث
WebUI.setText(findTestObject('Object Repository/Page_- joacademy.com/input__search'), searchKeyword)

// تأخير بسيط للسماح بتحميل النتائج
WebUI.delay(2)

// إنشاء عنصر ديناميكي باستخدام XPath
TestObject dynamicResult = new TestObject('dynamicResult')

dynamicResult.addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, ('//h2[contains(text(),\'' + searchKeyword) + 
    '\')]')

// التمرير إلى العنصر الديناميكي
WebUI.scrollToElement(dynamicResult, 5)

// التحقق من أن العنصر الديناميكي موجود
boolean isCourseFound = WebUI.verifyElementPresent(dynamicResult, 5)

if (isCourseFound) {
    println('تم العثور على دورة تحتوي على النص المطلوب: ' + searchKeyword)

    // التفاعل مع الدورة (مثل فتح التفاصيل)
    WebUI.click(dynamicResult)
	//WebUI.click(findTestObject('Object Repository/Page_- joacademy.com/button_for_detail_thecoursse'))
	WebUI.delay(10)
	// الرجوع إلى الصفحة السابقة
	WebUI.back()
     }

 else {
    println('لم يتم العثور على دورة تحتوي على النص المطلوب: ' + searchKeyword)
}
//WebUI.click(findTestObject('Object Repository/Page_- joacademy.com/button_for_detail_thecoursse'))
WebUI.click(findTestObject('Object Repository/The_courses_page/Page_- joacademy.com/button_for_reset_filter'))
// التمرير إلى أسفل الصفحة
WebUI.scrollToPosition(0, 1000)

// تأخير قليل لمشاهدة التمرير
WebUI.delay(10)

// التمرير إلى أعلى الصفحة
WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Object Repository/The_courses_page/Page_- joacademy.com/button_gruop_ofsupject_mathe'))
// التمرير إلى أسفل الصفحة
WebUI.scrollToPosition(0, 1000)

// تأخير قليل لمشاهدة التمرير
WebUI.delay(10)

// التمرير إلى أعلى الصفحة
WebUI.scrollToPosition(0, 0)
WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/The_courses_page/Page_- joacademy.com/button_gruop_ofsupject_arabic'))
// التمرير إلى أسفل الصفحة
WebUI.scrollToPosition(0, 1000)

// تأخير قليل لمشاهدة التمرير
WebUI.delay(10)

// التمرير إلى أعلى الصفحة
WebUI.scrollToPosition(0, 0)
WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/The_courses_page/Page_- joacademy.com/button_gruop_ofsupject_science'))
// التمرير إلى أسفل الصفحة
WebUI.scrollToPosition(0, 1000)

// تأخير قليل لمشاهدة التمرير
WebUI.delay(10)

// التمرير إلى أعلى الصفحة
WebUI.scrollToPosition(0, 0)
WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/The_courses_page/Page_- joacademy.com/button_gruop_ofsupject_English'))
// التمرير إلى أسفل الصفحة
WebUI.scrollToPosition(0, 1000)

// تأخير قليل لمشاهدة التمرير
WebUI.delay(10)

// التمرير إلى أعلى الصفحة
WebUI.scrollToPosition(0, 0)
WebUI.delay(5)




