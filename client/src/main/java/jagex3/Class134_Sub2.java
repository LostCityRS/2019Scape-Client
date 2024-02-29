package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahz")
public final class Class134_Sub2 extends Class134 {

	@OriginalMember(owner = "client!ahz", name = "q", descriptor = "I")
	static final int anInt1175 = 7;

	@OriginalMember(owner = "client!ahz", name = "d", descriptor = "I")
	static final int anInt1176 = 0;

	@OriginalMember(owner = "client!ahz", name = "x", descriptor = "I")
	static final int anInt1177 = 0;

	@OriginalMember(owner = "client!ahz", name = "r", descriptor = "I")
	static final int anInt1178 = 2;

	@OriginalMember(owner = "client!ahz", name = "a", descriptor = "I")
	static final int anInt1179 = 3;

	@OriginalMember(owner = "client!ahz", name = "o", descriptor = "I")
	static final int anInt1180 = 4;

	@OriginalMember(owner = "client!ahz", name = "s", descriptor = "I")
	static final int anInt1181 = 5;

	@OriginalMember(owner = "client!ahz", name = "v", descriptor = "I")
	static final int anInt1182 = 3;

	@OriginalMember(owner = "client!ahz", name = "c", descriptor = "I")
	static final int anInt1183 = 1;

	@OriginalMember(owner = "client!ahz", name = "b", descriptor = "I")
	static final int anInt1184 = 1;

	@OriginalMember(owner = "client!ahz", name = "h", descriptor = "I")
	static final int anInt1185 = 2;

	@OriginalMember(owner = "client!ahz", name = "y", descriptor = "I")
	static final int anInt1186 = 6;

	@OriginalMember(owner = "client!ahz", name = "p", descriptor = "Lclient!ho;")
	Class115 aClass115_5;

	@OriginalMember(owner = "client!ahz", name = "j", descriptor = "[I")
	int[] anIntArray99;

	@OriginalMember(owner = "client!ahz", name = "g", descriptor = "[Lclient!hi;")
	final Class116[] aClass116Array5 = new Class116[3];

	@OriginalMember(owner = "client!ahz", name = "i", descriptor = "[[I")
	final int[][] anIntArrayArray18 = new int[3][7];

	@OriginalMember(owner = "client!ahz", name = "t", descriptor = "Lclient!og;")
	Class460 aClass460_10 = new Class460(1.0F, 1.0F, 1.0F, 1.0F);

	@OriginalMember(owner = "client!ahz", name = "ae", descriptor = "Lclient!og;")
	Class460 aClass460_11 = new Class460(0.0F, 0.0F, 0.0F, 0.0F);

	@OriginalMember(owner = "client!ahz", name = "apk", descriptor = "(Lclient!yf;B)V")
	static void method10210(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class166_Sub6.method15494(-218445149).getId();
	}

	@OriginalMember(owner = "client!ahz", name = "ahb", descriptor = "(Lclient!yf;B)V")
	static void method10211(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = client.anInt3561 * 2112576331;
	}

	@OriginalMember(owner = "client!ahz", name = "f", descriptor = "(IB)I")
	public static int method10212(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(6) int local6 = local0 | local0 >>> 1;
		@Pc(12) int local12 = local6 | local6 >>> 2;
		@Pc(18) int local18 = local12 | local12 >>> 4;
		@Pc(24) int local24 = local18 | local18 >>> 8;
		@Pc(30) int local30 = local24 | local24 >>> 16;
		return local30 + 1;
	}

	@OriginalMember(owner = "client!ahz", name = "<init>", descriptor = "(Lclient!afc;)V")
	public Class134_Sub2(@OriginalArg(0) Class104_Sub2 arg0) throws Exception_Sub2 {
		super(arg0);
		this.method10206((byte) -9);
	}

	@OriginalMember(owner = "client!ahz", name = "f", descriptor = "()V")
	@Override
	public void method10199() {
		this.aClass115_5.method8203(this.aClass116Array5[0]);
		this.aClass115_5.method8285();
		this.anIntArray99 = this.anIntArrayArray18[this.aClass115_5.method8253(-935165066)];
		this.method10204(1431702440);
	}

	@OriginalMember(owner = "client!ahz", name = "e", descriptor = "(II)V")
	@Override
	public void method10197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		switch(arg0) {
			case 0:
				this.aClass460_10.method29377(arg1);
				this.aClass460_11.method29377(0);
				break;
			case 1:
				this.aClass460_10.method29377(-1);
				this.aClass460_11.method29377(0);
				break;
			case 2:
				this.aClass460_10.method29377(arg1);
				this.aClass460_11.method29377(0);
				break;
			case 3:
				this.aClass460_10.method29377(arg1 & 0xFF000000 | 0xFFFFFF);
				this.aClass460_11.method29377(arg1 & 0xFFFFFF);
				break;
			case 4:
				this.aClass460_10.method29377(-1);
				this.aClass460_11.method29377(arg1);
				this.aClass460_11.method29387();
		}
	}

	@OriginalMember(owner = "client!ahz", name = "z", descriptor = "(I)V")
	void method10204(@OriginalArg(0) int arg0) {
		this.aClass115_5.method8256(this.anIntArray99[1], 0, this.anInterface38_20, (byte) 0);
		this.aClass104_Sub2_19.method20946(this.aClass489_48);
		this.aClass115_5.method8224(this.anIntArray99[0], this.aClass489_48, 1822232180);
		this.aClass115_5.method8223(this.anIntArray99[3], this.aClass489_49, 1047815710);
		this.aClass115_5.method8219(this.anIntArray99[5], this.aClass460_10.aFloat301, this.aClass460_10.aFloat300, this.aClass460_10.aFloat299, this.aClass460_10.aFloat302, 1741825539);
		this.aClass115_5.method8219(this.anIntArray99[6], this.aClass460_11.aFloat301, this.aClass460_11.aFloat300, this.aClass460_11.aFloat299, this.aClass460_11.aFloat302, 1741825539);
		this.aClass104_Sub2_19.method21060(0, this.anInterface37_9);
		this.aClass104_Sub2_19.method21118(this.aClass145_10);
		this.aClass104_Sub2_19.method21017(Class424.aClass424_4, this.anInt1174, 2);
	}

	@OriginalMember(owner = "client!ahz", name = "n", descriptor = "()V")
	@Override
	public void method10198() {
		this.aClass115_5.method8203(this.aClass116Array5[0]);
		this.aClass115_5.method8285();
		this.anIntArray99 = this.anIntArrayArray18[this.aClass115_5.method8253(-995029276)];
		this.method10204(114962694);
	}

	@OriginalMember(owner = "client!ahz", name = "l", descriptor = "()V")
	@Override
	public void method10203() {
		this.aClass115_5.method8203(this.aClass116Array5[1]);
		this.aClass115_5.method8285();
		this.anIntArray99 = this.anIntArrayArray18[this.aClass115_5.method8253(-1994935051)];
		this.aClass115_5.method8256(this.anIntArray99[2], 1, this.anInterface38_19, (byte) 0);
		this.aClass115_5.method8223(this.anIntArray99[4], this.aClass489_50, 1047815710);
		this.method10204(-761990783);
	}

	@OriginalMember(owner = "client!ahz", name = "k", descriptor = "(II)V")
	@Override
	public void method10200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		switch(arg0) {
			case 0:
				this.aClass460_10.method29377(arg1);
				this.aClass460_11.method29377(0);
				break;
			case 1:
				this.aClass460_10.method29377(-1);
				this.aClass460_11.method29377(0);
				break;
			case 2:
				this.aClass460_10.method29377(arg1);
				this.aClass460_11.method29377(0);
				break;
			case 3:
				this.aClass460_10.method29377(arg1 & 0xFF000000 | 0xFFFFFF);
				this.aClass460_11.method29377(arg1 & 0xFFFFFF);
				break;
			case 4:
				this.aClass460_10.method29377(-1);
				this.aClass460_11.method29377(arg1);
				this.aClass460_11.method29387();
		}
	}

	@OriginalMember(owner = "client!ahz", name = "r", descriptor = "()V")
	void method10205() {
		this.aClass115_5.method8256(this.anIntArray99[1], 0, this.anInterface38_20, (byte) 0);
		this.aClass104_Sub2_19.method20946(this.aClass489_48);
		this.aClass115_5.method8224(this.anIntArray99[0], this.aClass489_48, -425472640);
		this.aClass115_5.method8223(this.anIntArray99[3], this.aClass489_49, 1047815710);
		this.aClass115_5.method8219(this.anIntArray99[5], this.aClass460_10.aFloat301, this.aClass460_10.aFloat300, this.aClass460_10.aFloat299, this.aClass460_10.aFloat302, 1741825539);
		this.aClass115_5.method8219(this.anIntArray99[6], this.aClass460_11.aFloat301, this.aClass460_11.aFloat300, this.aClass460_11.aFloat299, this.aClass460_11.aFloat302, 1741825539);
		this.aClass104_Sub2_19.method21060(0, this.anInterface37_9);
		this.aClass104_Sub2_19.method21118(this.aClass145_10);
		this.aClass104_Sub2_19.method21017(Class424.aClass424_4, this.anInt1174, 2);
	}

	@OriginalMember(owner = "client!ahz", name = "w", descriptor = "()V")
	@Override
	public void method10202() {
		this.aClass115_5.method8203(this.aClass116Array5[0]);
		this.aClass115_5.method8285();
		this.anIntArray99 = this.anIntArrayArray18[this.aClass115_5.method8253(-662244789)];
		this.method10204(-773619035);
	}

	@OriginalMember(owner = "client!ahz", name = "u", descriptor = "(B)Z")
	boolean method10206(@OriginalArg(0) byte arg0) throws Exception_Sub2 {
		this.aClass115_5 = this.aClass104_Sub2_19.method20904("Sprite");
		@Pc(11) Class93_Sub33_Sub1 local11 = this.aClass115_5.method8198("WVPMatrix", (byte) 0);
		@Pc(17) Class93_Sub33_Sub1 local17 = this.aClass115_5.method8198("SpriteSampler", (byte) 0);
		@Pc(23) Class93_Sub33_Sub1 local23 = this.aClass115_5.method8198("MaskSampler", (byte) 0);
		@Pc(29) Class93_Sub33_Sub1 local29 = this.aClass115_5.method8198("MulColour", (byte) 0);
		@Pc(35) Class93_Sub33_Sub1 local35 = this.aClass115_5.method8198("AddColour", (byte) 0);
		@Pc(41) Class93_Sub33_Sub1 local41 = this.aClass115_5.method8198("SpriteTexCoordMatrix", (byte) 0);
		@Pc(47) Class93_Sub33_Sub1 local47 = this.aClass115_5.method8198("MaskTexCoordMatrix", (byte) 0);
		this.aClass116Array5[0] = this.aClass115_5.method8268("Normal", 1249273355);
		this.aClass116Array5[1] = this.aClass115_5.method8268("Masked", 1249273355);
		this.aClass116Array5[2] = this.aClass115_5.method8268("AlphaTex", 1249273355);
		for (@Pc(76) int local76 = 0; local76 < 3; local76++) {
			@Pc(88) int local88 = this.aClass115_5.method8241(this.aClass116Array5[local76], 1533585557);
			this.anIntArrayArray18[local76][0] = local11.method23668(local88);
			this.anIntArrayArray18[local76][1] = local17.method23668(local88);
			this.anIntArrayArray18[local76][2] = local23.method23668(local88);
			this.anIntArrayArray18[local76][5] = local29.method23668(local88);
			this.anIntArrayArray18[local76][6] = local35.method23668(local88);
			this.anIntArrayArray18[local76][3] = local41.method23668(local88);
			this.anIntArrayArray18[local76][4] = local47.method23668(local88);
		}
		this.aClass115_5.method8203(this.aClass116Array5[0]);
		return true;
	}

	@OriginalMember(owner = "client!ahz", name = "p", descriptor = "()Z")
	boolean method10207() throws Exception_Sub2 {
		this.aClass115_5 = this.aClass104_Sub2_19.method20904("Sprite");
		@Pc(11) Class93_Sub33_Sub1 local11 = this.aClass115_5.method8198("WVPMatrix", (byte) 0);
		@Pc(17) Class93_Sub33_Sub1 local17 = this.aClass115_5.method8198("SpriteSampler", (byte) 0);
		@Pc(23) Class93_Sub33_Sub1 local23 = this.aClass115_5.method8198("MaskSampler", (byte) 0);
		@Pc(29) Class93_Sub33_Sub1 local29 = this.aClass115_5.method8198("MulColour", (byte) 0);
		@Pc(35) Class93_Sub33_Sub1 local35 = this.aClass115_5.method8198("AddColour", (byte) 0);
		@Pc(41) Class93_Sub33_Sub1 local41 = this.aClass115_5.method8198("SpriteTexCoordMatrix", (byte) 0);
		@Pc(47) Class93_Sub33_Sub1 local47 = this.aClass115_5.method8198("MaskTexCoordMatrix", (byte) 0);
		this.aClass116Array5[0] = this.aClass115_5.method8268("Normal", 1249273355);
		this.aClass116Array5[1] = this.aClass115_5.method8268("Masked", 1249273355);
		this.aClass116Array5[2] = this.aClass115_5.method8268("AlphaTex", 1249273355);
		for (@Pc(76) int local76 = 0; local76 < 3; local76++) {
			@Pc(88) int local88 = this.aClass115_5.method8241(this.aClass116Array5[local76], 1607115163);
			this.anIntArrayArray18[local76][0] = local11.method23668(local88);
			this.anIntArrayArray18[local76][1] = local17.method23668(local88);
			this.anIntArrayArray18[local76][2] = local23.method23668(local88);
			this.anIntArrayArray18[local76][5] = local29.method23668(local88);
			this.anIntArrayArray18[local76][6] = local35.method23668(local88);
			this.anIntArrayArray18[local76][3] = local41.method23668(local88);
			this.anIntArrayArray18[local76][4] = local47.method23668(local88);
		}
		this.aClass115_5.method8203(this.aClass116Array5[0]);
		return true;
	}

	@OriginalMember(owner = "client!ahz", name = "m", descriptor = "()V")
	@Override
	public void method10201() {
		this.aClass115_5.method8203(this.aClass116Array5[1]);
		this.aClass115_5.method8285();
		this.anIntArray99 = this.anIntArrayArray18[this.aClass115_5.method8253(-332074878)];
		this.aClass115_5.method8256(this.anIntArray99[2], 1, this.anInterface38_19, (byte) 0);
		this.aClass115_5.method8223(this.anIntArray99[4], this.aClass489_50, 1047815710);
		this.method10204(-115794341);
	}

	@OriginalMember(owner = "client!ahz", name = "c", descriptor = "()V")
	void method10208() {
		this.aClass115_5.method8256(this.anIntArray99[1], 0, this.anInterface38_20, (byte) 0);
		this.aClass104_Sub2_19.method20946(this.aClass489_48);
		this.aClass115_5.method8224(this.anIntArray99[0], this.aClass489_48, -1071743723);
		this.aClass115_5.method8223(this.anIntArray99[3], this.aClass489_49, 1047815710);
		this.aClass115_5.method8219(this.anIntArray99[5], this.aClass460_10.aFloat301, this.aClass460_10.aFloat300, this.aClass460_10.aFloat299, this.aClass460_10.aFloat302, 1741825539);
		this.aClass115_5.method8219(this.anIntArray99[6], this.aClass460_11.aFloat301, this.aClass460_11.aFloat300, this.aClass460_11.aFloat299, this.aClass460_11.aFloat302, 1741825539);
		this.aClass104_Sub2_19.method21060(0, this.anInterface37_9);
		this.aClass104_Sub2_19.method21118(this.aClass145_10);
		this.aClass104_Sub2_19.method21017(Class424.aClass424_4, this.anInt1174, 2);
	}

	@OriginalMember(owner = "client!ahz", name = "d", descriptor = "()Z")
	boolean method10209() throws Exception_Sub2 {
		this.aClass115_5 = this.aClass104_Sub2_19.method20904("Sprite");
		@Pc(11) Class93_Sub33_Sub1 local11 = this.aClass115_5.method8198("WVPMatrix", (byte) 0);
		@Pc(17) Class93_Sub33_Sub1 local17 = this.aClass115_5.method8198("SpriteSampler", (byte) 0);
		@Pc(23) Class93_Sub33_Sub1 local23 = this.aClass115_5.method8198("MaskSampler", (byte) 0);
		@Pc(29) Class93_Sub33_Sub1 local29 = this.aClass115_5.method8198("MulColour", (byte) 0);
		@Pc(35) Class93_Sub33_Sub1 local35 = this.aClass115_5.method8198("AddColour", (byte) 0);
		@Pc(41) Class93_Sub33_Sub1 local41 = this.aClass115_5.method8198("SpriteTexCoordMatrix", (byte) 0);
		@Pc(47) Class93_Sub33_Sub1 local47 = this.aClass115_5.method8198("MaskTexCoordMatrix", (byte) 0);
		this.aClass116Array5[0] = this.aClass115_5.method8268("Normal", 1249273355);
		this.aClass116Array5[1] = this.aClass115_5.method8268("Masked", 1249273355);
		this.aClass116Array5[2] = this.aClass115_5.method8268("AlphaTex", 1249273355);
		for (@Pc(76) int local76 = 0; local76 < 3; local76++) {
			@Pc(88) int local88 = this.aClass115_5.method8241(this.aClass116Array5[local76], 883297888);
			this.anIntArrayArray18[local76][0] = local11.method23668(local88);
			this.anIntArrayArray18[local76][1] = local17.method23668(local88);
			this.anIntArrayArray18[local76][2] = local23.method23668(local88);
			this.anIntArrayArray18[local76][5] = local29.method23668(local88);
			this.anIntArrayArray18[local76][6] = local35.method23668(local88);
			this.anIntArrayArray18[local76][3] = local41.method23668(local88);
			this.anIntArrayArray18[local76][4] = local47.method23668(local88);
		}
		this.aClass115_5.method8203(this.aClass116Array5[0]);
		return true;
	}
}
