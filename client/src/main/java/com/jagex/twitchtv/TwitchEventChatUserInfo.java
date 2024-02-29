package com.jagex.twitchtv;

import com.jagex.Class591;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!com/jagex/twitchtv/TwitchEventChatUserInfo")
public class TwitchEventChatUserInfo extends TwitchEvent {

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "userState", descriptor = "I")
	public int userState;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "displayName", descriptor = "Ljava/lang/String;")
	public String displayName;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "nameColourARGB", descriptor = "I")
	public int nameColourARGB;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "ignore", descriptor = "Z")
	public boolean ignore;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "modes", descriptor = "I")
	public int modes;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "subscriptions", descriptor = "I")
	public int subscriptions;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "<init>", descriptor = "(IILjava/lang/String;IZII)V", line = 30)
	public TwitchEventChatUserInfo(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0);
		this.userState = arg1;
		this.displayName = arg2;
		this.nameColourARGB = arg3;
		this.ignore = arg4;
		this.modes = arg5;
		this.subscriptions = arg6;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "n", descriptor = "()Lclient!ud;", line = 40)
	@Override
	public Class591 n() {
		return null;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "m", descriptor = "()Lclient!ud;", line = 40)
	@Override
	public Class591 m() {
		return null;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "k", descriptor = "()Lclient!ud;", line = 40)
	@Override
	public Class591 k() {
		return null;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "f", descriptor = "()Lclient!ud;", line = 40)
	@Override
	public Class591 f() {
		return null;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "w", descriptor = "()Lclient!ud;", line = 40)
	@Override
	public Class591 w() {
		return null;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "l", descriptor = "()Lclient!ud;", line = 40)
	@Override
	public Class591 l() {
		return null;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "e", descriptor = "([I[J[Ljava/lang/Object;)V", line = 43)
	@Override
	public void e(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "u", descriptor = "([I[J[Ljava/lang/Object;)V", line = 43)
	@Override
	public void u(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "z", descriptor = "([I[J[Ljava/lang/Object;)V", line = 43)
	@Override
	public void z(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "p", descriptor = "([I[J[Ljava/lang/Object;)V", line = 43)
	@Override
	public void p(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "d", descriptor = "([I[J[Ljava/lang/Object;)V", line = 43)
	@Override
	public void d(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
	}
}
