import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')
WebUI.navigateToUrl('https://automationbookstore.dev/')

// --- objek yang dipakai
def search = findTestObject('Search')                 // //input[@id='searchBar']
def anyVisibleBook = findTestObject('AnyVisibleBook') // //ul[@id='books']/li[not(contains(@class,'ui-screen-hidden'))]

// --- ketik keyword yang dipastikan tidak ada
WebUI.waitForElementVisible(search, 10)
WebUI.setText(search, 'Febrinabooks')
WebUI.delay(1)  // beri waktu filter berjalan

// --- verifikasi TIDAK ADA hasil yang terlihat
WebUI.verifyElementNotPresent(anyVisibleBook, 0)

// --- (opsional) “tutup” pencarian: kosongkan input
WebUI.clearText(search)

WebUI.closeBrowser()
