package com.jagex.game.config.cursortype;

import com.jagex.CursorTypeFactory;
import com.jagex.Packet;
import com.jagex.SpriteData;
import com.jagex.SpriteDataProvider;
import com.jagex.game.config.ConfigType;
import deob.ObfuscatedName;

@ObfuscatedName("xj")
public class CursorType implements ConfigType {

	@ObfuscatedName("xj.e")
	public final CursorTypeFactory field7962;

	@ObfuscatedName("xj.n")
	public int field7963;

	@ObfuscatedName("xj.m")
	public int field7964;

	@ObfuscatedName("xj.k")
	public int field7965;

	public CursorType(int arg0, CursorTypeFactory arg1) {
		this.field7962 = arg1;
	}

	@ObfuscatedName("xj.e(Lalw;B)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method10303(arg0, var2);
		}
	}

	@ObfuscatedName("xj.u(Lalw;II)V")
	public void method10303(Packet arg0, int arg1) {
		if (arg1 == 1) {
			this.field7963 = arg0.gSmart2or4null();
		} else if (arg1 == 2) {
			this.field7964 = arg0.g1();
			this.field7965 = arg0.g1();
		}
	}

	@ObfuscatedName("xj.z(I)Lde;")
	public synchronized SpriteData method10302() {
		SpriteData var1 = (SpriteData) this.field7962.field7959.method2930((long) this.field7963);
		if (var1 != null) {
			return var1;
		}
		SpriteData var2 = SpriteDataProvider.method1609(this.field7962.field7960, this.field7963, 0);
		if (var2 != null) {
			this.field7962.field7959.method2921(var2, (long) this.field7963);
		}
		return var2;
	}

	@ObfuscatedName("xj.n(I)V")
	public void postDecode() {
	}
}
