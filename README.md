# Hardware Monitoring SDK

HMSDK *(= Hardware Monitoring Software Development Kit)* is a library which receives the current temperatures etc. from the [Hardware Monitoring Display](https://github.com/verityyt/hardware-monitoring-display).

## Example
```kotlin
import sdk.HMSDK
...

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
You or the user of your application has to run the [Hardware Monitoring Display](https://github.com/verityyt/hardware-monitoring-display) in background
