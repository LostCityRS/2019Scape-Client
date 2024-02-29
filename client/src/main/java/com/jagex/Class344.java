package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public class Class344 {

	@OriginalMember(owner = "client!io", name = "e", descriptor = "I")
	static final int anInt4189 = 10;

	@OriginalMember(owner = "client!io", name = "cl", descriptor = "I")
	static int anInt4190;

	@OriginalMember(owner = "client!io", name = "k", descriptor = "Ljava/lang/String;")
	String aString180;

	@OriginalMember(owner = "client!io", name = "n", descriptor = "Z")
	boolean aBoolean724 = false;

	@OriginalMember(owner = "client!io", name = "m", descriptor = "Ljava/util/LinkedList;")
	LinkedList aLinkedList2 = new LinkedList();

	@OriginalMember(owner = "client!io", name = "e", descriptor = "(I)Z", line = 17)
	public boolean method27524(@OriginalArg(0) int arg0) {
		return this.aBoolean724;
	}

	@OriginalMember(owner = "client!io", name = "d", descriptor = "()Z", line = 17)
	public boolean method27525() {
		return this.aBoolean724;
	}

	@OriginalMember(owner = "client!io", name = "n", descriptor = "(ZS)V", line = 21)
	public void method27526(@OriginalArg(0) boolean arg0, @OriginalArg(1) short arg1) {
		this.aBoolean724 = arg0;
	}

	@OriginalMember(owner = "client!io", name = "c", descriptor = "(Z)V", line = 21)
	public void method27527(@OriginalArg(0) boolean arg0) {
		this.aBoolean724 = arg0;
	}

	@OriginalMember(owner = "client!io", name = "r", descriptor = "(Z)V", line = 21)
	public void method27528(@OriginalArg(0) boolean arg0) {
		this.aBoolean724 = arg0;
	}

	@OriginalMember(owner = "client!io", name = "m", descriptor = "(I)I", line = 25)
	public int method27529(@OriginalArg(0) int arg0) {
		return this.aLinkedList2.size();
	}

	@OriginalMember(owner = "client!io", name = "v", descriptor = "(C)Z", line = 29)
	public static final boolean method27530(@OriginalArg(0) char arg0) {
		return arg0 >= '!' && arg0 < '0' || arg0 >= ':' && arg0 <= '@' && arg0 != '<' || arg0 >= '[' && arg0 <= '_' || arg0 >= '{';
	}

	@OriginalMember(owner = "client!io", name = "f", descriptor = "(Ljava/lang/String;III)Z", line = 33)
	public final boolean method27531(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0.isEmpty() || arg0.length() > 10 || !Class53_Sub1.method14952(arg0.charAt(0), (byte) 87)) {
			return false;
		}
		@Pc(17) Class346 local17 = this.method27535(arg0, -2477816);
		if (local17 != null) {
			this.aLinkedList2.remove(local17);
		}
		this.aLinkedList2.add(new Class346(arg0, arg1, arg2));
		this.method27550(1281612045);
		return true;
	}

	@OriginalMember(owner = "client!io", name = "o", descriptor = "(Ljava/lang/String;II)Z", line = 33)
	public final boolean method27532(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0.isEmpty() || arg0.length() > 10 || !Class53_Sub1.method14952(arg0.charAt(0), (byte) 60)) {
			return false;
		}
		@Pc(17) Class346 local17 = this.method27535(arg0, -72563851);
		if (local17 != null) {
			this.aLinkedList2.remove(local17);
		}
		this.aLinkedList2.add(new Class346(arg0, arg1, arg2));
		this.method27550(1544580348);
		return true;
	}

	@OriginalMember(owner = "client!io", name = "y", descriptor = "(Ljava/lang/String;)Lclient!iq;", line = 46)
	final Class346 method27533(@OriginalArg(0) String arg0) {
		@Pc(3) Iterator local3 = this.aLinkedList2.iterator();
		@Pc(10) Class346 local10;
		do {
			if (!local3.hasNext()) {
				return null;
			}
			local10 = (Class346) local3.next();
		} while (!local10.aString181.equals(arg0));
		return local10;
	}

	@OriginalMember(owner = "client!io", name = "q", descriptor = "(Ljava/lang/String;)Lclient!iq;", line = 46)
	final Class346 method27534(@OriginalArg(0) String arg0) {
		@Pc(3) Iterator local3 = this.aLinkedList2.iterator();
		@Pc(10) Class346 local10;
		do {
			if (!local3.hasNext()) {
				return null;
			}
			local10 = (Class346) local3.next();
		} while (!local10.aString181.equals(arg0));
		return local10;
	}

	@OriginalMember(owner = "client!io", name = "w", descriptor = "(Ljava/lang/String;I)Lclient!iq;", line = 46)
	final Class346 method27535(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Iterator local3 = this.aLinkedList2.iterator();
		@Pc(10) Class346 local10;
		do {
			if (!local3.hasNext()) {
				return null;
			}
			local10 = (Class346) local3.next();
		} while (!local10.aString181.equals(arg0));
		return local10;
	}

	@OriginalMember(owner = "client!io", name = "s", descriptor = "(Ljava/lang/String;)Lclient!iq;", line = 46)
	final Class346 method27536(@OriginalArg(0) String arg0) {
		@Pc(3) Iterator local3 = this.aLinkedList2.iterator();
		@Pc(10) Class346 local10;
		do {
			if (!local3.hasNext()) {
				return null;
			}
			local10 = (Class346) local3.next();
		} while (!local10.aString181.equals(arg0));
		return local10;
	}

	@OriginalMember(owner = "client!io", name = "l", descriptor = "(Ljava/lang/String;I)V", line = 57)
	public final void method27537(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Iterator local3 = this.aLinkedList2.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class346 local10 = (Class346) local3.next();
			if (local10.aString181.equals(arg0)) {
				local3.remove();
				break;
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(Ljava/lang/String;)V", line = 57)
	public final void method27538(@OriginalArg(0) String arg0) {
		@Pc(3) Iterator local3 = this.aLinkedList2.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class346 local10 = (Class346) local3.next();
			if (local10.aString181.equals(arg0)) {
				local3.remove();
				break;
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "x", descriptor = "(Ljava/lang/String;)V", line = 57)
	public final void method27539(@OriginalArg(0) String arg0) {
		@Pc(3) Iterator local3 = this.aLinkedList2.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class346 local10 = (Class346) local3.next();
			if (local10.aString181.equals(arg0)) {
				local3.remove();
				break;
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "p", descriptor = "(Lclient!yf;B)V", line = 62)
	static void method27540(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class452.method28959((byte) -30);
	}

	@OriginalMember(owner = "client!io", name = "u", descriptor = "(I)V", line = 68)
	public final void method27541(@OriginalArg(0) int arg0) {
		this.aLinkedList2.clear();
		this.aString180 = "";
	}

	@OriginalMember(owner = "client!io", name = "h", descriptor = "()V", line = 68)
	public final void method27542() {
		this.aLinkedList2.clear();
		this.aString180 = "";
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "()V", line = 68)
	public final void method27543() {
		this.aLinkedList2.clear();
		this.aString180 = "";
	}

	@OriginalMember(owner = "client!io", name = "g", descriptor = "()V", line = 68)
	public final void method27544() {
		this.aLinkedList2.clear();
		this.aString180 = "";
	}

	@OriginalMember(owner = "client!io", name = "z", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 73)
	public final String method27545(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
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
			} else if (this.aString180.indexOf(local27) != -1) {
				for (@Pc(49) int local49 = 0; local49 < this.aLinkedList2.size(); local49++) {
					@Pc(60) Class346 local60 = (Class346) this.aLinkedList2.get(local49);
					@Pc(64) int local64 = local60.aString181.length();
					if (local18 <= local14 - local64 && arg0.substring(local18, local64 + local18).equals(local60.aString181)) {
						@Pc(105) String local105;
						if (local60.anInt4193 * -109028217 > 0) {
							local105 = String.format("<sprite=%d,%d>", local60.anInt4192 * 1179887561, local60.anInt4193 * -109028217);
						} else {
							local105 = String.format("<sprite=%d>", local60.anInt4192 * 1179887561);
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

	@OriginalMember(owner = "client!io", name = "i", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 73)
	public final String method27546(@OriginalArg(0) String arg0) {
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
			} else if (this.aString180.indexOf(local27) != -1) {
				for (@Pc(49) int local49 = 0; local49 < this.aLinkedList2.size(); local49++) {
					@Pc(60) Class346 local60 = (Class346) this.aLinkedList2.get(local49);
					@Pc(64) int local64 = local60.aString181.length();
					if (local18 <= local14 - local64 && arg0.substring(local18, local64 + local18).equals(local60.aString181)) {
						@Pc(105) String local105;
						if (local60.anInt4193 * -109028217 > 0) {
							local105 = String.format("<sprite=%d,%d>", local60.anInt4192 * 1179887561, local60.anInt4193 * -109028217);
						} else {
							local105 = String.format("<sprite=%d>", local60.anInt4192 * 1179887561);
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

	@OriginalMember(owner = "client!io", name = "j", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 73)
	public final String method27547(@OriginalArg(0) String arg0) {
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
			} else if (this.aString180.indexOf(local27) != -1) {
				for (@Pc(49) int local49 = 0; local49 < this.aLinkedList2.size(); local49++) {
					@Pc(60) Class346 local60 = (Class346) this.aLinkedList2.get(local49);
					@Pc(64) int local64 = local60.aString181.length();
					if (local18 <= local14 - local64 && arg0.substring(local18, local64 + local18).equals(local60.aString181)) {
						@Pc(105) String local105;
						if (local60.anInt4193 * -109028217 > 0) {
							local105 = String.format("<sprite=%d,%d>", local60.anInt4192 * 1179887561, local60.anInt4193 * -109028217);
						} else {
							local105 = String.format("<sprite=%d>", local60.anInt4192 * 1179887561);
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

	@OriginalMember(owner = "client!io", name = "m", descriptor = "(I)Lclient!cm;", line = 86)
	public static Class100 method27548(@OriginalArg(0) int arg0) {
		return Class625.aClass100_51;
	}

	@OriginalMember(owner = "client!io", name = "ag", descriptor = "()V", line = 119)
	final void method27549() {
		this.aString180 = "";
		for (@Pc(4) int local4 = 0; local4 < this.aLinkedList2.size(); local4++) {
			@Pc(15) Class346 local15 = (Class346) this.aLinkedList2.get(local4);
			@Pc(20) char local20 = local15.aString181.charAt(0);
			if (this.aString180.indexOf(local20) < 0) {
				this.aString180 = this.aString180 + local20;
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "p", descriptor = "(I)V", line = 119)
	final void method27550(@OriginalArg(0) int arg0) {
		this.aString180 = "";
		for (@Pc(4) int local4 = 0; local4 < this.aLinkedList2.size(); local4++) {
			@Pc(15) Class346 local15 = (Class346) this.aLinkedList2.get(local4);
			@Pc(20) char local20 = local15.aString181.charAt(0);
			if (this.aString180.indexOf(local20) < 0) {
				this.aString180 = this.aString180 + local20;
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "ae", descriptor = "()V", line = 119)
	final void method27551() {
		this.aString180 = "";
		for (@Pc(4) int local4 = 0; local4 < this.aLinkedList2.size(); local4++) {
			@Pc(15) Class346 local15 = (Class346) this.aLinkedList2.get(local4);
			@Pc(20) char local20 = local15.aString181.charAt(0);
			if (this.aString180.indexOf(local20) < 0) {
				this.aString180 = this.aString180 + local20;
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "t", descriptor = "()V", line = 119)
	final void method27552() {
		this.aString180 = "";
		for (@Pc(4) int local4 = 0; local4 < this.aLinkedList2.size(); local4++) {
			@Pc(15) Class346 local15 = (Class346) this.aLinkedList2.get(local4);
			@Pc(20) char local20 = local15.aString181.charAt(0);
			if (this.aString180.indexOf(local20) < 0) {
				this.aString180 = this.aString180 + local20;
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "ah", descriptor = "()V", line = 119)
	final void method27553() {
		this.aString180 = "";
		for (@Pc(4) int local4 = 0; local4 < this.aLinkedList2.size(); local4++) {
			@Pc(15) Class346 local15 = (Class346) this.aLinkedList2.get(local4);
			@Pc(20) char local20 = local15.aString181.charAt(0);
			if (this.aString180.indexOf(local20) < 0) {
				this.aString180 = this.aString180 + local20;
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "rw", descriptor = "(Lclient!yf;I)V", line = 8053)
	static final void method27554(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class168.method17628(local11, local14, arg0, (byte) -53);
	}

	@OriginalMember(owner = "client!io", name = "abn", descriptor = "(Lclient!yf;I)V", line = 9878)
	static final void method27555(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class557.aClass297_1.method26646(local12, 1849330986).method26746((short) -15353);
	}

	@OriginalMember(owner = "client!io", name = "ajz", descriptor = "(Lclient!yf;I)V", line = 11435)
	static final void method27556(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		throw new RuntimeException("");
	}

	@OriginalMember(owner = "client!io", name = "asy", descriptor = "(Lclient!yf;I)V", line = 13084)
	static final void method27557(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub35_2, arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091], (byte) 93);
		Class106_Sub1.method5135(1710055133);
		client.aBoolean601 = false;
	}

	@OriginalMember(owner = "client!io", name = "bbb", descriptor = "(Lclient!yf;I)V", line = 14415)
	static final void method27558(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= 463840436;
	}
}
