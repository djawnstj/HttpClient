package client.v1

import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.PrintStream
import java.net.Socket

class KotlinClientV1: BasicClientV1 {

    override fun request(method: String, httpVersion: String, host: String, port: Int, header: String) {
        val sc = Socket(host, port)
        val br = BufferedReader(InputStreamReader(sc.getInputStream()))

        val ps = PrintStream(sc.getOutputStream())
        ps.println("$method / $httpVersion")

        ps.println("Host: $host")
        ps.println("header")

        ps.println()

        var line: String? = br.readLine()

        while (line != null) {
            println(line)
            line = br.readLine()
        }

        br.close()
        ps.close()
        sc.close()

    }

}