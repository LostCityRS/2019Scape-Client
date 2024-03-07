package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agz")
public class Class110_Sub23 extends Class110 {

	@OriginalMember(owner = "client!agz", name = "n", descriptor = "I")
	final int anInt1001;

	@OriginalMember(owner = "client!agz", name = "m", descriptor = "I")
	final int anInt999;

	@OriginalMember(owner = "client!agz", name = "k", descriptor = "I")
	final int anInt998;

	@OriginalMember(owner = "client!agz", name = "f", descriptor = "I")
	final int anInt1000;

	@OriginalMember(owner = "client!agz", name = "w", descriptor = "Lclient!rw;")
	Class539 aClass539_2;

	@OriginalMember(owner = "client!agz", name = "<init>", descriptor = "(Lclient!alw;)V", line = 18)
	Class110_Sub23(@OriginalArg(0) Packet arg0) {
		super(arg0);
		this.anInt1001 = arg0.g2(-1434290800) * -313944289;
		this.anInt999 = arg0.g1((short) 16384) * -2049916011;
		this.anInt998 = arg0.g1((short) 16384) * -222526445;
		this.anInt1000 = arg0.g1((short) 16384) * 1931014705;
		this.aClass539_2 = Class274.aClass258_1.method26097(Class275.aClass275_9, this, this.anInt1001 * 1891312863, this.anInt1000 * 484386513, this.anInt999 * -884314179, Class280.aClass280_7.method26450(-1440019737), Class278.aClass278_2, 0.0F, 0.0F, null, 0, this.anInt998 * -413669861, false, -2052373249);
		if (this.aClass539_2 != null) {
			this.aClass539_2.method30797(-1234437357);
		}
	}

	@OriginalMember(owner = "client!agz", name = "n", descriptor = "(I)V", line = 30)
	@Override
	public void method20149(@OriginalArg(0) int arg0) {
		if (this.aClass539_2 != null) {
			this.aClass539_2.method30802(827342689);
		}
	}

	@OriginalMember(owner = "client!agz", name = "f", descriptor = "()V", line = 30)
	@Override
	public void method20150() {
		if (this.aClass539_2 != null) {
			this.aClass539_2.method30802(-216699414);
		}
	}

	@OriginalMember(owner = "client!agz", name = "u", descriptor = "()V", line = 36)
	@Override
	void method20139() {
		if (this.aClass539_2 != null) {
			this.aClass539_2.method30803(50, (byte) -48);
			Class274.aClass258_1.method26088(this.aClass539_2, 1858378071);
			this.aClass539_2 = null;
		}
	}

	@OriginalMember(owner = "client!agz", name = "m", descriptor = "(I)V", line = 36)
	@Override
	void method20140(@OriginalArg(0) int arg0) {
		if (this.aClass539_2 != null) {
			this.aClass539_2.method30803(50, (byte) -63);
			Class274.aClass258_1.method26088(this.aClass539_2, 1474494591);
			this.aClass539_2 = null;
		}
	}

	@OriginalMember(owner = "client!agz", name = "n", descriptor = "(I)Z", line = 51)
	static boolean method8623(@OriginalArg(0) int arg0) {
		@Pc(1) boolean local1 = true;
		if (Class171.aClass105_2 == null) {
			if (Class110_Sub7.aClass497_22.method30071(Class160.anInt1962 * 182602545, -512225963)) {
				Class171.aClass105_2 = Class203.method24653(Class110_Sub7.aClass497_22, Class160.anInt1962 * 182602545);
			} else {
				local1 = false;
			}
		}
		if (Class171.aClass105_1 == null) {
			if (Class110_Sub7.aClass497_22.method30071(Class296.anInt3919 * -278754945, -512225963)) {
				Class171.aClass105_1 = Class203.method24653(Class110_Sub7.aClass497_22, Class296.anInt3919 * -278754945);
			} else {
				local1 = false;
			}
		}
		if (Class531.aClass105_3 == null) {
			if (Class110_Sub7.aClass497_22.method30071(Class628.anInt5707 * 1184402739, -512225963)) {
				Class531.aClass105_3 = Class203.method24653(Class110_Sub7.aClass497_22, Class628.anInt5707 * 1184402739);
			} else {
				local1 = false;
			}
		}
		if (Class63.aClass5_2 == null) {
			if (Class633.aClass497_137.method30071(Class171.anInt3057 * 57763875, -512225963)) {
				Class63.aClass5_2 = Class157.aClass462_2.method29259(client.anInterface50_1, Class171.anInt3057 * 57763875, -2053596534);
			} else {
				local1 = false;
			}
		}
		if (Class171.aClass105_Sub2_1 == null) {
			if (Class110_Sub7.aClass497_22.method30071(Class171.anInt3057 * 57763875, -512225963)) {
				Class171.aClass105_Sub2_1 = (Class105_Sub2) Class203.method24653(Class110_Sub7.aClass497_22, Class171.anInt3057 * 57763875);
			} else {
				local1 = false;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!agz", name = "d", descriptor = "(IIIII)V", line = 311)
	public static void method8624(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(4) Class93_Sub13 local4;
		for (local4 = (Class93_Sub13) Class93_Sub13.aClass22_21.method428((byte) 113); local4 != null; local4 = (Class93_Sub13) Class93_Sub13.aClass22_21.method442(964784107)) {
			Class527.method30388(local4, arg0, arg1, arg2, arg3, -735811045);
		}
		@Pc(29) byte local29;
		@Pc(34) Class622 local34;
		@Pc(40) int local40;
		@Pc(115) int local115;
		@Pc(218) Class472 local218;
		for (local4 = (Class93_Sub13) Class93_Sub13.aClass22_22.method428((byte) 58); local4 != null; local4 = (Class93_Sub13) Class93_Sub13.aClass22_22.method442(1186384131)) {
			local29 = 1;
			local34 = local4.aClass132_Sub1_Sub1_Sub1_Sub1_1.method19997(930565507);
			local40 = local4.aClass132_Sub1_Sub1_Sub1_Sub1_1.aClass19_Sub3_3.method23564((byte) 79);
			if (local40 == -1 || local4.aClass132_Sub1_Sub1_Sub1_Sub1_1.aClass19_Sub3_3.aBoolean379) {
				local29 = 0;
			} else if (local40 == local34.anInt5680 * 1046628773 || local34.anInt5654 * 884977547 == local40 || local40 == local34.anInt5656 * 1632091583 || local40 == local34.anInt5655 * 1798234475) {
				local29 = 2;
			} else if (local40 == local34.anInt5657 * -2077928117 || local40 == local34.anInt5658 * 1363226867 || local34.anInt5645 * 285037349 == local40 || local34.anInt5653 * -2038961455 == local40) {
				local29 = 3;
			}
			if (local4.anInt1515 * 1201626885 != local29) {
				local115 = Class566.method31257(local4.aClass132_Sub1_Sub1_Sub1_Sub1_1, -755129677);
				@Pc(119) Class336 local119 = local4.aClass132_Sub1_Sub1_Sub1_Sub1_1.aClass336_1;
				if (local119.anIntArray412 != null) {
					local119 = local119.method27435(Class624.playerVariableManager, Class624.playerVariableManager, (short) 29606);
				}
				if (local119 == null || local115 == -1) {
					local4.anInt1522 = 1340593683;
					local4.anInt1515 = local29 * -449342003;
				} else if (local115 == local4.anInt1522 * 486579173) {
					local4.anInt1515 = local29 * -449342003;
					local4.anInt1514 = local119.anInt4167 * 500628225;
				} else {
					@Pc(151) boolean local151 = false;
					if (local4.aClass539_3 == null) {
						local151 = true;
					} else {
						local4.anInt1514 -= 1825123840;
						if (local4.anInt1514 * 1666407207 <= 0) {
							local4.aClass539_3.method30803(100, (byte) -20);
							Class274.aClass258_1.method26088(local4.aClass539_3, 1609571703);
							local4.aClass539_3 = null;
							local151 = true;
						}
					}
					if (local151) {
						local4.anInt1514 = local119.anInt4167 * 500628225;
						local4.anInt1522 = local115 * -1340593683;
						local4.anInt1515 = local29 * -449342003;
					}
				}
			}
			local218 = local4.aClass132_Sub1_Sub1_Sub1_Sub1_1.method24220().aClass472_61;
			local4.anInt1513 = (int) local218.aFloat317 * 1575742085;
			local4.anInt1508 = ((int) local218.aFloat317 + (local4.aClass132_Sub1_Sub1_Sub1_Sub1_1.method19986(-1666725116) << 8)) * 440138643;
			local4.anInt1507 = (int) local218.aFloat319 * 1539129531;
			local4.anInt1509 = ((int) local218.aFloat319 + (local4.aClass132_Sub1_Sub1_Sub1_Sub1_1.method19986(-4636485) << 8)) * -465070531;
			local4.anInt1506 = local4.aClass132_Sub1_Sub1_Sub1_Sub1_1.aByte100 * 1680099407;
			Class527.method30388(local4, arg0, arg1, arg2, arg3, -735811045);
		}
		for (local4 = (Class93_Sub13) Class93_Sub13.aClass16_11.method227((byte) 29); local4 != null; local4 = (Class93_Sub13) Class93_Sub13.aClass16_11.method229(1758003760)) {
			local29 = 1;
			local34 = local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.method19997(985134320);
			local40 = local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.aClass19_Sub3_3.method23564((byte) 16);
			if (local40 == -1 || local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.aClass19_Sub3_3.aBoolean379) {
				local29 = 0;
			} else if (local34.anInt5680 * 1046628773 == local40 || local34.anInt5654 * 884977547 == local40 || local34.anInt5656 * 1632091583 == local40 || local34.anInt5655 * 1798234475 == local40) {
				local29 = 2;
			} else if (local40 == local34.anInt5657 * -2077928117 || local34.anInt5658 * 1363226867 == local40 || local40 == local34.anInt5645 * 285037349 || local40 == local34.anInt5653 * -2038961455) {
				local29 = 3;
			}
			if (local29 != local4.anInt1515 * 1201626885) {
				local115 = Class110_Sub18.method8431(local4.aClass132_Sub1_Sub1_Sub1_Sub2_1, -2105766868);
				if (local4.anInt1522 * 486579173 == local115) {
					local4.anInt1514 = local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.anInt2808 * 31129119;
					local4.anInt1515 = local29 * -449342003;
				} else {
					@Pc(384) boolean local384 = false;
					if (local4.aClass539_3 == null) {
						local384 = true;
					} else {
						local4.anInt1514 -= 1825123840;
						if (local4.anInt1514 * 1666407207 <= 0) {
							local4.aClass539_3.method30803(100, (byte) -42);
							Class274.aClass258_1.method26088(local4.aClass539_3, 1527433662);
							local4.aClass539_3 = null;
							local384 = true;
						}
					}
					if (local384) {
						local4.anInt1514 = local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.anInt2808 * 31129119;
						local4.anInt1522 = local115 * -1340593683;
						local4.anInt1515 = local29 * -449342003;
					}
				}
			}
			local218 = local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.method24220().aClass472_61;
			local4.anInt1513 = (int) local218.aFloat317 * 1575742085;
			local4.anInt1508 = ((int) local218.aFloat317 + (local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.method19986(-818242305) << 8)) * 440138643;
			local4.anInt1507 = (int) local218.aFloat319 * 1539129531;
			local4.anInt1509 = ((int) local218.aFloat319 + (local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.method19986(734172845) << 8)) * -465070531;
			local4.anInt1506 = local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.aByte100 * 1680099407;
			Class527.method30388(local4, arg0, arg1, arg2, arg3, -735811045);
		}
	}

	@OriginalMember(owner = "client!agz", name = "anl", descriptor = "(Lclient!yf;I)V", line = 12335)
	static final void method8625(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class93_Sub30 local13 = (Class93_Sub30) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375];
		if (Class65.aClass123_Sub1_2.method9024(-1662199153) != Class342.aClass342_4) {
			throw new RuntimeException();
		}
		@Pc(27) Class124_Sub2 local27 = (Class124_Sub2) Class65.aClass123_Sub1_2.method9011((byte) -99);
		local27.method9297(local13, -1049152339);
		client.aBoolean619 = true;
	}
}
