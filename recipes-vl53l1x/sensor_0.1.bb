SUMMARY = "An sensor connected via I2c"
DESCRIPTION = "This is a first part of the project where it will send information to the board via I2C and to the system via IPC (FIFO)"
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""
SRC_URI = "git://github.com/SystemProgrammerWizzard/sensor-vl53l1x.git;branch=devtool;protocol=https"
inherit cmake
SRCREV = "${AUTOREV}"


S = "${WORKDIR}/git"


