package com.jagex.game.config;

import com.jagex.game.config.loctype.LocTypeFactory;
import com.jagex.core.constants.Language;
import com.jagex.core.constants.ModeGame;
import com.jagex.game.config.loctype.LocType;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("alf")
public class BasicLocTypeFactory extends LocTypeFactory implements ConfigTypeFactory {

	@ObfuscatedName("alf.z")
	public final Js5 field11701;

	public BasicLocTypeFactory(boolean arg0, Js5 arg1, Language arg2, ModeGame arg3) {
		super(arg0, arg2, arg3);
		this.field11701 = arg1;
	}

	@ObfuscatedName("alf.v(ILao;I)Lay;")
	public ConfigType create(int arg0, ConfigTypeList arg1) {
		return new LocType(arg0, this, arg1);
	}

	@ObfuscatedName("alf.o(B)Ljava/lang/Class;")
	public Class type() {
		return LocType.class;
	}

	@ObfuscatedName("alf.w(II)[B")
	public byte[] method9530(int arg0) {
		Js5 var2 = this.field11701;
		synchronized (this.field11701) {
			return this.field11701.method6879(arg0, 0);
		}
	}

	@ObfuscatedName("alf.l(IS)Z")
	public boolean method9525(int arg0) {
		Js5 var2 = this.field11701;
		synchronized (this.field11701) {
			return this.field11701.method6888(arg0, 0);
		}
	}
}
