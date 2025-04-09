SUMMARY = "bitbake-layers tes"
DESCRIPTION = "Receiped for lab test"
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""
SRC_URI = "file://input_app.c"

S = "${WORKDIR}"

do_compile() {
    ${CC} ${CFLAGS} ${LDFLAGS} input_app.c -o input_app
}


do_install() {
    install -d ${D}${bindir}
    install -m 0755 input_app ${D}${bindir}
}


