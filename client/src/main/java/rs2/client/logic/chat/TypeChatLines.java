package rs2.client.logic.chat;

import com.jagex.game.shared.framework.chat.ChatCrownType;
import deob.ObfuscatedName;

@ObfuscatedName("ij")
public class TypeChatLines {

	@ObfuscatedName("ij.n")
	public ChatLine[] field2598 = new ChatLine[100];

	@ObfuscatedName("ij.m")
	public int field2600;

	@ObfuscatedName("ij.e(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILnn;I)Lasg;")
	public ChatLine method4323(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, String arg6, int arg7, ChatCrownType arg8) {
		ChatLine var10 = this.field2598[99];
		for (int var11 = this.field2600; var11 > 0; var11--) {
			if (var11 != 100) {
				this.field2598[var11] = this.field2598[var11 - 1];
			}
		}
		if (var10 == null) {
			var10 = new ChatLine(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg5, arg8);
		} else {
			var10.unlink();
			var10.secondaryRemove();
			var10.method19429(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg5, arg8);
		}
		this.field2598[0] = var10;
		if (this.field2600 < 100) {
			this.field2600++;
		}
		return var10;
	}

	@ObfuscatedName("ij.n(II)Lasg;")
	public ChatLine method4322(int arg0) {
		return arg0 >= 0 && arg0 < this.field2600 ? this.field2598[arg0] : null;
	}

	@ObfuscatedName("ij.m(B)I")
	public int method4331() {
		return this.field2600;
	}
}
