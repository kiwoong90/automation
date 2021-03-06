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

WebUI.click(findTestObject('Calendar/Menu_Calendar'))

WebUI.click(findTestObject('Calendar/Calendar_Create Button'))

WebUI.click(findTestObject('Common/Choose_Class Button'))

WebUI.click(findTestObject('Calendar/Choose_all Class Button'))

WebUI.click(findTestObject('Common/Class_Choose confirm Button'))

WebUI.click(findTestObject('Common/Title_input box'))

WebUI.setText(findTestObject('Common/Title_input box'), '일정표 테스트 Calendar TEST ')

WebUI.click(findTestObject('Common/textarea__input box'))

WebUI.setText(findTestObject('Common/textarea__input box'), 'Test 일정표 작성 테스트')

WebUI.click(findTestObject('Calendar/Calendar_sticker image'))

WebUI.click(findTestObject('Calendar/Calendar_Send button'))

