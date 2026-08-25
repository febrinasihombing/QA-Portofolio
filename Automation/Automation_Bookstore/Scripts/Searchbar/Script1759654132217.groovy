import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling as FH

WebUI.openBrowser('')

WebUI.navigateToUrl('https://automationbookstore.dev/')

def search = findTestObject('Search')

def book = findTestObject('books3')

WebUI.waitForElementVisible(search, 10)

WebUI.click(search)

WebUI.setText(findTestObject('Search'), 'Agile')

WebUI.delay(1)

// kalau buku ada → tampilkan; kalau tidak → “close” pencarian (clear)
boolean found = WebUI.verifyElementPresent(book, 2, FH.OPTIONAL)

if (found) {
    WebUI.scrollToElement(book, 5)

    WebUI.verifyElementVisible(book)

    WebUI.click(book) // tutup pencarian (input jadi kosong)
} else {
    WebUI.clearText(search)
}

WebUI.closeBrowser()

