package oop_00000116912_devlinvalentino_week6.tugas

fun main() {
    val myHub = smartHomeHub()

    val lampuTamu = smartLamp("L-001", "Ruang Tamu")
    val speakerDapur = smartSpeaker("S-002", "Google Nest Dapur")
    val cctvGarasi = smartCCTV("C-003", "Ezviz Garasi")

    myHub.addDevice(lampuTamu)
    myHub.addDevice(speakerDapur)
    myHub.addDevice(cctvGarasi)

    myHub.activateSecurityMode()
    myHub.turnOffAllSwitches()
}