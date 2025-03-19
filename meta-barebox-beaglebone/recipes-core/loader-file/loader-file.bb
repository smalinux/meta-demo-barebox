SUMMARY = "Install loader configuration files"
LICENSE = "CLOSED"

# Ensure SRC_URI is pointing to the correct file in the 'files' directory
SRC_URI = "file://am335x-boneblack.conf"

do_install() {
    # Create the target directory where the file should be installed
    install -d ${D}/loader/entries

    install -m 0644 ${UNPACKDIR}/am335x-boneblack.conf ${D}/loader/entries/am335x-boneblack.conf
}

FILES:${PN} += "/loader/entries/am335x-boneblack.conf"
