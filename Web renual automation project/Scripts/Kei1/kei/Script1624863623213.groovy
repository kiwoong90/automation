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

WebUI.navigateToUrl('https://www-staging-blue.kidsnote.com/member/login')

WebUI.setText(findTestObject('Object Repository/kei/Page_/input__username'), 'kdnh16')

WebUI.setEncryptedText(findTestObject('Object Repository/kei/Page_/input__password'), 'SFTQUhjBfIY=')

WebUI.click(findTestObject('Object Repository/kei/Page_/button_'))

WebUI.click(findTestObject('Object Repository/kei/Page_/div_expand_more_1'))

WebUI.click(findTestObject('Object Repository/kei/Page_/span__css-1y66q0h eugmj2q0'))

WebUI.click(findTestObject('Object Repository/kei/Page_/span_'))

WebUI.click(findTestObject('Object Repository/kei/Page_/p_'))

WebUI.click(findTestObject('Object Repository/kei/Page_/span_create'))

WebUI.click(findTestObject('Common/Choose_all Class Button'))

WebUI.click(findTestObject('Common/Choose_all Class Button'))

WebUI.click(findTestObject('Common/Class_Choose confirm Button'))

WebUI.setText(findTestObject('Object Repository/kei/Page_/input__title'), 'asd')

WebUI.setText(findTestObject('Object Repository/kei/Page_/textarea_a'), 'a')

WebUI.setText(findTestObject('Object Repository/kei/Page_/textarea_as'), 'as')

WebUI.setText(findTestObject('Object Repository/kei/Page_/textarea_asd'), 'asd')

WebUI.click(findTestObject('Object Repository/kei/Page_/img__css-1jgxixz ech34xo16'))

WebUI.click(findTestObject('Object Repository/kei/Page_/span__1_2_3'))
