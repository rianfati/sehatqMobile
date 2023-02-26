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
import org.apache.commons.lang.RandomStringUtils

String charset = (('A'..'Z') + ('0'..'9')).join()
Integer length = 9
String randomString = RandomStringUtils.random(length, charset.toCharArray())
System.out.println(randomString)

String charset2 = (('0'..'9')).join()
Integer length2 = 6
String randomNumber = RandomStringUtils.random(length2, charset2.toCharArray())
System.out.println(randomNumber)

String email = randomString + '@mail.com'
String phone = '0812' + randomNumber

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
Mobile.tap(findTestObject('Object Repository/loginRegisterLink'), 5)
Mobile.delay(2)
Mobile.sendKeys(findTestObject('Object Repository/registerNamaLengkapField'), 'Budi Awan')
Mobile.sendKeys(findTestObject('Object Repository/registerJenisKelaminField'), 'Laki-laki')
Mobile.sendKeys(findTestObject('Object Repository/registerEmailField'), randomString + '@mail.com')
Mobile.sendKeys(findTestObject('Object Repository/registerPasswordField'), 'Qwe')
Mobile.tap(findTestObject('Object Repository/registerTncButton'), 5)
Mobile.tap(findTestObject('Object Repository/registerSubmitButton'), 5)
Mobile.delay(5)
Mobile.verifyElementExist(findTestObject('Object Repository/registerPasswordLessThan6CharAlert'), 2)