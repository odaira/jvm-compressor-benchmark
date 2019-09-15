package com.ning.jcbm.lz4;

import net.jpountz.lz4.LZ4Factory;

/**
 * High LZ4 compression with 99, pure Java impl.
 */
public class Lz4Hc99JavaDriver extends AbstractLz4Driver {

    public Lz4Hc99JavaDriver() {
        super("LZ4 HC 99 (Java)", LZ4Factory.safeInstance().highCompressor(99), LZ4Factory.safeInstance().fastDecompressor());
    }

}
