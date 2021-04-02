import sdk.HMSDK

fun main() {

    val sdk = object : HMSDK() {
        override fun handle(input: String) {
            println(input)
        }
    }

    sdk.startListening()

}