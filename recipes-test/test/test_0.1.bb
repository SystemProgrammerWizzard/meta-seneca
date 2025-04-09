SUMMARY = "bitbake-layers tes"
DESCRIPTION = "Receiped for lab test"
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""
SRC_URI = "git://github.com/ancor1369/simple-library.git;branch=main;protocol=https"
DEPENDS= "gtest spdlog nlohmann-json"        
SRCREV = "1e2f9bf03244fa37187482dbfa95d676ae84df6c"

S = "${WORKDIR}/git"

inherit cmake
do_install() {
    install -d ${D}${bindir}
    install -m 0755 tests/simple-library-test ${D}${bindir}
}

