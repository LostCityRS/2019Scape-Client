package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("asc")
public class ClientScript extends SecondaryNode {

	@ObfuscatedName("asc.l")
	public ClientTriggerType field12373;

	@ObfuscatedName("asc.u")
	public String field12365;

	@ObfuscatedName("asc.z")
	public ClientScriptCommand[] field12369;

	@ObfuscatedName("asc.p")
	public int[] field12367;

	@ObfuscatedName("asc.d")
	public Object[] field12366;

	@ObfuscatedName("asc.c")
	public int field12370;

	@ObfuscatedName("asc.r")
	public int field12368;

	@ObfuscatedName("asc.v")
	public int field12371;

	@ObfuscatedName("asc.o")
	public int field12372;

	@ObfuscatedName("asc.s")
	public int field12374;

	@ObfuscatedName("asc.y")
	public int field12364;

	@ObfuscatedName("asc.q")
	public IterableMap[] field12375;

	@ObfuscatedName("asc.x")
	public final class151 field12376;

	public ClientScript(Packet arg0, class151 arg1) {
		this.field12376 = arg1;
		int var3 = this.method19494(arg0);
		int var4 = 0;
		ClientScriptCommand[] var5 = ClientScriptCommand.method7897();
		while (arg0.pos < var3) {
			ClientScriptCommand var6 = this.method19493(arg0, var5);
			this.method19495(arg0, var4, var6);
			var4++;
		}
	}

	@ObfuscatedName("asc.e(Lalw;[Lss;I)Lss;")
	public ClientScriptCommand method19493(Packet arg0, ClientScriptCommand[] arg1) {
		int var3 = arg0.g2();
		if (var3 < 0 || var3 >= arg1.length) {
			throw new RuntimeException("");
		}
		return arg1[var3];
	}

	@ObfuscatedName("asc.n(Lalw;I)I")
	public int method19494(Packet arg0) {
		arg0.pos = (arg0.data.length - 2);
		int var2 = arg0.g2();
		int var3 = arg0.data.length - 2 - var2 - 16;
		arg0.pos = var3;
		int var4 = arg0.g4s();
		this.field12370 = arg0.g2();
		this.field12368 = arg0.g2();
		this.field12371 = arg0.g2();
		this.field12372 = arg0.g2();
		this.field12374 = arg0.g2();
		this.field12364 = arg0.g2();
		int var5 = arg0.g1();
		if (var5 > 0) {
			this.field12375 = new IterableMap[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				int var7 = arg0.g2();
				IterableMap var8 = new IterableMap(var7 > 0 ? class783.method16657(var7) : 1);
				this.field12375[var6] = var8;
				while (var7-- > 0) {
					int var9 = arg0.g4s();
					int var10 = arg0.g4s();
					var8.method14501(new class988(var10), (long) var9);
				}
			}
		}
		arg0.pos = 0;
		this.field12365 = arg0.fastgstr();
		this.field12369 = new ClientScriptCommand[var4];
		return var3;
	}

	@ObfuscatedName("asc.m(Lalw;ILss;I)V")
	public void method19495(Packet arg0, int arg1, ClientScriptCommand arg2) {
		int var4 = this.field12369.length;
		if (ClientScriptCommand.field5937 == arg2 || ClientScriptCommand.field5651 == arg2) {
			VarDomainType var7 = (VarDomainType) class686.method1897(VarDomainType.method7216(), arg0.g1());
			int var8 = arg0.g2();
			if (this.field12366 == null) {
				this.field12366 = new Object[var4];
			}
			this.field12366[arg1] = this.field12376.method695(var7, var8);
			if (this.field12367 == null) {
				this.field12367 = new int[var4];
			}
			this.field12367[arg1] = arg0.g1();
		} else if (ClientScriptCommand.field5144 == arg2) {
			BaseVarType var5 = (BaseVarType) class686.method1897(Statics.method7338(), arg0.g1());
			switch(var5.id) {
				case 1:
					if (this.field12366 == null) {
						this.field12366 = new Object[var4];
					}
					this.field12366[arg1] = arg0.gjstr().intern();
					break;
				case 2:
					if (this.field12367 == null) {
						this.field12367 = new int[var4];
					}
					arg2 = ClientScriptCommand.field5463;
					this.field12367[arg1] = arg0.g4s();
					break;
				case 3:
				default:
					throw new RuntimeException();
				case 4:
					if (this.field12366 == null) {
						this.field12366 = new Object[var4];
					}
					arg2 = ClientScriptCommand.field5164;
					this.field12366[arg1] = arg0.g8();
			}
		} else if (ClientScriptCommand.field5142 == arg2 || ClientScriptCommand.field5143 == arg2) {
			int var6 = arg0.g2();
			if (this.field12366 == null) {
				this.field12366 = new Object[var4];
			}
			this.field12366[arg1] = this.field12376.method694(var6);
			if (this.field12367 == null) {
				this.field12367 = new int[var4];
			}
			this.field12367[arg1] = arg0.g1();
		} else {
			if (this.field12367 == null) {
				this.field12367 = new int[var4];
			}
			if (arg2 != null && arg2.field6572) {
				this.field12367[arg1] = arg0.g4s();
			} else {
				this.field12367[arg1] = arg0.g1();
			}
		}
		this.field12369[arg1] = arg2;
	}
}
