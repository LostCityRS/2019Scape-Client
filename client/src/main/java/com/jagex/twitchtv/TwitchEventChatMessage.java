package com.jagex.twitchtv;

import com.jagex.Class591;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!com/jagex/twitchtv/TwitchEventChatMessage")
public final class TwitchEventChatMessage extends TwitchEvent {

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "name", descriptor = "Ljava/lang/String;")
	public String aString149;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "message", descriptor = "Ljava/lang/String;")
	public String aString150;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "nameColourARGB", descriptor = "I")
	public int anInt3594;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "modes", descriptor = "I")
	public int anInt3595;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "subscriptions", descriptor = "I")
	public int anInt3596;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "isAction", descriptor = "Z")
	public boolean aBoolean641;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIIZ)V")
	public TwitchEventChatMessage(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0);
		this.aString149 = arg1;
		this.aString150 = arg2;
		this.anInt3594 = arg3;
		this.anInt3595 = arg4;
		this.anInt3596 = arg5;
		this.aBoolean641 = arg6;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "e", descriptor = "([I[J[Ljava/lang/Object;)V")
	@Override
	public void method25473(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
		arg2[0] = this.aString149;
		arg2[1] = this.aString150;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "n", descriptor = "()Lclient!ud;")
	@Override
	public Class591 method25474() {
		return Class591.aClass591_4;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "m", descriptor = "()Lclient!ud;")
	@Override
	public Class591 method25475() {
		return Class591.aClass591_4;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "k", descriptor = "()Lclient!ud;")
	@Override
	public Class591 method25476() {
		return Class591.aClass591_4;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "f", descriptor = "()Lclient!ud;")
	@Override
	public Class591 method25477() {
		return Class591.aClass591_4;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "w", descriptor = "()Lclient!ud;")
	@Override
	public Class591 method25478() {
		return Class591.aClass591_4;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "l", descriptor = "()Lclient!ud;")
	@Override
	public Class591 method25479() {
		return Class591.aClass591_4;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "u", descriptor = "([I[J[Ljava/lang/Object;)V")
	@Override
	public void method25480(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
		arg2[0] = this.aString149;
		arg2[1] = this.aString150;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "z", descriptor = "([I[J[Ljava/lang/Object;)V")
	@Override
	public void method25481(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
		arg2[0] = this.aString149;
		arg2[1] = this.aString150;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "p", descriptor = "([I[J[Ljava/lang/Object;)V")
	@Override
	public void method25482(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
		arg2[0] = this.aString149;
		arg2[1] = this.aString150;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "d", descriptor = "([I[J[Ljava/lang/Object;)V")
	@Override
	public void method25483(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
		arg2[0] = this.aString149;
		arg2[1] = this.aString150;
	}
}
