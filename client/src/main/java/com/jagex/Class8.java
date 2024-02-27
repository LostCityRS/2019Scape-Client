package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.Collection;
import java.util.Iterator;

@OriginalClass("client!aag")
public final class Class8 implements Iterable, Collection {

	@OriginalMember(owner = "client!aag", name = "d", descriptor = "Lclient!ed;")
	public static Class104 aClass104_1;

	@OriginalMember(owner = "client!aag", name = "s", descriptor = "I")
	static int anInt17;

	@OriginalMember(owner = "client!aag", name = "f", descriptor = "Lclient!tn;")
	Class80 aClass80_4;

	@OriginalMember(owner = "client!aag", name = "t", descriptor = "Lclient!tn;")
	public Class80 aClass80_3 = new Class80();

	@OriginalMember(owner = "client!aag", name = "al", descriptor = "(Lclient!tn;Lclient!tn;)V")
	public static void method267(@OriginalArg(0) Class80 arg0, @OriginalArg(1) Class80 arg1) {
		if (arg0.aClass80_228 != null) {
			arg0.method24395((byte) 4);
		}
		arg0.aClass80_228 = arg1.aClass80_228;
		arg0.aClass80_227 = arg1;
		arg0.aClass80_228.aClass80_227 = arg0;
		arg0.aClass80_227.aClass80_228 = arg0;
	}

	@OriginalMember(owner = "client!aag", name = "yx", descriptor = "(Lclient!yp;I)V")
	static void method312(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.anInt3532 * 1713995257;
	}

	@OriginalMember(owner = "client!aag", name = "anl", descriptor = "(Lclient!yp;I)V")
	static void method313(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class80_Sub33 local13 = (Class80_Sub33) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		if (BufferedSocket.aClass121_Sub1_2.method9607(-449912154) != Class340.aClass340_5) {
			throw new RuntimeException();
		}
		@Pc(27) Class123_Sub1 local27 = (Class123_Sub1) BufferedSocket.aClass121_Sub1_2.method9603(-1577450079);
		local27.method9811(local13, -561681627);
		client.aBoolean726 = true;
	}

	@OriginalMember(owner = "client!aag", name = "bd", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method314(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		arg2.anInt5778 -= -442943724;
		arg0.anInt4099 = arg2.anIntArray525[arg2.anInt5778 * 1896589581] * 1739295105;
		arg0.anInt4161 = arg2.anIntArray525[arg2.anInt5778 * 1896589581 + 1] * 1695333709;
		arg0.anInt4132 = 0;
		arg0.anInt4133 = 0;
		@Pc(45) int local45 = arg2.anIntArray525[arg2.anInt5778 * 1896589581 + 2];
		if (local45 < 0) {
			local45 = 0;
		} else if (local45 > 4) {
			local45 = 4;
		}
		@Pc(65) int local65 = arg2.anIntArray525[arg2.anInt5778 * 1896589581 + 3];
		if (local65 < 0) {
			local65 = 0;
		} else if (local65 > 4) {
			local65 = 4;
		}
		arg0.aByte127 = (byte) local45;
		arg0.aByte126 = (byte) local65;
		Class296.method26998(arg0, -1841605902);
		Class122_Sub2.method10326(arg1, arg0, -124827234);
		if (arg0.anInt4135 * 710314345 == 0) {
			Class388.method28636(arg1, arg0, false, (byte) 8);
		}
	}

	@OriginalMember(owner = "client!aag", name = "<init>", descriptor = "()V")
	public Class8() {
		this.aClass80_3.aClass80_227 = this.aClass80_3;
		this.aClass80_3.aClass80_228 = this.aClass80_3;
	}

	@OriginalMember(owner = "client!aag", name = "bt", descriptor = "()I")
	public int method230() {
		return this.method239((byte) -126);
	}

	@OriginalMember(owner = "client!aag", name = "l", descriptor = "(Lclient!aag;Lclient!tn;B)V")
	void method231(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class80 arg1, @OriginalArg(2) byte arg2) {
		@Pc(3) Class80 local3 = this.aClass80_3.aClass80_228;
		this.aClass80_3.aClass80_228 = arg1.aClass80_228;
		arg1.aClass80_228.aClass80_227 = this.aClass80_3;
		if (this.aClass80_3 != arg1) {
			arg1.aClass80_228 = arg0.aClass80_3.aClass80_228;
			arg1.aClass80_228.aClass80_227 = arg1;
			local3.aClass80_227 = arg0.aClass80_3;
			arg0.aClass80_3.aClass80_228 = local3;
		}
	}

	@OriginalMember(owner = "client!aag", name = "f", descriptor = "(Lclient!tn;I)V")
	public void method232(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1) {
		if (arg0.aClass80_228 != null) {
			arg0.method24395((byte) 84);
		}
		arg0.aClass80_228 = this.aClass80_3.aClass80_228;
		arg0.aClass80_227 = this.aClass80_3;
		arg0.aClass80_228.aClass80_227 = arg0;
		arg0.aClass80_227.aClass80_228 = arg0;
	}

	@OriginalMember(owner = "client!aag", name = "u", descriptor = "(I)Lclient!tn;")
	public Class80 method233(@OriginalArg(0) int arg0) {
		@Pc(3) Class80 local3 = this.aClass80_3.aClass80_227;
		if (this.aClass80_3 == local3) {
			return null;
		} else {
			local3.method24395((byte) 118);
			return local3;
		}
	}

	@OriginalMember(owner = "client!aag", name = "remove", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean remove(@OriginalArg(0) Object arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!aag", name = "p", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method234(@OriginalArg(0) Object arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!aag", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!aag", name = "s", descriptor = "(I)Lclient!tn;")
	public Class80 method235(@OriginalArg(0) int arg0) {
		return this.method256(null, (byte) 86);
	}

	@OriginalMember(owner = "client!aag", name = "bp", descriptor = "(Ljava/util/Collection;)Z")
	public boolean method236(@OriginalArg(0) Collection arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!aag", name = "x", descriptor = "(I)Lclient!tn;")
	public Class80 method237(@OriginalArg(0) int arg0) {
		@Pc(2) Class80 local2 = this.aClass80_4;
		if (this.aClass80_3 == local2) {
			this.aClass80_4 = null;
			return null;
		} else {
			this.aClass80_4 = local2.aClass80_227;
			return local2;
		}
	}

	@OriginalMember(owner = "client!aag", name = "w", descriptor = "(B)Lclient!tn;")
	public Class80 method238(@OriginalArg(0) byte arg0) {
		@Pc(2) Class80 local2 = this.aClass80_4;
		if (this.aClass80_3 == local2) {
			this.aClass80_4 = null;
			return null;
		} else {
			this.aClass80_4 = local2.aClass80_228;
			return local2;
		}
	}

	@OriginalMember(owner = "client!aag", name = "r", descriptor = "(B)I")
	public int method239(@OriginalArg(0) byte arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class80 local5 = this.aClass80_3.aClass80_227; local5 != this.aClass80_3; local5 = local5.aClass80_227) {
			local1++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!aag", name = "q", descriptor = "(I)Z")
	public boolean method240(@OriginalArg(0) int arg0) {
		return this.aClass80_3 == this.aClass80_3.aClass80_227;
	}

	@OriginalMember(owner = "client!aag", name = "h", descriptor = "(I)[Lclient!tn;")
	Class80[] method241(@OriginalArg(0) int arg0) {
		@Pc(4) Class80[] local4 = new Class80[this.method239((byte) -8)];
		@Pc(6) int local6 = 0;
		for (@Pc(10) Class80 local10 = this.aClass80_3.aClass80_227; local10 != this.aClass80_3; local10 = local10.aClass80_227) {
			local4[local6++] = local10;
		}
		return local4;
	}

	@OriginalMember(owner = "client!aag", name = "ag", descriptor = "(Lclient!tn;)V")
	public void method242(@OriginalArg(0) Class80 arg0) {
		if (arg0.aClass80_228 != null) {
			arg0.method24395((byte) 19);
		}
		arg0.aClass80_228 = this.aClass80_3.aClass80_228;
		arg0.aClass80_227 = this.aClass80_3;
		arg0.aClass80_228.aClass80_227 = arg0;
		arg0.aClass80_227.aClass80_228 = arg0;
	}

	@OriginalMember(owner = "client!aag", name = "size", descriptor = "()I")
	@Override
	public int size() {
		return this.method239((byte) -43);
	}

	@OriginalMember(owner = "client!aag", name = "isEmpty", descriptor = "()Z")
	@Override
	public boolean isEmpty() {
		return this.method240(385416355);
	}

	@OriginalMember(owner = "client!aag", name = "contains", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean contains(@OriginalArg(0) Object arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!aag", name = "toArray", descriptor = "()[Ljava/lang/Object;")
	@Override
	public Object[] toArray() {
		return this.method241(-1056201112);
	}

	@OriginalMember(owner = "client!aag", name = "toArray", descriptor = "([Ljava/lang/Object;)[Ljava/lang/Object;")
	@Override
	public Object[] toArray(@OriginalArg(0) Object[] arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class80 local5 = this.aClass80_3.aClass80_227; local5 != this.aClass80_3; local5 = local5.aClass80_227) {
			arg0[local1++] = local5;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!aag", name = "d", descriptor = "(Lclient!tn;B)Z")
	boolean method243(@OriginalArg(0) Class80 arg0, @OriginalArg(1) byte arg1) {
		this.method232(arg0, 2007305875);
		return true;
	}

	@OriginalMember(owner = "client!aag", name = "ay", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method244(@OriginalArg(0) Object arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!aag", name = "containsAll", descriptor = "(Ljava/util/Collection;)Z")
	@Override
	public boolean containsAll(@OriginalArg(0) Collection arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!aag", name = "addAll", descriptor = "(Ljava/util/Collection;)Z")
	@Override
	public boolean addAll(@OriginalArg(0) Collection arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!aag", name = "removeAll", descriptor = "(Ljava/util/Collection;)Z")
	@Override
	public boolean removeAll(@OriginalArg(0) Collection arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!aag", name = "retainAll", descriptor = "(Ljava/util/Collection;)Z")
	@Override
	public boolean retainAll(@OriginalArg(0) Collection arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!aag", name = "c", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method245(@OriginalArg(0) Object arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!aag", name = "add", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean add(@OriginalArg(0) Object arg0) {
		return this.method243((Class80) arg0, (byte) 16);
	}

	@OriginalMember(owner = "client!aag", name = "z", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method246(@OriginalArg(0) Object arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!aag", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@OriginalMember(owner = "client!aag", name = "i", descriptor = "(I)Lclient!tn;")
	public Class80 method247(@OriginalArg(0) int arg0) {
		return this.method288(null, 1902610740);
	}

	@OriginalMember(owner = "client!aag", name = "g", descriptor = "(Lclient!aag;I)V")
	public void method248(@OriginalArg(0) Class8 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass80_3 != this.aClass80_3.aClass80_227) {
			this.method231(arg0, this.aClass80_3.aClass80_227, (byte) 73);
		}
	}

	@OriginalMember(owner = "client!aag", name = "o", descriptor = "()Ljava/util/Iterator;")
	public Iterator method249() {
		return new Class7(this);
	}

	@OriginalMember(owner = "client!aag", name = "j", descriptor = "()Ljava/util/Iterator;")
	public Iterator method250() {
		return new Class7(this);
	}

	@OriginalMember(owner = "client!aag", name = "a", descriptor = "()Ljava/util/Iterator;")
	public Iterator method251() {
		return new Class7(this);
	}

	@OriginalMember(owner = "client!aag", name = "av", descriptor = "(Lclient!tn;)Lclient!tn;")
	Class80 method252(@OriginalArg(0) Class80 arg0) {
		@Pc(5) Class80 local5;
		if (arg0 == null) {
			local5 = this.aClass80_3.aClass80_227;
		} else {
			local5 = arg0;
		}
		if (this.aClass80_3 == local5) {
			this.aClass80_4 = null;
			return null;
		} else {
			this.aClass80_4 = local5.aClass80_227;
			return local5;
		}
	}

	@OriginalMember(owner = "client!aag", name = "bq", descriptor = "()V")
	public void method253() {
		this.method260(-568248949);
	}

	@OriginalMember(owner = "client!aag", name = "v", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method254(@OriginalArg(0) Object arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!aag", name = "iterator", descriptor = "()Ljava/util/Iterator;")
	@Override
	public Iterator iterator() {
		return new Class7(this);
	}

	@OriginalMember(owner = "client!aag", name = "n", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method255(@OriginalArg(0) Object arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!aag", name = "k", descriptor = "(Lclient!tn;B)Lclient!tn;")
	Class80 method256(@OriginalArg(0) Class80 arg0, @OriginalArg(1) byte arg1) {
		@Pc(5) Class80 local5;
		if (arg0 == null) {
			local5 = this.aClass80_3.aClass80_228;
		} else {
			local5 = arg0;
		}
		if (this.aClass80_3 == local5) {
			this.aClass80_4 = null;
			return null;
		} else {
			this.aClass80_4 = local5.aClass80_228;
			return local5;
		}
	}

	@OriginalMember(owner = "client!aag", name = "b", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method257(@OriginalArg(0) Object arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!aag", name = "ax", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method258(@OriginalArg(0) Object arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!aag", name = "rn", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method259(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!aag", name = "t", descriptor = "(I)V")
	public void method260(@OriginalArg(0) int arg0) {
		while (this.aClass80_3.aClass80_227 != this.aClass80_3) {
			this.aClass80_3.aClass80_227.method24395((byte) 77);
		}
	}

	@OriginalMember(owner = "client!aag", name = "aq", descriptor = "()[Ljava/lang/Object;")
	public Object[] method261() {
		return this.method241(1086511122);
	}

	@OriginalMember(owner = "client!aag", name = "clear", descriptor = "()V")
	@Override
	public void clear() {
		this.method260(834155486);
	}

	@OriginalMember(owner = "client!aag", name = "bs", descriptor = "()I")
	public int method262() {
		return this.method239((byte) -109);
	}

	@OriginalMember(owner = "client!aag", name = "aj", descriptor = "()V")
	public void method263() {
		while (this.aClass80_3.aClass80_227 != this.aClass80_3) {
			this.aClass80_3.aClass80_227.method24395((byte) 38);
		}
	}

	@OriginalMember(owner = "client!aag", name = "ac", descriptor = "()V")
	public void method264() {
		while (this.aClass80_3.aClass80_227 != this.aClass80_3) {
			this.aClass80_3.aClass80_227.method24395((byte) 111);
		}
	}

	@OriginalMember(owner = "client!aag", name = "rs", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method265(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!aag", name = "ab", descriptor = "(Lclient!tn;)V")
	public void method266(@OriginalArg(0) Class80 arg0) {
		if (arg0.aClass80_228 != null) {
			arg0.method24395((byte) 8);
		}
		arg0.aClass80_228 = this.aClass80_3.aClass80_228;
		arg0.aClass80_227 = this.aClass80_3;
		arg0.aClass80_228.aClass80_227 = arg0;
		arg0.aClass80_227.aClass80_228 = arg0;
	}

	@OriginalMember(owner = "client!aag", name = "ah", descriptor = "()Lclient!tn;")
	public Class80 method268() {
		@Pc(3) Class80 local3 = this.aClass80_3.aClass80_227;
		if (this.aClass80_3 == local3) {
			return null;
		} else {
			local3.method24395((byte) 85);
			return local3;
		}
	}

	@OriginalMember(owner = "client!aag", name = "af", descriptor = "(Lclient!aag;)V")
	public void method269(@OriginalArg(0) Class8 arg0) {
		if (this.aClass80_3 != this.aClass80_3.aClass80_227) {
			this.method231(arg0, this.aClass80_3.aClass80_227, (byte) 108);
		}
	}

	@OriginalMember(owner = "client!aag", name = "am", descriptor = "()Lclient!tn;")
	public Class80 method270() {
		return this.method288(null, 2061989690);
	}

	@OriginalMember(owner = "client!aag", name = "ak", descriptor = "()Lclient!tn;")
	public Class80 method271() {
		return this.method288(null, 1288437003);
	}

	@OriginalMember(owner = "client!aag", name = "at", descriptor = "()Lclient!tn;")
	public Class80 method272() {
		return this.method288(null, 1369841446);
	}

	@OriginalMember(owner = "client!aag", name = "ad", descriptor = "(Lclient!tn;)Lclient!tn;")
	Class80 method273(@OriginalArg(0) Class80 arg0) {
		@Pc(5) Class80 local5;
		if (arg0 == null) {
			local5 = this.aClass80_3.aClass80_227;
		} else {
			local5 = arg0;
		}
		if (this.aClass80_3 == local5) {
			this.aClass80_4 = null;
			return null;
		} else {
			this.aClass80_4 = local5.aClass80_227;
			return local5;
		}
	}

	@OriginalMember(owner = "client!aag", name = "bx", descriptor = "(Ljava/util/Collection;)Z")
	public boolean method274(@OriginalArg(0) Collection arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!aag", name = "an", descriptor = "(Lclient!tn;)Lclient!tn;")
	Class80 method275(@OriginalArg(0) Class80 arg0) {
		@Pc(5) Class80 local5;
		if (arg0 == null) {
			local5 = this.aClass80_3.aClass80_227;
		} else {
			local5 = arg0;
		}
		if (this.aClass80_3 == local5) {
			this.aClass80_4 = null;
			return null;
		} else {
			this.aClass80_4 = local5.aClass80_227;
			return local5;
		}
	}

	@OriginalMember(owner = "client!aag", name = "aa", descriptor = "()Lclient!tn;")
	public Class80 method276() {
		return this.method256(null, (byte) 105);
	}

	@OriginalMember(owner = "client!aag", name = "ae", descriptor = "(Lclient!tn;)Lclient!tn;")
	Class80 method277(@OriginalArg(0) Class80 arg0) {
		@Pc(5) Class80 local5;
		if (arg0 == null) {
			local5 = this.aClass80_3.aClass80_228;
		} else {
			local5 = arg0;
		}
		if (this.aClass80_3 == local5) {
			this.aClass80_4 = null;
			return null;
		} else {
			this.aClass80_4 = local5.aClass80_228;
			return local5;
		}
	}

	@OriginalMember(owner = "client!aag", name = "br", descriptor = "()Z")
	public boolean method278() {
		return this.aClass80_3 == this.aClass80_3.aClass80_227;
	}

	@OriginalMember(owner = "client!aag", name = "ar", descriptor = "(Lclient!tn;)Lclient!tn;")
	Class80 method279(@OriginalArg(0) Class80 arg0) {
		@Pc(5) Class80 local5;
		if (arg0 == null) {
			local5 = this.aClass80_3.aClass80_228;
		} else {
			local5 = arg0;
		}
		if (this.aClass80_3 == local5) {
			this.aClass80_4 = null;
			return null;
		} else {
			this.aClass80_4 = local5.aClass80_228;
			return local5;
		}
	}

	@OriginalMember(owner = "client!aag", name = "au", descriptor = "(Lclient!tn;)Lclient!tn;")
	Class80 method280(@OriginalArg(0) Class80 arg0) {
		@Pc(5) Class80 local5;
		if (arg0 == null) {
			local5 = this.aClass80_3.aClass80_228;
		} else {
			local5 = arg0;
		}
		if (this.aClass80_3 == local5) {
			this.aClass80_4 = null;
			return null;
		} else {
			this.aClass80_4 = local5.aClass80_228;
			return local5;
		}
	}

	@OriginalMember(owner = "client!aag", name = "az", descriptor = "()Lclient!tn;")
	public Class80 method281() {
		@Pc(2) Class80 local2 = this.aClass80_4;
		if (this.aClass80_3 == local2) {
			this.aClass80_4 = null;
			return null;
		} else {
			this.aClass80_4 = local2.aClass80_227;
			return local2;
		}
	}

	@OriginalMember(owner = "client!aag", name = "as", descriptor = "()Lclient!tn;")
	public Class80 method282() {
		@Pc(2) Class80 local2 = this.aClass80_4;
		if (this.aClass80_3 == local2) {
			this.aClass80_4 = null;
			return null;
		} else {
			this.aClass80_4 = local2.aClass80_227;
			return local2;
		}
	}

	@OriginalMember(owner = "client!aag", name = "ap", descriptor = "(Lclient!tn;)Lclient!tn;")
	Class80 method283(@OriginalArg(0) Class80 arg0) {
		@Pc(5) Class80 local5;
		if (arg0 == null) {
			local5 = this.aClass80_3.aClass80_228;
		} else {
			local5 = arg0;
		}
		if (this.aClass80_3 == local5) {
			this.aClass80_4 = null;
			return null;
		} else {
			this.aClass80_4 = local5.aClass80_228;
			return local5;
		}
	}

	@OriginalMember(owner = "client!aag", name = "bg", descriptor = "()I")
	public int method284() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class80 local5 = this.aClass80_3.aClass80_227; local5 != this.aClass80_3; local5 = local5.aClass80_227) {
			local1++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!aag", name = "bl", descriptor = "()I")
	public int method285() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class80 local5 = this.aClass80_3.aClass80_227; local5 != this.aClass80_3; local5 = local5.aClass80_227) {
			local1++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!aag", name = "ao", descriptor = "()[Ljava/lang/Object;")
	public Object[] method286() {
		return this.method241(1140612069);
	}

	@OriginalMember(owner = "client!aag", name = "bn", descriptor = "()Z")
	public boolean method287() {
		return this.aClass80_3 == this.aClass80_3.aClass80_227;
	}

	@OriginalMember(owner = "client!aag", name = "m", descriptor = "(Lclient!tn;I)Lclient!tn;")
	Class80 method288(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class80 local5;
		if (arg0 == null) {
			local5 = this.aClass80_3.aClass80_227;
		} else {
			local5 = arg0;
		}
		if (this.aClass80_3 == local5) {
			this.aClass80_4 = null;
			return null;
		} else {
			this.aClass80_4 = local5.aClass80_227;
			return local5;
		}
	}

	@OriginalMember(owner = "client!aag", name = "by", descriptor = "()I")
	public int method289() {
		return this.method239((byte) -109);
	}

	@OriginalMember(owner = "client!aag", name = "rm", descriptor = "()I")
	public int method290() {
		return super.hashCode();
	}

	@OriginalMember(owner = "client!aag", name = "bj", descriptor = "()I")
	public int method291() {
		return this.method239((byte) -94);
	}

	@OriginalMember(owner = "client!aag", name = "bm", descriptor = "()V")
	public void method292() {
		this.method260(665382459);
	}

	@OriginalMember(owner = "client!aag", name = "bk", descriptor = "()Z")
	public boolean method293() {
		return this.method240(414787840);
	}

	@OriginalMember(owner = "client!aag", name = "bz", descriptor = "()Z")
	public boolean method294() {
		return this.method240(-978528140);
	}

	@OriginalMember(owner = "client!aag", name = "be", descriptor = "([Ljava/lang/Object;)[Ljava/lang/Object;")
	public Object[] method295(@OriginalArg(0) Object[] arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class80 local5 = this.aClass80_3.aClass80_227; local5 != this.aClass80_3; local5 = local5.aClass80_227) {
			arg0[local1++] = local5;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!aag", name = "bh", descriptor = "([Ljava/lang/Object;)[Ljava/lang/Object;")
	public Object[] method296(@OriginalArg(0) Object[] arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class80 local5 = this.aClass80_3.aClass80_227; local5 != this.aClass80_3; local5 = local5.aClass80_227) {
			arg0[local1++] = local5;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!aag", name = "bv", descriptor = "(Lclient!tn;)Z")
	boolean method297(@OriginalArg(0) Class80 arg0) {
		this.method232(arg0, 1916874488);
		return true;
	}

	@OriginalMember(owner = "client!aag", name = "aw", descriptor = "()I")
	public int method298() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class80 local5 = this.aClass80_3.aClass80_227; local5 != this.aClass80_3; local5 = local5.aClass80_227) {
			local1++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!aag", name = "bb", descriptor = "(Ljava/util/Collection;)Z")
	public boolean method299(@OriginalArg(0) Collection arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!aag", name = "bo", descriptor = "(Ljava/util/Collection;)Z")
	public boolean method300(@OriginalArg(0) Collection arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!aag", name = "bc", descriptor = "(Ljava/util/Collection;)Z")
	public boolean method301(@OriginalArg(0) Collection arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!aag", name = "bf", descriptor = "(Ljava/util/Collection;)Z")
	public boolean method302(@OriginalArg(0) Collection arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!aag", name = "bw", descriptor = "(Ljava/util/Collection;)Z")
	public boolean method303(@OriginalArg(0) Collection arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!aag", name = "y", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method304(@OriginalArg(0) Object arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!aag", name = "bi", descriptor = "(Ljava/util/Collection;)Z")
	public boolean method305(@OriginalArg(0) Collection arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!aag", name = "bu", descriptor = "(Ljava/util/Collection;)Z")
	public boolean method306(@OriginalArg(0) Collection arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!aag", name = "ba", descriptor = "()[Lclient!tn;")
	Class80[] method307() {
		@Pc(4) Class80[] local4 = new Class80[this.method239((byte) -63)];
		@Pc(6) int local6 = 0;
		for (@Pc(10) Class80 local10 = this.aClass80_3.aClass80_227; local10 != this.aClass80_3; local10 = local10.aClass80_227) {
			local4[local6++] = local10;
		}
		return local4;
	}

	@OriginalMember(owner = "client!aag", name = "ai", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method308(@OriginalArg(0) Object arg0) {
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!aag", name = "bd", descriptor = "()V")
	public void method309() {
		this.method260(-467400652);
	}

	@OriginalMember(owner = "client!aag", name = "cd", descriptor = "()V")
	public void method310() {
		this.method260(2095615714);
	}

	@OriginalMember(owner = "client!aag", name = "cv", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method311(@OriginalArg(0) Object arg0) {
		return this.method243((Class80) arg0, (byte) 16);
	}
}
