import client.common.HTTP_METHOD
import client.common.HTTP_VERSION
import client.v2.KotlinClientV2
import client.v3.KotlinClientV3
import java.io.ByteArrayOutputStream
import java.net.HttpURLConnection
import java.net.URL

fun main(args: Array<String>) {

    val method = "GET"
    val http = "HTTP/1.1"
    val host = "127.0.0.1"
    val port = 8080
    val header = "User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_0)" +
            "AppleWebKit/537.36 (KHTML, like Gecko)" +
            "Chrome/30.0.1599.101 Safari/537.36"

//    KotlinClientV1().request(method, http, host, port, header)

    val clientV2 = KotlinClientV2().apply {
        requestMethod = HTTP_METHOD.of(method)
        httpVersion = HTTP_VERSION.of(http)
        this.host = host
        this.port = port
        this.header = header
    }

//    clientV2.request()

    val clientV3 = KotlinClientV3().apply {
        requestMethod = HTTP_METHOD.of(method)
        httpVersion = HTTP_VERSION.of(http)
        this.host = host
        this.port = port
        this.requestHeader = header
    }

//    clientV3.request()
//
//    println(clientV3.responseCode)
//    println()
//    clientV3.responseHeader.forEach { println(it) }
//    println()
//    println(clientV3.responseMessage)


}

fun requestURLConnection() {

    val url = URL("https://www.google.com")

    println("URL: ${url.toExternalForm()}")

    val conn = url.openConnection() as HttpURLConnection

    conn.requestMethod = "GET"
    conn.connectTimeout = 3000
    conn.readTimeout = 3000

    println("requestMethod = ${conn.requestMethod}")
    println("contentType = ${conn.contentType}")
    println("responseCode = ${conn.responseCode}")
    println("responseMessage = ${conn.responseMessage}")

   conn.headerFields.entries.forEach {
       it.value.forEach { value ->
           println("${it.key}: $value")
       }
   }

    try {
        val inputStream = conn.inputStream
        val outputStream = ByteArrayOutputStream()

        val buf = ByteArray(1024 * 8)
        var length = inputStream.read(buf)

        while (length != -1) {
            outputStream.write(buf, 0, length)
        }
        println(String(outputStream.toByteArray()))

    } catch (e: Exception) {
        e.printStackTrace()
    }

    conn.disconnect()
}

fun requestSocket() {

}