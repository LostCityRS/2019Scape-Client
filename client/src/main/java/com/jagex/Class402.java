package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lp")
public final class Class402 {

	@OriginalMember(owner = "client!lp", name = "e", descriptor = "I")
	static final int anInt4841 = 128;

	@OriginalMember(owner = "client!lp", name = "n", descriptor = "I")
	static final int anInt4842 = 128;

	@OriginalMember(owner = "client!lp", name = "m", descriptor = "I")
	public static final int anInt4843 = 16;

	@OriginalMember(owner = "client!lp", name = "r", descriptor = "Ljava/lang/Object;")
	static Object anObject15;

	@OriginalMember(owner = "client!lp", name = "d", descriptor = "Ljava/lang/Object;")
	static Object anObject16;

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "Ljava/lang/Object;")
	static Object anObject17;

	@OriginalMember(owner = "client!lp", name = "w", descriptor = "[Lclient!lz;")
	Interface38[] anInterface38Array2 = null;

	@OriginalMember(owner = "client!lp", name = "l", descriptor = "Lclient!ll;")
	Interface35 anInterface35_2 = null;

	@OriginalMember(owner = "client!lp", name = "u", descriptor = "[Lclient!lz;")
	public Interface38[] anInterface38Array1 = null;

	@OriginalMember(owner = "client!lp", name = "z", descriptor = "Lclient!ll;")
	public Interface35 anInterface35_3 = null;

	@OriginalMember(owner = "client!lp", name = "p", descriptor = "Lclient!ll;")
	public Interface35 anInterface35_1 = null;

	@OriginalMember(owner = "client!lp", name = "k", descriptor = "Lclient!afc;")
	Class104_Sub2 aClass104_Sub2_36;

	@OriginalMember(owner = "client!lp", name = "f", descriptor = "Z")
	public boolean aBoolean755;

	@OriginalMember(owner = "client!lp", name = "e", descriptor = "()V")
	static void method28692() {
		@Pc(11) byte[] local11;
		if (anObject16 == null) {
			@Pc(5) Class140_Sub1_Sub2 local5 = new Class140_Sub1_Sub2();
			local11 = local5.method20336(128, 128, 16);
			anObject16 = Class113.method7411(local11, false, 1215292027);
		}
		if (anObject17 == null) {
			@Pc(22) Class140_Sub2_Sub2 local22 = new Class140_Sub2_Sub2();
			local11 = local22.method20421(128, 128, 16);
			anObject17 = Class113.method7411(local11, false, 1215292027);
		}
	}

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lclient!afc;)V")
	Class402(@OriginalArg(0) Class104_Sub2 arg0) {
		this.aClass104_Sub2_36 = arg0;
		this.aBoolean755 = this.aClass104_Sub2_36.aBoolean472;
		if (this.aBoolean755 && !this.aClass104_Sub2_36.aBoolean470) {
			this.aBoolean755 = false;
		}
		if (this.aBoolean755 && !this.aClass104_Sub2_36.method21230(Class206.aClass206_21, Class226.aClass226_22)) {
			this.aBoolean755 = false;
		}
		if (this.aBoolean755 || this.aClass104_Sub2_36.method20966(Class206.aClass206_21, Class226.aClass226_22)) {
			method28692();
			if (this.aBoolean755) {
				@Pc(128) byte[] local128 = Class331.method27479(anObject16, false, -702112405);
				this.anInterface35_2 = this.aClass104_Sub2_36.method21138(Class206.aClass206_21, 128, 128, 16, true, local128);
				@Pc(144) byte[] local144 = Class331.method27479(anObject17, false, 854468817);
				this.anInterface35_3 = this.aClass104_Sub2_36.method21138(Class206.aClass206_21, 128, 128, 16, true, local144);
			} else {
				this.anInterface38Array2 = new Interface38[16];
				@Pc(66) int local66;
				@Pc(77) byte[] local77;
				for (local66 = 0; local66 < 16; local66++) {
					local77 = Class441.method29037(anObject16, local66 * 32768, 32768, 1048575);
					this.anInterface38Array2[local66] = this.aClass104_Sub2_36.method20968(Class206.aClass206_21, 128, 128, true, local77);
				}
				this.anInterface38Array1 = new Interface38[16];
				for (local66 = 0; local66 < 16; local66++) {
					local77 = Class441.method29037(anObject17, local66 * 32768, 32768, 1048575);
					this.anInterface38Array1[local66] = this.aClass104_Sub2_36.method20968(Class206.aClass206_21, 128, 128, true, local77);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lp", name = "n", descriptor = "()Z")
	public boolean method28689() {
		return this.aBoolean755 ? this.anInterface35_2 != null : this.anInterface38Array2 != null;
	}

	@OriginalMember(owner = "client!lp", name = "l", descriptor = "()Z")
	public boolean method28690() {
		if (!this.aClass104_Sub2_36.aBoolean472) {
			return false;
		}
		if (this.anInterface35_1 == null) {
			@Pc(25) byte[] local25;
			if (anObject15 == null) {
				local25 = Class571.method31505(128, 128, 16, 8, new Class161_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
				anObject15 = Class113.method7411(local25, false, 1215292027);
			}
			local25 = Class331.method27479(anObject15, false, 1149898089);
			@Pc(41) byte[] local41 = new byte[local25.length * 4];
			@Pc(43) int local43 = 0;
			for (@Pc(45) int local45 = 0; local45 < 16; local45++) {
				@Pc(52) int local52 = local45 * 16384;
				@Pc(54) int local54 = local52;
				for (@Pc(56) int local56 = 0; local56 < 128; local56++) {
					@Pc(65) int local65 = local54 + local56 * 128;
					@Pc(75) int local75 = local54 + (local56 - 1 & 0x7F) * 128;
					@Pc(85) int local85 = local54 + (local56 + 1 & 0x7F) * 128;
					for (@Pc(87) int local87 = 0; local87 < 128; local87++) {
						@Pc(107) float local107 = (float) ((local25[local75 + local87] & 0xFF) - (local25[local85 + local87] & 0xFF));
						@Pc(132) float local132 = (float) ((local25[local65 + (local87 - 1 & 0x7F)] & 0xFF) - (local25[local65 + (local87 + 1 & 0x7F)] & 0xFF));
						@Pc(147) float local147 = (float) (128.0D / Math.sqrt((double) (local132 * local132 + 16384.0F + local107 * local107)));
						local41[local43++] = (byte) (local132 * local147 + 127.0F);
						local41[local43++] = (byte) (local147 * 128.0F + 127.0F);
						local41[local43++] = (byte) (local107 * local147 + 127.0F);
						local41[local43++] = local25[local52++];
					}
				}
			}
			this.anInterface35_1 = this.aClass104_Sub2_36.method21138(Class206.aClass206_22, 128, 128, 16, true, local41);
		}
		return this.anInterface35_1 != null;
	}

	@OriginalMember(owner = "client!lp", name = "m", descriptor = "()Z")
	public boolean method28691() {
		if (!this.aClass104_Sub2_36.aBoolean472) {
			return false;
		}
		if (this.anInterface35_1 == null) {
			@Pc(25) byte[] local25;
			if (anObject15 == null) {
				local25 = Class571.method31505(128, 128, 16, 8, new Class161_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
				anObject15 = Class113.method7411(local25, false, 1215292027);
			}
			local25 = Class331.method27479(anObject15, false, -1048657981);
			@Pc(41) byte[] local41 = new byte[local25.length * 4];
			@Pc(43) int local43 = 0;
			for (@Pc(45) int local45 = 0; local45 < 16; local45++) {
				@Pc(52) int local52 = local45 * 16384;
				@Pc(54) int local54 = local52;
				for (@Pc(56) int local56 = 0; local56 < 128; local56++) {
					@Pc(65) int local65 = local54 + local56 * 128;
					@Pc(75) int local75 = local54 + (local56 - 1 & 0x7F) * 128;
					@Pc(85) int local85 = local54 + (local56 + 1 & 0x7F) * 128;
					for (@Pc(87) int local87 = 0; local87 < 128; local87++) {
						@Pc(107) float local107 = (float) ((local25[local75 + local87] & 0xFF) - (local25[local85 + local87] & 0xFF));
						@Pc(132) float local132 = (float) ((local25[local65 + (local87 - 1 & 0x7F)] & 0xFF) - (local25[local65 + (local87 + 1 & 0x7F)] & 0xFF));
						@Pc(147) float local147 = (float) (128.0D / Math.sqrt((double) (local132 * local132 + 16384.0F + local107 * local107)));
						local41[local43++] = (byte) (local132 * local147 + 127.0F);
						local41[local43++] = (byte) (local147 * 128.0F + 127.0F);
						local41[local43++] = (byte) (local107 * local147 + 127.0F);
						local41[local43++] = local25[local52++];
					}
				}
			}
			this.anInterface35_1 = this.aClass104_Sub2_36.method21138(Class206.aClass206_22, 128, 128, 16, true, local41);
		}
		return this.anInterface35_1 != null;
	}

	@OriginalMember(owner = "client!lp", name = "f", descriptor = "()Z")
	public boolean method28693() {
		if (!this.aClass104_Sub2_36.aBoolean472) {
			return false;
		}
		if (this.anInterface35_1 == null) {
			@Pc(25) byte[] local25;
			if (anObject15 == null) {
				local25 = Class571.method31505(128, 128, 16, 8, new Class161_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
				anObject15 = Class113.method7411(local25, false, 1215292027);
			}
			local25 = Class331.method27479(anObject15, false, -215838624);
			@Pc(41) byte[] local41 = new byte[local25.length * 4];
			@Pc(43) int local43 = 0;
			for (@Pc(45) int local45 = 0; local45 < 16; local45++) {
				@Pc(52) int local52 = local45 * 16384;
				@Pc(54) int local54 = local52;
				for (@Pc(56) int local56 = 0; local56 < 128; local56++) {
					@Pc(65) int local65 = local54 + local56 * 128;
					@Pc(75) int local75 = local54 + (local56 - 1 & 0x7F) * 128;
					@Pc(85) int local85 = local54 + (local56 + 1 & 0x7F) * 128;
					for (@Pc(87) int local87 = 0; local87 < 128; local87++) {
						@Pc(107) float local107 = (float) ((local25[local75 + local87] & 0xFF) - (local25[local85 + local87] & 0xFF));
						@Pc(132) float local132 = (float) ((local25[local65 + (local87 - 1 & 0x7F)] & 0xFF) - (local25[local65 + (local87 + 1 & 0x7F)] & 0xFF));
						@Pc(147) float local147 = (float) (128.0D / Math.sqrt((double) (local132 * local132 + 16384.0F + local107 * local107)));
						local41[local43++] = (byte) (local132 * local147 + 127.0F);
						local41[local43++] = (byte) (local147 * 128.0F + 127.0F);
						local41[local43++] = (byte) (local107 * local147 + 127.0F);
						local41[local43++] = local25[local52++];
					}
				}
			}
			this.anInterface35_1 = this.aClass104_Sub2_36.method21138(Class206.aClass206_22, 128, 128, 16, true, local41);
		}
		return this.anInterface35_1 != null;
	}

	@OriginalMember(owner = "client!lp", name = "w", descriptor = "()Z")
	public boolean method28694() {
		if (!this.aClass104_Sub2_36.aBoolean472) {
			return false;
		}
		if (this.anInterface35_1 == null) {
			@Pc(25) byte[] local25;
			if (anObject15 == null) {
				local25 = Class571.method31505(128, 128, 16, 8, new Class161_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
				anObject15 = Class113.method7411(local25, false, 1215292027);
			}
			local25 = Class331.method27479(anObject15, false, 1961252037);
			@Pc(41) byte[] local41 = new byte[local25.length * 4];
			@Pc(43) int local43 = 0;
			for (@Pc(45) int local45 = 0; local45 < 16; local45++) {
				@Pc(52) int local52 = local45 * 16384;
				@Pc(54) int local54 = local52;
				for (@Pc(56) int local56 = 0; local56 < 128; local56++) {
					@Pc(65) int local65 = local54 + local56 * 128;
					@Pc(75) int local75 = local54 + (local56 - 1 & 0x7F) * 128;
					@Pc(85) int local85 = local54 + (local56 + 1 & 0x7F) * 128;
					for (@Pc(87) int local87 = 0; local87 < 128; local87++) {
						@Pc(107) float local107 = (float) ((local25[local75 + local87] & 0xFF) - (local25[local85 + local87] & 0xFF));
						@Pc(132) float local132 = (float) ((local25[local65 + (local87 - 1 & 0x7F)] & 0xFF) - (local25[local65 + (local87 + 1 & 0x7F)] & 0xFF));
						@Pc(147) float local147 = (float) (128.0D / Math.sqrt((double) (local132 * local132 + 16384.0F + local107 * local107)));
						local41[local43++] = (byte) (local132 * local147 + 127.0F);
						local41[local43++] = (byte) (local147 * 128.0F + 127.0F);
						local41[local43++] = (byte) (local107 * local147 + 127.0F);
						local41[local43++] = local25[local52++];
					}
				}
			}
			this.anInterface35_1 = this.aClass104_Sub2_36.method21138(Class206.aClass206_22, 128, 128, 16, true, local41);
		}
		return this.anInterface35_1 != null;
	}

	@OriginalMember(owner = "client!lp", name = "k", descriptor = "()Z")
	public boolean method28695() {
		return this.aBoolean755 ? this.anInterface35_2 != null : this.anInterface38Array2 != null;
	}
}
