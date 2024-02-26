package com.jagex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public final class Class273 {

	@OriginalMember(owner = "client!fs", name = "t", descriptor = "I")
	static final int anInt3919 = 40;

	@OriginalMember(owner = "client!fs", name = "f", descriptor = "I")
	static final int anInt3921 = 8;

	@OriginalMember(owner = "client!fs", name = "aw", descriptor = "I")
	public static int anInt3922;

	@OriginalMember(owner = "client!fs", name = "e", descriptor = "Ljava/lang/Integer;")
	static final Integer anInteger1 = -1;

	@OriginalMember(owner = "client!fs", name = "u", descriptor = "I")
	public final int anInt3920;

	@OriginalMember(owner = "client!fs", name = "l", descriptor = "Ljava/util/List;")
	final List aList11;

	@OriginalMember(owner = "client!fs", name = "g", descriptor = "Ljava/util/List;")
	final List aList10;

	@OriginalMember(owner = "client!fs", name = "i", descriptor = "Ljava/util/List;")
	final List aList9;

	@OriginalMember(owner = "client!fs", name = "m", descriptor = "Ljava/util/List;")
	final List aList12;

	@OriginalMember(owner = "client!fs", name = "i", descriptor = "(IB)I")
	static int method26774(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return arg0 == 16711935 ? -1 : Class651.method33130(arg0, 1992465224);
	}

	@OriginalMember(owner = "client!fs", name = "yz", descriptor = "(Lclient!yp;I)V")
	static void method26775(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class601.method32105(Class709.method37153(1255975308), arg0, (byte) 3);
	}

	@OriginalMember(owner = "client!fs", name = "auq", descriptor = "(Lclient!yp;B)V")
	static void method26776(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub11_1.method16040((byte) 8);
	}

	@OriginalMember(owner = "client!fs", name = "avj", descriptor = "(Lclient!yp;I)V")
	static void method26777(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		client.aShort156 = (short) arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		if (client.aShort156 <= 0) {
			client.aShort156 = 256;
		}
		client.aShort157 = (short) arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		if (client.aShort157 <= 0) {
			client.aShort157 = 205;
		}
	}

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(I)V")
	public Class273(@OriginalArg(0) int arg0) {
		this.anInt3920 = arg0 * 500258701;
		this.aList11 = new ArrayList();
		this.aList10 = new ArrayList();
		this.aList9 = new ArrayList();
		this.aList12 = new ArrayList();
	}

	@OriginalMember(owner = "client!fs", name = "as", descriptor = "(II)I")
	public int method26713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aList10.size() == 40) {
			throw new RuntimeException("");
		} else if (this.method26716(arg0, 812643644) == -1) {
			if (arg1 == -1) {
				arg1 = this.aList10.size();
			}
			this.method26758(arg0, arg1, 941560199);
			for (@Pc(36) int local36 = arg1 + 1; local36 < this.aList10.size(); local36++) {
				@Pc(47) Integer local47 = (Integer) this.aList9.get(local36);
				if (!local47.equals(anInteger1) && local47 < local36) {
					this.method26729(local36, local36 - 1, (byte) 95);
				}
			}
			return this.method26716(arg0, 812643644);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!fs", name = "t", descriptor = "(B)I")
	public int method26714(@OriginalArg(0) byte arg0) {
		return this.aList11.size();
	}

	@OriginalMember(owner = "client!fs", name = "at", descriptor = "(I)I")
	public int method26715(@OriginalArg(0) int arg0) {
		return this.method26728(arg0, -1, 960226777);
	}

	@OriginalMember(owner = "client!fs", name = "e", descriptor = "(II)I")
	public int method26716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aList10.indexOf(arg0);
	}

	@OriginalMember(owner = "client!fs", name = "u", descriptor = "(IB)I")
	public int method26717(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return (Integer) this.aList10.get(arg0);
	}

	@OriginalMember(owner = "client!fs", name = "l", descriptor = "(II)I")
	public int method26718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aList11.indexOf(arg0);
	}

	@OriginalMember(owner = "client!fs", name = "g", descriptor = "(II)I")
	public int method26719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Integer) this.aList11.get(arg0);
	}

	@OriginalMember(owner = "client!fs", name = "ay", descriptor = "(I)I")
	public int method26720(@OriginalArg(0) int arg0) {
		return this.aList11.indexOf(arg0);
	}

	@OriginalMember(owner = "client!fs", name = "f", descriptor = "(I)I")
	public int method26721(@OriginalArg(0) int arg0) {
		return this.aList10.size();
	}

	@OriginalMember(owner = "client!fs", name = "o", descriptor = "(IIB)V")
	public void method26722(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		this.aList9.set(arg0, arg1);
	}

	@OriginalMember(owner = "client!fs", name = "j", descriptor = "(II)Z")
	public boolean method26723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return !((Integer) this.aList9.get(arg0)).equals(anInteger1);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(III)I")
	public int method26724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aList11.size() == 8) {
			throw new RuntimeException("");
		} else if (this.method26718(arg0, -1702559601) == -1) {
			if (arg1 == -1) {
				arg1 = this.aList11.size();
			}
			this.aList11.add(arg1, arg0);
			@Pc(37) Iterator local37 = this.aList12.iterator();
			while (local37.hasNext()) {
				@Pc(44) List local44 = (List) local37.next();
				local44.add(arg1, null);
			}
			return arg1;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!fs", name = "k", descriptor = "(II)I")
	public int method26725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method26728(arg0, -1, 2034337554);
	}

	@OriginalMember(owner = "client!fs", name = "ac", descriptor = "(I)I")
	public int method26726(@OriginalArg(0) int arg0) {
		return this.method26724(arg0, -1, 1845523688);
	}

	@OriginalMember(owner = "client!fs", name = "x", descriptor = "(IIS)V")
	public void method26727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2) {
		this.method26729(arg0, arg1, (byte) 67);
		for (@Pc(6) int local6 = 0; local6 < this.aList9.size(); local6++) {
			@Pc(17) Integer local17 = (Integer) this.aList9.get(local6);
			if (!local17.equals(anInteger1)) {
				@Pc(25) Integer local25 = local6;
				if (!local17.equals(local25)) {
					this.aList9.set(local6, local25);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fs", name = "r", descriptor = "(III)I")
	public int method26728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aList10.size() == 40) {
			throw new RuntimeException("");
		} else if (this.method26716(arg0, 812643644) == -1) {
			if (arg1 == -1) {
				arg1 = this.aList10.size();
			}
			this.method26758(arg0, arg1, 941560199);
			for (@Pc(36) int local36 = arg1 + 1; local36 < this.aList10.size(); local36++) {
				@Pc(47) Integer local47 = (Integer) this.aList9.get(local36);
				if (!local47.equals(anInteger1) && local47 < local36) {
					this.method26729(local36, local36 - 1, (byte) 63);
				}
			}
			return this.method26716(arg0, 812643644);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!fs", name = "w", descriptor = "(IIB)V")
	void method26729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		this.aList10.add(arg1, this.aList10.remove(arg0));
		this.aList9.add(arg1, this.aList9.remove(arg0));
		this.aList12.add(arg1, this.aList12.remove(arg0));
	}

	@OriginalMember(owner = "client!fs", name = "h", descriptor = "(II)V")
	public void method26730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method26731(arg0, (byte) 35);
		@Pc(5) int local5 = arg0;
		for (@Pc(7) int local7 = arg0; local7 < this.aList10.size(); local7++) {
			if (!this.method26723(local7, 927112518)) {
				if (local5 != local7) {
					this.method26729(local7, local5, (byte) 123);
				}
				local5 = local7 + 1;
			}
		}
	}

	@OriginalMember(owner = "client!fs", name = "d", descriptor = "(IB)V")
	void method26731(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aList10.remove(arg0);
		this.aList9.remove(arg0);
		this.aList12.remove(arg0);
	}

	@OriginalMember(owner = "client!fs", name = "z", descriptor = "(III)V")
	public void method26732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aList11.add(arg1, this.aList11.remove(arg0));
		@Pc(11) Iterator local11 = this.aList12.iterator();
		while (local11.hasNext()) {
			@Pc(18) List local18 = (List) local11.next();
			local18.add(arg1, local18.remove(arg0));
		}
	}

	@OriginalMember(owner = "client!fs", name = "ah", descriptor = "(IZ)V")
	public void method26733(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aList9.set(arg0, arg1 ? arg0 : anInteger1);
	}

	@OriginalMember(owner = "client!fs", name = "v", descriptor = "(IILjava/lang/Object;I)V")
	public void method26734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3) {
		((List) this.aList12.get(arg0)).set(arg1, arg2);
	}

	@OriginalMember(owner = "client!fs", name = "y", descriptor = "()I")
	public int method26735() {
		return this.aList10.size();
	}

	@OriginalMember(owner = "client!fs", name = "n", descriptor = "(I)I")
	public int method26736(@OriginalArg(0) int arg0) {
		return this.aList10.indexOf(arg0);
	}

	@OriginalMember(owner = "client!fs", name = "m", descriptor = "(IZI)V")
	public void method26737(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aList9.set(arg0, arg1 ? arg0 : anInteger1);
	}

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "(I)I")
	public int method26738(@OriginalArg(0) int arg0) {
		return this.aList10.indexOf(arg0);
	}

	@OriginalMember(owner = "client!fs", name = "bt", descriptor = "(II)V")
	public void method26739(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aList11.add(arg1, this.aList11.remove(arg0));
		@Pc(11) Iterator local11 = this.aList12.iterator();
		while (local11.hasNext()) {
			@Pc(18) List local18 = (List) local11.next();
			local18.add(arg1, local18.remove(arg0));
		}
	}

	@OriginalMember(owner = "client!fs", name = "ax", descriptor = "(I)I")
	public int method26740(@OriginalArg(0) int arg0) {
		return (Integer) this.aList10.get(arg0);
	}

	@OriginalMember(owner = "client!fs", name = "p", descriptor = "(III)Ljava/lang/Object;")
	public Object method26741(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return ((List) this.aList12.get(arg0)).get(arg1);
	}

	@OriginalMember(owner = "client!fs", name = "ai", descriptor = "(I)I")
	public int method26742(@OriginalArg(0) int arg0) {
		return this.aList11.indexOf(arg0);
	}

	@OriginalMember(owner = "client!fs", name = "aq", descriptor = "(I)I")
	public int method26743(@OriginalArg(0) int arg0) {
		return (Integer) this.aList11.get(arg0);
	}

	@OriginalMember(owner = "client!fs", name = "ao", descriptor = "(I)I")
	public int method26744(@OriginalArg(0) int arg0) {
		return (Integer) this.aList11.get(arg0);
	}

	@OriginalMember(owner = "client!fs", name = "aj", descriptor = "(I)I")
	public int method26745(@OriginalArg(0) int arg0) {
		return this.method26724(arg0, -1, 764075483);
	}

	@OriginalMember(owner = "client!fs", name = "ar", descriptor = "(II)I")
	public int method26746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aList10.size() == 40) {
			throw new RuntimeException("");
		} else if (this.method26716(arg0, 812643644) == -1) {
			if (arg1 == -1) {
				arg1 = this.aList10.size();
			}
			this.method26758(arg0, arg1, 941560199);
			for (@Pc(36) int local36 = arg1 + 1; local36 < this.aList10.size(); local36++) {
				@Pc(47) Integer local47 = (Integer) this.aList9.get(local36);
				if (!local47.equals(anInteger1) && local47 < local36) {
					this.method26729(local36, local36 - 1, (byte) 123);
				}
			}
			return this.method26716(arg0, 812643644);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!fs", name = "ag", descriptor = "(I)I")
	public int method26747(@OriginalArg(0) int arg0) {
		return this.method26724(arg0, -1, 1552799764);
	}

	@OriginalMember(owner = "client!fs", name = "ab", descriptor = "(I)I")
	public int method26748(@OriginalArg(0) int arg0) {
		return this.method26724(arg0, -1, 1156631890);
	}

	@OriginalMember(owner = "client!fs", name = "al", descriptor = "(I)I")
	public int method26749(@OriginalArg(0) int arg0) {
		return this.method26724(arg0, -1, 323430572);
	}

	@OriginalMember(owner = "client!fs", name = "s", descriptor = "(II)V")
	public void method26750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aList11.remove(arg0);
		@Pc(8) Iterator local8 = this.aList12.iterator();
		while (local8.hasNext()) {
			@Pc(15) List local15 = (List) local8.next();
			local15.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!fs", name = "af", descriptor = "(IZ)V")
	public void method26751(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aList9.set(arg0, arg1 ? arg0 : anInteger1);
	}

	@OriginalMember(owner = "client!fs", name = "am", descriptor = "(II)I")
	public int method26752(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aList11.size() == 8) {
			throw new RuntimeException("");
		} else if (this.method26718(arg0, -1702559601) == -1) {
			if (arg1 == -1) {
				arg1 = this.aList11.size();
			}
			this.aList11.add(arg1, arg0);
			@Pc(37) Iterator local37 = this.aList12.iterator();
			while (local37.hasNext()) {
				@Pc(44) List local44 = (List) local37.next();
				local44.add(arg1, null);
			}
			return arg1;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!fs", name = "ak", descriptor = "(I)V")
	public void method26753(@OriginalArg(0) int arg0) {
		this.aList11.remove(arg0);
		@Pc(8) Iterator local8 = this.aList12.iterator();
		while (local8.hasNext()) {
			@Pc(15) List local15 = (List) local8.next();
			local15.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!fs", name = "av", descriptor = "(II)V")
	public void method26754(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method26729(arg0, arg1, (byte) 37);
		for (@Pc(6) int local6 = 0; local6 < this.aList9.size(); local6++) {
			@Pc(17) Integer local17 = (Integer) this.aList9.get(local6);
			if (!local17.equals(anInteger1)) {
				@Pc(25) Integer local25 = local6;
				if (!local17.equals(local25)) {
					this.aList9.set(local6, local25);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fs", name = "ad", descriptor = "(II)V")
	public void method26755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method26729(arg0, arg1, (byte) 106);
		for (@Pc(6) int local6 = 0; local6 < this.aList9.size(); local6++) {
			@Pc(17) Integer local17 = (Integer) this.aList9.get(local6);
			if (!local17.equals(anInteger1)) {
				@Pc(25) Integer local25 = local6;
				if (!local17.equals(local25)) {
					this.aList9.set(local6, local25);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fs", name = "aa", descriptor = "(II)V")
	public void method26756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method26729(arg0, arg1, (byte) 56);
		for (@Pc(6) int local6 = 0; local6 < this.aList9.size(); local6++) {
			@Pc(17) Integer local17 = (Integer) this.aList9.get(local6);
			if (!local17.equals(anInteger1)) {
				@Pc(25) Integer local25 = local6;
				if (!local17.equals(local25)) {
					this.aList9.set(local6, local25);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fs", name = "an", descriptor = "(II)V")
	public void method26757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method26729(arg0, arg1, (byte) 49);
		for (@Pc(6) int local6 = 0; local6 < this.aList9.size(); local6++) {
			@Pc(17) Integer local17 = (Integer) this.aList9.get(local6);
			if (!local17.equals(anInteger1)) {
				@Pc(25) Integer local25 = local6;
				if (!local17.equals(local25)) {
					this.aList9.set(local6, local25);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fs", name = "q", descriptor = "(III)V")
	void method26758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aList10.add(arg1, arg0);
		this.aList9.add(arg1, anInteger1);
		@Pc(14) ArrayList local14 = new ArrayList();
		for (@Pc(16) int local16 = 0; local16 < this.aList11.size(); local16++) {
			local14.add(null);
		}
		this.aList12.add(arg1, local14);
	}

	@OriginalMember(owner = "client!fs", name = "ae", descriptor = "(II)V")
	void method26759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aList10.add(arg1, this.aList10.remove(arg0));
		this.aList9.add(arg1, this.aList9.remove(arg0));
		this.aList12.add(arg1, this.aList12.remove(arg0));
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(I)I")
	public int method26760(@OriginalArg(0) int arg0) {
		return (Integer) this.aList10.get(arg0);
	}

	@OriginalMember(owner = "client!fs", name = "au", descriptor = "(II)I")
	public int method26761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aList10.size() == 40) {
			throw new RuntimeException("");
		} else if (this.method26716(arg0, 812643644) == -1) {
			if (arg1 == -1) {
				arg1 = this.aList10.size();
			}
			this.method26758(arg0, arg1, 941560199);
			for (@Pc(36) int local36 = arg1 + 1; local36 < this.aList10.size(); local36++) {
				@Pc(47) Integer local47 = (Integer) this.aList9.get(local36);
				if (!local47.equals(anInteger1) && local47 < local36) {
					this.method26729(local36, local36 - 1, (byte) 98);
				}
			}
			return this.method26716(arg0, 812643644);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!fs", name = "az", descriptor = "(II)I")
	public int method26762(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aList10.size() == 40) {
			throw new RuntimeException("");
		} else if (this.method26716(arg0, 812643644) == -1) {
			if (arg1 == -1) {
				arg1 = this.aList10.size();
			}
			this.method26758(arg0, arg1, 941560199);
			for (@Pc(36) int local36 = arg1 + 1; local36 < this.aList10.size(); local36++) {
				@Pc(47) Integer local47 = (Integer) this.aList9.get(local36);
				if (!local47.equals(anInteger1) && local47 < local36) {
					this.method26729(local36, local36 - 1, (byte) 111);
				}
			}
			return this.method26716(arg0, 812643644);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!fs", name = "i", descriptor = "(II)I")
	public int method26763(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method26724(arg0, -1, 1406778816);
	}

	@OriginalMember(owner = "client!fs", name = "aw", descriptor = "(II)V")
	void method26764(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aList10.add(arg1, arg0);
		this.aList9.add(arg1, anInteger1);
		@Pc(14) ArrayList local14 = new ArrayList();
		for (@Pc(16) int local16 = 0; local16 < this.aList11.size(); local16++) {
			local14.add(null);
		}
		this.aList12.add(arg1, local14);
	}

	@OriginalMember(owner = "client!fs", name = "bg", descriptor = "(II)V")
	void method26765(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aList10.add(arg1, arg0);
		this.aList9.add(arg1, anInteger1);
		@Pc(14) ArrayList local14 = new ArrayList();
		for (@Pc(16) int local16 = 0; local16 < this.aList11.size(); local16++) {
			local14.add(null);
		}
		this.aList12.add(arg1, local14);
	}

	@OriginalMember(owner = "client!fs", name = "bl", descriptor = "(I)V")
	void method26766(@OriginalArg(0) int arg0) {
		this.aList10.remove(arg0);
		this.aList9.remove(arg0);
		this.aList12.remove(arg0);
	}

	@OriginalMember(owner = "client!fs", name = "br", descriptor = "(I)V")
	void method26767(@OriginalArg(0) int arg0) {
		this.aList10.remove(arg0);
		this.aList9.remove(arg0);
		this.aList12.remove(arg0);
	}

	@OriginalMember(owner = "client!fs", name = "bn", descriptor = "(I)V")
	void method26768(@OriginalArg(0) int arg0) {
		this.aList10.remove(arg0);
		this.aList9.remove(arg0);
		this.aList12.remove(arg0);
	}

	@OriginalMember(owner = "client!fs", name = "ba", descriptor = "(II)V")
	public void method26769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aList11.add(arg1, this.aList11.remove(arg0));
		@Pc(11) Iterator local11 = this.aList12.iterator();
		while (local11.hasNext()) {
			@Pc(18) List local18 = (List) local11.next();
			local18.add(arg1, local18.remove(arg0));
		}
	}

	@OriginalMember(owner = "client!fs", name = "ap", descriptor = "(II)I")
	public int method26770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aList10.size() == 40) {
			throw new RuntimeException("");
		} else if (this.method26716(arg0, 812643644) == -1) {
			if (arg1 == -1) {
				arg1 = this.aList10.size();
			}
			this.method26758(arg0, arg1, 941560199);
			for (@Pc(36) int local36 = arg1 + 1; local36 < this.aList10.size(); local36++) {
				@Pc(47) Integer local47 = (Integer) this.aList9.get(local36);
				if (!local47.equals(anInteger1) && local47 < local36) {
					this.method26729(local36, local36 - 1, (byte) 13);
				}
			}
			return this.method26716(arg0, 812643644);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!fs", name = "bs", descriptor = "(II)Ljava/lang/Object;")
	public Object method26771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return ((List) this.aList12.get(arg0)).get(arg1);
	}

	@OriginalMember(owner = "client!fs", name = "bj", descriptor = "(II)Ljava/lang/Object;")
	public Object method26772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return ((List) this.aList12.get(arg0)).get(arg1);
	}

	@OriginalMember(owner = "client!fs", name = "by", descriptor = "(IILjava/lang/Object;)V")
	public void method26773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2) {
		((List) this.aList12.get(arg0)).set(arg1, arg2);
	}
}
