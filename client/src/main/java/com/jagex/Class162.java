package com.jagex;

import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xd")
public abstract class Class162 {

	@OriginalMember(owner = "client!xd", name = "hp", descriptor = "Lclient!aod;")
	public static Class32_Sub3 aClass32_Sub3_2;

	@OriginalMember(owner = "client!xd", name = "n", descriptor = "Lclient!eb;")
	final Class240 aClass240_37 = new Class240(2);

	@OriginalMember(owner = "client!xd", name = "e", descriptor = "Lclient!py;")
	Class497 aClass497_56;

	@OriginalMember(owner = "client!xd", name = "<init>", descriptor = "(Lclient!py;)V", line = 51)
	Class162(@OriginalArg(0) Class497 arg0) {
		this.aClass497_56 = arg0;
	}

	@OriginalMember(owner = "client!xd", name = "e", descriptor = "(I)V", line = 56)
	void method14775(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_37;
		synchronized (this.aClass240_37) {
			this.aClass240_37.method25847((byte) -127);
		}
	}

	@OriginalMember(owner = "client!xd", name = "k", descriptor = "()V", line = 56)
	void method14776() {
		@Pc(3) Class240 local3 = this.aClass240_37;
		synchronized (this.aClass240_37) {
			this.aClass240_37.method25847((byte) -117);
		}
	}

	@OriginalMember(owner = "client!xd", name = "w", descriptor = "()V", line = 56)
	void method14777() {
		@Pc(3) Class240 local3 = this.aClass240_37;
		synchronized (this.aClass240_37) {
			this.aClass240_37.method25847((byte) -53);
		}
	}

	@OriginalMember(owner = "client!xd", name = "f", descriptor = "()V", line = 56)
	void method14778() {
		@Pc(3) Class240 local3 = this.aClass240_37;
		synchronized (this.aClass240_37) {
			this.aClass240_37.method25847((byte) -35);
		}
	}

	@OriginalMember(owner = "client!xd", name = "u", descriptor = "(I)V", line = 62)
	void method14779(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_37;
		synchronized (this.aClass240_37) {
			this.aClass240_37.method25843(arg0, (byte) 21);
		}
	}

	@OriginalMember(owner = "client!xd", name = "n", descriptor = "(II)V", line = 62)
	void method14780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class240 local3 = this.aClass240_37;
		synchronized (this.aClass240_37) {
			this.aClass240_37.method25843(arg0, (byte) 59);
		}
	}

	@OriginalMember(owner = "client!xd", name = "l", descriptor = "(I)V", line = 62)
	void method14781(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_37;
		synchronized (this.aClass240_37) {
			this.aClass240_37.method25843(arg0, (byte) -79);
		}
	}

	@OriginalMember(owner = "client!xd", name = "m", descriptor = "(I)V", line = 68)
	void method14782(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_37;
		synchronized (this.aClass240_37) {
			this.aClass240_37.method25860(1161602830);
		}
	}

	@OriginalMember(owner = "client!xd", name = "z", descriptor = "()V", line = 68)
	void method14783() {
		@Pc(3) Class240 local3 = this.aClass240_37;
		synchronized (this.aClass240_37) {
			this.aClass240_37.method25860(1161602830);
		}
	}

	@OriginalMember(owner = "client!xd", name = "u", descriptor = "(B)V", line = 134)
	static void method14784(@OriginalArg(0) byte arg0) {
		if (Class168.anInt2448 * -649935255 < 102) {
			Class168.anInt2448 += 178977558;
		}
		@Pc(24) int local24;
		if (Class168.anInt2447 * -2005950823 != -1 && Class168.aLong111 * -473982398681043039L < Class305.method26797(420077591)) {
			for (local24 = Class168.anInt2447 * -2005950823; local24 < Class350.aStringArray28.length; local24++) {
				if (Class350.aStringArray28[local24].startsWith("pause")) {
					@Pc(36) int local36 = 5;
					try {
						local36 = Integer.parseInt(Class350.aStringArray28[local24].substring(6));
					} catch (@Pc(45) Exception local45) {
					}
					Class314.method26939("Pausing for " + local36 + " seconds...", -2092914501);
					Class168.anInt2447 = (local24 + 1) * -636234327;
					Class168.aLong111 = (Class305.method26797(404393062) + (long) (local36 * 1000)) * 9101462360260179041L;
					return;
				}
				Class168.aString61 = Class350.aStringArray28[local24];
				Class30.method626(false, -8416589);
			}
			Class168.anInt2447 = 636234327;
		}
		if (client.anInt3446 * 1897469075 != 0) {
			Class168.anInt2446 -= client.anInt3446 * -1672376405;
			if (Class168.anInt2446 * 1637474717 >= Class168.anInt2442 * -227471249) {
				Class168.anInt2446 = Class168.anInt2442 * -2031799685 - 2042014901;
			}
			if (Class168.anInt2446 * 1637474717 < 0) {
				Class168.anInt2446 = 0;
			}
			client.anInt3446 = 0;
		}
		for (local24 = 0; local24 < client.anInt3448 * -1523148821; local24++) {
			@Pc(127) Interface66 local127 = client.anInterface66Array2[local24];
			@Pc(131) int local131 = local127.method13696((byte) 0);
			@Pc(135) char local135 = local127.method13686((byte) -30);
			@Pc(139) int local139 = local127.method13689(1610964233);
			if (local131 == 84) {
				Class30.method626(false, 1613353086);
			}
			if (local131 == 80) {
				Class30.method626(true, 403548352);
			} else if (local131 == 66 && (local139 & 0x4) != 0) {
				if (Class413.aClipboard1 != null) {
					@Pc(165) String local165 = "";
					for (@Pc(170) int local170 = Class518.aStringArray31.length - 1; local170 >= 0; local170--) {
						if (Class518.aStringArray31[local170] != null && Class518.aStringArray31[local170].length() > 0) {
							local165 = local165 + Class518.aStringArray31[local170] + '\n';
						}
					}
					Class413.aClipboard1.setContents(new StringSelection(local165), null);
				}
			} else if (local131 == 67 && (local139 & 0x4) != 0) {
				if (Class413.aClipboard1 != null) {
					try {
						@Pc(220) Transferable local220 = Class413.aClipboard1.getContents(null);
						if (local220 != null) {
							@Pc(227) String local227 = (String) local220.getTransferData(DataFlavor.stringFlavor);
							if (local227 != null) {
								@Pc(234) String[] local234 = client.method24953(local227, '\n', 1506101334);
								Class96_Sub3.method2329(local234, -1711802336);
							}
						}
					} catch (@Pc(239) Exception local239) {
					}
				}
			} else if (local131 == 85 && Class168.anInt2445 * 66864267 > 0) {
				Class168.aString61 = Class168.aString61.substring(0, Class168.anInt2445 * 66864267 - 1) + Class168.aString61.substring(Class168.anInt2445 * 66864267);
				Class168.anInt2445 -= -1799421149;
			} else if (local131 == 101 && Class168.anInt2445 * 66864267 < Class168.aString61.length()) {
				Class168.aString61 = Class168.aString61.substring(0, Class168.anInt2445 * 66864267) + Class168.aString61.substring(Class168.anInt2445 * 66864267 + 1);
			} else if (local131 == 96 && Class168.anInt2445 * 66864267 > 0) {
				Class168.anInt2445 -= -1799421149;
			} else if (local131 == 97 && Class168.anInt2445 * 66864267 < Class168.aString61.length()) {
				Class168.anInt2445 += -1799421149;
			} else if (local131 == 102) {
				Class168.anInt2445 = 0;
			} else if (local131 == 103) {
				Class168.anInt2445 = Class168.aString61.length() * -1799421149;
			} else if (local131 == 104 && Class168.anInt2443 * 469822389 < Class518.aStringArray31.length) {
				Class168.anInt2443 += -510858595;
				Class276.method26347(1459780548);
				Class168.anInt2445 = Class168.aString61.length() * -1799421149;
			} else if (local131 == 105 && Class168.anInt2443 * 469822389 > 0) {
				Class168.anInt2443 -= -510858595;
				Class276.method26347(1209323896);
				Class168.anInt2445 = Class168.aString61.length() * -1799421149;
			} else if (Class239.method25819(local135, -948774027) || "\\/.:, _-+[]~@".indexOf(local135) != -1) {
				Class168.aString61 = Class168.aString61.substring(0, Class168.anInt2445 * 66864267) + client.anInterface66Array2[local24].method13686((byte) -124) + Class168.aString61.substring(Class168.anInt2445 * 66864267);
				Class168.anInt2445 += -1799421149;
			}
		}
		client.anInt3448 = 0;
		client.anInt3450 = 0;
		Class635.method32440((short) 255);
	}

	@OriginalMember(owner = "client!xd", name = "ak", descriptor = "(Lclient!yf;B)V", line = 5072)
	static final void method14785(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.aLongArray26[arg0.anIntArray520[arg0.anInt5889 * -709694321]] = arg0.aLongArray27[(arg0.anInt5894 -= -1364417339) * -2000995827];
	}

	@OriginalMember(owner = "client!xd", name = "xb", descriptor = "(Lclient!yf;B)V", line = 9196)
	static final void method14786(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 100;
	}

	@OriginalMember(owner = "client!xd", name = "abk", descriptor = "(Lclient!yf;I)V", line = 9927)
	static final void method14787(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class557.aClass297_1.method26616((byte) -18).size();
	}

	@OriginalMember(owner = "client!xd", name = "ahj", descriptor = "(Lclient!yf;I)V", line = 10805)
	static final void method14788(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(18) Class47 local18 = (Class47) Class277.aClass32_Sub12_1.method18261(local12, 411748954);
		@Pc(26) int local26;
		if (local18.aBoolean20) {
			local26 = local18.anInt187 * 454881133;
		} else if (local18.aBoolean21) {
			local26 = Class288.aClass636_1.anInt5729 * -605634533;
		} else {
			local26 = Class288.aClass636_1.anInt5728 * -180353715;
		}
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local26;
	}
}
