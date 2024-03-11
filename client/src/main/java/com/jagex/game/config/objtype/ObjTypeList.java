package com.jagex.game.config.objtype;

import com.jagex.*;
import com.jagex.game.config.ConfigTypeList;
import com.jagex.game.config.Js5ConfigGroup;
import com.jagex.game.config.defaults.GraphicsDefaults;
import deob.ObfuscatedName;

@ObfuscatedName("aon")
public class ObjTypeList extends CachingConfigTypeList {

	public ObjTypeList(ModeGame arg0, Language arg1, boolean arg2, ConfigTypeList arg3, Js5 arg4, Js5 arg5) {
		super(arg0, arg1, arg4, Js5ConfigGroup.OBJTYPE, 64, new BasicObjTypeFactory(arg0, arg1, arg2, arg5, arg3));
	}

	@ObfuscatedName("aon.al(Ldh;IIIIILxg;I)Lcm;")
	public Sprite method18900(Renderer arg0, int arg1, int arg2, int arg3, int arg4, int arg5, PlayerModel arg6) {
		return ((ObjTypeFactory) this.field8796).method14616(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@ObfuscatedName("aon.ac(Ldh;Ldh;IIIIZZILeu;Lxg;Lws;S)Lcm;")
	public Sprite method18905(Renderer arg0, Renderer arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7, int arg8, Font arg9, PlayerModel arg10, GraphicsDefaults arg11) {
		return ((ObjTypeFactory) this.field8796).method14617(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, this);
	}

	@ObfuscatedName("aon.ai(ZI)V")
	public void setAllowMembers(boolean arg0) {
		((ObjTypeFactory) this.field8796).method14618(arg0);
		super.method14895();
	}

	@ObfuscatedName("aon.aw(II)V")
	public void method18902(int arg0) {
		((ObjTypeFactory) this.field8796).method14619(arg0);
	}

	@ObfuscatedName("aon.r(I)V")
	public void method14895() {
		super.method14895();
		((ObjTypeFactory) this.field8796).method14623();
	}

	@ObfuscatedName("aon.as(I)V")
	public void method18903() {
		((ObjTypeFactory) this.field8796).method14621();
	}

	@ObfuscatedName("aon.v(II)V")
	public void method14896(int arg0) {
		super.method14896(arg0);
		((ObjTypeFactory) this.field8796).method14624(arg0);
	}

	@ObfuscatedName("aon.o(I)V")
	public void method14899() {
		super.method14899();
		((ObjTypeFactory) this.field8796).method14622();
	}
}
