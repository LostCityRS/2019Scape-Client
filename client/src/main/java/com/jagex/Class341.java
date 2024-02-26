package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.Iterator;
import java.util.LinkedList;

@OriginalClass("client!il")
public final class Class341 {

	@OriginalMember(owner = "client!il", name = "t", descriptor = "I")
	static final int anInt4243 = 10;

	@OriginalMember(owner = "client!il", name = "u", descriptor = "Ljava/lang/String;")
	String aString189;

	@OriginalMember(owner = "client!il", name = "f", descriptor = "Z")
	boolean aBoolean832 = false;

	@OriginalMember(owner = "client!il", name = "e", descriptor = "Ljava/util/LinkedList;")
	LinkedList aLinkedList2 = new LinkedList();

	@OriginalMember(owner = "client!il", name = "r", descriptor = "(C)Z")
	public static boolean method27913(@OriginalArg(0) char arg0) {
		return arg0 >= '!' && arg0 < '0' || arg0 >= ':' && arg0 <= '@' && arg0 != '<' || arg0 >= '[' && arg0 <= '_' || arg0 >= '{';
	}

	@OriginalMember(owner = "client!il", name = "q", descriptor = "(C)Z")
	public static boolean method27924(@OriginalArg(0) char arg0) {
		return arg0 >= '!' && arg0 < '0' || arg0 >= ':' && arg0 <= '@' && arg0 != '<' || arg0 >= '[' && arg0 <= '_' || arg0 >= '{';
	}

	@OriginalMember(owner = "client!il", name = "uj", descriptor = "(Lclient!yp;I)V")
	static void method27938(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2085859554);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local16.anInt4114 * 671136973;
	}

	@OriginalMember(owner = "client!il", name = "bak", descriptor = "(Lclient!yp;I)V")
	static void method27939(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub35_1.method16950(local12, (byte) -28);
	}

	@OriginalMember(owner = "client!il", name = "iq", descriptor = "(I)V")
	static void method27940(@OriginalArg(0) int arg0) {
		client.aBoolean750 = false;
		if (Class507.anInt5045 * -1170417853 == 3) {
			return;
		}
		@Pc(11) Class463 local11 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method24552().aClass463_61;
		@Pc(15) Class502 local15 = client.aClass539_1.method30903(-463929735);
		@Pc(61) int local61;
		if (Class368.anInt4502 * -1583611537 != 2 && Class368.anInt4502 * -1583611537 != 3 && Class588.anInt5304 * -969208673 == -1) {
			local61 = Class439.method29150(Class89.anInt319 * 1749751025, Class102_Sub2.anInt653 * 1132703631, Class507.anInt5045 * -1170417853, 1037753497);
			if (local61 - Class283.anInt3937 * -1465520451 < 3200 && (local15.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853][Class89.anInt319 * 1749751025 >> 9][Class102_Sub2.anInt653 * 1132703631 >> 9] & 0x4) != 0) {
				client.aBoolean750 = true;
			}
			return;
		}
		@Pc(34) Class626 local34 = client.aClass539_1.method30893((byte) -29);
		@Pc(72) int local72;
		if (Class368.anInt4502 * -1583611537 == 3) {
			@Pc(45) Class463 local45 = Class160.aClass121_Sub1_2.method9693(1393209570).method23078(-2031543136);
			if (Float.isNaN(local45.aFloat297)) {
				return;
			}
			local61 = (int) local45.aFloat297 - (local34.anInt5540 * -390642507 << 9);
			local72 = (int) local45.aFloat296 - (local34.anInt5537 * -894305615 << 9);
			if (local61 < 0 || local72 < 0 || local61 >> 9 >= local15.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853].length || local72 >> 9 >= local15.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853][local61 >> 9].length) {
				return;
			}
		} else if (Class368.anInt4502 * -1583611537 == 2) {
			local61 = (int) local11.aFloat297;
			local72 = (int) local11.aFloat296;
		} else {
			local61 = Class588.anInt5304 * -969208673;
			local72 = Class130_Sub1.anInt1175 * -978744261;
		}
		if ((local15.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853][local61 >> 9][local72 >> 9] & 0x4) != 0) {
			client.aBoolean750 = true;
			return;
		}
		@Pc(179) int local179;
		@Pc(168) int local168;
		if (Class368.anInt4502 * -1583611537 == 3) {
			@Pc(157) Class463 local157 = Class160.aClass121_Sub1_2.method9603(-1530171948).method20516(1436604136);
			local168 = ((int) local157.aFloat297 >> 9) - local34.anInt5540 * -390642507;
			local179 = ((int) local157.aFloat296 >> 9) - local34.anInt5537 * -894305615;
			if (local168 < 0 || local179 < 0 || local168 >= local15.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853].length || local179 >= local15.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853][local168].length) {
				return;
			}
		} else {
			local168 = Class89.anInt319 * 1749751025 >> 9;
			local179 = Class102_Sub2.anInt653 * 1132703631 >> 9;
		}
		@Pc(221) int local221 = local61 >> 9;
		@Pc(225) int local225 = local72 >> 9;
		@Pc(241) int local241;
		if (local15.method30432(local168, local179, -1804834912)) {
			local241 = Class439.method29150(Class89.anInt319 * 1749751025, Class102_Sub2.anInt653 * 1132703631, 3, 1037753497);
			if (Class283.anInt3937 * -1465520451 >= local241) {
				client.aBoolean750 = true;
			}
			return;
		}
		if (client.anInt3481 * 1789770377 >= 2560) {
			return;
		}
		if (local221 > local168) {
			local241 = local221 - local168;
		} else {
			local241 = local168 - local221;
		}
		@Pc(273) int local273;
		if (local225 > local179) {
			local273 = local225 - local179;
		} else {
			local273 = local179 - local225;
		}
		if (local241 == 0 && local273 == 0 || local241 <= -client.aClass539_1.method30921(2091406434) || local241 >= client.aClass539_1.method30921(1919296184) || local273 <= -client.aClass539_1.method31011(-552639583) || local273 >= client.aClass539_1.method31011(-546733928)) {
			if (Class368.anInt4502 * -1583611537 != 3) {
				Class603.method32133(local168 + Class256.aString157 + local179 + " " + local221 + Class256.aString157 + local225 + " " + local34.anInt5540 * -390642507 + Class256.aString157 + local34.anInt5537 * -894305615, new RuntimeException(), 839300151);
			}
			return;
		}
		@Pc(357) int local357;
		@Pc(359) int local359;
		if (local241 <= local273) {
			local357 = local241 * 65536 / local273;
			local359 = 32768;
			while (local179 != local225) {
				if (local179 < local225) {
					local179++;
				} else if (local179 > local225) {
					local179--;
				}
				if ((local15.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853][local168][local179] & 0x4) != 0) {
					client.aBoolean750 = true;
					return;
				}
				if (local168 + 1 < local15.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853].length && (local15.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853][local168 + 1][local179] & 0x4) != 0) {
					client.aBoolean750 = true;
					return;
				}
				if (local168 > 0 && (local15.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853][local168 - 1][local179] & 0x4) != 0) {
					client.aBoolean750 = true;
					return;
				}
				local359 += local357;
				if (local359 >= 65536) {
					local359 -= 65536;
					if (local168 < local221) {
						local168++;
						if (local168 + 1 < local15.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853].length && (local15.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853][local168 + 1][local179] & 0x4) != 0) {
							client.aBoolean750 = true;
							return;
						}
					} else if (local168 > local221) {
						local168--;
						if (local168 > 0 && (local15.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853][local168 - 1][local179] & 0x4) != 0) {
							client.aBoolean750 = true;
							return;
						}
					}
				}
			}
			return;
		}
		local357 = local273 * 65536 / local241;
		local359 = 32768;
		while (local168 != local221) {
			if (local168 < local221) {
				local168++;
			} else if (local168 > local221) {
				local168--;
			}
			if ((local15.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853][local168][local179] & 0x4) != 0) {
				client.aBoolean750 = true;
				return;
			}
			if (local179 + 1 < local15.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853][local168].length && (local15.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853][local168][local179 + 1] & 0x4) != 0) {
				client.aBoolean750 = true;
				return;
			}
			if (local179 > 0 && (local15.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853][local168][local179 - 1] & 0x4) != 0) {
				client.aBoolean750 = true;
				return;
			}
			local359 += local357;
			if (local359 >= 65536) {
				local359 -= 65536;
				if (local179 < local225) {
					local179++;
					if (local179 + 1 < local15.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853][local168].length && (local15.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853][local168][local179 + 1] & 0x4) != 0) {
						client.aBoolean750 = true;
						return;
					}
				} else if (local179 > local225) {
					local179--;
					if (local179 > 0 && (local15.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853][local168][local179 - 1] & 0x4) != 0) {
						client.aBoolean750 = true;
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!il", name = "j", descriptor = "(B)V")
	void method27909(@OriginalArg(0) byte arg0) {
		this.aString189 = "";
		for (@Pc(4) int local4 = 0; local4 < this.aLinkedList2.size(); local4++) {
			@Pc(15) Class343 local15 = (Class343) this.aLinkedList2.get(local4);
			@Pc(20) char local20 = local15.aString191.charAt(0);
			if (this.aString189.indexOf(local20) < 0) {
				this.aString189 = this.aString189 + local20;
			}
		}
	}

	@OriginalMember(owner = "client!il", name = "t", descriptor = "(B)Z")
	public boolean method27910(@OriginalArg(0) byte arg0) {
		return this.aBoolean832;
	}

	@OriginalMember(owner = "client!il", name = "f", descriptor = "(ZI)V")
	public void method27911(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		this.aBoolean832 = arg0;
	}

	@OriginalMember(owner = "client!il", name = "w", descriptor = "()I")
	public int method27912() {
		return this.aLinkedList2.size();
	}

	@OriginalMember(owner = "client!il", name = "g", descriptor = "(Ljava/lang/String;B)Lclient!in;")
	Class343 method27914(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) Iterator local3 = this.aLinkedList2.iterator();
		@Pc(10) Class343 local10;
		do {
			if (!local3.hasNext()) {
				return null;
			}
			local10 = (Class343) local3.next();
		} while (!local10.aString191.equals(arg0));
		return local10;
	}

	@OriginalMember(owner = "client!il", name = "z", descriptor = "(Ljava/lang/String;II)Z")
	public boolean method27915(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0.isEmpty() || arg0.length() > 10 || !Class302.method27105(arg0.charAt(0), 1069156408)) {
			return false;
		}
		@Pc(17) Class343 local17 = this.method27914(arg0, (byte) -93);
		if (local17 != null) {
			this.aLinkedList2.remove(local17);
		}
		this.aLinkedList2.add(new Class343(arg0, arg1, arg2));
		this.method27909((byte) 55);
		return true;
	}

	@OriginalMember(owner = "client!il", name = "m", descriptor = "(I)V")
	public void method27916(@OriginalArg(0) int arg0) {
		this.aLinkedList2.clear();
		this.aString189 = "";
	}

	@OriginalMember(owner = "client!il", name = "o", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public String method27917(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.aLinkedList2.isEmpty()) {
			return arg0;
		}
		@Pc(11) StringBuilder local11 = new StringBuilder(arg0.length());
		@Pc(14) int local14 = arg0.length();
		@Pc(16) boolean local16 = false;
		for (@Pc(18) int local18 = 0; local18 < local14; local18++) {
			@Pc(23) boolean local23 = false;
			@Pc(27) char local27 = arg0.charAt(local18);
			if (local16) {
				if (local27 == '>') {
					local16 = false;
				}
			} else if (local27 == '<') {
				local16 = true;
			} else if (this.aString189.indexOf(local27) != -1) {
				for (@Pc(49) int local49 = 0; local49 < this.aLinkedList2.size(); local49++) {
					@Pc(60) Class343 local60 = (Class343) this.aLinkedList2.get(local49);
					@Pc(64) int local64 = local60.aString191.length();
					if (local18 <= local14 - local64 && arg0.substring(local18, local64 + local18).equals(local60.aString191)) {
						@Pc(105) String local105;
						if (local60.anInt4245 * -427313599 > 0) {
							local105 = String.format("<sprite=%d,%d>", local60.anInt4244 * 979646419, local60.anInt4245 * -427313599);
						} else {
							local105 = String.format("<sprite=%d>", local60.anInt4244 * 979646419);
						}
						local11.append(local105);
						local23 = true;
						local18 += local64 - 1;
						break;
					}
				}
			}
			if (!local23) {
				local11.append(local27);
			}
		}
		return local11.toString();
	}

	@OriginalMember(owner = "client!il", name = "e", descriptor = "(I)I")
	public int method27918(@OriginalArg(0) int arg0) {
		return this.aLinkedList2.size();
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "()Z")
	public boolean method27919() {
		return this.aBoolean832;
	}

	@OriginalMember(owner = "client!il", name = "s", descriptor = "()Z")
	public boolean method27920() {
		return this.aBoolean832;
	}

	@OriginalMember(owner = "client!il", name = "k", descriptor = "(Z)V")
	public void method27921(@OriginalArg(0) boolean arg0) {
		this.aBoolean832 = arg0;
	}

	@OriginalMember(owner = "client!il", name = "n", descriptor = "()V")
	public void method27922() {
		this.aLinkedList2.clear();
		this.aString189 = "";
	}

	@OriginalMember(owner = "client!il", name = "x", descriptor = "()I")
	public int method27923() {
		return this.aLinkedList2.size();
	}

	@OriginalMember(owner = "client!il", name = "l", descriptor = "(Ljava/lang/String;IIS)Z")
	public boolean method27925(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) short arg3) {
		if (arg0.isEmpty() || arg0.length() > 10 || !Class302.method27105(arg0.charAt(0), 1606724925)) {
			return false;
		}
		@Pc(17) Class343 local17 = this.method27914(arg0, (byte) -65);
		if (local17 != null) {
			this.aLinkedList2.remove(local17);
		}
		this.aLinkedList2.add(new Class343(arg0, arg1, arg2));
		this.method27909((byte) 25);
		return true;
	}

	@OriginalMember(owner = "client!il", name = "h", descriptor = "(Ljava/lang/String;II)Z")
	public boolean method27926(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0.isEmpty() || arg0.length() > 10 || !Class302.method27105(arg0.charAt(0), 1011303282)) {
			return false;
		}
		@Pc(17) Class343 local17 = this.method27914(arg0, (byte) -9);
		if (local17 != null) {
			this.aLinkedList2.remove(local17);
		}
		this.aLinkedList2.add(new Class343(arg0, arg1, arg2));
		this.method27909((byte) 76);
		return true;
	}

	@OriginalMember(owner = "client!il", name = "d", descriptor = "(Ljava/lang/String;II)Z")
	public boolean method27927(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0.isEmpty() || arg0.length() > 10 || !Class302.method27105(arg0.charAt(0), 1406012641)) {
			return false;
		}
		@Pc(17) Class343 local17 = this.method27914(arg0, (byte) -16);
		if (local17 != null) {
			this.aLinkedList2.remove(local17);
		}
		this.aLinkedList2.add(new Class343(arg0, arg1, arg2));
		this.method27909((byte) 114);
		return true;
	}

	@OriginalMember(owner = "client!il", name = "y", descriptor = "(Ljava/lang/String;)V")
	public void method27928(@OriginalArg(0) String arg0) {
		@Pc(3) Iterator local3 = this.aLinkedList2.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class343 local10 = (Class343) local3.next();
			if (local10.aString191.equals(arg0)) {
				local3.remove();
				break;
			}
		}
	}

	@OriginalMember(owner = "client!il", name = "p", descriptor = "(Ljava/lang/String;)Lclient!in;")
	Class343 method27929(@OriginalArg(0) String arg0) {
		@Pc(3) Iterator local3 = this.aLinkedList2.iterator();
		@Pc(10) Class343 local10;
		do {
			if (!local3.hasNext()) {
				return null;
			}
			local10 = (Class343) local3.next();
		} while (!local10.aString191.equals(arg0));
		return local10;
	}

	@OriginalMember(owner = "client!il", name = "v", descriptor = "(Ljava/lang/String;)Lclient!in;")
	Class343 method27930(@OriginalArg(0) String arg0) {
		@Pc(3) Iterator local3 = this.aLinkedList2.iterator();
		@Pc(10) Class343 local10;
		do {
			if (!local3.hasNext()) {
				return null;
			}
			local10 = (Class343) local3.next();
		} while (!local10.aString191.equals(arg0));
		return local10;
	}

	@OriginalMember(owner = "client!il", name = "i", descriptor = "(Ljava/lang/String;I)V")
	public void method27931(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Iterator local3 = this.aLinkedList2.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class343 local10 = (Class343) local3.next();
			if (local10.aString191.equals(arg0)) {
				local3.remove();
				break;
			}
		}
	}

	@OriginalMember(owner = "client!il", name = "c", descriptor = "()V")
	public void method27932() {
		this.aLinkedList2.clear();
		this.aString189 = "";
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	public String method27933(@OriginalArg(0) String arg0) {
		if (this.aLinkedList2.isEmpty()) {
			return arg0;
		}
		@Pc(11) StringBuilder local11 = new StringBuilder(arg0.length());
		@Pc(14) int local14 = arg0.length();
		@Pc(16) boolean local16 = false;
		for (@Pc(18) int local18 = 0; local18 < local14; local18++) {
			@Pc(23) boolean local23 = false;
			@Pc(27) char local27 = arg0.charAt(local18);
			if (local16) {
				if (local27 == '>') {
					local16 = false;
				}
			} else if (local27 == '<') {
				local16 = true;
			} else if (this.aString189.indexOf(local27) != -1) {
				for (@Pc(49) int local49 = 0; local49 < this.aLinkedList2.size(); local49++) {
					@Pc(60) Class343 local60 = (Class343) this.aLinkedList2.get(local49);
					@Pc(64) int local64 = local60.aString191.length();
					if (local18 <= local14 - local64 && arg0.substring(local18, local64 + local18).equals(local60.aString191)) {
						@Pc(105) String local105;
						if (local60.anInt4245 * -427313599 > 0) {
							local105 = String.format("<sprite=%d,%d>", local60.anInt4244 * 979646419, local60.anInt4245 * -427313599);
						} else {
							local105 = String.format("<sprite=%d>", local60.anInt4244 * 979646419);
						}
						local11.append(local105);
						local23 = true;
						local18 += local64 - 1;
						break;
					}
				}
			}
			if (!local23) {
				local11.append(local27);
			}
		}
		return local11.toString();
	}

	@OriginalMember(owner = "client!il", name = "ax", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	public String method27934(@OriginalArg(0) String arg0) {
		if (this.aLinkedList2.isEmpty()) {
			return arg0;
		}
		@Pc(11) StringBuilder local11 = new StringBuilder(arg0.length());
		@Pc(14) int local14 = arg0.length();
		@Pc(16) boolean local16 = false;
		for (@Pc(18) int local18 = 0; local18 < local14; local18++) {
			@Pc(23) boolean local23 = false;
			@Pc(27) char local27 = arg0.charAt(local18);
			if (local16) {
				if (local27 == '>') {
					local16 = false;
				}
			} else if (local27 == '<') {
				local16 = true;
			} else if (this.aString189.indexOf(local27) != -1) {
				for (@Pc(49) int local49 = 0; local49 < this.aLinkedList2.size(); local49++) {
					@Pc(60) Class343 local60 = (Class343) this.aLinkedList2.get(local49);
					@Pc(64) int local64 = local60.aString191.length();
					if (local18 <= local14 - local64 && arg0.substring(local18, local64 + local18).equals(local60.aString191)) {
						@Pc(105) String local105;
						if (local60.anInt4245 * -427313599 > 0) {
							local105 = String.format("<sprite=%d,%d>", local60.anInt4244 * 979646419, local60.anInt4245 * -427313599);
						} else {
							local105 = String.format("<sprite=%d>", local60.anInt4244 * 979646419);
						}
						local11.append(local105);
						local23 = true;
						local18 += local64 - 1;
						break;
					}
				}
			}
			if (!local23) {
				local11.append(local27);
			}
		}
		return local11.toString();
	}

	@OriginalMember(owner = "client!il", name = "ay", descriptor = "()V")
	void method27935() {
		this.aString189 = "";
		for (@Pc(4) int local4 = 0; local4 < this.aLinkedList2.size(); local4++) {
			@Pc(15) Class343 local15 = (Class343) this.aLinkedList2.get(local4);
			@Pc(20) char local20 = local15.aString191.charAt(0);
			if (this.aString189.indexOf(local20) < 0) {
				this.aString189 = this.aString189 + local20;
			}
		}
	}

	@OriginalMember(owner = "client!il", name = "ai", descriptor = "()V")
	void method27936() {
		this.aString189 = "";
		for (@Pc(4) int local4 = 0; local4 < this.aLinkedList2.size(); local4++) {
			@Pc(15) Class343 local15 = (Class343) this.aLinkedList2.get(local4);
			@Pc(20) char local20 = local15.aString191.charAt(0);
			if (this.aString189.indexOf(local20) < 0) {
				this.aString189 = this.aString189 + local20;
			}
		}
	}

	@OriginalMember(owner = "client!il", name = "aq", descriptor = "()V")
	void method27937() {
		this.aString189 = "";
		for (@Pc(4) int local4 = 0; local4 < this.aLinkedList2.size(); local4++) {
			@Pc(15) Class343 local15 = (Class343) this.aLinkedList2.get(local4);
			@Pc(20) char local20 = local15.aString191.charAt(0);
			if (this.aString189.indexOf(local20) < 0) {
				this.aString189 = this.aString189 + local20;
			}
		}
	}
}
