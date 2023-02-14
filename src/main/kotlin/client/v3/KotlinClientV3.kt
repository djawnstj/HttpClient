package client.v3

import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.PrintStream
import java.net.Socket

class KotlinClientV3: BasicClientV3Impl() {
    override fun request() {

        val sc = Socket(host, port)
        val br = BufferedReader(InputStreamReader(sc.getInputStream()))

        val ps = PrintStream(sc.getOutputStream())
        ps.println("$requestMethod / ${httpVersion.version}")

        ps.println("Host: $host")
        ps.println(requestHeader)

        ps.println()

        var line: String? = br.readLine()

        line?.let {
            responseCode = it.split(" ")[1].toInt()
        }

        while (!line.isNullOrEmpty()) {
            val header = line.split(":")

            if (header.size >= 2) {
                val key = header[0]
                var value = ""
                for (i in 1 until header.size) value += ":${header[i]}"

                setResponseHeader(key, value)
            }

            line = br.readLine()
        }

        while (line != null) {
            responseMessage += line
            line = br.readLine()
        }

        br.close()
        ps.close()
        sc.close()

    }

}