package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public class Class93 {

	@OriginalMember(owner = "client!tj", name = "e", descriptor = "J")
	public long aLong232;

	@OriginalMember(owner = "client!tj", name = "n", descriptor = "Lclient!tj;")
	public Class93 aClass93_227;

	@OriginalMember(owner = "client!tj", name = "m", descriptor = "Lclient!tj;")
	public Class93 aClass93_228;

	@OriginalMember(owner = "client!tj", name = "q", descriptor = "()V", line = 9)
	public void method23968() {
		if (this.aClass93_228 != null) {
			this.aClass93_228.aClass93_227 = this.aClass93_227;
			this.aClass93_227.aClass93_228 = this.aClass93_228;
			this.aClass93_227 = null;
			this.aClass93_228 = null;
		}
	}

	@OriginalMember(owner = "client!tj", name = "o", descriptor = "(I)V", line = 9)
	public void method23969(@OriginalArg(0) int arg0) {
		if (this.aClass93_228 != null) {
			this.aClass93_228.aClass93_227 = this.aClass93_227;
			this.aClass93_227.aClass93_228 = this.aClass93_228;
			this.aClass93_227 = null;
			this.aClass93_228 = null;
		}
	}

	@OriginalMember(owner = "client!tj", name = "s", descriptor = "(I)Z", line = 17)
	public boolean method23970(@OriginalArg(0) int arg0) {
		return this.aClass93_228 != null;
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "()Z", line = 17)
	public boolean method23971() {
		return this.aClass93_228 != null;
	}

	@OriginalMember(owner = "client!tj", name = "qc", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 7932)
	static final void method23972(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5888 -= 957530791) * 587908375];
		@Pc(18) int[] local18 = Class532.method30597(local13, arg2, 1518522314);
		if (local18 != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray23 = Class499.method30149(local13, arg2, 689370152);
		arg0.anIntArray381 = local18;
		arg0.aBoolean680 = true;
	}

	@OriginalMember(owner = "client!tj", name = "sv", descriptor = "(Lclient!yf;I)V", line = 8170)
	static final void method23973(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local11.anInt3991 * 1312295363;
	}

	@OriginalMember(owner = "client!tj", name = "abc", descriptor = "(Lclient!yf;I)V", line = 9847)
	static final void method23974(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class557.aClass297_1.method26611((byte) 3).size();
	}

	@OriginalMember(owner = "client!tj", name = "afj", descriptor = "(Lclient!yf;I)V", line = 10612)
	static final void method23975(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375];
		@Pc(19) StringBuilder local19 = new StringBuilder(local13.length());
		@Pc(21) boolean local21 = false;
		for (@Pc(23) int local23 = 0; local23 < local13.length(); local23++) {
			@Pc(31) char local31 = local13.charAt(local23);
			if (local31 == '<') {
				local21 = true;
			} else if (local31 == '>') {
				local21 = false;
			} else if (!local21) {
				local19.append(local31);
			}
		}
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local19.toString();
	}
}
