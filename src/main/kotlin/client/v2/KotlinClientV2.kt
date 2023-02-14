package client.v2

import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.PrintStream
import java.net.Socket

class KotlinClientV2: BasicClientV2Impl() {

    override fun request() {

        val sc = Socket(host, port)
        val br = BufferedReader(InputStreamReader(sc.getInputStream()))

        val ps = PrintStream(sc.getOutputStream())
        ps.println("$requestMethod / ${httpVersion.version}")

        ps.println("Host: $host")
        ps.println(header)

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