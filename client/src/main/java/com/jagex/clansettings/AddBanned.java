package com.jagex.clansettings;

import com.jagex.Packet;
import com.jagex.ClanSettings;
import com.jagex.class978;
import deob.ObfuscatedName;

@ObfuscatedName("are")
public class AddBanned extends class978 {

	// $FF: synthetic field
	public final ClanSettingsDelta this$0;

	@ObfuscatedName("are.k")
	public long field12216;

	@ObfuscatedName("are.f")
	public String field12217;

	public AddBanned(ClanSettingsDelta arg0) {
		this.this$0 = arg0;
		this.field12216 = -1L;
		this.field12217 = null;
	}

	@ObfuscatedName("are.e(Lalw;B)V")
	public void method17726(Packet arg0) {
		if (arg0.g1() != 255) {
			arg0.pos -= -1445626955;
			this.field12216 = arg0.g8();
		}
		this.field12217 = arg0.fastgstr();
	}

	@ObfuscatedName("are.n(Lkr;I)V")
	public void method17727(ClanSettings arg0) {
		arg0.method5308(this.field12216, this.field12217);
	}
}
