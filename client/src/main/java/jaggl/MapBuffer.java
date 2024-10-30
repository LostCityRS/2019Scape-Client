package jaggl;

import deob.ObfuscatedName;
import jaclib.memory.NativeBuffer;

public class MapBuffer extends NativeBuffer {

	@ObfuscatedName("jaggl/MapBuffer.m")
	public int field213;

	@ObfuscatedName("jaggl/MapBuffer.m([BIII)V")
	public void method8(byte[] arg0, int arg1, int arg2, int arg3) {
		if (this.field213 == 0) {
			throw new RuntimeException();
		}
		super.method8(arg0, arg1, arg2, arg3);
	}
}
