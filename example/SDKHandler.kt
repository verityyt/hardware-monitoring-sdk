import sdk.HMSDK

object SDKHandler : HMSDK() {

    override fun handle(input: String) {
        println(input)
    }

}