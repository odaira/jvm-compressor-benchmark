package com.ning.jcbm.lz4;

import net.jpountz.lz4.LZ4Factory;

/**
 * High LZ4 compression with level 99, JNI bindings.
 */
public class Lz4Hc99JNIDriver extends AbstractLz4Driver {

    public Lz4Hc99JNIDriver() {
        super("LZ4 HC 99 (JNI)", LZ4Factory.nativeInstance().highCompressor(99), LZ4Factory.nativeInstance().fastDecompressor());
    }

}
