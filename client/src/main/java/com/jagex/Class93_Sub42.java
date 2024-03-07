package com.jagex;

import jaclib.hardware_info.HardwareInfo;
import java.util.HashMap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aly")
public class Class93_Sub42 extends Class93 {

	@OriginalMember(owner = "client!aly", name = "ah", descriptor = "I")
	static final int anInt2018 = 27;

	@OriginalMember(owner = "client!aly", name = "f", descriptor = "I")
	static final int anInt2019 = 1;

	@OriginalMember(owner = "client!aly", name = "w", descriptor = "I")
	static final int anInt2020 = 2;

	@OriginalMember(owner = "client!aly", name = "ag", descriptor = "I")
	static final int anInt2021 = 26;

	@OriginalMember(owner = "client!aly", name = "u", descriptor = "I")
	static final int anInt2022 = 4;

	@OriginalMember(owner = "client!aly", name = "d", descriptor = "I")
	static final int anInt2024 = 1;

	@OriginalMember(owner = "client!aly", name = "c", descriptor = "I")
	static final int anInt2025 = 2;

	@OriginalMember(owner = "client!aly", name = "as", descriptor = "I")
	static final int anInt2026 = 4;

	@OriginalMember(owner = "client!aly", name = "v", descriptor = "I")
	static final int anInt2027 = 4;

	@OriginalMember(owner = "client!aly", name = "o", descriptor = "I")
	static final int anInt2028 = 5;

	@OriginalMember(owner = "client!aly", name = "s", descriptor = "I")
	static final int anInt2029 = 6;

	@OriginalMember(owner = "client!aly", name = "q", descriptor = "I")
	static final int anInt2030 = 8;

	@OriginalMember(owner = "client!aly", name = "i", descriptor = "I")
	static final int anInt2031 = 22;

	@OriginalMember(owner = "client!aly", name = "r", descriptor = "I")
	static final int anInt2032 = 3;

	@OriginalMember(owner = "client!aly", name = "a", descriptor = "I")
	static final int anInt2034 = 20;

	@OriginalMember(owner = "client!aly", name = "g", descriptor = "I")
	static final int anInt2035 = 21;

	@OriginalMember(owner = "client!aly", name = "j", descriptor = "I")
	static final int anInt2037 = 23;

	@OriginalMember(owner = "client!aly", name = "t", descriptor = "I")
	static final int anInt2038 = 24;

	@OriginalMember(owner = "client!aly", name = "ae", descriptor = "I")
	static final int anInt2039 = 25;

	@OriginalMember(owner = "client!aly", name = "at", descriptor = "I")
	static final int anInt2040 = 5;

	@OriginalMember(owner = "client!aly", name = "ac", descriptor = "I")
	static final int anInt2042 = 1;

	@OriginalMember(owner = "client!aly", name = "ai", descriptor = "I")
	static final int anInt2043 = 2;

	@OriginalMember(owner = "client!aly", name = "aw", descriptor = "I")
	static final int anInt2044 = 3;

	@OriginalMember(owner = "client!aly", name = "ao", descriptor = "I")
	public static final int anInt2046 = 0;

	@OriginalMember(owner = "client!aly", name = "ax", descriptor = "I")
	static final int anInt2048 = 0;

	@OriginalMember(owner = "client!aly", name = "k", descriptor = "I")
	static final int anInt2050 = 8;

	@OriginalMember(owner = "client!aly", name = "y", descriptor = "I")
	static final int anInt2051 = 7;

	@OriginalMember(owner = "client!aly", name = "l", descriptor = "I")
	static final int anInt2052 = 3;

	@OriginalMember(owner = "client!aly", name = "h", descriptor = "I")
	static final int anInt2054 = 11;

	@OriginalMember(owner = "client!aly", name = "x", descriptor = "I")
	static final int anInt2057 = 9;

	@OriginalMember(owner = "client!aly", name = "b", descriptor = "I")
	static final int anInt2061 = 10;

	@OriginalMember(owner = "client!aly", name = "bx", descriptor = "[I")
	int[] anIntArray199 = new int[3];

	@OriginalMember(owner = "client!aly", name = "z", descriptor = "I")
	int anInt2058;

	@OriginalMember(owner = "client!aly", name = "p", descriptor = "Z")
	boolean aBoolean362;

	@OriginalMember(owner = "client!aly", name = "al", descriptor = "I")
	int anInt2041;

	@OriginalMember(owner = "client!aly", name = "ad", descriptor = "I")
	int anInt2047;

	@OriginalMember(owner = "client!aly", name = "am", descriptor = "I")
	int anInt2045;

	@OriginalMember(owner = "client!aly", name = "au", descriptor = "I")
	int anInt2049;

	@OriginalMember(owner = "client!aly", name = "ar", descriptor = "I")
	int anInt2036;

	@OriginalMember(owner = "client!aly", name = "ap", descriptor = "Z")
	boolean aBoolean363;

	@OriginalMember(owner = "client!aly", name = "aq", descriptor = "I")
	int anInt2023;

	@OriginalMember(owner = "client!aly", name = "av", descriptor = "I")
	int anInt2053;

	@OriginalMember(owner = "client!aly", name = "bf", descriptor = "I")
	int anInt2033;

	@OriginalMember(owner = "client!aly", name = "ay", descriptor = "I")
	int anInt2056;

	@OriginalMember(owner = "client!aly", name = "aj", descriptor = "I")
	public int anInt2055;

	@OriginalMember(owner = "client!aly", name = "bk", descriptor = "Ljava/lang/String;")
	String aString55;

	@OriginalMember(owner = "client!aly", name = "bd", descriptor = "I")
	int anInt2063;

	@OriginalMember(owner = "client!aly", name = "bl", descriptor = "I")
	int anInt2062;

	@OriginalMember(owner = "client!aly", name = "bh", descriptor = "Ljava/lang/String;")
	String aString56;

	@OriginalMember(owner = "client!aly", name = "ab", descriptor = "Ljava/lang/String;")
	String aString52;

	@OriginalMember(owner = "client!aly", name = "an", descriptor = "I")
	int anInt2060;

	@OriginalMember(owner = "client!aly", name = "ak", descriptor = "I")
	int anInt2059;

	@OriginalMember(owner = "client!aly", name = "aa", descriptor = "Ljava/lang/String;")
	String aString53;

	@OriginalMember(owner = "client!aly", name = "az", descriptor = "Ljava/lang/String;")
	String aString57;

	@OriginalMember(owner = "client!aly", name = "af", descriptor = "Ljava/lang/String;")
	String aString54;

	@OriginalMember(owner = "client!aly", name = "bc", descriptor = "Ljava/lang/String;")
	String aString51;

	@OriginalMember(owner = "client!aly", name = "<init>", descriptor = "(Z)V", line = 67)
	public Class93_Sub42(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Class339.aString179.startsWith("win")) {
				this.anInt2058 = 1520491363;
			} else if (Class339.aString179.startsWith("mac")) {
				this.anInt2058 = -1253984570;
			} else if (Class339.aString179.startsWith("linux")) {
				this.anInt2058 = 266506793;
			} else {
				this.anInt2058 = 1786998156;
			}
			if (Class320.aString173.startsWith("amd64") || Class320.aString173.startsWith("x86_64")) {
				this.aBoolean362 = true;
			} else {
				this.aBoolean362 = false;
			}
			if (this.anInt2058 * 2065137227 == 1) {
				if (Class672.aString238.indexOf("4.0") != -1) {
					this.anInt2041 = -604099985;
				} else if (Class672.aString238.indexOf("4.1") != -1) {
					this.anInt2041 = -1208199970;
				} else if (Class672.aString238.indexOf("4.9") != -1) {
					this.anInt2041 = -1812299955;
				} else if (Class672.aString238.indexOf("5.0") != -1) {
					this.anInt2041 = 1878567356;
				} else if (Class672.aString238.indexOf("5.1") != -1) {
					this.anInt2041 = 1274467371;
				} else if (Class672.aString238.indexOf("5.2") != -1) {
					this.anInt2041 = -537832584;
				} else if (Class672.aString238.indexOf("6.0") != -1) {
					this.anInt2041 = 670367386;
				} else if (Class672.aString238.indexOf("6.1") != -1) {
					this.anInt2041 = 66267401;
				} else if (Class672.aString238.indexOf("6.2") != -1) {
					this.anInt2041 = -1141932569;
				} else if (Class672.aString238.indexOf("6.3") != -1) {
					this.anInt2041 = -1746032554;
				} else if (Class672.aString238.indexOf("10.0") != -1) {
					this.anInt2041 = 1944834757;
				}
			} else if (this.anInt2058 * 2065137227 == 2) {
				if (Class672.aString238.indexOf("10.4") != -1) {
					this.anInt2041 = 802902188;
				} else if (Class672.aString238.indexOf("10.5") != -1) {
					this.anInt2041 = 198802203;
				} else if (Class672.aString238.indexOf("10.6") != -1) {
					this.anInt2041 = -405297782;
				} else if (Class672.aString238.indexOf("10.7") != -1) {
					this.anInt2041 = -1009397767;
				} else if (Class672.aString238.indexOf("10.8") != -1) {
					this.anInt2041 = -1613497752;
				} else if (Class672.aString238.indexOf("10.9") != -1) {
					this.anInt2041 = 2077369559;
				} else if (Class672.aString238.indexOf("10.10") != -1) {
					this.anInt2041 = 1473269574;
				} else if (Class672.aString238.indexOf("10.11") != -1) {
					this.anInt2041 = 869169589;
				}
			}
			if (Class392.aString197.toLowerCase().indexOf("sun") != -1) {
				this.anInt2047 = 1324620785;
			} else if (Class392.aString197.toLowerCase().indexOf("microsoft") != -1) {
				this.anInt2047 = -1645725726;
			} else if (Class392.aString197.toLowerCase().indexOf("apple") != -1) {
				this.anInt2047 = -321104941;
			} else if (Class392.aString197.toLowerCase().indexOf("oracle") == -1) {
				this.anInt2047 = 1003515844;
			} else {
				this.anInt2047 = -1966830667;
			}
			@Pc(276) int local276 = 2;
			@Pc(278) int local278 = 0;
			@Pc(286) char local286;
			try {
				while (local276 < Class95.aString12.length()) {
					local286 = Class95.aString12.charAt(local276);
					if (local286 < '0' || local286 > '9') {
						break;
					}
					local278 = local286 - '0' + local278 * 10;
					local276++;
				}
			} catch (@Pc(304) Exception local304) {
			}
			this.anInt2045 = local278 * -1966580153;
			local276 = Class95.aString12.indexOf(46, 2) + 1;
			local278 = 0;
			try {
				while (local276 < Class95.aString12.length()) {
					local286 = Class95.aString12.charAt(local276);
					if (local286 < '0' || local286 > '9') {
						break;
					}
					local278 = local278 * 10 + (local286 - '0');
					local276++;
				}
			} catch (@Pc(344) Exception local344) {
			}
			this.anInt2049 = local278 * -236404581;
			local276 = Class95.aString12.indexOf(95, 4) + 1;
			local278 = 0;
			try {
				while (local276 < Class95.aString12.length()) {
					local286 = Class95.aString12.charAt(local276);
					if (local286 < '0' || local286 > '9') {
						break;
					}
					local278 = local278 * 10 + (local286 - '0');
					local276++;
				}
			} catch (@Pc(384) Exception local384) {
			}
			this.anInt2036 = local278 * 542122091;
			this.aBoolean363 = false;
			this.anInt2023 = Class553.anInt3419 * 675424613;
			if (this.anInt2045 * -2102924425 > 3) {
				this.anInt2053 = Class553.anInt3422 * 1820660237;
			} else {
				this.anInt2053 = 0;
			}
			try {
				@Pc(414) int[] local414 = HardwareInfo.getCPUInfo();
				if (local414 != null && local414.length == 3) {
					this.anInt2033 = local414[0] * 882533243;
					this.anInt2056 = local414[1] * -10038079;
					this.anInt2055 = local414[2] * -464716607;
				}
				@Pc(443) int[] local443 = HardwareInfo.getRawCPUInfo();
				@Pc(457) int local457;
				@Pc(477) int local477;
				@Pc(485) int local485;
				@Pc(493) int local493;
				if (local443 != null && local443.length % 5 == 0) {
					@Pc(455) HashMap local455 = new HashMap();
					for (local457 = 0; local457 < local443.length / 5; local457++) {
						@Pc(469) int local469 = local443[local457 * 5];
						local477 = local443[local457 * 5 + 1];
						local485 = local443[local457 * 5 + 2];
						local493 = local443[local457 * 5 + 3];
						@Pc(501) int local501 = local443[local457 * 5 + 4];
						@Pc(510) Class37 local510 = new Class37(local469, local477, local485, local493, local501);
						local455.put(local469, local510);
					}
					@Pc(524) Class37 local524 = (Class37) local455.get(0);
					if (local524 != null) {
						@Pc(531) Packet local531 = new Packet(13);
						local531.ip4(local524.anInt119 * 1396359751, 1986541412);
						local531.ip4(local524.anInt122 * -762512765, 1023601104);
						local531.ip4(local524.anInt121 * -407508469, 1150404530);
						local531.pos = 0;
						this.aString55 = local531.gjstr(1090969084);
					}
					@Pc(566) Class37 local566 = (Class37) local455.get(1);
					if (local566 != null) {
						this.anInt2063 = local566.anInt118 * 1286149943;
						local477 = local566.anInt119 * 1396359751;
						this.anInt2062 = (local477 >> 16 & 0xFF) * 1134934083;
						this.anIntArray199[0] = local566.anInt121 * -407508469;
						this.anIntArray199[1] = local566.anInt122 * -762512765;
					}
					@Pc(610) Class37 local610 = (Class37) local455.get(-2147483647);
					if (local610 != null) {
						this.anIntArray199[2] = local610.anInt122 * -762512765;
					}
					@Pc(625) Packet local625 = new Packet(49);
					for (local493 = -2147483646; local493 <= -2147483644; local493++) {
						@Pc(636) Class37 local636 = (Class37) local455.get(local493);
						if (local636 != null) {
							local625.ip4(local636.anInt118 * 233985593, 847203018);
							local625.ip4(local636.anInt119 * 1396359751, 1391402069);
							local625.ip4(local636.anInt121 * -407508469, 1219806041);
							local625.ip4(local636.anInt122 * -762512765, 1535188596);
						}
					}
					local625.pos = 0;
					this.aString56 = local625.gjstr(1400341971);
				}
				@Pc(679) String[][] local679 = HardwareInfo.getDXDiagDisplayDevicesProps();
				@Pc(731) String local731;
				if (local679 != null && local679.length > 0 && local679[0] != null) {
					for (local457 = 0; local457 < local679[0].length; local457 += 2) {
						if (local679[0][local457].equalsIgnoreCase("szDescription")) {
							this.aString52 = local679[0][local457 + 1];
						} else if (local679[0][local457].equalsIgnoreCase("szDriverDateEnglish")) {
							local731 = local679[0][local457 + 1];
							try {
								local477 = local731.indexOf("/");
								local485 = local731.indexOf("/", local477 + 1);
								this.anInt2060 = Integer.parseInt(local731.substring(0, local477)) * 1401372253;
								this.anInt2059 = Integer.parseInt(local731.substring(local485 + 1, local731.indexOf(" ", local485))) * -1348589587;
							} catch (@Pc(767) Exception local767) {
							}
						}
					}
				}
				@Pc(771) String[] local771 = HardwareInfo.getDXDiagSystemProps();
				if (local771 != null) {
					local731 = "";
					@Pc(777) String local777 = "";
					@Pc(779) String local779 = "";
					for (local493 = 0; local493 < local771.length; local493 += 2) {
						if (local771[local493].equalsIgnoreCase("dwDirectXVersionMajor")) {
							local731 = local771[local493 + 1];
						} else if (local771[local493].equalsIgnoreCase("dwDirectXVersionMinor")) {
							local777 = local771[local493 + 1];
						} else if (local771[local493].equalsIgnoreCase("dwDirectXVersionLetter")) {
							local779 = local771[local493 + 1];
						}
					}
					this.aString53 = local731 + "." + local777 + local779;
				}
			} catch (@Pc(841) Throwable local841) {
				this.anInt2055 = 0;
			}
		}
		if (this.aString52 == null) {
			this.aString52 = "";
		}
		if (this.aString57 == null) {
			this.aString57 = "";
		}
		if (this.aString53 == null) {
			this.aString53 = "";
		}
		if (this.aString54 == null) {
			this.aString54 = "";
		}
		if (this.aString55 == null) {
			this.aString55 = "";
		}
		if (this.aString56 == null) {
			this.aString56 = "";
		}
		if (this.aString51 == null) {
			this.aString51 = "";
		}
		this.method15296((short) 4473);
	}

	@OriginalMember(owner = "client!aly", name = "e", descriptor = "(S)V", line = 254)
	void method15296(@OriginalArg(0) short arg0) {
		if (this.aString52.length() > 40) {
			this.aString52 = this.aString52.substring(0, 40);
		}
		if (this.aString57.length() > 40) {
			this.aString57 = this.aString57.substring(0, 40);
		}
		if (this.aString53.length() > 10) {
			this.aString53 = this.aString53.substring(0, 10);
		}
		if (this.aString54.length() > 10) {
			this.aString54 = this.aString54.substring(0, 10);
		}
		if (this.aString51.length() > 120) {
			this.aString51 = this.aString51.substring(0, 120);
		}
	}

	@OriginalMember(owner = "client!aly", name = "f", descriptor = "()V", line = 254)
	void method15297() {
		if (this.aString52.length() > 40) {
			this.aString52 = this.aString52.substring(0, 40);
		}
		if (this.aString57.length() > 40) {
			this.aString57 = this.aString57.substring(0, 40);
		}
		if (this.aString53.length() > 10) {
			this.aString53 = this.aString53.substring(0, 10);
		}
		if (this.aString54.length() > 10) {
			this.aString54 = this.aString54.substring(0, 10);
		}
		if (this.aString51.length() > 120) {
			this.aString51 = this.aString51.substring(0, 120);
		}
	}

	@OriginalMember(owner = "client!aly", name = "k", descriptor = "()V", line = 254)
	void method15298() {
		if (this.aString52.length() > 40) {
			this.aString52 = this.aString52.substring(0, 40);
		}
		if (this.aString57.length() > 40) {
			this.aString57 = this.aString57.substring(0, 40);
		}
		if (this.aString53.length() > 10) {
			this.aString53 = this.aString53.substring(0, 10);
		}
		if (this.aString54.length() > 10) {
			this.aString54 = this.aString54.substring(0, 10);
		}
		if (this.aString51.length() > 120) {
			this.aString51 = this.aString51.substring(0, 120);
		}
	}

	@OriginalMember(owner = "client!aly", name = "l", descriptor = "(Lclient!alw;)V", line = 262)
	public void method15299(@OriginalArg(0) Packet arg0) {
		arg0.p1(8, (byte) -128);
		arg0.p1(this.anInt2058 * 2065137227, (byte) -74);
		arg0.p1(this.aBoolean362 ? 1 : 0, (byte) -39);
		arg0.p2(this.anInt2041 * -2131463025, 2127102055);
		arg0.p1(this.anInt2047 * -1974110959, (byte) -65);
		arg0.p1(this.anInt2045 * -2102924425, (byte) -29);
		arg0.p1(this.anInt2049 * 1127818643, (byte) -12);
		arg0.p1(this.anInt2036 * -1691907005, (byte) -124);
		arg0.p1(this.aBoolean363 ? 1 : 0, (byte) -54);
		arg0.p2(this.anInt2023 * -1954378101, 2137743820);
		arg0.p1(this.anInt2053 * -1871990631, (byte) 1);
		arg0.p3(this.anInt2055 * 714183489, (byte) 109);
		arg0.p2(this.anInt2056 * 1094433601, 2126980591);
		arg0.pjstr2(this.aString52, 1516871641);
		arg0.pjstr2(this.aString57, 1516871641);
		arg0.pjstr2(this.aString53, 1516871641);
		arg0.pjstr2(this.aString54, 1516871641);
		arg0.p1(this.anInt2060 * -1138260491, (byte) -74);
		arg0.p2(this.anInt2059 * 856968677, 2142051520);
		arg0.pjstr2(this.aString55, 1516871641);
		arg0.pjstr2(this.aString56, 1516871641);
		arg0.p1(this.anInt2033 * -66714701, (byte) -115);
		arg0.p1(this.anInt2062 * 1212306539, (byte) -80);
		for (@Pc(151) int local151 = 0; local151 < this.anIntArray199.length; local151++) {
			arg0.p4(this.anIntArray199[local151], (byte) 34);
		}
		arg0.p4(this.anInt2063 * 728684047, (byte) -8);
		arg0.pjstr2(this.aString51, 1516871641);
	}

	@OriginalMember(owner = "client!aly", name = "n", descriptor = "(Lclient!alw;I)V", line = 262)
	public void encode(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		arg0.p1(8, (byte) -37);
		arg0.p1(this.anInt2058 * 2065137227, (byte) -123);
		arg0.p1(this.aBoolean362 ? 1 : 0, (byte) -78);
		arg0.p2(this.anInt2041 * -2131463025, 2129353747);
		arg0.p1(this.anInt2047 * -1974110959, (byte) -67);
		arg0.p1(this.anInt2045 * -2102924425, (byte) -126);
		arg0.p1(this.anInt2049 * 1127818643, (byte) -123);
		arg0.p1(this.anInt2036 * -1691907005, (byte) -58);
		arg0.p1(this.aBoolean363 ? 1 : 0, (byte) -113);
		arg0.p2(this.anInt2023 * -1954378101, 2140591903);
		arg0.p1(this.anInt2053 * -1871990631, (byte) -65);
		arg0.p3(this.anInt2055 * 714183489, (byte) 89);
		arg0.p2(this.anInt2056 * 1094433601, 2130906676);
		arg0.pjstr2(this.aString52, 1516871641);
		arg0.pjstr2(this.aString57, 1516871641);
		arg0.pjstr2(this.aString53, 1516871641);
		arg0.pjstr2(this.aString54, 1516871641);
		arg0.p1(this.anInt2060 * -1138260491, (byte) -87);
		arg0.p2(this.anInt2059 * 856968677, 2143582345);
		arg0.pjstr2(this.aString55, 1516871641);
		arg0.pjstr2(this.aString56, 1516871641);
		arg0.p1(this.anInt2033 * -66714701, (byte) -41);
		arg0.p1(this.anInt2062 * 1212306539, (byte) -53);
		for (@Pc(151) int local151 = 0; local151 < this.anIntArray199.length; local151++) {
			arg0.p4(this.anIntArray199[local151], (byte) -28);
		}
		arg0.p4(this.anInt2063 * 728684047, (byte) -109);
		arg0.pjstr2(this.aString51, 1516871641);
	}

	@OriginalMember(owner = "client!aly", name = "w", descriptor = "(Lclient!alw;)V", line = 262)
	public void method15301(@OriginalArg(0) Packet arg0) {
		arg0.p1(8, (byte) -51);
		arg0.p1(this.anInt2058 * 2065137227, (byte) -11);
		arg0.p1(this.aBoolean362 ? 1 : 0, (byte) -127);
		arg0.p2(this.anInt2041 * -2131463025, 2130321133);
		arg0.p1(this.anInt2047 * -1974110959, (byte) -24);
		arg0.p1(this.anInt2045 * -2102924425, (byte) -61);
		arg0.p1(this.anInt2049 * 1127818643, (byte) -46);
		arg0.p1(this.anInt2036 * -1691907005, (byte) -73);
		arg0.p1(this.aBoolean363 ? 1 : 0, (byte) 2);
		arg0.p2(this.anInt2023 * -1954378101, 2136415413);
		arg0.p1(this.anInt2053 * -1871990631, (byte) -60);
		arg0.p3(this.anInt2055 * 714183489, (byte) 94);
		arg0.p2(this.anInt2056 * 1094433601, 2125577705);
		arg0.pjstr2(this.aString52, 1516871641);
		arg0.pjstr2(this.aString57, 1516871641);
		arg0.pjstr2(this.aString53, 1516871641);
		arg0.pjstr2(this.aString54, 1516871641);
		arg0.p1(this.anInt2060 * -1138260491, (byte) -89);
		arg0.p2(this.anInt2059 * 856968677, 2128055715);
		arg0.pjstr2(this.aString55, 1516871641);
		arg0.pjstr2(this.aString56, 1516871641);
		arg0.p1(this.anInt2033 * -66714701, (byte) -110);
		arg0.p1(this.anInt2062 * 1212306539, (byte) -36);
		for (@Pc(151) int local151 = 0; local151 < this.anIntArray199.length; local151++) {
			arg0.p4(this.anIntArray199[local151], (byte) 47);
		}
		arg0.p4(this.anInt2063 * 728684047, (byte) 57);
		arg0.pjstr2(this.aString51, 1516871641);
	}

	@OriginalMember(owner = "client!aly", name = "m", descriptor = "(I)I", line = 291)
	public int computeSize(@OriginalArg(0) int arg0) {
		@Pc(1) byte local1 = 39;
		@Pc(8) int local8 = local1 + Packet.pjstr2len(this.aString52, 1642462336);
		@Pc(15) int local15 = local8 + Packet.pjstr2len(this.aString57, 1178809023);
		@Pc(22) int local22 = local15 + Packet.pjstr2len(this.aString53, 1471923545);
		@Pc(29) int local29 = local22 + Packet.pjstr2len(this.aString54, -1809860357);
		@Pc(36) int local36 = local29 + Packet.pjstr2len(this.aString55, 1291092271);
		@Pc(43) int local43 = local36 + Packet.pjstr2len(this.aString56, -924011362);
		return local43 + Packet.pjstr2len(this.aString51, 1270568662);
	}
}
