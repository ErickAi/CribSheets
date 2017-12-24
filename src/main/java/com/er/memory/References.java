package com.er.memory;

import java.lang.ref.SoftReference;

public class References {
    SoftReference<byte[]> ref;
    void doSmth(){
        byte[] buff = ref.get();
        if (buff == null) {
            buff = new byte[10_000_000];
            ref = new SoftReference<byte[]>(buff);
        }
        buff[0] = 1;
    }
//also WeakReference & PhantomReference
}
