package com.jagex.twitchtv;

import com.jagex.Class591;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!com/jagex/twitchtv/TwitchEventChatMessage")
public class TwitchEventChatMessage extends TwitchEvent {

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "name", descriptor = "Ljava/lang/String;")
	public String name;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "message", descriptor = "Ljava/lang/String;")
	public String message;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "nameColourARGB", descriptor = "I")
	public int nameColourARGB;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "modes", descriptor = "I")
	public int modes;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "subscriptions", descriptor = "I")
	public int subscriptions;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "isAction", descriptor = "Z")
	public boolean isAction;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIIZ)V", line = 30)
	public TwitchEventChatMessage(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0);
		this.name = arg1;
		this.message = arg2;
		this.nameColourARGB = arg3;
		this.modes = arg4;
		this.subscriptions = arg5;
		this.isAction = arg6;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "e", descriptor = "([I[J[Ljava/lang/Object;)V", line = 40)
	@Override
	public void e(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
		arg2[0] = this.name;
		arg2[1] = this.message;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "u", descriptor = "([I[J[Ljava/lang/Object;)V", line = 40)
	@Override
	public void u(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
		arg2[0] = this.name;
		arg2[1] = this.message;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "z", descriptor = "([I[J[Ljava/lang/Object;)V", line = 40)
	@Override
	public void z(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
		arg2[0] = this.name;
		arg2[1] = this.message;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "p", descriptor = "([I[J[Ljava/lang/Object;)V", line = 40)
	@Override
	public void p(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
		arg2[0] = this.name;
		arg2[1] = this.message;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "d", descriptor = "([I[J[Ljava/lang/Object;)V", line = 40)
	@Override
	public void d(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
		arg2[0] = this.name;
		arg2[1] = this.message;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "n", descriptor = "()Lclient!ud;", line = 45)
	@Override
	public Class591 n() {
		return Class591.aClass591_4;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "m", descriptor = "()Lclient!ud;", line = 45)
	@Override
	public Class591 m() {
		return Class591.aClass591_4;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "k", descriptor = "()Lclient!ud;", line = 45)
	@Override
	public Class591 k() {
		return Class591.aClass591_4;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "f", descriptor = "()Lclient!ud;", line = 45)
	@Override
	public Class591 f() {
		return Class591.aClass591_4;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "w", descriptor = "()Lclient!ud;", line = 45)
	@Override
	public Class591 w() {
		return Class591.aClass591_4;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatMessage", name = "l", descriptor = "()Lclient!ud;", line = 45)
	@Override
	public Class591 l() {
		return Class591.aClass591_4;
	}
}
