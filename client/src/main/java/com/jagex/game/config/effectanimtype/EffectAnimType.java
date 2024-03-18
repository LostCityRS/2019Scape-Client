package com.jagex.game.config.effectanimtype;

import com.jagex.core.datastruct.WeightedCache;
import com.jagex.core.io.Packet;
import com.jagex.game.config.ConfigType;
import com.jagex.graphics.*;
import deob.ObfuscatedName;

@ObfuscatedName("yy")
public class EffectAnimType implements ConfigType {

	@ObfuscatedName("yy.n")
	public final EffectAnimTypeFactory factory;

	@ObfuscatedName("yy.m")
	public final int id;

	@ObfuscatedName("yy.k")
	public int model;

	@ObfuscatedName("yy.f")
	public int anim = -1;

	@ObfuscatedName("yy.w")
	public short[] recol_s;

	@ObfuscatedName("yy.l")
	public short[] recol_d;

	@ObfuscatedName("yy.u")
	public short[] retex_s;

	@ObfuscatedName("yy.z")
	public short[] retex_d;

	@ObfuscatedName("yy.p")
	public byte[] field8254;

	@ObfuscatedName("yy.d")
	public byte[] field8255;

	@ObfuscatedName("yy.c")
	public int resizeh = 128;

	@ObfuscatedName("yy.r")
	public int resizev = 128;

	@ObfuscatedName("yy.v")
	public int orientation = 0;

	@ObfuscatedName("yy.o")
	public int ambient = 0;

	@ObfuscatedName("yy.s")
	public int contrast = 0;

	@ObfuscatedName("yy.y")
	public boolean field8261 = false;

	@ObfuscatedName("yy.q")
	public byte field8262 = 0;

	@ObfuscatedName("yy.x")
	public int field8263 = -1;

	public EffectAnimType(int id, EffectAnimTypeFactory factory) {
		this.id = id;
		this.factory = factory;
	}

	@ObfuscatedName("yy.e(Lalw;B)V")
	public void decode(Packet buf) {
		while (true) {
			int code = buf.g1();
			if (code == 0) {
				return;
			}
			this.decode(buf, code);
		}
	}

	@ObfuscatedName("yy.u(Lalw;II)V")
	public void decode(Packet buf, int code) {
		if (code == 1) {
			this.model = buf.gSmart2or4null();
		} else if (code == 2) {
			this.anim = buf.gSmart2or4null();
		} else if (code == 4) {
			this.resizeh = buf.g2();
		} else if (code == 5) {
			this.resizev = buf.g2();
		} else if (code == 6) {
			this.orientation = buf.g2();
		} else if (code == 7) {
			this.ambient = buf.g1();
		} else if (code == 8) {
			this.contrast = buf.g1();
		} else if (code == 10) {
			this.field8261 = true;
		} else if (code == 9) {
			this.field8262 = 3;
			this.field8263 = 8224;
		} else if (code == 15) {
			this.field8262 = 3;
			this.field8263 = buf.g2();
		} else if (code == 16) {
			this.field8262 = 3;
			this.field8263 = buf.g4s();
		} else if (code == 40) {
			int length = buf.g1();
			this.recol_s = new short[length];
			this.recol_d = new short[length];
			for (int index = 0; index < length; index++) {
				this.recol_s[index] = (short) buf.g2();
				this.recol_d[index] = (short) buf.g2();
			}
		} else if (code == 41) {
			int length = buf.g1();
			this.retex_s = new short[length];
			this.retex_d = new short[length];
			for (int index = 0; index < length; index++) {
				this.retex_s[index] = (short) buf.g2();
				this.retex_d[index] = (short) buf.g2();
			}
		} else if (code == 44) {
			int var7 = buf.g2();
			int var8 = 0;
			for (int var9 = var7; var9 > 0; var9 >>= 0x1) {
				var8++;
			}
			this.field8254 = new byte[var8];
			byte var10 = 0;
			for (int var11 = 0; var11 < var8; var11++) {
				if ((var7 & 0x1 << var11) > 0) {
					this.field8254[var11] = var10++;
				} else {
					this.field8254[var11] = -1;
				}
			}
		} else if (code == 45) {
			int var12 = buf.g2();
			int var13 = 0;
			for (int var14 = var12; var14 > 0; var14 >>= 0x1) {
				var13++;
			}
			this.field8255 = new byte[var13];
			byte var15 = 0;
			for (int var16 = 0; var16 < var13; var16++) {
				if ((var12 & 0x1 << var16) > 0) {
					this.field8255[var16] = var15++;
				} else {
					this.field8255[var16] = -1;
				}
			}
		} else if (code == 46) {
		}
	}

	@ObfuscatedName("yy.z(Ldh;ILaaq;BI)Ldo;")
	public final Model method13817(Renderer arg0, int arg1, AnimationWrapper arg2, byte arg3) {
		return this.getModel(arg0, arg1, false, null, null, 0, 0, 0, 0, 0, 0, 0, arg2, arg3);
	}

	@ObfuscatedName("yy.p(Ldh;IIIIILaaq;BI)Ldo;")
	public final Model method13800(Renderer arg0, int arg1, int arg2, int arg3, int arg4, int arg5, AnimationWrapper arg6, byte arg7) {
		return this.field8262 == 3 ? this.getModel(arg0, arg1, true, null, null, 0, 0, 0, arg2, arg3, arg4, arg5, arg6, arg7) : this.getModel(arg0, arg1, false, null, null, 0, 0, 0, arg2, 0, 0, 0, arg6, arg7);
	}

	@ObfuscatedName("yy.d(Ldh;IILcb;Lcb;IIILaaq;BB)Ldo;")
	public final Model method13802(Renderer arg0, int arg1, int arg2, FloorModel arg3, FloorModel arg4, int arg5, int arg6, int arg7, AnimationWrapper arg8, byte arg9) {
		return this.getModel(arg0, arg1, true, arg3, arg4, arg5, arg6, arg7, arg2, 0, 0, 0, arg8, arg9);
	}

	@ObfuscatedName("yy.c(Ldh;IZLcb;Lcb;IIIIIIILaaq;BI)Ldo;")
	public final Model getModel(Renderer arg0, int arg1, boolean arg2, FloorModel arg3, FloorModel arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, AnimationWrapper arg12, byte arg13) {
		int var15 = arg1;
		boolean var16 = arg2 & this.field8262 != 0;
		if (arg12 != null) {
			var15 = arg1 | arg12.method14358();
		}
		if (this.resizev != 128) {
			var15 |= 0x2;
		}
		if (this.resizeh != 128 || this.orientation != 0 || arg8 != 0) {
			var15 |= 0x5;
		}
		if (var16) {
			var15 |= 0x7;
		}
		WeightedCache var17 = this.factory.modelCache;
		Model var18;
		synchronized (this.factory.modelCache) {
			var18 = (Model) this.factory.modelCache.get((long) (this.id | arg0.field1595 << 29));
		}
		if (var18 == null || arg0.method2394(var18.method1691(), var15) != 0) {
			if (var18 != null) {
				var15 = arg0.method2213(var15, var18.method1691());
			}
			int var20 = var15;
			if (this.recol_s != null) {
				var20 = var15 | 0x4000;
			}
			if (this.retex_s != null) {
				var20 |= 0x8000;
			}
			ModelUnlit var21 = ModelUnlit.method1931(this.factory.configClient, this.model, 0);
			if (var21 == null) {
				return null;
			}
			if (var21.field1372 < 13) {
				var21.method1947(2);
			}
			var18 = arg0.createModel(var21, var20, this.factory.field8264, this.ambient + 64, this.contrast + 850);
			if (this.recol_s != null) {
				for (int var22 = 0; var22 < this.recol_s.length; var22++) {
					var18.method1859(this.recol_s[var22], this.recol_d[var22]);
				}
			}
			if (this.retex_s != null) {
				for (int var23 = 0; var23 < this.retex_s.length; var23++) {
					var18.method1744(this.retex_s[var23], this.retex_d[var23]);
				}
			}
			var18.method1690(var15);
			WeightedCache var24 = this.factory.modelCache;
			synchronized (this.factory.modelCache) {
				this.factory.modelCache.put(var18, (long) (this.id | arg0.field1595 << 29));
			}
		}
		Model var26 = var18.method1773(arg13, var15, true);
		if (arg12 != null) {
			arg12.method14359(var26, 0);
		}
		if (this.resizeh != 128 || this.resizev != 128) {
			var26.method1699(this.resizeh, this.resizev, this.resizeh);
		}
		if (this.orientation != 0) {
			if (this.orientation == 90) {
				arg8 += 4096;
			}
			if (this.orientation == 180) {
				arg8 += 8192;
			}
			if (this.orientation == 270) {
				arg8 += 12288;
			}
		}
		if (arg8 != 0) {
			int var27 = arg8 & 0x3FFF;
			var26.method1693(var27);
		}
		if (var16) {
			if (arg3 == null) {
				if (arg9 != 0) {
					var26.method1852(arg9);
				}
				if (arg10 != 0) {
					var26.method1696(arg10);
				}
				if (arg11 != 0) {
					var26.method1805(0, arg11, 0);
				}
			} else {
				var26.method1700(this.field8262, this.field8263, arg3, arg4, arg5, arg6, arg7);
			}
		}
		var26.method1690(arg1);
		return var26;
	}

	@ObfuscatedName("yy.r(B)Z")
	public final boolean method13803() {
		return this.model == -1 ? true : this.factory.configClient.requestdownload(this.model, 0);
	}

	@ObfuscatedName("yy.n(I)V")
	public void postDecode() {
	}
}
