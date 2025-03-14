Clone:

    $ git clone --recurse-submodules -j8 https://github.com/smalinux/barebox-bbb

Source:

    $ source poky/oe-init-build-env build/

Build:

    $ bitbake core-image-minimal

flash to sd-card:

    $ sudo bmaptool copy core-image-minimal-beaglebone-yocto.rootfs.wic /dev/sda
