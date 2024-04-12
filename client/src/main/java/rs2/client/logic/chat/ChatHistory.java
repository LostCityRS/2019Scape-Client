package rs2.client.logic.chat;

import com.jagex.core.datastruct.SecondaryLinkedList;
import com.jagex.core.datastruct.HashTable;
import com.jagex.game.shared.framework.chat.ChatCrownType;
import deob.ObfuscatedName;
import rs2.client.Client;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("hz")
public class ChatHistory {

	@ObfuscatedName("hz.e")
	public static final Map field2594 = new HashMap();

	@ObfuscatedName("hz.n")
	public static final HashTable field2597 = new HashTable(1024);

	@ObfuscatedName("hz.m")
	public static final SecondaryLinkedList field2596 = new SecondaryLinkedList();

	@ObfuscatedName("hz.k")
	public static int field2595 = 0;

	public ChatHistory() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ty.e(B)I")
	public static int method8480() {
		return ++field2595 - 1;
	}

	@ObfuscatedName("amx.n(I)I")
	public static int lastUid() {
		return field2595 - 1;
	}

	@ObfuscatedName("js.m(Ljava/lang/String;B)V")
	public static void method4943(String arg0) {
		addMessage(0, 0, "", "", "", arg0, null);
	}

	@ObfuscatedName("af.k(ILjava/lang/String;I)V")
	public static void method1006(int arg0, String arg1) {
		addMessage(arg0, 0, "", "", "", arg1, null);
	}

	@ObfuscatedName("dj.f(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnn;I)V")
	public static void addMessage(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, ChatCrownType arg6) {
		method15054(arg0, arg1, arg2, arg3, arg4, arg5, null, -1, arg6);
	}

	@ObfuscatedName("acj.w(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILnn;I)V")
	public static void method15054(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, String arg6, int arg7, ChatCrownType arg8) {
		TypeChatLines var9 = (TypeChatLines) field2594.get(arg0);
		if (var9 == null) {
			var9 = new TypeChatLines();
			field2594.put(arg0, var9);
		}
		ChatLine var10 = var9.method4323(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		field2597.put(var10, (long) var10.uid);
		field2596.pushBack(var10);
		Client.lastOnChatTransmitRedrawCycle = Client.redrawCycle;
	}

	@ObfuscatedName("qo.l(III)Lasg;")
	public static ChatLine method7310(int arg0, int arg1) {
		TypeChatLines var2 = (TypeChatLines) field2594.get(arg0);
		return var2.method4322(arg1);
	}

	@ObfuscatedName("d.u(II)Lasg;")
	public static ChatLine method304(int arg0) {
		return (ChatLine) field2597.get((long) arg0);
	}

	@ObfuscatedName("pg.z(II)I")
	public static int length(int arg0) {
		TypeChatLines var1 = (TypeChatLines) field2594.get(arg0);
		return var1 == null ? 0 : var1.method4331();
	}

	@ObfuscatedName("v.p(I)V")
	public static void clear() {
		field2594.clear();
		field2597.removeAll();
		field2596.removeAll();
		field2595 = 0;
	}

	@ObfuscatedName("agj.d(II)I")
	public static int previousUid(int arg0) {
		ChatLine var1 = (ChatLine) field2597.get((long) arg0);
		if (var1 == null) {
			return -1;
		} else if (field2596.head == var1.secondaryNext) {
			return -1;
		} else {
			return ((ChatLine) var1.secondaryNext).uid;
		}
	}

	@ObfuscatedName("ko.c(II)I")
	public static int nextUid(int arg0) {
		ChatLine var1 = (ChatLine) field2597.get((long) arg0);
		if (var1 == null) {
			return -1;
		} else if (field2596.head == var1.secondaryPrev) {
			return -1;
		} else {
			return ((ChatLine) var1.secondaryPrev).uid;
		}
	}
}
