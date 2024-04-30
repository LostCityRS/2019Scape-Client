package rs2.client.clientscript.emoji;

import deob.ObfuscatedName;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("io")
public class EmojiList {

	@ObfuscatedName("io.n")
	public boolean autochat = false;

	@ObfuscatedName("io.m")
	public LinkedList emojis = new LinkedList();

	@ObfuscatedName("io.k")
	public String field2602;

	@ObfuscatedName("io.e(I)Z")
	public boolean isAutochat() {
		return this.autochat;
	}

	@ObfuscatedName("io.n(ZS)V")
	public void setAutochat(boolean autochat) {
		this.autochat = autochat;
	}

	@ObfuscatedName("io.m(I)I")
	public int getSize() {
		return this.emojis.size();
	}

	@ObfuscatedName("alv.k(CB)Z")
	public static final boolean isValidChar(char arg0) {
		return arg0 >= '!' && arg0 < '0' || arg0 >= ':' && arg0 <= '@' && arg0 != '<' || arg0 >= '[' && arg0 <= '_' || arg0 >= '{';
	}

	@ObfuscatedName("io.f(Ljava/lang/String;III)Z")
	public final boolean add(String arg0, int arg1, int arg2) {
		if (arg0.isEmpty() || arg0.length() > 10 || !isValidChar(arg0.charAt(0))) {
			return false;
		}
		Emoji var4 = this.method4361(arg0);
		if (var4 != null) {
			this.emojis.remove(var4);
		}
		this.emojis.add(new Emoji(arg0, arg1, arg2));
		this.method4346();
		return true;
	}

	@ObfuscatedName("io.w(Ljava/lang/String;I)Liq;")
	public final Emoji method4361(String arg0) {
		Iterator var2 = this.emojis.iterator();
		Emoji var3;
		do {
			if (!var2.hasNext()) {
				return null;
			}
			var3 = (Emoji) var2.next();
		} while (!var3.name.equals(arg0));
		return var3;
	}

	@ObfuscatedName("io.l(Ljava/lang/String;I)V")
	public final void remove(String arg0) {
		Iterator var2 = this.emojis.iterator();
		while (var2.hasNext()) {
			Emoji var3 = (Emoji) var2.next();
			if (var3.name.equals(arg0)) {
				var2.remove();
				break;
			}
		}
	}

	@ObfuscatedName("io.u(I)V")
	public final void removeAll() {
		this.emojis.clear();
		this.field2602 = "";
	}

	@ObfuscatedName("io.z(Ljava/lang/String;I)Ljava/lang/String;")
	public final String substitute(String arg0) {
		if (this.emojis.isEmpty()) {
			return arg0;
		}
		StringBuilder var2 = new StringBuilder(arg0.length());
		int var3 = arg0.length();
		boolean var4 = false;
		for (int var5 = 0; var5 < var3; var5++) {
			boolean var6 = false;
			char var7 = arg0.charAt(var5);
			if (var4) {
				if (var7 == '>') {
					var4 = false;
				}
			} else if (var7 == '<') {
				var4 = true;
			} else if (this.field2602.indexOf(var7) != -1) {
				for (int var8 = 0; var8 < this.emojis.size(); var8++) {
					Emoji var9 = (Emoji) this.emojis.get(var8);
					int var10 = var9.name.length();
					if (var5 <= var3 - var10 && arg0.substring(var5, var5 + var10).equals(var9.name)) {
						String var11;
						if (var9.spriteFile > 0) {
							var11 = String.format("<sprite=%d,%d>", var9.spriteGroup, var9.spriteFile);
						} else {
							var11 = String.format("<sprite=%d>", var9.spriteGroup);
						}
						var2.append(var11);
						var6 = true;
						var5 += var10 - 1;
						break;
					}
				}
			}
			if (!var6) {
				var2.append(var7);
			}
		}
		return var2.toString();
	}

	@ObfuscatedName("io.p(I)V")
	public final void method4346() {
		this.field2602 = "";
		for (int var1 = 0; var1 < this.emojis.size(); var1++) {
			Emoji var2 = (Emoji) this.emojis.get(var1);
			char var3 = var2.name.charAt(0);
			if (this.field2602.indexOf(var3) < 0) {
				this.field2602 = this.field2602 + var3;
			}
		}
	}
}
