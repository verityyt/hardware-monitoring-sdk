# Hardware Monitoring SDK

HMSDK *(= Hardware Monitoring Software Development Kit)* is a library which receives data from the [Hardware Monitoring Display](https://github.com/verityyt/hardware-monitoring-display).

## [Example](https://github.com/verityyt/hardware-monitoring-sdk/blob/master/example/Example.kt)
```kotlin
import sdk.HMSDK

val sdk = object : HMSDK() {
    override fun handle(input: String) {
        println(input)
    }
}

sdk.startListening()
```

## Linked projects
[Hardware Monitoring Display](https://github.com/verityyt/hardware-monitoring-display)

[Installer](https://github.com/verityyt/hmd-installer)

## Note
You or the user of your application has to run the [Hardware Monitoring Display](https://github.com/verityyt/hardware-monitoring-display) in background.

Please note that <code>allow_sdk</code> in the config of the running [HMD](https://github.com/verityyt/hardware-monitoring-display) must be <code>true</code>. And as port you should use the port

which is configured in the config, as <code>sdk_port</code>, the default port is <code>6969</code>