package jagex3;

import java.util.Iterator;
import java.util.LinkedList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public final class Class344 {

	@OriginalMember(owner = "client!io", name = "e", descriptor = "I")
	static final int anInt4230 = 10;

	@OriginalMember(owner = "client!io", name = "cl", descriptor = "I")
	static int anInt4231;

	@OriginalMember(owner = "client!io", name = "k", descriptor = "Ljava/lang/String;")
	String aString186;

	@OriginalMember(owner = "client!io", name = "n", descriptor = "Z")
	boolean aBoolean728 = false;

	@OriginalMember(owner = "client!io", name = "m", descriptor = "Ljava/util/LinkedList;")
	LinkedList aLinkedList3 = new LinkedList();

	@OriginalMember(owner = "client!io", name = "v", descriptor = "(C)Z")
	public static boolean method27629(@OriginalArg(0) char arg0) {
		return arg0 >= '!' && arg0 < '0' || arg0 >= ':' && arg0 <= '@' && arg0 != '<' || arg0 >= '[' && arg0 <= '_' || arg0 >= '{';
	}

	@OriginalMember(owner = "client!io", name = "m", descriptor = "(I)Lclient!cm;")
	public static Class100 method27645(@OriginalArg(0) int arg0) {
		return Class625.aClass100_51;
	}

	@OriginalMember(owner = "client!io", name = "p", descriptor = "(Lclient!yf;B)V")
	static void method27646(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class452.method29142((byte) -30);
	}

	@OriginalMember(owner = "client!io", name = "rw", descriptor = "(Lclient!yf;I)V")
	static void method27647(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class168.method17639(local11, local14, arg0, (byte) -53);
	}

	@OriginalMember(owner = "client!io", name = "abn", descriptor = "(Lclient!yf;I)V")
	static void method27648(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class557.aClass297_1.method26715(local12, 1849330986).method26843((short) -15353);
	}

	@OriginalMember(owner = "client!io", name = "ajz", descriptor = "(Lclient!yf;I)V")
	static void method27649(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		throw new RuntimeException("");
	}

	@OriginalMember(owner = "client!io", name = "asy", descriptor = "(Lclient!yf;I)V")
	static void method27650(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub35_2, arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091], (byte) 93);
		Class106_Sub1.method5148(1710055133);
		client.aBoolean603 = false;
	}

	@OriginalMember(owner = "client!io", name = "bbb", descriptor = "(Lclient!yf;I)V")
	static void method27651(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= 463840436;
	}

	@OriginalMember(owner = "client!io", name = "z", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public String method27617(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.aLinkedList3.isEmpty()) {
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
			} else if (this.aString186.indexOf(local27) != -1) {
				for (@Pc(49) int local49 = 0; local49 < this.aLinkedList3.size(); local49++) {
					@Pc(60) Class346 local60 = (Class346) this.aLinkedList3.get(local49);
					@Pc(64) int local64 = local60.aString187.length();
					if (local18 <= local14 - local64 && arg0.substring(local18, local64 + local18).equals(local60.aString187)) {
						@Pc(105) String local105;
						if (local60.anInt4234 * -109028217 > 0) {
							local105 = String.format("<sprite=%d,%d>", local60.anInt4233 * 1179887561, local60.anInt4234 * -109028217);
						} else {
							local105 = String.format("<sprite=%d>", local60.anInt4233 * 1179887561);
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

	@OriginalMember(owner = "client!io", name = "e", descriptor = "(I)Z")
	public boolean method27618(@OriginalArg(0) int arg0) {
		return this.aBoolean728;
	}

	@OriginalMember(owner = "client!io", name = "n", descriptor = "(ZS)V")
	public void method27619(@OriginalArg(0) boolean arg0, @OriginalArg(1) short arg1) {
		this.aBoolean728 = arg0;
	}

	@OriginalMember(owner = "client!io", name = "f", descriptor = "(Ljava/lang/String;III)Z")
	public boolean method27620(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0.isEmpty() || arg0.length() > 10 || !Class53_Sub1.method14964(arg0.charAt(0), (byte) 87)) {
			return false;
		}
		@Pc(17) Class346 local17 = this.method27639(arg0, -2477816);
		if (local17 != null) {
			this.aLinkedList3.remove(local17);
		}
		this.aLinkedList3.add(new Class346(arg0, arg1, arg2));
		this.method27624(1281612045);
		return true;
	}

	@OriginalMember(owner = "client!io", name = "ag", descriptor = "()V")
	void method27621() {
		this.aString186 = "";
		for (@Pc(4) int local4 = 0; local4 < this.aLinkedList3.size(); local4++) {
			@Pc(15) Class346 local15 = (Class346) this.aLinkedList3.get(local4);
			@Pc(20) char local20 = local15.aString187.charAt(0);
			if (this.aString186.indexOf(local20) < 0) {
				this.aString186 = this.aString186 + local20;
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "l", descriptor = "(Ljava/lang/String;I)V")
	public void method27622(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Iterator local3 = this.aLinkedList3.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class346 local10 = (Class346) local3.next();
			if (local10.aString187.equals(arg0)) {
				local3.remove();
				break;
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "u", descriptor = "(I)V")
	public void method27623(@OriginalArg(0) int arg0) {
		this.aLinkedList3.clear();
		this.aString186 = "";
	}

	@OriginalMember(owner = "client!io", name = "p", descriptor = "(I)V")
	void method27624(@OriginalArg(0) int arg0) {
		this.aString186 = "";
		for (@Pc(4) int local4 = 0; local4 < this.aLinkedList3.size(); local4++) {
			@Pc(15) Class346 local15 = (Class346) this.aLinkedList3.get(local4);
			@Pc(20) char local20 = local15.aString187.charAt(0);
			if (this.aString186.indexOf(local20) < 0) {
				this.aString186 = this.aString186 + local20;
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "ae", descriptor = "()V")
	void method27625() {
		this.aString186 = "";
		for (@Pc(4) int local4 = 0; local4 < this.aLinkedList3.size(); local4++) {
			@Pc(15) Class346 local15 = (Class346) this.aLinkedList3.get(local4);
			@Pc(20) char local20 = local15.aString187.charAt(0);
			if (this.aString186.indexOf(local20) < 0) {
				this.aString186 = this.aString186 + local20;
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "d", descriptor = "()Z")
	public boolean method27626() {
		return this.aBoolean728;
	}

	@OriginalMember(owner = "client!io", name = "c", descriptor = "(Z)V")
	public void method27627(@OriginalArg(0) boolean arg0) {
		this.aBoolean728 = arg0;
	}

	@OriginalMember(owner = "client!io", name = "r", descriptor = "(Z)V")
	public void method27628(@OriginalArg(0) boolean arg0) {
		this.aBoolean728 = arg0;
	}

	@OriginalMember(owner = "client!io", name = "o", descriptor = "(Ljava/lang/String;II)Z")
	public boolean method27630(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0.isEmpty() || arg0.length() > 10 || !Class53_Sub1.method14964(arg0.charAt(0), (byte) 60)) {
			return false;
		}
		@Pc(17) Class346 local17 = this.method27639(arg0, -72563851);
		if (local17 != null) {
			this.aLinkedList3.remove(local17);
		}
		this.aLinkedList3.add(new Class346(arg0, arg1, arg2));
		this.method27624(1544580348);
		return true;
	}

	@OriginalMember(owner = "client!io", name = "m", descriptor = "(I)I")
	public int method27631(@OriginalArg(0) int arg0) {
		return this.aLinkedList3.size();
	}

	@OriginalMember(owner = "client!io", name = "y", descriptor = "(Ljava/lang/String;)Lclient!iq;")
	Class346 method27632(@OriginalArg(0) String arg0) {
		@Pc(3) Iterator local3 = this.aLinkedList3.iterator();
		@Pc(10) Class346 local10;
		do {
			if (!local3.hasNext()) {
				return null;
			}
			local10 = (Class346) local3.next();
		} while (!local10.aString187.equals(arg0));
		return local10;
	}

	@OriginalMember(owner = "client!io", name = "q", descriptor = "(Ljava/lang/String;)Lclient!iq;")
	Class346 method27633(@OriginalArg(0) String arg0) {
		@Pc(3) Iterator local3 = this.aLinkedList3.iterator();
		@Pc(10) Class346 local10;
		do {
			if (!local3.hasNext()) {
				return null;
			}
			local10 = (Class346) local3.next();
		} while (!local10.aString187.equals(arg0));
		return local10;
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(Ljava/lang/String;)V")
	public void method27634(@OriginalArg(0) String arg0) {
		@Pc(3) Iterator local3 = this.aLinkedList3.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class346 local10 = (Class346) local3.next();
			if (local10.aString187.equals(arg0)) {
				local3.remove();
				break;
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "x", descriptor = "(Ljava/lang/String;)V")
	public void method27635(@OriginalArg(0) String arg0) {
		@Pc(3) Iterator local3 = this.aLinkedList3.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class346 local10 = (Class346) local3.next();
			if (local10.aString187.equals(arg0)) {
				local3.remove();
				break;
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "h", descriptor = "()V")
	public void method27636() {
		this.aLinkedList3.clear();
		this.aString186 = "";
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "()V")
	public void method27637() {
		this.aLinkedList3.clear();
		this.aString186 = "";
	}

	@OriginalMember(owner = "client!io", name = "g", descriptor = "()V")
	public void method27638() {
		this.aLinkedList3.clear();
		this.aString186 = "";
	}

	@OriginalMember(owner = "client!io", name = "w", descriptor = "(Ljava/lang/String;I)Lclient!iq;")
	Class346 method27639(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Iterator local3 = this.aLinkedList3.iterator();
		@Pc(10) Class346 local10;
		do {
			if (!local3.hasNext()) {
				return null;
			}
			local10 = (Class346) local3.next();
		} while (!local10.aString187.equals(arg0));
		return local10;
	}

	@OriginalMember(owner = "client!io", name = "s", descriptor = "(Ljava/lang/String;)Lclient!iq;")
	Class346 method27640(@OriginalArg(0) String arg0) {
		@Pc(3) Iterator local3 = this.aLinkedList3.iterator();
		@Pc(10) Class346 local10;
		do {
			if (!local3.hasNext()) {
				return null;
			}
			local10 = (Class346) local3.next();
		} while (!local10.aString187.equals(arg0));
		return local10;
	}

	@OriginalMember(owner = "client!io", name = "t", descriptor = "()V")
	void method27641() {
		this.aString186 = "";
		for (@Pc(4) int local4 = 0; local4 < this.aLinkedList3.size(); local4++) {
			@Pc(15) Class346 local15 = (Class346) this.aLinkedList3.get(local4);
			@Pc(20) char local20 = local15.aString187.charAt(0);
			if (this.aString186.indexOf(local20) < 0) {
				this.aString186 = this.aString186 + local20;
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "i", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	public String method27642(@OriginalArg(0) String arg0) {
		if (this.aLinkedList3.isEmpty()) {
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
			} else if (this.aString186.indexOf(local27) != -1) {
				for (@Pc(49) int local49 = 0; local49 < this.aLinkedList3.size(); local49++) {
					@Pc(60) Class346 local60 = (Class346) this.aLinkedList3.get(local49);
					@Pc(64) int local64 = local60.aString187.length();
					if (local18 <= local14 - local64 && arg0.substring(local18, local64 + local18).equals(local60.aString187)) {
						@Pc(105) String local105;
						if (local60.anInt4234 * -109028217 > 0) {
							local105 = String.format("<sprite=%d,%d>", local60.anInt4233 * 1179887561, local60.anInt4234 * -109028217);
						} else {
							local105 = String.format("<sprite=%d>", local60.anInt4233 * 1179887561);
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

	@OriginalMember(owner = "client!io", name = "ah", descriptor = "()V")
	void method27643() {
		this.aString186 = "";
		for (@Pc(4) int local4 = 0; local4 < this.aLinkedList3.size(); local4++) {
			@Pc(15) Class346 local15 = (Class346) this.aLinkedList3.get(local4);
			@Pc(20) char local20 = local15.aString187.charAt(0);
			if (this.aString186.indexOf(local20) < 0) {
				this.aString186 = this.aString186 + local20;
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "j", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	public String method27644(@OriginalArg(0) String arg0) {
		if (this.aLinkedList3.isEmpty()) {
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
			} else if (this.aString186.indexOf(local27) != -1) {
				for (@Pc(49) int local49 = 0; local49 < this.aLinkedList3.size(); local49++) {
					@Pc(60) Class346 local60 = (Class346) this.aLinkedList3.get(local49);
					@Pc(64) int local64 = local60.aString187.length();
					if (local18 <= local14 - local64 && arg0.substring(local18, local64 + local18).equals(local60.aString187)) {
						@Pc(105) String local105;
						if (local60.anInt4234 * -109028217 > 0) {
							local105 = String.format("<sprite=%d,%d>", local60.anInt4233 * 1179887561, local60.anInt4234 * -109028217);
						} else {
							local105 = String.format("<sprite=%d>", local60.anInt4233 * 1179887561);
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
}
