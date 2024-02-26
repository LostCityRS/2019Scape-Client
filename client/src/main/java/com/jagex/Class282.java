package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class282 implements Interface26 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!ga", name = "this$0", descriptor = "Lclient!gc;")
	final Class284 aClass284_4;

	@OriginalMember(owner = "client!ga", name = "t", descriptor = "Lclient!og;")
	final Class460 aClass460_1;

	@OriginalMember(owner = "client!ga", name = "ay", descriptor = "(I)V")
	static void method26867(@OriginalArg(0) int arg0) {
		Class238.aClass75_3.method1314(1587586714);
		Class238.aClass75_3.aClass80_Sub36_Sub1_1.anInt3152 = 0;
		Class238.aClass75_3.aClass448_3 = null;
		Class238.aClass75_3.aClass448_4 = null;
		Class238.aClass75_3.aClass448_1 = null;
		Class238.aClass75_3.anInt245 = 0;
		client.anInt3584 = 0;
		client.anInt3577 = 0;
		client.anInt3573 = 0;
		client.anInt3519 = 0;
		client.aString148 = null;
		Class274.anInt3924 = 0;
		Class14.aClass164Array1 = null;
		Class327.aClass378_1 = null;
		Class453.aClass378_2 = null;
		client.aBoolean749 = true;
		Class559.method31406(508423310);
		for (@Pc(42) int local42 = 0; local42 < Class672.aClass134_1.aClass661Array1.length; local42++) {
			@Pc(56) Class661 local56 = new Class661(Class450.aClass634_1.method32789(local42, -458332729), false);
			local56.method33313(0, -2105390147);
			local56.method33299(0, -1357088781);
			Class672.aClass134_1.aClass661Array1[local42] = local56;
		}
		Class672.aClass134_1.aClass636_1.method32852((byte) 16);
		Class376.method28463((byte) 0);
		Class103_Sub23.method8699(Class238.aClass75_3, 1978795723);
	}

	@OriginalMember(owner = "client!ga", name = "m", descriptor = "(Lclient!yp;B)V")
	static void method26868(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class697.method37056(Class279.aClass102_9, 1087492339);
	}

	@OriginalMember(owner = "client!ga", name = "r", descriptor = "(Lclient!he;IIIZLclient!yp;I)V")
	static void method26869(@OriginalArg(0) Class310 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class690 arg5, @OriginalArg(6) int arg6) {
		if (arg2 == 0) {
			throw new RuntimeException();
		}
		@Pc(10) Class327 local10 = arg0.aClass327Array2[arg1];
		if (local10.aClass327Array3 == null) {
			local10.aClass327Array3 = new Class327[arg3 + 1];
			local10.aClass327Array4 = local10.aClass327Array3;
		}
		if (local10.aClass327Array3.length <= arg3) {
			@Pc(39) Class327[] local39;
			if (local10.aClass327Array3 == local10.aClass327Array4) {
				local39 = new Class327[arg3 + 1];
				for (@Pc(41) int local41 = 0; local41 < local10.aClass327Array3.length; local41++) {
					local39[local41] = local10.aClass327Array3[local41];
				}
				local10.aClass327Array3 = local10.aClass327Array4 = local39;
			} else {
				local39 = new Class327[arg3 + 1];
				@Pc(72) Class327[] local72 = new Class327[arg3 + 1];
				for (@Pc(74) int local74 = 0; local74 < local10.aClass327Array3.length; local74++) {
					local39[local74] = local10.aClass327Array3[local74];
					local72[local74] = local10.aClass327Array4[local74];
				}
				local10.aClass327Array3 = local39;
				local10.aClass327Array4 = local72;
			}
		}
		if (arg3 > 0 && local10.aClass327Array3[arg3 - 1] == null) {
			throw new RuntimeException("" + (arg3 - 1));
		}
		@Pc(129) Class327 local129 = new Class327();
		local129.anInt4135 = arg2 * 819107545;
		local129.anInt4082 = (local129.anInt4087 = local10.anInt4087) * 1200104149;
		local129.anInt4094 = arg3 * 1442205567;
		local10.aClass327Array3[arg3] = local129;
		if (local10.aClass327Array3 != local10.aClass327Array4) {
			local10.aClass327Array4[arg3] = local129;
		}
		@Pc(170) Class691 local170;
		if (arg4) {
			local170 = arg5.aClass691_1;
		} else {
			local170 = arg5.aClass691_2;
		}
		local170.aClass310_4 = arg0;
		local170.aClass327_14 = local129;
		Class296.method26998(local10, 2084508872);
	}

	@OriginalMember(owner = "client!ga", name = "aux", descriptor = "(Lclient!yp;I)V")
	static void method26870(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub39_1.method16764(1219470775);
	}

	@OriginalMember(owner = "client!ga", name = "aue", descriptor = "(Lclient!yp;B)V")
	static void method26871(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class256.method26417(1495211203);
	}

	@OriginalMember(owner = "client!ga", name = "uf", descriptor = "(Lclient!yp;S)V")
	static void method26872(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2087527018);
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local16.aString183;
	}

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lclient!gc;Lclient!ald;)V")
	Class282(@OriginalArg(0) Class284 arg0, @OriginalArg(1) Class80_Sub36 arg1) {
		this.aClass284_4 = arg0;
		if (arg1.method23178((byte) -83) == 65535) {
			this.aClass460_1 = null;
		} else {
			arg1.anInt3152 -= 2068361142;
			this.aClass460_1 = arg0.anInterface27_2.method13(2018730667).method1820(arg1, 341178500);
		}
	}

	@OriginalMember(owner = "client!ga", name = "t", descriptor = "(Lclient!gz;I)V")
	@Override
	public void method27029(@OriginalArg(0) Class305 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass460_1 != null) {
			arg0.method27129(-891158048).method37001((Class107) this.aClass284_4.anInterface27_2.method13(1997141640).method18054(this.aClass460_1.anInt4907 * -38979583, 340017054), this.aClass460_1.anObject19, 2087859645);
		}
	}

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "(Lclient!gz;)V")
	@Override
	public void method27028(@OriginalArg(0) Class305 arg0) {
		if (this.aClass460_1 != null) {
			arg0.method27129(-1401768454).method37001((Class107) this.aClass284_4.anInterface27_2.method13(1965842573).method18054(this.aClass460_1.anInt4907 * -38979583, -1336404063), this.aClass460_1.anObject19, 2122734343);
		}
	}
}
