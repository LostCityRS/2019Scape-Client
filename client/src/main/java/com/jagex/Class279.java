package com.jagex;

import java.awt.Canvas;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fy")
public class Class279 {

	@OriginalMember(owner = "client!fy", name = "n", descriptor = "I")
	static final int anInt3889 = 8;

	@OriginalMember(owner = "client!fy", name = "e", descriptor = "I")
	static final int anInt3890 = 40;

	@OriginalMember(owner = "client!fy", name = "tv", descriptor = "Lclient!kr;")
	public static Class386 aClass386_1;

	@OriginalMember(owner = "client!fy", name = "kd", descriptor = "I")
	static int anInt3892;

	@OriginalMember(owner = "client!fy", name = "m", descriptor = "Ljava/lang/Integer;")
	static final Integer anInteger1 = -1;

	@OriginalMember(owner = "client!fy", name = "k", descriptor = "I")
	public final int anInt3891;

	@OriginalMember(owner = "client!fy", name = "f", descriptor = "Ljava/util/List;")
	final List aList12;

	@OriginalMember(owner = "client!fy", name = "w", descriptor = "Ljava/util/List;")
	final List aList10;

	@OriginalMember(owner = "client!fy", name = "l", descriptor = "Ljava/util/List;")
	final List aList11;

	@OriginalMember(owner = "client!fy", name = "u", descriptor = "Ljava/util/List;")
	final List aList13;

	@OriginalMember(owner = "client!fy", name = "e", descriptor = "(Ljava/awt/Canvas;Lclient!df;Lclient!es;Lclient!nx;Lclient!nb;Lclient!np;IIB)Lclient!dh;", line = 13)
	public static Class104 method26366(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class225 arg1, @OriginalArg(2) Interface24 arg2, @OriginalArg(3) Interface48 arg3, @OriginalArg(4) Interface46 arg4, @OriginalArg(5) Interface47 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte arg8) {
		return new Class104_Sub3(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!fy", name = "<init>", descriptor = "(I)V", line = 16)
	public Class279(@OriginalArg(0) int arg0) {
		this.anInt3891 = arg0 * 2067035095;
		this.aList12 = new ArrayList();
		this.aList10 = new ArrayList();
		this.aList11 = new ArrayList();
		this.aList13 = new ArrayList();
	}

	@OriginalMember(owner = "client!fy", name = "e", descriptor = "(B)I", line = 25)
	public int method26367(@OriginalArg(0) byte arg0) {
		return this.aList12.size();
	}

	@OriginalMember(owner = "client!fy", name = "g", descriptor = "()I", line = 25)
	public int method26368() {
		return this.aList12.size();
	}

	@OriginalMember(owner = "client!fy", name = "j", descriptor = "()I", line = 29)
	public int method26369() {
		return this.aList10.size();
	}

	@OriginalMember(owner = "client!fy", name = "n", descriptor = "(I)I", line = 29)
	public int method26370(@OriginalArg(0) int arg0) {
		return this.aList10.size();
	}

	@OriginalMember(owner = "client!fy", name = "ae", descriptor = "()I", line = 29)
	public int method26371() {
		return this.aList10.size();
	}

	@OriginalMember(owner = "client!fy", name = "ah", descriptor = "()I", line = 29)
	public int method26372() {
		return this.aList10.size();
	}

	@OriginalMember(owner = "client!fy", name = "ag", descriptor = "()I", line = 29)
	public int method26373() {
		return this.aList10.size();
	}

	@OriginalMember(owner = "client!fy", name = "i", descriptor = "()I", line = 29)
	public int method26374() {
		return this.aList10.size();
	}

	@OriginalMember(owner = "client!fy", name = "t", descriptor = "()I", line = 29)
	public int method26375() {
		return this.aList10.size();
	}

	@OriginalMember(owner = "client!fy", name = "al", descriptor = "(I)I", line = 33)
	public int method26376(@OriginalArg(0) int arg0) {
		return this.aList10.indexOf(arg0);
	}

	@OriginalMember(owner = "client!fy", name = "ai", descriptor = "(I)I", line = 33)
	public int method26377(@OriginalArg(0) int arg0) {
		return this.aList10.indexOf(arg0);
	}

	@OriginalMember(owner = "client!fy", name = "ac", descriptor = "(I)I", line = 33)
	public int method26378(@OriginalArg(0) int arg0) {
		return this.aList10.indexOf(arg0);
	}

	@OriginalMember(owner = "client!fy", name = "m", descriptor = "(II)I", line = 33)
	public int method26379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aList10.indexOf(arg0);
	}

	@OriginalMember(owner = "client!fy", name = "k", descriptor = "(IB)I", line = 37)
	public int method26380(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return (Integer) this.aList10.get(arg0);
	}

	@OriginalMember(owner = "client!fy", name = "as", descriptor = "(I)I", line = 41)
	public int method26381(@OriginalArg(0) int arg0) {
		return this.aList12.indexOf(arg0);
	}

	@OriginalMember(owner = "client!fy", name = "f", descriptor = "(II)I", line = 41)
	public int method26382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aList12.indexOf(arg0);
	}

	@OriginalMember(owner = "client!fy", name = "aw", descriptor = "(I)I", line = 41)
	public int method26383(@OriginalArg(0) int arg0) {
		return this.aList12.indexOf(arg0);
	}

	@OriginalMember(owner = "client!fy", name = "w", descriptor = "(II)I", line = 45)
	public int method26384(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Integer) this.aList12.get(arg0);
	}

	@OriginalMember(owner = "client!fy", name = "ad", descriptor = "(I)I", line = 45)
	public int method26385(@OriginalArg(0) int arg0) {
		return (Integer) this.aList12.get(arg0);
	}

	@OriginalMember(owner = "client!fy", name = "at", descriptor = "(I)I", line = 45)
	public int method26386(@OriginalArg(0) int arg0) {
		return (Integer) this.aList12.get(arg0);
	}

	@OriginalMember(owner = "client!fy", name = "am", descriptor = "(I)I", line = 49)
	public int method26387(@OriginalArg(0) int arg0) {
		return this.method26404(arg0, -1, -1470029567);
	}

	@OriginalMember(owner = "client!fy", name = "ap", descriptor = "(I)I", line = 49)
	public int method26388(@OriginalArg(0) int arg0) {
		return this.method26404(arg0, -1, -302036450);
	}

	@OriginalMember(owner = "client!fy", name = "l", descriptor = "(IB)I", line = 49)
	public int method26389(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return this.method26404(arg0, -1, -1883426330);
	}

	@OriginalMember(owner = "client!fy", name = "au", descriptor = "(I)I", line = 49)
	public int method26390(@OriginalArg(0) int arg0) {
		return this.method26404(arg0, -1, -1572244076);
	}

	@OriginalMember(owner = "client!fy", name = "ar", descriptor = "(I)I", line = 49)
	public int method26391(@OriginalArg(0) int arg0) {
		return this.method26404(arg0, -1, -407489213);
	}

	@OriginalMember(owner = "client!fy", name = "aq", descriptor = "(IZ)V", line = 53)
	public void method26392(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aList11.set(arg0, arg1 ? arg0 : anInteger1);
	}

	@OriginalMember(owner = "client!fy", name = "u", descriptor = "(IZI)V", line = 53)
	public void method26393(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aList11.set(arg0, arg1 ? arg0 : anInteger1);
	}

	@OriginalMember(owner = "client!fy", name = "ax", descriptor = "(IZ)V", line = 53)
	public void method26394(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aList11.set(arg0, arg1 ? arg0 : anInteger1);
	}

	@OriginalMember(owner = "client!fy", name = "av", descriptor = "(IZ)V", line = 53)
	public void method26395(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aList11.set(arg0, arg1 ? arg0 : anInteger1);
	}

	@OriginalMember(owner = "client!fy", name = "ao", descriptor = "(IZ)V", line = 53)
	public void method26396(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aList11.set(arg0, arg1 ? arg0 : anInteger1);
	}

	@OriginalMember(owner = "client!fy", name = "aj", descriptor = "(IZ)V", line = 53)
	public void method26397(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aList11.set(arg0, arg1 ? arg0 : anInteger1);
	}

	@OriginalMember(owner = "client!fy", name = "z", descriptor = "(III)V", line = 57)
	public void method26398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aList11.set(arg0, arg1);
	}

	@OriginalMember(owner = "client!fy", name = "ay", descriptor = "(II)V", line = 57)
	public void method26399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aList11.set(arg0, arg1);
	}

	@OriginalMember(owner = "client!fy", name = "ab", descriptor = "(II)V", line = 57)
	public void method26400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aList11.set(arg0, arg1);
	}

	@OriginalMember(owner = "client!fy", name = "p", descriptor = "(II)Z", line = 61)
	public boolean method26401(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return !((Integer) this.aList11.get(arg0)).equals(anInteger1);
	}

	@OriginalMember(owner = "client!fy", name = "aa", descriptor = "(I)Z", line = 61)
	public boolean method26402(@OriginalArg(0) int arg0) {
		return !((Integer) this.aList11.get(arg0)).equals(anInteger1);
	}

	@OriginalMember(owner = "client!fy", name = "az", descriptor = "(I)Z", line = 61)
	public boolean method26403(@OriginalArg(0) int arg0) {
		return !((Integer) this.aList11.get(arg0)).equals(anInteger1);
	}

	@OriginalMember(owner = "client!fy", name = "d", descriptor = "(III)I", line = 65)
	public int method26404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aList12.size() == 8) {
			throw new RuntimeException("");
		} else if (this.method26382(arg0, 867457263) == -1) {
			if (arg1 == -1) {
				arg1 = this.aList12.size();
			}
			this.aList12.add(arg1, arg0);
			@Pc(37) Iterator local37 = this.aList13.iterator();
			while (local37.hasNext()) {
				@Pc(44) List local44 = (List) local37.next();
				local44.add(arg1, null);
			}
			return arg1;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!fy", name = "af", descriptor = "(II)I", line = 65)
	public int method26405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aList12.size() == 8) {
			throw new RuntimeException("");
		} else if (this.method26382(arg0, 867457263) == -1) {
			if (arg1 == -1) {
				arg1 = this.aList12.size();
			}
			this.aList12.add(arg1, arg0);
			@Pc(37) Iterator local37 = this.aList13.iterator();
			while (local37.hasNext()) {
				@Pc(44) List local44 = (List) local37.next();
				local44.add(arg1, null);
			}
			return arg1;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!fy", name = "bf", descriptor = "(I)V", line = 79)
	public void method26406(@OriginalArg(0) int arg0) {
		this.aList12.remove(arg0);
		@Pc(8) Iterator local8 = this.aList13.iterator();
		while (local8.hasNext()) {
			@Pc(15) List local15 = (List) local8.next();
			local15.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!fy", name = "c", descriptor = "(IB)V", line = 79)
	public void method26407(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aList12.remove(arg0);
		@Pc(8) Iterator local8 = this.aList13.iterator();
		while (local8.hasNext()) {
			@Pc(15) List local15 = (List) local8.next();
			local15.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!fy", name = "ak", descriptor = "(I)V", line = 79)
	public void method26408(@OriginalArg(0) int arg0) {
		this.aList12.remove(arg0);
		@Pc(8) Iterator local8 = this.aList13.iterator();
		while (local8.hasNext()) {
			@Pc(15) List local15 = (List) local8.next();
			local15.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!fy", name = "an", descriptor = "(I)V", line = 79)
	public void method26409(@OriginalArg(0) int arg0) {
		this.aList12.remove(arg0);
		@Pc(8) Iterator local8 = this.aList13.iterator();
		while (local8.hasNext()) {
			@Pc(15) List local15 = (List) local8.next();
			local15.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!fy", name = "r", descriptor = "(II)I", line = 89)
	public int method26410(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method26421(arg0, -1, 1217577618);
	}

	@OriginalMember(owner = "client!fy", name = "bl", descriptor = "(I)I", line = 89)
	public int method26411(@OriginalArg(0) int arg0) {
		return this.method26421(arg0, -1, 1217577618);
	}

	@OriginalMember(owner = "client!fy", name = "v", descriptor = "(IIB)V", line = 93)
	public void method26412(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		this.method26418(arg0, arg1, -1931481788);
		for (@Pc(6) int local6 = 0; local6 < this.aList11.size(); local6++) {
			@Pc(17) Integer local17 = (Integer) this.aList11.get(local6);
			if (!local17.equals(anInteger1)) {
				@Pc(25) Integer local25 = local6;
				if (!local17.equals(local25)) {
					this.aList11.set(local6, local25);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fy", name = "bk", descriptor = "(II)V", line = 93)
	public void method26413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method26418(arg0, arg1, -1931481788);
		for (@Pc(6) int local6 = 0; local6 < this.aList11.size(); local6++) {
			@Pc(17) Integer local17 = (Integer) this.aList11.get(local6);
			if (!local17.equals(anInteger1)) {
				@Pc(25) Integer local25 = local6;
				if (!local17.equals(local25)) {
					this.aList11.set(local6, local25);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fy", name = "bh", descriptor = "(II)V", line = 93)
	public void method26414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method26418(arg0, arg1, -1931481788);
		for (@Pc(6) int local6 = 0; local6 < this.aList11.size(); local6++) {
			@Pc(17) Integer local17 = (Integer) this.aList11.get(local6);
			if (!local17.equals(anInteger1)) {
				@Pc(25) Integer local25 = local6;
				if (!local17.equals(local25)) {
					this.aList11.set(local6, local25);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fy", name = "bx", descriptor = "(II)V", line = 93)
	public void method26415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method26418(arg0, arg1, -1931481788);
		for (@Pc(6) int local6 = 0; local6 < this.aList11.size(); local6++) {
			@Pc(17) Integer local17 = (Integer) this.aList11.get(local6);
			if (!local17.equals(anInteger1)) {
				@Pc(25) Integer local25 = local6;
				if (!local17.equals(local25)) {
					this.aList11.set(local6, local25);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fy", name = "bc", descriptor = "(II)V", line = 93)
	public void method26416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method26418(arg0, arg1, -1931481788);
		for (@Pc(6) int local6 = 0; local6 < this.aList11.size(); local6++) {
			@Pc(17) Integer local17 = (Integer) this.aList11.get(local6);
			if (!local17.equals(anInteger1)) {
				@Pc(25) Integer local25 = local6;
				if (!local17.equals(local25)) {
					this.aList11.set(local6, local25);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fy", name = "bd", descriptor = "(II)V", line = 93)
	public void method26417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method26418(arg0, arg1, -1931481788);
		for (@Pc(6) int local6 = 0; local6 < this.aList11.size(); local6++) {
			@Pc(17) Integer local17 = (Integer) this.aList11.get(local6);
			if (!local17.equals(anInteger1)) {
				@Pc(25) Integer local25 = local6;
				if (!local17.equals(local25)) {
					this.aList11.set(local6, local25);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fy", name = "o", descriptor = "(III)V", line = 103)
	void method26418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aList10.add(arg1, this.aList10.remove(arg0));
		this.aList11.add(arg1, this.aList11.remove(arg0));
		this.aList13.add(arg1, this.aList13.remove(arg0));
	}

	@OriginalMember(owner = "client!fy", name = "bi", descriptor = "(II)V", line = 103)
	void method26419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aList10.add(arg1, this.aList10.remove(arg0));
		this.aList11.add(arg1, this.aList11.remove(arg0));
		this.aList13.add(arg1, this.aList13.remove(arg0));
	}

	@OriginalMember(owner = "client!fy", name = "bn", descriptor = "(II)V", line = 103)
	void method26420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aList10.add(arg1, this.aList10.remove(arg0));
		this.aList11.add(arg1, this.aList11.remove(arg0));
		this.aList13.add(arg1, this.aList13.remove(arg0));
	}

	@OriginalMember(owner = "client!fy", name = "s", descriptor = "(III)I", line = 109)
	public int method26421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aList10.size() == 40) {
			throw new RuntimeException("");
		} else if (this.method26379(arg0, -1113809210) == -1) {
			if (arg1 == -1) {
				arg1 = this.aList10.size();
			}
			this.method26423(arg0, arg1, (byte) -9);
			for (@Pc(36) int local36 = arg1 + 1; local36 < this.aList10.size(); local36++) {
				@Pc(47) Integer local47 = (Integer) this.aList11.get(local36);
				if (!local47.equals(anInteger1) && local47 < local36) {
					this.method26418(local36, local36 - 1, -1931481788);
				}
			}
			return this.method26379(arg0, -1113809210);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!fy", name = "bt", descriptor = "(II)I", line = 109)
	public int method26422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aList10.size() == 40) {
			throw new RuntimeException("");
		} else if (this.method26379(arg0, -1113809210) == -1) {
			if (arg1 == -1) {
				arg1 = this.aList10.size();
			}
			this.method26423(arg0, arg1, (byte) -118);
			for (@Pc(36) int local36 = arg1 + 1; local36 < this.aList10.size(); local36++) {
				@Pc(47) Integer local47 = (Integer) this.aList11.get(local36);
				if (!local47.equals(anInteger1) && local47 < local36) {
					this.method26418(local36, local36 - 1, -1931481788);
				}
			}
			return this.method26379(arg0, -1113809210);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!fy", name = "y", descriptor = "(IIB)V", line = 123)
	void method26423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		this.aList10.add(arg1, arg0);
		this.aList11.add(arg1, anInteger1);
		@Pc(14) ArrayList local14 = new ArrayList();
		for (@Pc(16) int local16 = 0; local16 < this.aList12.size(); local16++) {
			local14.add(null);
		}
		this.aList13.add(arg1, local14);
	}

	@OriginalMember(owner = "client!fy", name = "bq", descriptor = "(II)V", line = 123)
	void method26424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aList10.add(arg1, arg0);
		this.aList11.add(arg1, anInteger1);
		@Pc(14) ArrayList local14 = new ArrayList();
		for (@Pc(16) int local16 = 0; local16 < this.aList12.size(); local16++) {
			local14.add(null);
		}
		this.aList13.add(arg1, local14);
	}

	@OriginalMember(owner = "client!fy", name = "bm", descriptor = "(II)V", line = 123)
	void method26425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aList10.add(arg1, arg0);
		this.aList11.add(arg1, anInteger1);
		@Pc(14) ArrayList local14 = new ArrayList();
		for (@Pc(16) int local16 = 0; local16 < this.aList12.size(); local16++) {
			local14.add(null);
		}
		this.aList13.add(arg1, local14);
	}

	@OriginalMember(owner = "client!fy", name = "bb", descriptor = "(II)V", line = 123)
	void method26426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aList10.add(arg1, arg0);
		this.aList11.add(arg1, anInteger1);
		@Pc(14) ArrayList local14 = new ArrayList();
		for (@Pc(16) int local16 = 0; local16 < this.aList12.size(); local16++) {
			local14.add(null);
		}
		this.aList13.add(arg1, local14);
	}

	@OriginalMember(owner = "client!fy", name = "by", descriptor = "(I)V", line = 131)
	public void method26427(@OriginalArg(0) int arg0) {
		this.method26432(arg0, -525952582);
		@Pc(5) int local5 = arg0;
		for (@Pc(7) int local7 = arg0; local7 < this.aList10.size(); local7++) {
			if (!this.method26401(local7, 1147325028)) {
				if (local7 != local5) {
					this.method26418(local7, local5, -1931481788);
				}
				local5 = local7 + 1;
			}
		}
	}

	@OriginalMember(owner = "client!fy", name = "q", descriptor = "(II)V", line = 131)
	public void method26428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method26432(arg0, 820726769);
		@Pc(5) int local5 = arg0;
		for (@Pc(7) int local7 = arg0; local7 < this.aList10.size(); local7++) {
			if (!this.method26401(local7, -1180704314)) {
				if (local7 != local5) {
					this.method26418(local7, local5, -1931481788);
				}
				local5 = local7 + 1;
			}
		}
	}

	@OriginalMember(owner = "client!fy", name = "bu", descriptor = "(I)V", line = 131)
	public void method26429(@OriginalArg(0) int arg0) {
		this.method26432(arg0, 1350824717);
		@Pc(5) int local5 = arg0;
		for (@Pc(7) int local7 = arg0; local7 < this.aList10.size(); local7++) {
			if (!this.method26401(local7, -1960117609)) {
				if (local7 != local5) {
					this.method26418(local7, local5, -1931481788);
				}
				local5 = local7 + 1;
			}
		}
	}

	@OriginalMember(owner = "client!fy", name = "be", descriptor = "(I)V", line = 131)
	public void method26430(@OriginalArg(0) int arg0) {
		this.method26432(arg0, -1265046712);
		@Pc(5) int local5 = arg0;
		for (@Pc(7) int local7 = arg0; local7 < this.aList10.size(); local7++) {
			if (!this.method26401(local7, 1739973156)) {
				if (local7 != local5) {
					this.method26418(local7, local5, -1931481788);
				}
				local5 = local7 + 1;
			}
		}
	}

	@OriginalMember(owner = "client!fy", name = "bo", descriptor = "(I)V", line = 142)
	void method26431(@OriginalArg(0) int arg0) {
		this.aList10.remove(arg0);
		this.aList11.remove(arg0);
		this.aList13.remove(arg0);
	}

	@OriginalMember(owner = "client!fy", name = "x", descriptor = "(II)V", line = 142)
	void method26432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aList10.remove(arg0);
		this.aList11.remove(arg0);
		this.aList13.remove(arg0);
	}

	@OriginalMember(owner = "client!fy", name = "bz", descriptor = "(I)V", line = 142)
	void method26433(@OriginalArg(0) int arg0) {
		this.aList10.remove(arg0);
		this.aList11.remove(arg0);
		this.aList13.remove(arg0);
	}

	@OriginalMember(owner = "client!fy", name = "bw", descriptor = "(I)V", line = 142)
	void method26434(@OriginalArg(0) int arg0) {
		this.aList10.remove(arg0);
		this.aList11.remove(arg0);
		this.aList13.remove(arg0);
	}

	@OriginalMember(owner = "client!fy", name = "br", descriptor = "(II)V", line = 148)
	public void method26435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aList12.add(arg1, this.aList12.remove(arg0));
		@Pc(11) Iterator local11 = this.aList13.iterator();
		while (local11.hasNext()) {
			@Pc(18) List local18 = (List) local11.next();
			local18.add(arg1, local18.remove(arg0));
		}
	}

	@OriginalMember(owner = "client!fy", name = "bv", descriptor = "(II)V", line = 148)
	public void method26436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aList12.add(arg1, this.aList12.remove(arg0));
		@Pc(11) Iterator local11 = this.aList13.iterator();
		while (local11.hasNext()) {
			@Pc(18) List local18 = (List) local11.next();
			local18.add(arg1, local18.remove(arg0));
		}
	}

	@OriginalMember(owner = "client!fy", name = "b", descriptor = "(III)V", line = 148)
	public void method26437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aList12.add(arg1, this.aList12.remove(arg0));
		@Pc(11) Iterator local11 = this.aList13.iterator();
		while (local11.hasNext()) {
			@Pc(18) List local18 = (List) local11.next();
			local18.add(arg1, local18.remove(arg0));
		}
	}

	@OriginalMember(owner = "client!fy", name = "h", descriptor = "(IIB)Ljava/lang/Object;", line = 158)
	public Object method26438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		return ((List) this.aList13.get(arg0)).get(arg1);
	}

	@OriginalMember(owner = "client!fy", name = "ba", descriptor = "(II)Ljava/lang/Object;", line = 158)
	public Object method26439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return ((List) this.aList13.get(arg0)).get(arg1);
	}

	@OriginalMember(owner = "client!fy", name = "bp", descriptor = "(II)Ljava/lang/Object;", line = 158)
	public Object method26440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return ((List) this.aList13.get(arg0)).get(arg1);
	}

	@OriginalMember(owner = "client!fy", name = "bj", descriptor = "(II)Ljava/lang/Object;", line = 158)
	public Object method26441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return ((List) this.aList13.get(arg0)).get(arg1);
	}

	@OriginalMember(owner = "client!fy", name = "bg", descriptor = "(II)Ljava/lang/Object;", line = 158)
	public Object method26442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return ((List) this.aList13.get(arg0)).get(arg1);
	}

	@OriginalMember(owner = "client!fy", name = "a", descriptor = "(IILjava/lang/Object;I)V", line = 162)
	public void method26443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3) {
		((List) this.aList13.get(arg0)).set(arg1, arg2);
	}

	@OriginalMember(owner = "client!fy", name = "bs", descriptor = "(IILjava/lang/Object;)V", line = 162)
	public void method26444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2) {
		((List) this.aList13.get(arg0)).set(arg1, arg2);
	}

	@OriginalMember(owner = "client!fy", name = "cl", descriptor = "(IILjava/lang/Object;)V", line = 162)
	public void method26445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2) {
		((List) this.aList13.get(arg0)).set(arg1, arg2);
	}

	@OriginalMember(owner = "client!fy", name = "cg", descriptor = "(IILjava/lang/Object;)V", line = 162)
	public void method26446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2) {
		((List) this.aList13.get(arg0)).set(arg1, arg2);
	}

	@OriginalMember(owner = "client!fy", name = "eh", descriptor = "(II)V", line = 882)
	public static void method26447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class355 local5 = (Class355) Class159_Sub1.aHashMap4.get(arg0);
		if (local5 == null) {
			local5 = new Class355();
		}
		local5.anInt4218 = Class159_Sub1.anInt1944 * -1043952585;
		local5.anInt4217 = Class159_Sub1.anInt1955 * -1400884413;
		Class159_Sub1.aHashMap4.put(arg0, local5);
	}

	@OriginalMember(owner = "client!fy", name = "ic", descriptor = "(IB)V", line = 9614)
	static final void method26448(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(2) PacketBit local2 = client.aClass175_2.aPacketBit_2;
		while (local2.bitsAvailable(client.aClass175_2.length * 2010044839, 1313572448) >= 15) {
			@Pc(17) int local17 = local2.gBit(15, 1227115599);
			if (local17 == 32767) {
				break;
			}
			@Pc(23) boolean local23 = false;
			@Pc(29) Class93_Sub15 local29 = (Class93_Sub15) client.aClass16_18.method214((long) local17);
			@Pc(38) Class132_Sub1_Sub1_Sub1_Sub1 local38;
			if (local29 == null) {
				local38 = new Class132_Sub1_Sub1_Sub1_Sub1(client.aClass532_1.method30481(-2038432393));
				local38.anInt2768 = local17 * 171759809;
				local29 = new Class93_Sub15(local38);
				client.aClass16_18.method220(local29, (long) local17);
				client.aClass93_Sub15Array1[(client.anInt3488 += 436180911) * -1814159537 - 1] = local29;
				local23 = true;
			}
			local38 = (Class132_Sub1_Sub1_Sub1_Sub1) local29.anObject5;
			client.anIntArray323[(client.anInt3540 += 2039022169) * 568731113 - 1] = local17;
			local38.anInt2786 = client.anInt3445 * 848722373;
			if (local38.aClass336_1 != null && local38.aClass336_1.method27441((short) 12466)) {
				Class665.method32891(local38, 846198857);
			}
			@Pc(105) int local105 = local2.gBit(2, -833157368);
			@Pc(110) int local110 = local2.gBit(arg0, -833088547);
			if (local110 > (0x1 << arg0 - 1) - 1) {
				local110 -= 0x1 << arg0;
			}
			@Pc(130) int local130 = local2.gBit(1, 311787348);
			if (local130 == 1) {
				client.anIntArray306[(client.anInt3472 += -170330519) * 146012633 - 1] = local17;
			}
			local38.method18594((Class336) Class162.aClass32_Sub3_2.method18261(local2.gBit(15, -1414174684), 1358140749), 484412968);
			@Pc(161) int local161 = local2.gBit(1, -1125559557);
			@Pc(172) int local172 = local2.gBit(3, 1297161788) + 4 << 11 & 0x3FFF;
			@Pc(177) int local177 = local2.gBit(arg0, 59162484);
			if (local177 > (0x1 << arg0 - 1) - 1) {
				local177 -= 0x1 << arg0;
			}
			local38.method19980(local38.aClass336_1.anInt4154 * 447008399, -2142170693);
			local38.anInt2788 = (local38.aClass336_1.anInt4165 * 295553787 << 3) * 723489705;
			if (local23) {
				local38.method19953(local172, true, 1006106775);
			}
			local38.method18606(local105, Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray240[0] + local177, Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray239[0] + local110, local161 == 1, local38.method19986(-1066476941), (byte) -95);
			if (local38.aClass336_1.method27441((short) -2741)) {
				Class643.method32582(local38.aByte100, local38.anIntArray240[0], local38.anIntArray239[0], 0, null, local38, null, 694869299);
			}
			if (local23) {
				local38.method18588((byte) 0);
			}
		}
		local2.accessBytes(-1653671445);
	}

	@OriginalMember(owner = "client!fy", name = "avj", descriptor = "(Lclient!yf;I)V", line = 13469)
	static final void method26449(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}
}
