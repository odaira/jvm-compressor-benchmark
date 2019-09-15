package com.ning.jcbm.lz4;

import net.jpountz.lz4.LZ4Factory;

/**
 * High LZ4 compression with level 99, pure Java impl relying on sun.misc.Unsafe.
 */
public class Lz4Hc99JavaUnsafeDriver extends AbstractLz4Driver {

    public Lz4Hc99JavaUnsafeDriver() {
        super("LZ4 HC 99 (Java+Unsafe)", LZ4Factory.unsafeInstance().highCompressor(99), LZ4Factory.unsafeInstance().fastDecompressor());
    }

}
