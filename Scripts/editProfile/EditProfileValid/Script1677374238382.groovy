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

Mobile.startApplication('/Users/rianfati/Documents/sehatq/mobile/sehatq2.apk', true)
Mobile.tap(findTestObject('Object Repository/halamanUtamaButton'), 1)
if (Mobile.verifyElementExist(findTestObject('Object Repository/aktifkanLokasiButton'), 2, FailureHandling.OPTIONAL)){
	Mobile.tap(findTestObject('Object Repository/aktifkanLokasiButton'), 1)
}
if (Mobile.verifyElementExist(findTestObject('Object Repository/allowWhileUsingAppButton'), 2, FailureHandling.OPTIONAL)){
	Mobile.tap(findTestObject('Object Repository/allowWhileUsingAppButton'), 1)
}
//Mobile.tap(findTestObject('Object Repository/aktifkanLokasiButton'), 1)
//Mobile.tap(findTestObject('Object Repository/allowWhileUsingAppButton'), 1)
Mobile.verifyElementExist(findTestObject('Object Repository/lewatiButton'), 2)
Mobile.tap(findTestObject('Object Repository/lewatiButton'), 5)
Mobile.delay(2)
Mobile.tapAtPosition(1009, 219)
Mobile.delay(2)
Mobile.tap(findTestObject('Object Repository/loginEmail'), 5)
Mobile.delay(2)
Mobile.sendKeys(findTestObject('Object Repository/loginFieldEmail'), 'rianfati@gmail.com')
Mobile.delay(2)
Mobile.tap(findTestObject('Object Repository/loginFieldPassword'), 5)
Mobile.delay(2)
Mobile.sendKeys(findTestObject('Object Repository/loginFieldPassword'), 'E3yhanhi')
Mobile.delay(5)
Mobile.tap(findTestObject('Object Repository/loginSubmitButton2'), 1)
Mobile.delay(5)
assert Mobile.getText(findTestObject('Object Repository/profileEmail'), 5) == 'rianfati@gmail.com'
Mobile.tap(findTestObject('Object Repository/profileLihatProfileButton'), 1)
Mobile.tap(findTestObject('Object Repository/profileEditProfileButton'), 1)
Mobile.delay(2)
Mobile.sendKeys(findTestObject('Object Repository/editProfileName'), 'Rianfati')
Mobile.delay(2)
Mobile.sendKeys(findTestObject('Object Repository/editProfileHeight'), '177')
Mobile.delay(2)
Mobile.sendKeys(findTestObject('Object Repository/editProfileWeight'), '64')
Mobile.delay(2)
Mobile.swipe(484, 1722, 491, 621)
Mobile.delay(3)
Mobile.sendKeys(findTestObject('Object Repository/editProfileAddress'), 'Tangerang')
Mobile.delay(2)
Mobile.tap(findTestObject('Object Repository/editProfileSaveButton'), 1)
Mobile.verifyElementExist(findTestObject('Object Repository/editProfileSuccesAlert'), 2)
