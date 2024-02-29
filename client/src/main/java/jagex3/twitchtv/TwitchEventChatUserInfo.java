package jagex3.twitchtv;

import jagex3.Class591;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!com/jagex/twitchtv/TwitchEventChatUserInfo")
public final class TwitchEventChatUserInfo extends TwitchEvent {

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "userState", descriptor = "I")
	public int anInt3598;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "displayName", descriptor = "Ljava/lang/String;")
	public String aString151;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "nameColourARGB", descriptor = "I")
	public int anInt3599;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "ignore", descriptor = "Z")
	public boolean aBoolean642;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "modes", descriptor = "I")
	public int anInt3600;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "subscriptions", descriptor = "I")
	public int anInt3601;

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "<init>", descriptor = "(IILjava/lang/String;IZII)V")
	public TwitchEventChatUserInfo(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0);
		this.anInt3598 = arg1;
		this.aString151 = arg2;
		this.anInt3599 = arg3;
		this.aBoolean642 = arg4;
		this.anInt3600 = arg5;
		this.anInt3601 = arg6;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "n", descriptor = "()Lclient!ud;")
	@Override
	public Class591 method25474() {
		return null;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "e", descriptor = "([I[J[Ljava/lang/Object;)V")
	@Override
	public void method25473(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "m", descriptor = "()Lclient!ud;")
	@Override
	public Class591 method25475() {
		return null;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "k", descriptor = "()Lclient!ud;")
	@Override
	public Class591 method25476() {
		return null;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "f", descriptor = "()Lclient!ud;")
	@Override
	public Class591 method25477() {
		return null;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "w", descriptor = "()Lclient!ud;")
	@Override
	public Class591 method25478() {
		return null;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "l", descriptor = "()Lclient!ud;")
	@Override
	public Class591 method25479() {
		return null;
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "u", descriptor = "([I[J[Ljava/lang/Object;)V")
	@Override
	public void method25480(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "z", descriptor = "([I[J[Ljava/lang/Object;)V")
	@Override
	public void method25481(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "p", descriptor = "([I[J[Ljava/lang/Object;)V")
	@Override
	public void method25482(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
	}

	@OriginalMember(owner = "client!com/jagex/twitchtv/TwitchEventChatUserInfo", name = "d", descriptor = "([I[J[Ljava/lang/Object;)V")
	@Override
	public void method25483(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) Object[] arg2) {
	}
}
