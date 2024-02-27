package com.jagex;

import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.HashMap;

@OriginalClass("client!ali")
public final class Class80_Sub39 extends Class80 {

	@OriginalMember(owner = "client!ali", name = "ax", descriptor = "I")
	static final int anInt1683 = 25;

	@OriginalMember(owner = "client!ali", name = "g", descriptor = "I")
	static final int anInt1684 = 2;

	@OriginalMember(owner = "client!ali", name = "i", descriptor = "I")
	static final int anInt1685 = 3;

	@OriginalMember(owner = "client!ali", name = "m", descriptor = "I")
	static final int anInt1686 = 4;

	@OriginalMember(owner = "client!ali", name = "s", descriptor = "I")
	static final int anInt1688 = 2;

	@OriginalMember(owner = "client!ali", name = "a", descriptor = "I")
	static final int anInt1689 = 1;

	@OriginalMember(owner = "client!ali", name = "k", descriptor = "I")
	static final int anInt1690 = 3;

	@OriginalMember(owner = "client!ali", name = "x", descriptor = "I")
	static final int anInt1691 = 4;

	@OriginalMember(owner = "client!ali", name = "r", descriptor = "I")
	static final int anInt1693 = 6;

	@OriginalMember(owner = "client!ali", name = "ad", descriptor = "I")
	static final int anInt1694 = 0;

	@OriginalMember(owner = "client!ali", name = "h", descriptor = "I")
	static final int anInt1695 = 8;

	@OriginalMember(owner = "client!ali", name = "d", descriptor = "I")
	static final int anInt1696 = 9;

	@OriginalMember(owner = "client!ali", name = "ab", descriptor = "I")
	static final int anInt1697 = 5;

	@OriginalMember(owner = "client!ali", name = "p", descriptor = "I")
	static final int anInt1698 = 11;

	@OriginalMember(owner = "client!ali", name = "y", descriptor = "I")
	static final int anInt1700 = 21;

	@OriginalMember(owner = "client!ali", name = "n", descriptor = "I")
	static final int anInt1701 = 22;

	@OriginalMember(owner = "client!ali", name = "c", descriptor = "I")
	static final int anInt1702 = 23;

	@OriginalMember(owner = "client!ali", name = "b", descriptor = "I")
	static final int anInt1703 = 24;

	@OriginalMember(owner = "client!ali", name = "ay", descriptor = "I")
	static final int anInt1704 = 26;

	@OriginalMember(owner = "client!ali", name = "ao", descriptor = "I")
	static final int anInt1707 = 1;

	@OriginalMember(owner = "client!ali", name = "aj", descriptor = "I")
	static final int anInt1708 = 2;

	@OriginalMember(owner = "client!ali", name = "ac", descriptor = "I")
	static final int anInt1709 = 3;

	@OriginalMember(owner = "client!ali", name = "ag", descriptor = "I")
	static final int anInt1710 = 4;

	@OriginalMember(owner = "client!ali", name = "v", descriptor = "I")
	static final int anInt1711 = 20;

	@OriginalMember(owner = "client!ali", name = "u", descriptor = "I")
	static final int anInt1713 = 8;

	@OriginalMember(owner = "client!ali", name = "ai", descriptor = "I")
	static final int anInt1715 = 27;

	@OriginalMember(owner = "client!ali", name = "z", descriptor = "I")
	static final int anInt1716 = 10;

	@OriginalMember(owner = "client!ali", name = "an", descriptor = "I")
	public static final int anInt1718 = 0;

	@OriginalMember(owner = "client!ali", name = "q", descriptor = "I")
	static final int anInt1721 = 7;

	@OriginalMember(owner = "client!ali", name = "w", descriptor = "I")
	static final int anInt1724 = 5;

	@OriginalMember(owner = "client!ali", name = "l", descriptor = "I")
	static final int anInt1726 = 1;

	@OriginalMember(owner = "client!ali", name = "ba", descriptor = "[I")
	int[] anIntArray195 = new int[3];

	@OriginalMember(owner = "client!ali", name = "o", descriptor = "I")
	int anInt1687;

	@OriginalMember(owner = "client!ali", name = "j", descriptor = "Z")
	boolean aBoolean392;

	@OriginalMember(owner = "client!ali", name = "aq", descriptor = "I")
	int anInt1706;

	@OriginalMember(owner = "client!ali", name = "al", descriptor = "I")
	int anInt1712;

	@OriginalMember(owner = "client!ali", name = "ah", descriptor = "I")
	int anInt1723;

	@OriginalMember(owner = "client!ali", name = "af", descriptor = "I")
	int anInt1714;

	@OriginalMember(owner = "client!ali", name = "am", descriptor = "I")
	int anInt1682;

	@OriginalMember(owner = "client!ali", name = "ak", descriptor = "Z")
	boolean aBoolean393;

	@OriginalMember(owner = "client!ali", name = "at", descriptor = "I")
	int anInt1705;

	@OriginalMember(owner = "client!ali", name = "av", descriptor = "I")
	int anInt1717;

	@OriginalMember(owner = "client!ali", name = "bg", descriptor = "I")
	int anInt1692;

	@OriginalMember(owner = "client!ali", name = "ae", descriptor = "I")
	int anInt1699;

	@OriginalMember(owner = "client!ali", name = "aa", descriptor = "I")
	public int anInt1719;

	@OriginalMember(owner = "client!ali", name = "br", descriptor = "Ljava/lang/String;")
	String aString57;

	@OriginalMember(owner = "client!ali", name = "bt", descriptor = "I")
	int anInt1727;

	@OriginalMember(owner = "client!ali", name = "bl", descriptor = "I")
	int anInt1725;

	@OriginalMember(owner = "client!ali", name = "bn", descriptor = "Ljava/lang/String;")
	String aString58;

	@OriginalMember(owner = "client!ali", name = "ap", descriptor = "Ljava/lang/String;")
	String aString54;

	@OriginalMember(owner = "client!ali", name = "aw", descriptor = "I")
	int anInt1720;

	@OriginalMember(owner = "client!ali", name = "as", descriptor = "I")
	int anInt1722;

	@OriginalMember(owner = "client!ali", name = "au", descriptor = "Ljava/lang/String;")
	String aString56;

	@OriginalMember(owner = "client!ali", name = "ar", descriptor = "Ljava/lang/String;")
	String aString55;

	@OriginalMember(owner = "client!ali", name = "az", descriptor = "Ljava/lang/String;")
	String aString53;

	@OriginalMember(owner = "client!ali", name = "bs", descriptor = "Ljava/lang/String;")
	String aString59;

	@OriginalMember(owner = "client!ali", name = "f", descriptor = "([Lclient!zg;II)Lclient!zg;")
	public static Interface75 method15030(@OriginalArg(0) Interface75[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(1) Interface75[] local1 = arg0;
		for (@Pc(3) int local3 = 0; local3 < local1.length; local3++) {
			@Pc(11) Interface75 local11 = local1[local3];
			if (arg1 == local11.getId()) {
				return local11;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ali", name = "<init>", descriptor = "(Z)V")
	public Class80_Sub39(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Class450.aString209.startsWith("win")) {
				this.anInt1687 = 1134187165;
			} else if (Class450.aString209.startsWith("mac")) {
				this.anInt1687 = -2026592966;
			} else if (Class450.aString209.startsWith("linux")) {
				this.anInt1687 = -892405801;
			} else {
				this.anInt1687 = 241781364;
			}
			if (Class103_Sub22.aString44.startsWith("amd64") || Class103_Sub22.aString44.startsWith("x86_64")) {
				this.aBoolean392 = true;
			} else {
				this.aBoolean392 = false;
			}
			if (this.anInt1687 * 1844364213 == 1) {
				if (Class505.aString216.indexOf("4.0") != -1) {
					this.anInt1706 = -1847931441;
				} else if (Class505.aString216.indexOf("4.1") != -1) {
					this.anInt1706 = 599104414;
				} else if (Class505.aString216.indexOf("4.9") != -1) {
					this.anInt1706 = -1248827027;
				} else if (Class505.aString216.indexOf("5.0") != -1) {
					this.anInt1706 = 1198208828;
				} else if (Class505.aString216.indexOf("5.1") != -1) {
					this.anInt1706 = -649722613;
				} else if (Class505.aString216.indexOf("5.2") != -1) {
					this.anInt1706 = -1898549640;
				} else if (Class505.aString216.indexOf("6.0") != -1) {
					this.anInt1706 = 1797313242;
				} else if (Class505.aString216.indexOf("6.1") != -1) {
					this.anInt1706 = -50618199;
				} else if (Class505.aString216.indexOf("6.2") != -1) {
					this.anInt1706 = 548486215;
				} else if (Class505.aString216.indexOf("6.3") != -1) {
					this.anInt1706 = -1299445226;
				} else if (Class505.aString216.indexOf("10.0") != -1) {
					this.anInt1706 = 1147590629;
				}
			} else if (this.anInt1687 * 1844364213 == 2) {
				if (Class505.aString216.indexOf("10.4") != -1) {
					this.anInt1706 = 1696076844;
				} else if (Class505.aString216.indexOf("10.5") != -1) {
					this.anInt1706 = -151854597;
				} else if (Class505.aString216.indexOf("10.6") != -1) {
					this.anInt1706 = -1999786038;
				} else if (Class505.aString216.indexOf("10.7") != -1) {
					this.anInt1706 = 447249817;
				} else if (Class505.aString216.indexOf("10.8") != -1) {
					this.anInt1706 = -1400681624;
				} else if (Class505.aString216.indexOf("10.9") != -1) {
					this.anInt1706 = 1046354231;
				} else if (Class505.aString216.indexOf("10.10") != -1) {
					this.anInt1706 = -801577210;
				} else if (Class505.aString216.indexOf("10.11") != -1) {
					this.anInt1706 = 1645458645;
				}
			}
			if (Class342.javaVendor.toLowerCase().indexOf("sun") != -1) {
				this.anInt1712 = 970518717;
			} else if (Class342.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
				this.anInt1712 = 1941037434;
			} else if (Class342.javaVendor.toLowerCase().indexOf("apple") != -1) {
				this.anInt1712 = -1383411145;
			} else if (Class342.javaVendor.toLowerCase().indexOf("oracle") == -1) {
				this.anInt1712 = -412892428;
			} else {
				this.anInt1712 = 557626289;
			}
			@Pc(276) int local276 = 2;
			@Pc(278) int local278 = 0;
			@Pc(286) char local286;
			try {
				while (local276 < Class601.javaVersion.length()) {
					local286 = Class601.javaVersion.charAt(local276);
					if (local286 < '0' || local286 > '9') {
						break;
					}
					local278 = local286 - '0' + local278 * 10;
					local276++;
				}
			} catch (@Pc(304) Exception local304) {
			}
			this.anInt1723 = local278 * -764779723;
			local276 = Class601.javaVersion.indexOf(46, 2) + 1;
			local278 = 0;
			try {
				while (local276 < Class601.javaVersion.length()) {
					local286 = Class601.javaVersion.charAt(local276);
					if (local286 < '0' || local286 > '9') {
						break;
					}
					local278 = local286 - '0' + local278 * 10;
					local276++;
				}
			} catch (@Pc(344) Exception local344) {
			}
			this.anInt1714 = local278 * 1800875411;
			local276 = Class601.javaVersion.indexOf(95, 4) + 1;
			local278 = 0;
			try {
				while (local276 < Class601.javaVersion.length()) {
					local286 = Class601.javaVersion.charAt(local276);
					if (local286 < '0' || local286 > '9') {
						break;
					}
					local278 = local286 - '0' + local278 * 10;
					local276++;
				}
			} catch (@Pc(384) Exception local384) {
			}
			this.anInt1682 = local278 * 2135554905;
			this.aBoolean393 = false;
			this.anInt1705 = Class554.anInt3423 * 901073457;
			if (this.anInt1723 * 1594169117 > 3) {
				this.anInt1717 = Class554.anInt3412 * -2146820313;
			} else {
				this.anInt1717 = 0;
			}
			try {
				@Pc(414) int[] local414 = HardwareInfo.getCPUInfo();
				if (local414 != null && local414.length == 3) {
					this.anInt1692 = local414[0] * 544332717;
					this.anInt1699 = local414[1] * 2024204083;
					this.anInt1719 = local414[2] * 2100868685;
				}
				@Pc(444) int[] local444 = HardwareInfo.getRawCPUInfo();
				@Pc(458) int local458;
				@Pc(478) int local478;
				@Pc(486) int local486;
				@Pc(494) int local494;
				if (local444 != null && local444.length % 5 == 0) {
					@Pc(456) HashMap local456 = new HashMap();
					for (local458 = 0; local458 < local444.length / 5; local458++) {
						@Pc(470) int local470 = local444[local458 * 5];
						local478 = local444[local458 * 5 + 1];
						local486 = local444[local458 * 5 + 2];
						local494 = local444[local458 * 5 + 3];
						@Pc(502) int local502 = local444[local458 * 5 + 4];
						@Pc(511) Class46 local511 = new Class46(local470, local478, local486, local494, local502);
						local456.put(local470, local511);
					}
					@Pc(525) Class46 local525 = (Class46) local456.get(0);
					if (local525 != null) {
						@Pc(533) Packet local533 = new Packet(13);
						local533.ip4(local525.anInt177 * 462963017);
						local533.ip4(local525.anInt175 * -1954493571);
						local533.ip4(local525.anInt178 * 1742578199);
						local533.pos = 0;
						this.aString57 = local533.gjstr();
					}
					@Pc(568) Class46 local568 = (Class46) local456.get(1);
					if (local568 != null) {
						this.anInt1727 = local568.anInt176 * -806299529;
						local478 = local568.anInt177 * 462963017;
						this.anInt1725 = (local478 >> 16 & 0xFF) * 1701215071;
						this.anIntArray195[0] = local568.anInt178 * 1742578199;
						this.anIntArray195[1] = local568.anInt175 * -1954493571;
					}
					@Pc(612) Class46 local612 = (Class46) local456.get(-2147483647);
					if (local612 != null) {
						this.anIntArray195[2] = local612.anInt175 * -1954493571;
					}
					@Pc(627) Packet local627 = new Packet(49);
					for (local494 = -2147483646; local494 <= -2147483644; local494++) {
						@Pc(638) Class46 local638 = (Class46) local456.get(local494);
						if (local638 != null) {
							local627.ip4(local638.anInt176 * 1555724869);
							local627.ip4(local638.anInt177 * 462963017);
							local627.ip4(local638.anInt178 * 1742578199);
							local627.ip4(local638.anInt175 * -1954493571);
						}
					}
					local627.pos = 0;
					this.aString58 = local627.gjstr();
				}
				@Pc(680) String[][] local680 = HardwareInfo.getDXDiagDisplayDevicesProps();
				@Pc(733) String local733;
				if (local680 != null && local680.length > 0 && local680[0] != null) {
					for (local458 = 0; local458 < local680[0].length; local458 += 2) {
						if (local680[0][local458].equalsIgnoreCase("szDescription")) {
							this.aString54 = local680[0][local458 + 1];
						} else if (local680[0][local458].equalsIgnoreCase("szDriverDateEnglish")) {
							local733 = local680[0][local458 + 1];
							try {
								local478 = local733.indexOf("/");
								local486 = local733.indexOf("/", local478 + 1);
								this.anInt1720 = Integer.parseInt(local733.substring(0, local478)) * -679792017;
								this.anInt1722 = Integer.parseInt(local733.substring(local486 + 1, local733.indexOf(" ", local486))) * 382719485;
							} catch (@Pc(769) Exception local769) {
							}
						}
					}
				}
				@Pc(773) String[] local773 = HardwareInfo.getDXDiagSystemProps();
				if (local773 != null) {
					local733 = "";
					@Pc(780) String local780 = "";
					@Pc(782) String local782 = "";
					for (local494 = 0; local494 < local773.length; local494 += 2) {
						if (local773[local494].equalsIgnoreCase("dwDirectXVersionMajor")) {
							local733 = local773[local494 + 1];
						} else if (local773[local494].equalsIgnoreCase("dwDirectXVersionMinor")) {
							local780 = local773[local494 + 1];
						} else if (local773[local494].equalsIgnoreCase("dwDirectXVersionLetter")) {
							local782 = local773[local494 + 1];
						}
					}
					this.aString56 = local733 + "." + local780 + local782;
				}
			} catch (@Pc(844) Throwable local844) {
				this.anInt1719 = 0;
			}
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
		if (this.aString53 == null) {
			this.aString53 = "";
		}
		if (this.aString57 == null) {
			this.aString57 = "";
		}
		if (this.aString58 == null) {
			this.aString58 = "";
		}
		if (this.aString59 == null) {
			this.aString59 = "";
		}
		this.method15028(-1626119696);
	}

	@OriginalMember(owner = "client!ali", name = "u", descriptor = "()V")
	void method15023() {
		if (this.aString54.length() > 40) {
			this.aString54 = this.aString54.substring(0, 40);
		}
		if (this.aString55.length() > 40) {
			this.aString55 = this.aString55.substring(0, 40);
		}
		if (this.aString56.length() > 10) {
			this.aString56 = this.aString56.substring(0, 10);
		}
		if (this.aString53.length() > 10) {
			this.aString53 = this.aString53.substring(0, 10);
		}
		if (this.aString59.length() > 120) {
			this.aString59 = this.aString59.substring(0, 120);
		}
	}

	@OriginalMember(owner = "client!ali", name = "g", descriptor = "(Lclient!ald;)V")
	public void method15024(@OriginalArg(0) Packet arg0) {
		arg0.p1(8);
		arg0.p1(this.anInt1687 * 1844364213);
		arg0.p1(this.aBoolean392 ? 1 : 0);
		arg0.p2(this.anInt1706 * 1800739119);
		arg0.p1(this.anInt1712 * 892242581);
		arg0.p1(this.anInt1723 * 1594169117);
		arg0.p1(this.anInt1714 * 2085353627);
		arg0.p1(this.anInt1682 * 75537641);
		arg0.p1(this.aBoolean393 ? 1 : 0);
		arg0.p2(this.anInt1705 * -1141561323);
		arg0.p1(this.anInt1717 * 453647239);
		arg0.p3(this.anInt1719 * 625439365);
		arg0.p2(this.anInt1699 * 1399024635);
		arg0.pjstr2(this.aString54);
		arg0.pjstr2(this.aString55);
		arg0.pjstr2(this.aString56);
		arg0.pjstr2(this.aString53);
		arg0.p1(this.anInt1720 * 966290575);
		arg0.p2(this.anInt1722 * 862891861);
		arg0.pjstr2(this.aString57);
		arg0.pjstr2(this.aString58);
		arg0.p1(this.anInt1692 * 1327513637);
		arg0.p1(this.anInt1725 * -293429089);
		for (@Pc(151) int local151 = 0; local151 < this.anIntArray195.length; local151++) {
			arg0.p4(this.anIntArray195[local151]);
		}
		arg0.p4(this.anInt1727 * 951365155);
		arg0.pjstr2(this.aString59);
	}

	@OriginalMember(owner = "client!ali", name = "f", descriptor = "(Lclient!ald;B)V")
	public void method15025(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		arg0.p1(8);
		arg0.p1(this.anInt1687 * 1844364213);
		arg0.p1(this.aBoolean392 ? 1 : 0);
		arg0.p2(this.anInt1706 * 1800739119);
		arg0.p1(this.anInt1712 * 892242581);
		arg0.p1(this.anInt1723 * 1594169117);
		arg0.p1(this.anInt1714 * 2085353627);
		arg0.p1(this.anInt1682 * 75537641);
		arg0.p1(this.aBoolean393 ? 1 : 0);
		arg0.p2(this.anInt1705 * -1141561323);
		arg0.p1(this.anInt1717 * 453647239);
		arg0.p3(this.anInt1719 * 625439365);
		arg0.p2(this.anInt1699 * 1399024635);
		arg0.pjstr2(this.aString54);
		arg0.pjstr2(this.aString55);
		arg0.pjstr2(this.aString56);
		arg0.pjstr2(this.aString53);
		arg0.p1(this.anInt1720 * 966290575);
		arg0.p2(this.anInt1722 * 862891861);
		arg0.pjstr2(this.aString57);
		arg0.pjstr2(this.aString58);
		arg0.p1(this.anInt1692 * 1327513637);
		arg0.p1(this.anInt1725 * -293429089);
		for (@Pc(151) int local151 = 0; local151 < this.anIntArray195.length; local151++) {
			arg0.p4(this.anIntArray195[local151]);
		}
		arg0.p4(this.anInt1727 * 951365155);
		arg0.pjstr2(this.aString59);
	}

	@OriginalMember(owner = "client!ali", name = "e", descriptor = "(B)I")
	public int method15026(@OriginalArg(0) byte arg0) {
		@Pc(1) byte local1 = 39;
		@Pc(8) int local8 = local1 + Packet.calculatePjstr2(this.aString54);
		@Pc(15) int local15 = local8 + Packet.calculatePjstr2(this.aString55);
		@Pc(22) int local22 = local15 + Packet.calculatePjstr2(this.aString56);
		@Pc(29) int local29 = local22 + Packet.calculatePjstr2(this.aString53);
		@Pc(36) int local36 = local29 + Packet.calculatePjstr2(this.aString57);
		@Pc(43) int local43 = local36 + Packet.calculatePjstr2(this.aString58);
		return local43 + Packet.calculatePjstr2(this.aString59);
	}

	@OriginalMember(owner = "client!ali", name = "l", descriptor = "(Lclient!ald;)V")
	public void method15027(@OriginalArg(0) Packet arg0) {
		arg0.p1(8);
		arg0.p1(this.anInt1687 * 1844364213);
		arg0.p1(this.aBoolean392 ? 1 : 0);
		arg0.p2(this.anInt1706 * 1800739119);
		arg0.p1(this.anInt1712 * 892242581);
		arg0.p1(this.anInt1723 * 1594169117);
		arg0.p1(this.anInt1714 * 2085353627);
		arg0.p1(this.anInt1682 * 75537641);
		arg0.p1(this.aBoolean393 ? 1 : 0);
		arg0.p2(this.anInt1705 * -1141561323);
		arg0.p1(this.anInt1717 * 453647239);
		arg0.p3(this.anInt1719 * 625439365);
		arg0.p2(this.anInt1699 * 1399024635);
		arg0.pjstr2(this.aString54);
		arg0.pjstr2(this.aString55);
		arg0.pjstr2(this.aString56);
		arg0.pjstr2(this.aString53);
		arg0.p1(this.anInt1720 * 966290575);
		arg0.p2(this.anInt1722 * 862891861);
		arg0.pjstr2(this.aString57);
		arg0.pjstr2(this.aString58);
		arg0.p1(this.anInt1692 * 1327513637);
		arg0.p1(this.anInt1725 * -293429089);
		for (@Pc(151) int local151 = 0; local151 < this.anIntArray195.length; local151++) {
			arg0.p4(this.anIntArray195[local151]);
		}
		arg0.p4(this.anInt1727 * 951365155);
		arg0.pjstr2(this.aString59);
	}

	@OriginalMember(owner = "client!ali", name = "t", descriptor = "(I)V")
	void method15028(@OriginalArg(0) int arg0) {
		if (this.aString54.length() > 40) {
			this.aString54 = this.aString54.substring(0, 40);
		}
		if (this.aString55.length() > 40) {
			this.aString55 = this.aString55.substring(0, 40);
		}
		if (this.aString56.length() > 10) {
			this.aString56 = this.aString56.substring(0, 10);
		}
		if (this.aString53.length() > 10) {
			this.aString53 = this.aString53.substring(0, 10);
		}
		if (this.aString59.length() > 120) {
			this.aString59 = this.aString59.substring(0, 120);
		}
	}

	@OriginalMember(owner = "client!ali", name = "i", descriptor = "()I")
	public int method15029() {
		@Pc(1) byte local1 = 39;
		@Pc(8) int local8 = local1 + Packet.calculatePjstr2(this.aString54);
		@Pc(15) int local15 = local8 + Packet.calculatePjstr2(this.aString55);
		@Pc(22) int local22 = local15 + Packet.calculatePjstr2(this.aString56);
		@Pc(29) int local29 = local22 + Packet.calculatePjstr2(this.aString53);
		@Pc(36) int local36 = local29 + Packet.calculatePjstr2(this.aString57);
		@Pc(43) int local43 = local36 + Packet.calculatePjstr2(this.aString58);
		return local43 + Packet.calculatePjstr2(this.aString59);
	}
}
