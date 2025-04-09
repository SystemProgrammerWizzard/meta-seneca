SUMMARY = "An sensor connected via I2c"
DESCRIPTION = "This is a first part of the project where it will send information to the board via I2C and to the system via IPC (FIFO)"
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

inherit cmake


SRC_URI = "file://CMakeLists.txt \
           file://sensor.c \
           file://vl53l1x/VL53L1X_api.c \
           file://vl53l1x/VL53L1X_api.h \
           file://vl53l1x/VL53L1X_calibration.c \
           file://vl53l1x/VL53L1X_calibration.h \
           file://vl53l1x/vl53l1_platform.c \
           file://vl53l1x/vl53l1_platform.h \
           file://vl53l1x/vl53l1_types.h"

S = "${WORKDIR}"

