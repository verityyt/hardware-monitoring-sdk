package sdk

import java.io.BufferedInputStream
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.net.Socket

open class HMSDK {

    lateinit var socket: Socket
    lateinit var input: InputStream
    lateinit var reader: BufferedReader

    fun startListening(port: Int = 6969) {
        Thread {
            println("Starting listening on port '$port'...")

            socket = Socket("localhost", port)
            input = socket.getInputStream()
            reader = BufferedReader(input.reader())

            while (true) {
                handle(reader.readLine())
            }

        }.start()
    }

    open fun handle(input: String) { }

}