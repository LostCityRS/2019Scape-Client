package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!anc")
public final class Class25_Sub2 extends Class25 {

	@OriginalMember(owner = "client!anc", name = "n", descriptor = "Lclient!ox;")
	final Class472 aClass472_48 = new Class472(Float.NaN, Float.NaN, Float.NaN);

	@OriginalMember(owner = "client!anc", name = "m", descriptor = "Lclient!ox;")
	final Class472 aClass472_49 = new Class472(Float.NaN, Float.NaN, Float.NaN);

	@OriginalMember(owner = "client!anc", name = "k", descriptor = "Lclient!ox;")
	final Class472 aClass472_50 = new Class472();

	@OriginalMember(owner = "client!anc", name = "e", descriptor = "(Ljava/lang/CharSequence;B)Ljava/lang/String;")
	public static String method16033(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) byte arg1) {
		@Pc(2) int local2 = arg0.length();
		@Pc(7) StringBuilder local7 = new StringBuilder(local2);
		for (@Pc(9) int local9 = 0; local9 < local2; local9++) {
			@Pc(16) char local16 = arg0.charAt(local9);
			if (local16 >= 'a' && local16 <= 'z' || !(local16 < 'A' || local16 > 'Z') || local16 >= '0' && local16 <= '9' || local16 == '.' || local16 == '-' || local16 == '*' || local16 == '_') {
				local7.append(local16);
			} else if (local16 == ' ') {
				local7.append('+');
			} else {
				@Pc(63) byte local63 = Class138_Sub3.method11406(local16, 1973178655);
				local7.append('%');
				@Pc(73) int local73 = local63 >> 4 & 0xF;
				if (local73 >= 10) {
					local7.append((char) (local73 + 55));
				} else {
					local7.append((char) (local73 + 48));
				}
				local73 = local63 & 0xF;
				if (local73 >= 10) {
					local7.append((char) (local73 + 55));
				} else {
					local7.append((char) (local73 + 48));
				}
			}
		}
		return local7.toString();
	}

	@OriginalMember(owner = "client!anc", name = "<init>", descriptor = "(Lclient!je;)V")
	public Class25_Sub2(@OriginalArg(0) Class123 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!anc", name = "q", descriptor = "(Lclient!akt;B)V")
	public void method16030(@OriginalArg(0) CoordFine arg0, @OriginalArg(1) byte arg1) {
		this.aClass472_49.aFloat325 = arg0.anInt1610 * -427776677;
		this.aClass472_49.aFloat326 = arg0.anInt1611 * 1802884841;
		this.aClass472_49.aFloat327 = arg0.anInt1612 * 671628745;
		if (Float.isNaN(this.aClass472_48.aFloat325)) {
			this.aClass472_48.method29719(this.aClass472_49);
			this.aClass472_50.method29720();
		}
	}

	@OriginalMember(owner = "client!anc", name = "o", descriptor = "(Lclient!alw;)V")
	@Override
	public void method23143(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aClass472_49.method29717(arg0);
	}

	@OriginalMember(owner = "client!anc", name = "n", descriptor = "(I)Z")
	@Override
	public boolean method23144(@OriginalArg(0) int arg0) {
		return !Float.isNaN(this.aClass472_48.aFloat325);
	}

	@OriginalMember(owner = "client!anc", name = "f", descriptor = "(Lclient!ju;Lclient!ou;IIFB)V")
	@Override
	public void method23135(@OriginalArg(0) Class368 arg0, @OriginalArg(1) Class470 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) byte arg5) {
		@Pc(5) Class472 local5 = Class472.method29711(this.aClass123_16.method8957(-2006254837));
		local5.aFloat325 -= arg2;
		local5.aFloat327 -= arg3;
		local5.aFloat326 *= -1.0F;
		@Pc(29) Class472 local29 = Class472.method29711(this.aClass472_48);
		local29.aFloat325 -= arg2;
		local29.aFloat327 -= arg3;
		local29.aFloat326 *= -1.0F;
		arg1.method29549((double) local5.aFloat325, (double) local5.aFloat326, (double) local5.aFloat327, (double) local29.aFloat325, (double) local29.aFloat326, (double) local29.aFloat327, 0.0F, 1.0F, 0.0F);
		local5.method29713();
		local29.method29713();
	}

	@OriginalMember(owner = "client!anc", name = "p", descriptor = "(Lclient!ju;Lclient!ou;IIF)V")
	@Override
	public void method23138(@OriginalArg(0) Class368 arg0, @OriginalArg(1) Class470 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(5) Class472 local5 = Class472.method29711(this.aClass123_16.method8957(-1240354525));
		local5.aFloat325 -= arg2;
		local5.aFloat327 -= arg3;
		local5.aFloat326 *= -1.0F;
		@Pc(29) Class472 local29 = Class472.method29711(this.aClass472_48);
		local29.aFloat325 -= arg2;
		local29.aFloat327 -= arg3;
		local29.aFloat326 *= -1.0F;
		arg1.method29549((double) local5.aFloat325, (double) local5.aFloat326, (double) local5.aFloat327, (double) local29.aFloat325, (double) local29.aFloat326, (double) local29.aFloat327, 0.0F, 1.0F, 0.0F);
		local5.method29713();
		local29.method29713();
	}

	@OriginalMember(owner = "client!anc", name = "k", descriptor = "(I)Lclient!ox;")
	@Override
	public Class472 method23134(@OriginalArg(0) int arg0) {
		return Class472.method29711(this.aClass472_49);
	}

	@OriginalMember(owner = "client!anc", name = "d", descriptor = "()Lclient!ox;")
	@Override
	public Class472 method23139() {
		return Class472.method29711(this.aClass472_48);
	}

	@OriginalMember(owner = "client!anc", name = "x", descriptor = "(Lclient!akt;)V")
	public void method16031(@OriginalArg(0) CoordFine arg0) {
		this.aClass472_49.aFloat325 = arg0.anInt1610 * -427776677;
		this.aClass472_49.aFloat326 = arg0.anInt1611 * 1802884841;
		this.aClass472_49.aFloat327 = arg0.anInt1612 * 671628745;
		if (Float.isNaN(this.aClass472_48.aFloat325)) {
			this.aClass472_48.method29719(this.aClass472_49);
			this.aClass472_50.method29720();
		}
	}

	@OriginalMember(owner = "client!anc", name = "b", descriptor = "(Lclient!akt;)V")
	public void method16032(@OriginalArg(0) CoordFine arg0) {
		this.aClass472_49.aFloat325 = arg0.anInt1610 * -427776677;
		this.aClass472_49.aFloat326 = arg0.anInt1611 * 1802884841;
		this.aClass472_49.aFloat327 = arg0.anInt1612 * 671628745;
		if (Float.isNaN(this.aClass472_48.aFloat325)) {
			this.aClass472_48.method29719(this.aClass472_49);
			this.aClass472_50.method29720();
		}
	}

	@OriginalMember(owner = "client!anc", name = "l", descriptor = "(F)V")
	@Override
	public void method23140(@OriginalArg(0) float arg0) {
		this.aClass123_16.method9050(false, arg0, this.aClass472_48, this.aClass123_16.method8964(975758127), this.aClass472_49, this.aClass472_50, (byte) -19);
	}

	@OriginalMember(owner = "client!anc", name = "u", descriptor = "(F)V")
	@Override
	public void method23136(@OriginalArg(0) float arg0) {
		this.aClass123_16.method9050(false, arg0, this.aClass472_48, this.aClass123_16.method8964(44780007), this.aClass472_49, this.aClass472_50, (byte) -2);
	}

	@OriginalMember(owner = "client!anc", name = "z", descriptor = "()Z")
	@Override
	public boolean method23137() {
		return !Float.isNaN(this.aClass472_48.aFloat325);
	}

	@OriginalMember(owner = "client!anc", name = "w", descriptor = "(Lclient!alw;I)V")
	@Override
	public void method23131(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.aClass472_49.method29717(arg0);
	}

	@OriginalMember(owner = "client!anc", name = "m", descriptor = "(I)Lclient!ox;")
	@Override
	public Class472 method23132(@OriginalArg(0) int arg0) {
		return Class472.method29711(this.aClass472_48);
	}

	@OriginalMember(owner = "client!anc", name = "c", descriptor = "(Lclient!alw;)V")
	@Override
	public void method23133(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aClass472_49.method29717(arg0);
	}

	@OriginalMember(owner = "client!anc", name = "r", descriptor = "(Lclient!alw;)V")
	@Override
	public void method23141(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aClass472_49.method29717(arg0);
	}

	@OriginalMember(owner = "client!anc", name = "v", descriptor = "(Lclient!alw;)V")
	@Override
	public void method23142(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aClass472_49.method29717(arg0);
	}

	@OriginalMember(owner = "client!anc", name = "e", descriptor = "(FB)V")
	@Override
	public void method23130(@OriginalArg(0) float arg0, @OriginalArg(1) byte arg1) {
		this.aClass123_16.method9050(false, arg0, this.aClass472_48, this.aClass123_16.method8964(1984510670), this.aClass472_49, this.aClass472_50, (byte) 17);
	}

	@OriginalMember(owner = "client!anc", name = "s", descriptor = "()Lclient!ox;")
	@Override
	public Class472 method23129() {
		return Class472.method29711(this.aClass472_49);
	}

	@OriginalMember(owner = "client!anc", name = "y", descriptor = "()Lclient!ox;")
	@Override
	public Class472 method23145() {
		return Class472.method29711(this.aClass472_49);
	}
}
