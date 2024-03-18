package rs2.client.logic.chat;

import com.jagex.core.datastruct.SecondaryNode;
import com.jagex.core.utils.MonotonicTime;
import com.jagex.game.shared.framework.chat.ChatCrownType;
import deob.ObfuscatedName;

@ObfuscatedName("asg")
public class ChatLine extends SecondaryNode {

	@ObfuscatedName("asg.l")
	public int uid = ChatHistory.method8480();

	@ObfuscatedName("asg.u")
	public long time = MonotonicTime.get();

	@ObfuscatedName("asg.z")
	public int type;

	@ObfuscatedName("asg.p")
	public int flags;

	@ObfuscatedName("asg.d")
	public String name;

	@ObfuscatedName("asg.c")
	public String nameUnfiltered;

	@ObfuscatedName("asg.r")
	public String nameSimple;

	@ObfuscatedName("asg.v")
	public String clan;

	@ObfuscatedName("asg.o")
	public int phrase;

	@ObfuscatedName("asg.s")
	public String message;

	@ObfuscatedName("asg.y")
	public ChatCrownType crown;

	public ChatLine(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7, ChatCrownType arg8) {
		this.type = arg0;
		this.flags = arg1;
		this.name = arg2;
		this.nameUnfiltered = arg3;
		this.nameSimple = arg4;
		this.clan = arg5;
		this.phrase = arg6;
		this.message = arg7;
		this.crown = arg8;
	}

	@ObfuscatedName("asg.e(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lnn;I)V")
	public void method19429(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7, ChatCrownType arg8) {
		this.uid = ChatHistory.method8480();
		this.time = MonotonicTime.get();
		this.type = arg0;
		this.flags = arg1;
		this.name = arg2;
		this.nameUnfiltered = arg3;
		this.nameSimple = arg4;
		this.clan = arg5;
		this.phrase = arg6;
		this.message = arg7;
		this.crown = arg8;
	}
}
