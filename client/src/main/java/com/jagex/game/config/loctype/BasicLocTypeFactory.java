package com.jagex.game.config.loctype;

import com.jagex.core.constants.Language;
import com.jagex.core.constants.ModeGame;
import com.jagex.game.config.ConfigType;
import com.jagex.game.config.ConfigTypeFactory;
import com.jagex.game.config.ConfigTypeList;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("alf")
public class BasicLocTypeFactory extends LocTypeFactory implements ConfigTypeFactory {

	@ObfuscatedName("alf.z")
	public final Js5 js5;

	public BasicLocTypeFactory(boolean allowMembers, Js5 js5, Language language, ModeGame modeGame) {
		super(allowMembers, language, modeGame);
		this.js5 = js5;
	}

	@ObfuscatedName("alf.v(ILao;I)Lay;")
	public ConfigType create(int id, ConfigTypeList configTypeList) {
		return new LocType(id, this, configTypeList);
	}

	@ObfuscatedName("alf.o(B)Ljava/lang/Class;")
	public Class type() {
		return LocType.class;
	}

	@ObfuscatedName("alf.w(II)[B")
	public byte[] method9530(int arg0) {
		Js5 var2 = this.js5;
		synchronized (this.js5) {
			return this.js5.getfile(arg0, 0);
		}
	}

	@ObfuscatedName("alf.l(IS)Z")
	public boolean method9525(int arg0) {
		Js5 var2 = this.js5;
		synchronized (this.js5) {
			return this.js5.requestdownload(arg0, 0);
		}
	}
}
