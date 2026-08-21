import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import groovy.json.JsonSlurper

// 1. Kirim request PATCH
def response = WS.sendRequest(findTestObject('Object Repository/PATCH'))

// 2. Verifikasi status code
WS.verifyResponseStatusCode(response, 204)

// 3. Parsing response body (jika ada)
def responseBody = response.getResponseBodyContent()

if (responseBody && responseBody.trim()) {
    def jsonResponse = new JsonSlurper().parseText(responseBody)

    println("Response Body:")
    println(jsonResponse)

    // 4. Verifikasi data yang diubah
    if (jsonResponse.username != null) {
        WS.verifyElementPropertyValue(response, 'username', 'felia.qam')
    } else {
        println("Tidak ada field 'username' di response PATCH.")
    }

    if (jsonResponse.email != null) {
        WS.verifyElementPropertyValue(response, 'email', 'felia.qam@example.com')
    } else {
        println("Tidak ada field 'email' di response PATCH.")
    }

} else {
    println("Response PATCH tidak memiliki body (status code 204 kemungkinan).")
}

println("Test PATCH user selesai dieksekusi.")
