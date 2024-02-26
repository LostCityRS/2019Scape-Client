package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.ByteArrayInputStream;
import java.io.IOException;

@OriginalClass("client!ss")
public final class Class559 {

	@OriginalMember(owner = "client!ss", name = "t", descriptor = "I")
	static final int anInt5184 = 5;

	@OriginalMember(owner = "client!ss", name = "c", descriptor = "[I")
	static int[] anIntArray474;

	@OriginalMember(owner = "client!ss", name = "f", descriptor = "Lclient!st;")
	static Class560 aClass560_2;

	static {
		new Class556();
		aClass560_2 = new Class560();
	}

	@OriginalMember(owner = "client!ss", name = "e", descriptor = "(Lclient!ald;I)[B")
	public static byte[] method31404(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(5) ByteArrayInputStream local5 = new ByteArrayInputStream(arg0.data);
		local5.skip((long) (arg0.pos * -1380987821));
		return Class278.method26838(local5, arg1, -1762075568);
	}

	@OriginalMember(owner = "client!ss", name = "lk", descriptor = "(Lclient!yp;I)V")
	static void method31405(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		arg0.anInt5778 -= -1107359310;
		@Pc(19) byte[] local19 = null;
		@Pc(21) byte[] local21 = null;
		@Pc(23) int local23;
		for (local23 = 0; local23 < 10 && arg0.anIntArray525[local23 + arg0.anInt5778 * 1896589581] >= 0; local23 += 2) {
		}
		if (local23 > 0) {
			local19 = new byte[local23 / 2];
			local21 = new byte[local23 / 2];
			for (local23 -= 2; local23 >= 0; local23 -= 2) {
				local19[local23 / 2] = (byte) arg0.anIntArray525[arg0.anInt5778 * 1896589581 + local23];
				local21[local23 / 2] = (byte) arg0.anIntArray525[local23 + arg0.anInt5778 * 1896589581 + 1];
			}
		}
		Class480.method30002(local11, local19, local21, arg0, (short) 651);
	}

	@OriginalMember(owner = "client!ss", name = "e", descriptor = "(I)V")
	public static void method31406(@OriginalArg(0) int arg0) {
		Class662.aClass162_Sub2_1.method15775(512534966);
		Class662.aClass162_Sub1_1.method15775(512534966);
		Class662.aLong409 = -3285507564811954843L;
		Class662.aBoolean975 = true;
	}

	@OriginalMember(owner = "client!ss", name = "jb", descriptor = "(Lclient!yp;I)V")
	static void method31407(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
	}

	@OriginalMember(owner = "client!ss", name = "fw", descriptor = "(ZI)V")
	public static void method31408(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (arg0) {
			if (client.anInt3460 * 1849344509 != -1) {
				Class123.method20527(client.anInt3460 * 1849344509, (byte) 4);
			}
			for (@Pc(16) Class80_Sub40 local16 = (Class80_Sub40) client.aClass24_20.method580((byte) -50); local16 != null; local16 = (Class80_Sub40) client.aClass24_20.method566((byte) 7)) {
				if (!local16.method24399(-1576217408)) {
					local16 = (Class80_Sub40) client.aClass24_20.method580((byte) -123);
					if (local16 == null) {
						break;
					}
				}
				Class80_Sub42.method15605(local16, true, false, (byte) -13);
			}
			client.anInt3460 = -458761045;
			client.aClass24_20 = new Class24(8);
			Class305.method27204(1974041735);
			client.anInt3460 = Class698.aClass638_1.anInt5615 * -868886369;
			if (client.anInt3460 * 1849344509 != -1) {
				Class144_Sub1.method12033(false, -240957815);
				Class138_Sub1.method10718((byte) 30);
				Class367.method28283(client.anInt3460 * 1849344509, null, -375983119);
			}
		}
		Class107.method7195(-159116402);
		Class160.aClass121_Sub1_2.method9573(true, 1989067524);
		Class238.aBoolean771 = false;
		Class288.method26911(1678423561);
		client.anInt3502 = -847777085;
		Class289.method26925(client.anInt3521 * -1968123903, (byte) 0);
		Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 = new Class120_Sub1_Sub1_Sub1_Sub2(null);
		client.aMap15.clear();
		Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method24531((float) (client.aClass539_1.method30921(1974689197) * 512 / 2), 0.0F, (float) (client.aClass539_1.method31011(-987994750) * 512 / 2));
		Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anIntArray234[0] = client.aClass539_1.method30921(2009018344) / 2;
		Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anIntArray242[0] = client.aClass539_1.method31011(-863707749) / 2;
		Class102_Sub2.anInt653 = 0;
		Class89.anInt319 = 0;
		if (Class368.anInt4502 * -1583611537 == 5) {
			Class89.anInt319 = (Class28.anInt92 * 746119785 << 9) * 2068667409;
			Class102_Sub2.anInt653 = (Class244.anInt3863 * -195303907 << 9) * 483037039;
		} else {
			Class364.method28220(394820816);
		}
		client.aClass539_1.method30904((byte) -6).method33382(-663798095);
	}

	@OriginalMember(owner = "client!ss", name = "f", descriptor = "(I)V")
	public static void method31409(@OriginalArg(0) int arg0) {
		Class551.method31321();
	}

	@OriginalMember(owner = "client!ss", name = "ado", descriptor = "(Lclient!yp;I)V")
	static void method31410(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = arg0.aClass80_Sub32_4.aClass382Array1[local12].anInt4538 * 1138615427;
	}

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "()V")
	Class559() throws Throwable {
		throw new Error();
	}
}
