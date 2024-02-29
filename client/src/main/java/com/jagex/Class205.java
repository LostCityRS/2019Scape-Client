package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ci")
public class Class205 {

	@OriginalMember(owner = "client!ci", name = "z", descriptor = "[[Lclient!bt;")
	Class195[][] aClass195ArrayArray1;

	@OriginalMember(owner = "client!ci", name = "e", descriptor = "Lclient!afa;")
	final Class104_Sub1 aClass104_Sub1_45;

	@OriginalMember(owner = "client!ci", name = "n", descriptor = "Lclient!aek;")
	final Class99_Sub2 aClass99_Sub2_3;

	@OriginalMember(owner = "client!ci", name = "m", descriptor = "I")
	final int anInt3384;

	@OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
	final int anInt3386;

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "[B")
	final byte[] aByteArray66;

	@OriginalMember(owner = "client!ci", name = "u", descriptor = "I")
	final int anInt3387;

	@OriginalMember(owner = "client!ci", name = "w", descriptor = "I")
	final int anInt3385;

	@OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
	final int anInt3383;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lclient!afa;Lclient!aek;)V", line = 19)
	Class205(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) Class99_Sub2 arg1) {
		this.aClass104_Sub1_45 = arg0;
		this.aClass99_Sub2_3 = arg1;
		this.anInt3384 = (this.aClass99_Sub2_3.anInt414 * -1667858293 * this.aClass99_Sub2_3.anInt412 * -1678286317 >> this.aClass104_Sub1_45.anInt532) + 2;
		this.anInt3386 = (this.aClass99_Sub2_3.anInt413 * -143202029 * this.aClass99_Sub2_3.anInt412 * -1678286317 >> this.aClass104_Sub1_45.anInt532) + 2;
		this.aByteArray66 = new byte[this.anInt3384 * this.anInt3386];
		this.anInt3387 = this.aClass104_Sub1_45.anInt532 + 7 - this.aClass99_Sub2_3.anInt415 * -373302705;
		this.anInt3385 = this.aClass99_Sub2_3.anInt414 * -1667858293 >> this.anInt3387;
		this.anInt3383 = this.aClass99_Sub2_3.anInt413 * -143202029 >> this.anInt3387;
	}

	@OriginalMember(owner = "client!ci", name = "e", descriptor = "()V", line = 31)
	void method24674() {
		this.aClass195ArrayArray1 = new Class195[this.anInt3385][this.anInt3383];
		for (@Pc(8) int local8 = 0; local8 < this.anInt3383; local8++) {
			for (@Pc(14) int local14 = 0; local14 < this.anInt3385; local14++) {
				this.aClass195ArrayArray1[local14][local8] = new Class195(this.aClass104_Sub1_45, this, this.aClass99_Sub2_3, local14, local8, this.anInt3387, local14 * 128 + 1, local8 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "p", descriptor = "()V", line = 31)
	void method24675() {
		this.aClass195ArrayArray1 = new Class195[this.anInt3385][this.anInt3383];
		for (@Pc(8) int local8 = 0; local8 < this.anInt3383; local8++) {
			for (@Pc(14) int local14 = 0; local14 < this.anInt3385; local14++) {
				this.aClass195ArrayArray1[local14][local8] = new Class195(this.aClass104_Sub1_45, this, this.aClass99_Sub2_3, local14, local8, this.anInt3387, local14 * 128 + 1, local8 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "r", descriptor = "(III[[ZZ)V", line = 40)
	void method24676(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.aClass104_Sub1_45.method3921(false);
		this.aClass104_Sub1_45.method3931(false);
		this.aClass104_Sub1_45.method3873(-2);
		this.aClass104_Sub1_45.method3888(1);
		this.aClass104_Sub1_45.method3938(1);
		@Pc(28) float local28 = 1.0F / (float) (this.aClass104_Sub1_45.anInt531 * 128);
		@Pc(32) int local32;
		@Pc(41) int local41;
		@Pc(48) int local48;
		@Pc(50) int local50;
		@Pc(59) int local59;
		@Pc(66) int local66;
		@Pc(68) int local68;
		if (arg4) {
			for (local32 = 0; local32 < this.anInt3383; local32++) {
				local41 = local32 << this.anInt3387;
				local48 = local32 + 1 << this.anInt3387;
				label128: for (local50 = 0; local50 < this.anInt3385; local50++) {
					local59 = local50 << this.anInt3387;
					local66 = local50 + 1 << this.anInt3387;
					for (local68 = local59; local68 < local66; local68++) {
						if (local68 - arg0 >= -arg2 && local68 - arg0 <= arg2) {
							for (@Pc(84) int local84 = local41; local84 < local48; local84++) {
								if (local84 - arg1 >= -arg2 && local84 - arg1 <= arg2 && arg3[local68 - arg0 + arg2][local84 - arg1 + arg2]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local28, local28, 1.0F);
									OpenGL.glTranslatef((float) -local50 / local28, (float) -local32 / local28, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass195ArrayArray1[local50][local32].method24598();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local32 = 0; local32 < this.anInt3383; local32++) {
				local41 = local32 << this.anInt3387;
				local48 = local32 + 1 << this.anInt3387;
				for (local50 = 0; local50 < this.anInt3385; local50++) {
					local59 = 0;
					local66 = local50 << this.anInt3387;
					local68 = local50 + 1 << this.anInt3387;
					@Pc(192) Class93_Sub41_Sub1 local192 = this.aClass104_Sub1_45.aClass93_Sub41_Sub1_1;
					local192.anInt3070 = 0;
					for (@Pc(197) int local197 = local41; local197 < local48; local197++) {
						if (local197 - arg1 >= -arg2 && local197 - arg1 <= arg2) {
							@Pc(221) int local221 = local197 * this.aClass99_Sub2_3.anInt414 * -1667858293 + local66;
							for (@Pc(223) int local223 = local66; local223 < local68; local223++) {
								if (local223 - arg0 >= -arg2 && local223 - arg0 <= arg2 && arg3[local223 - arg0 + arg2][local197 - arg1 + arg2]) {
									@Pc(257) short[] local257 = this.aClass99_Sub2_3.aShortArrayArray2[local221];
									if (local257 != null) {
										@Pc(265) int local265;
										if (this.aClass104_Sub1_45.aBoolean106) {
											for (local265 = 0; local265 < local257.length; local265++) {
												local192.method22395(local257[local265] & 0xFFFF, 2131751172);
												local59++;
											}
										} else {
											for (local265 = 0; local265 < local257.length; local265++) {
												local192.method22398(local257[local265] & 0xFFFF, -1059514351);
												local59++;
											}
										}
									}
								}
								local221++;
							}
						}
					}
					if (local59 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local28, local28, 1.0F);
						OpenGL.glTranslatef((float) -local50 / local28, (float) -local32 / local28, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass195ArrayArray1[local50][local32].method24604(local192.aByteArray58, local59);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ci", name = "n", descriptor = "(III[[ZZ)V", line = 40)
	void method24677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.aClass104_Sub1_45.method3921(false);
		this.aClass104_Sub1_45.method3931(false);
		this.aClass104_Sub1_45.method3873(-2);
		this.aClass104_Sub1_45.method3888(1);
		this.aClass104_Sub1_45.method3938(1);
		@Pc(28) float local28 = 1.0F / (float) (this.aClass104_Sub1_45.anInt531 * 128);
		@Pc(32) int local32;
		@Pc(41) int local41;
		@Pc(48) int local48;
		@Pc(50) int local50;
		@Pc(59) int local59;
		@Pc(66) int local66;
		@Pc(68) int local68;
		if (arg4) {
			for (local32 = 0; local32 < this.anInt3383; local32++) {
				local41 = local32 << this.anInt3387;
				local48 = local32 + 1 << this.anInt3387;
				label128: for (local50 = 0; local50 < this.anInt3385; local50++) {
					local59 = local50 << this.anInt3387;
					local66 = local50 + 1 << this.anInt3387;
					for (local68 = local59; local68 < local66; local68++) {
						if (local68 - arg0 >= -arg2 && local68 - arg0 <= arg2) {
							for (@Pc(84) int local84 = local41; local84 < local48; local84++) {
								if (local84 - arg1 >= -arg2 && local84 - arg1 <= arg2 && arg3[local68 - arg0 + arg2][local84 - arg1 + arg2]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local28, local28, 1.0F);
									OpenGL.glTranslatef((float) -local50 / local28, (float) -local32 / local28, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass195ArrayArray1[local50][local32].method24598();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local32 = 0; local32 < this.anInt3383; local32++) {
				local41 = local32 << this.anInt3387;
				local48 = local32 + 1 << this.anInt3387;
				for (local50 = 0; local50 < this.anInt3385; local50++) {
					local59 = 0;
					local66 = local50 << this.anInt3387;
					local68 = local50 + 1 << this.anInt3387;
					@Pc(192) Class93_Sub41_Sub1 local192 = this.aClass104_Sub1_45.aClass93_Sub41_Sub1_1;
					local192.anInt3070 = 0;
					for (@Pc(197) int local197 = local41; local197 < local48; local197++) {
						if (local197 - arg1 >= -arg2 && local197 - arg1 <= arg2) {
							@Pc(221) int local221 = local197 * this.aClass99_Sub2_3.anInt414 * -1667858293 + local66;
							for (@Pc(223) int local223 = local66; local223 < local68; local223++) {
								if (local223 - arg0 >= -arg2 && local223 - arg0 <= arg2 && arg3[local223 - arg0 + arg2][local197 - arg1 + arg2]) {
									@Pc(257) short[] local257 = this.aClass99_Sub2_3.aShortArrayArray2[local221];
									if (local257 != null) {
										@Pc(265) int local265;
										if (this.aClass104_Sub1_45.aBoolean106) {
											for (local265 = 0; local265 < local257.length; local265++) {
												local192.method22395(local257[local265] & 0xFFFF, 2142693823);
												local59++;
											}
										} else {
											for (local265 = 0; local265 < local257.length; local265++) {
												local192.method22398(local257[local265] & 0xFFFF, -437272909);
												local59++;
											}
										}
									}
								}
								local221++;
							}
						}
					}
					if (local59 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local28, local28, 1.0F);
						OpenGL.glTranslatef((float) -local50 / local28, (float) -local32 / local28, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass195ArrayArray1[local50][local32].method24604(local192.aByteArray58, local59);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "(III[[ZZ)V", line = 40)
	void method24678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.aClass104_Sub1_45.method3921(false);
		this.aClass104_Sub1_45.method3931(false);
		this.aClass104_Sub1_45.method3873(-2);
		this.aClass104_Sub1_45.method3888(1);
		this.aClass104_Sub1_45.method3938(1);
		@Pc(28) float local28 = 1.0F / (float) (this.aClass104_Sub1_45.anInt531 * 128);
		@Pc(32) int local32;
		@Pc(41) int local41;
		@Pc(48) int local48;
		@Pc(50) int local50;
		@Pc(59) int local59;
		@Pc(66) int local66;
		@Pc(68) int local68;
		if (arg4) {
			for (local32 = 0; local32 < this.anInt3383; local32++) {
				local41 = local32 << this.anInt3387;
				local48 = local32 + 1 << this.anInt3387;
				label128: for (local50 = 0; local50 < this.anInt3385; local50++) {
					local59 = local50 << this.anInt3387;
					local66 = local50 + 1 << this.anInt3387;
					for (local68 = local59; local68 < local66; local68++) {
						if (local68 - arg0 >= -arg2 && local68 - arg0 <= arg2) {
							for (@Pc(84) int local84 = local41; local84 < local48; local84++) {
								if (local84 - arg1 >= -arg2 && local84 - arg1 <= arg2 && arg3[local68 - arg0 + arg2][local84 - arg1 + arg2]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local28, local28, 1.0F);
									OpenGL.glTranslatef((float) -local50 / local28, (float) -local32 / local28, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass195ArrayArray1[local50][local32].method24598();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local32 = 0; local32 < this.anInt3383; local32++) {
				local41 = local32 << this.anInt3387;
				local48 = local32 + 1 << this.anInt3387;
				for (local50 = 0; local50 < this.anInt3385; local50++) {
					local59 = 0;
					local66 = local50 << this.anInt3387;
					local68 = local50 + 1 << this.anInt3387;
					@Pc(192) Class93_Sub41_Sub1 local192 = this.aClass104_Sub1_45.aClass93_Sub41_Sub1_1;
					local192.anInt3070 = 0;
					for (@Pc(197) int local197 = local41; local197 < local48; local197++) {
						if (local197 - arg1 >= -arg2 && local197 - arg1 <= arg2) {
							@Pc(221) int local221 = local197 * this.aClass99_Sub2_3.anInt414 * -1667858293 + local66;
							for (@Pc(223) int local223 = local66; local223 < local68; local223++) {
								if (local223 - arg0 >= -arg2 && local223 - arg0 <= arg2 && arg3[local223 - arg0 + arg2][local197 - arg1 + arg2]) {
									@Pc(257) short[] local257 = this.aClass99_Sub2_3.aShortArrayArray2[local221];
									if (local257 != null) {
										@Pc(265) int local265;
										if (this.aClass104_Sub1_45.aBoolean106) {
											for (local265 = 0; local265 < local257.length; local265++) {
												local192.method22395(local257[local265] & 0xFFFF, 2127846113);
												local59++;
											}
										} else {
											for (local265 = 0; local265 < local257.length; local265++) {
												local192.method22398(local257[local265] & 0xFFFF, -971449743);
												local59++;
											}
										}
									}
								}
								local221++;
							}
						}
					}
					if (local59 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local28, local28, 1.0F);
						OpenGL.glTranslatef((float) -local50 / local28, (float) -local32 / local28, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass195ArrayArray1[local50][local32].method24604(local192.aByteArray58, local59);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "(III[[ZZ)V", line = 40)
	void method24679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.aClass104_Sub1_45.method3921(false);
		this.aClass104_Sub1_45.method3931(false);
		this.aClass104_Sub1_45.method3873(-2);
		this.aClass104_Sub1_45.method3888(1);
		this.aClass104_Sub1_45.method3938(1);
		@Pc(28) float local28 = 1.0F / (float) (this.aClass104_Sub1_45.anInt531 * 128);
		@Pc(32) int local32;
		@Pc(41) int local41;
		@Pc(48) int local48;
		@Pc(50) int local50;
		@Pc(59) int local59;
		@Pc(66) int local66;
		@Pc(68) int local68;
		if (arg4) {
			for (local32 = 0; local32 < this.anInt3383; local32++) {
				local41 = local32 << this.anInt3387;
				local48 = local32 + 1 << this.anInt3387;
				label128: for (local50 = 0; local50 < this.anInt3385; local50++) {
					local59 = local50 << this.anInt3387;
					local66 = local50 + 1 << this.anInt3387;
					for (local68 = local59; local68 < local66; local68++) {
						if (local68 - arg0 >= -arg2 && local68 - arg0 <= arg2) {
							for (@Pc(84) int local84 = local41; local84 < local48; local84++) {
								if (local84 - arg1 >= -arg2 && local84 - arg1 <= arg2 && arg3[local68 - arg0 + arg2][local84 - arg1 + arg2]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local28, local28, 1.0F);
									OpenGL.glTranslatef((float) -local50 / local28, (float) -local32 / local28, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass195ArrayArray1[local50][local32].method24598();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local32 = 0; local32 < this.anInt3383; local32++) {
				local41 = local32 << this.anInt3387;
				local48 = local32 + 1 << this.anInt3387;
				for (local50 = 0; local50 < this.anInt3385; local50++) {
					local59 = 0;
					local66 = local50 << this.anInt3387;
					local68 = local50 + 1 << this.anInt3387;
					@Pc(192) Class93_Sub41_Sub1 local192 = this.aClass104_Sub1_45.aClass93_Sub41_Sub1_1;
					local192.anInt3070 = 0;
					for (@Pc(197) int local197 = local41; local197 < local48; local197++) {
						if (local197 - arg1 >= -arg2 && local197 - arg1 <= arg2) {
							@Pc(221) int local221 = local197 * this.aClass99_Sub2_3.anInt414 * -1667858293 + local66;
							for (@Pc(223) int local223 = local66; local223 < local68; local223++) {
								if (local223 - arg0 >= -arg2 && local223 - arg0 <= arg2 && arg3[local223 - arg0 + arg2][local197 - arg1 + arg2]) {
									@Pc(257) short[] local257 = this.aClass99_Sub2_3.aShortArrayArray2[local221];
									if (local257 != null) {
										@Pc(265) int local265;
										if (this.aClass104_Sub1_45.aBoolean106) {
											for (local265 = 0; local265 < local257.length; local265++) {
												local192.method22395(local257[local265] & 0xFFFF, 2144950106);
												local59++;
											}
										} else {
											for (local265 = 0; local265 < local257.length; local265++) {
												local192.method22398(local257[local265] & 0xFFFF, -580967337);
												local59++;
											}
										}
									}
								}
								local221++;
							}
						}
					}
					if (local59 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local28, local28, 1.0F);
						OpenGL.glTranslatef((float) -local50 / local28, (float) -local32 / local28, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass195ArrayArray1[local50][local32].method24604(local192.aByteArray58, local59);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ci", name = "m", descriptor = "(Lclient!ara;II)V", line = 123)
	void method24680(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class93_Sub1_Sub4_Sub2 local2 = (Class93_Sub1_Sub4_Sub2) arg0;
		arg1 += local2.anInt3212 + 1;
		arg2 += local2.anInt3209 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt3384;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt3213;
		@Pc(31) int local31 = local2.anInt3210;
		@Pc(36) int local36 = this.anInt3384 - local31;
		@Pc(38) int local38 = 0;
		@Pc(44) int local44;
		if (arg2 <= 0) {
			local44 = 1 - arg2;
			local28 -= local44;
			local25 += local44 * local31;
			local23 += local44 * this.anInt3384;
			arg2 = 1;
		}
		if (arg2 + local28 >= this.anInt3386) {
			local44 = arg2 + local28 + 1 - this.anInt3386;
			local28 -= local44;
		}
		if (arg1 <= 0) {
			local44 = 1 - arg1;
			local31 -= local44;
			local25 += local44;
			local23 += local44;
			local38 += local44;
			local36 += local44;
			arg1 = 1;
		}
		if (arg1 + local31 >= this.anInt3384) {
			local44 = arg1 + local31 + 1 - this.anInt3384;
			local31 -= local44;
			local38 += local44;
			local36 += local44;
		}
		if (local31 > 0 && local28 > 0) {
			method24688(this.aByteArray66, local2.aByteArray62, local25, local23, local31, local28, local36, local38);
			this.method24685(arg1, arg2, local31, local28);
		}
	}

	@OriginalMember(owner = "client!ci", name = "k", descriptor = "(Lclient!ara;II)V", line = 164)
	void method24681(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class93_Sub1_Sub4_Sub2 local2 = (Class93_Sub1_Sub4_Sub2) arg0;
		arg1 += local2.anInt3212 + 1;
		arg2 += local2.anInt3209 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt3384;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt3213;
		@Pc(31) int local31 = local2.anInt3210;
		@Pc(36) int local36 = this.anInt3384 - local31;
		@Pc(38) int local38 = 0;
		@Pc(44) int local44;
		if (arg2 <= 0) {
			local44 = 1 - arg2;
			local28 -= local44;
			local25 += local44 * local31;
			local23 += local44 * this.anInt3384;
			arg2 = 1;
		}
		if (arg2 + local28 >= this.anInt3386) {
			local44 = arg2 + local28 + 1 - this.anInt3386;
			local28 -= local44;
		}
		if (arg1 <= 0) {
			local44 = 1 - arg1;
			local31 -= local44;
			local25 += local44;
			local23 += local44;
			local38 += local44;
			local36 += local44;
			arg1 = 1;
		}
		if (arg1 + local31 >= this.anInt3384) {
			local44 = arg1 + local31 + 1 - this.anInt3384;
			local31 -= local44;
			local38 += local44;
			local36 += local44;
		}
		if (local31 > 0 && local28 > 0) {
			method24693(this.aByteArray66, local2.aByteArray62, local25, local23, local31, local28, local36, local38);
			this.method24685(arg1, arg2, local31, local28);
		}
	}

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "(Lclient!ara;II)Z", line = 205)
	boolean method24682(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class93_Sub1_Sub4_Sub2 local2 = (Class93_Sub1_Sub4_Sub2) arg0;
		arg1 += local2.anInt3212 + 1;
		arg2 += local2.anInt3209 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt3384;
		@Pc(26) int local26 = local2.anInt3213;
		@Pc(29) int local29 = local2.anInt3210;
		@Pc(34) int local34 = this.anInt3384 - local29;
		@Pc(40) int local40;
		if (arg2 <= 0) {
			local40 = 1 - arg2;
			local26 -= local40;
			local23 += local40 * this.anInt3384;
			arg2 = 1;
		}
		if (arg2 + local26 >= this.anInt3386) {
			local40 = arg2 + local26 + 1 - this.anInt3386;
			local26 -= local40;
		}
		if (arg1 <= 0) {
			local40 = 1 - arg1;
			local29 -= local40;
			local23 += local40;
			local34 += local40;
			arg1 = 1;
		}
		if (arg1 + local29 >= this.anInt3384) {
			local40 = arg1 + local29 + 1 - this.anInt3384;
			local29 -= local40;
			local34 += local40;
		}
		if (local29 > 0 && local26 > 0) {
			@Pc(123) byte local123 = 8;
			local34 += (local123 - 1) * this.anInt3384;
			return method24696(this.aByteArray66, local23, local29, local26, local34, local123);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ci", name = "o", descriptor = "(Lclient!ara;II)Z", line = 205)
	boolean method24683(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class93_Sub1_Sub4_Sub2 local2 = (Class93_Sub1_Sub4_Sub2) arg0;
		arg1 += local2.anInt3212 + 1;
		arg2 += local2.anInt3209 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt3384;
		@Pc(26) int local26 = local2.anInt3213;
		@Pc(29) int local29 = local2.anInt3210;
		@Pc(34) int local34 = this.anInt3384 - local29;
		@Pc(40) int local40;
		if (arg2 <= 0) {
			local40 = 1 - arg2;
			local26 -= local40;
			local23 += local40 * this.anInt3384;
			arg2 = 1;
		}
		if (arg2 + local26 >= this.anInt3386) {
			local40 = arg2 + local26 + 1 - this.anInt3386;
			local26 -= local40;
		}
		if (arg1 <= 0) {
			local40 = 1 - arg1;
			local29 -= local40;
			local23 += local40;
			local34 += local40;
			arg1 = 1;
		}
		if (arg1 + local29 >= this.anInt3384) {
			local40 = arg1 + local29 + 1 - this.anInt3384;
			local29 -= local40;
			local34 += local40;
		}
		if (local29 > 0 && local26 > 0) {
			@Pc(123) byte local123 = 8;
			local34 += (local123 - 1) * this.anInt3384;
			return method24696(this.aByteArray66, local23, local29, local26, local34, local123);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ci", name = "v", descriptor = "(Lclient!ara;II)Z", line = 205)
	boolean method24684(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class93_Sub1_Sub4_Sub2 local2 = (Class93_Sub1_Sub4_Sub2) arg0;
		arg1 += local2.anInt3212 + 1;
		arg2 += local2.anInt3209 + 1;
		@Pc(23) int local23 = arg1 + arg2 * this.anInt3384;
		@Pc(26) int local26 = local2.anInt3213;
		@Pc(29) int local29 = local2.anInt3210;
		@Pc(34) int local34 = this.anInt3384 - local29;
		@Pc(40) int local40;
		if (arg2 <= 0) {
			local40 = 1 - arg2;
			local26 -= local40;
			local23 += local40 * this.anInt3384;
			arg2 = 1;
		}
		if (arg2 + local26 >= this.anInt3386) {
			local40 = arg2 + local26 + 1 - this.anInt3386;
			local26 -= local40;
		}
		if (arg1 <= 0) {
			local40 = 1 - arg1;
			local29 -= local40;
			local23 += local40;
			local34 += local40;
			arg1 = 1;
		}
		if (arg1 + local29 >= this.anInt3384) {
			local40 = arg1 + local29 + 1 - this.anInt3384;
			local29 -= local40;
			local34 += local40;
		}
		if (local29 > 0 && local26 > 0) {
			@Pc(123) byte local123 = 8;
			local34 += (local123 - 1) * this.anInt3384;
			return method24696(this.aByteArray66, local23, local29, local26, local34, local123);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ci", name = "w", descriptor = "(IIII)V", line = 241)
	void method24685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass195ArrayArray1 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 - 1 >> 7;
		@Pc(19) int local19 = arg0 - 1 + arg2 - 1 >> 7;
		@Pc(25) int local25 = arg1 - 1 >> 7;
		@Pc(35) int local35 = arg1 - 1 + arg3 - 1 >> 7;
		for (@Pc(37) int local37 = local9; local37 <= local19; local37++) {
			@Pc(45) Class195[] local45 = this.aClass195ArrayArray1[local37];
			for (@Pc(47) int local47 = local25; local47 <= local35; local47++) {
				local45[local47].aBoolean576 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "y", descriptor = "(IIII)V", line = 241)
	void method24686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass195ArrayArray1 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 - 1 >> 7;
		@Pc(19) int local19 = arg0 - 1 + arg2 - 1 >> 7;
		@Pc(25) int local25 = arg1 - 1 >> 7;
		@Pc(35) int local35 = arg1 - 1 + arg3 - 1 >> 7;
		for (@Pc(37) int local37 = local9; local37 <= local19; local37++) {
			@Pc(45) Class195[] local45 = this.aClass195ArrayArray1[local37];
			for (@Pc(47) int local47 = local25; local47 <= local35; local47++) {
				local45[local47].aBoolean576 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "s", descriptor = "(IIII)V", line = 241)
	void method24687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass195ArrayArray1 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 - 1 >> 7;
		@Pc(19) int local19 = arg0 - 1 + arg2 - 1 >> 7;
		@Pc(25) int local25 = arg1 - 1 >> 7;
		@Pc(35) int local35 = arg1 - 1 + arg3 - 1 >> 7;
		for (@Pc(37) int local37 = local9; local37 <= local19; local37++) {
			@Pc(45) Class195[] local45 = this.aClass195ArrayArray1[local37];
			for (@Pc(47) int local47 = local25; local47 <= local35; local47++) {
				local45[local47].aBoolean576 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "l", descriptor = "([B[BIIIIII)V", line = 253)
	static final void method24688(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int local4 = -(arg4 >> 2);
		@Pc(9) int local9 = -(arg4 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			@Pc(16) int local16;
			@Pc(20) int local20;
			for (local16 = local4; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] += arg1[arg2++];
				@Pc(32) int local32 = arg3++;
				arg0[local32] += arg1[arg2++];
				@Pc(44) int local44 = arg3++;
				arg0[local44] += arg1[arg2++];
				@Pc(56) int local56 = arg3++;
				arg0[local56] += arg1[arg2++];
			}
			for (local16 = local9; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] += arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!ci", name = "q", descriptor = "([B[BIIIIII)V", line = 253)
	static final void method24689(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int local4 = -(arg4 >> 2);
		@Pc(9) int local9 = -(arg4 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			@Pc(16) int local16;
			@Pc(20) int local20;
			for (local16 = local4; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] += arg1[arg2++];
				@Pc(32) int local32 = arg3++;
				arg0[local32] += arg1[arg2++];
				@Pc(44) int local44 = arg3++;
				arg0[local44] += arg1[arg2++];
				@Pc(56) int local56 = arg3++;
				arg0[local56] += arg1[arg2++];
			}
			for (local16 = local9; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] += arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!ci", name = "x", descriptor = "([B[BIIIIII)V", line = 253)
	static final void method24690(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int local4 = -(arg4 >> 2);
		@Pc(9) int local9 = -(arg4 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			@Pc(16) int local16;
			@Pc(20) int local20;
			for (local16 = local4; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] += arg1[arg2++];
				@Pc(32) int local32 = arg3++;
				arg0[local32] += arg1[arg2++];
				@Pc(44) int local44 = arg3++;
				arg0[local44] += arg1[arg2++];
				@Pc(56) int local56 = arg3++;
				arg0[local56] += arg1[arg2++];
			}
			for (local16 = local9; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] += arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "([B[BIIIIII)V", line = 253)
	static final void method24691(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int local4 = -(arg4 >> 2);
		@Pc(9) int local9 = -(arg4 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			@Pc(16) int local16;
			@Pc(20) int local20;
			for (local16 = local4; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] += arg1[arg2++];
				@Pc(32) int local32 = arg3++;
				arg0[local32] += arg1[arg2++];
				@Pc(44) int local44 = arg3++;
				arg0[local44] += arg1[arg2++];
				@Pc(56) int local56 = arg3++;
				arg0[local56] += arg1[arg2++];
			}
			for (local16 = local9; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] += arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!ci", name = "h", descriptor = "([B[BIIIIII)V", line = 253)
	static final void method24692(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int local4 = -(arg4 >> 2);
		@Pc(9) int local9 = -(arg4 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			@Pc(16) int local16;
			@Pc(20) int local20;
			for (local16 = local4; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] += arg1[arg2++];
				@Pc(32) int local32 = arg3++;
				arg0[local32] += arg1[arg2++];
				@Pc(44) int local44 = arg3++;
				arg0[local44] += arg1[arg2++];
				@Pc(56) int local56 = arg3++;
				arg0[local56] += arg1[arg2++];
			}
			for (local16 = local9; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] += arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!ci", name = "u", descriptor = "([B[BIIIIII)V", line = 271)
	static final void method24693(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int local4 = -(arg4 >> 2);
		@Pc(9) int local9 = -(arg4 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			@Pc(16) int local16;
			@Pc(20) int local20;
			for (local16 = local4; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] -= arg1[arg2++];
				@Pc(32) int local32 = arg3++;
				arg0[local32] -= arg1[arg2++];
				@Pc(44) int local44 = arg3++;
				arg0[local44] -= arg1[arg2++];
				@Pc(56) int local56 = arg3++;
				arg0[local56] -= arg1[arg2++];
			}
			for (local16 = local9; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] -= arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "([B[BIIIIII)V", line = 271)
	static final void method24694(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int local4 = -(arg4 >> 2);
		@Pc(9) int local9 = -(arg4 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			@Pc(16) int local16;
			@Pc(20) int local20;
			for (local16 = local4; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] -= arg1[arg2++];
				@Pc(32) int local32 = arg3++;
				arg0[local32] -= arg1[arg2++];
				@Pc(44) int local44 = arg3++;
				arg0[local44] -= arg1[arg2++];
				@Pc(56) int local56 = arg3++;
				arg0[local56] -= arg1[arg2++];
			}
			for (local16 = local9; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] -= arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!ci", name = "g", descriptor = "([B[BIIIIII)V", line = 271)
	static final void method24695(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(4) int local4 = -(arg4 >> 2);
		@Pc(9) int local9 = -(arg4 & 0x3);
		for (@Pc(12) int local12 = -arg5; local12 < 0; local12++) {
			@Pc(16) int local16;
			@Pc(20) int local20;
			for (local16 = local4; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] -= arg1[arg2++];
				@Pc(32) int local32 = arg3++;
				arg0[local32] -= arg1[arg2++];
				@Pc(44) int local44 = arg3++;
				arg0[local44] -= arg1[arg2++];
				@Pc(56) int local56 = arg3++;
				arg0[local56] -= arg1[arg2++];
			}
			for (local16 = local9; local16 < 0; local16++) {
				local20 = arg3++;
				arg0[local20] -= arg1[arg2++];
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!ci", name = "z", descriptor = "([BIIIII)Z", line = 289)
	static final boolean method24696(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg2 % arg5;
		@Pc(9) int local9;
		if (local3 == 0) {
			local9 = 0;
		} else {
			local9 = arg5 - local3;
		}
		@Pc(21) int local21 = -((arg3 + arg5 - 1) / arg5);
		@Pc(30) int local30 = -((arg2 + arg5 - 1) / arg5);
		for (@Pc(32) int local32 = local21; local32 < 0; local32++) {
			for (@Pc(36) int local36 = local30; local36 < 0; local36++) {
				if (arg0[arg1] == 0) {
					return true;
				}
				arg1 += arg5;
			}
			arg1 -= local9;
			if (arg0[arg1 - 1] == 0) {
				return true;
			}
			arg1 += arg4;
		}
		return false;
	}

	@OriginalMember(owner = "client!ci", name = "i", descriptor = "([BIIIII)Z", line = 289)
	static final boolean method24697(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg2 % arg5;
		@Pc(9) int local9;
		if (local3 == 0) {
			local9 = 0;
		} else {
			local9 = arg5 - local3;
		}
		@Pc(21) int local21 = -((arg3 + arg5 - 1) / arg5);
		@Pc(30) int local30 = -((arg2 + arg5 - 1) / arg5);
		for (@Pc(32) int local32 = local21; local32 < 0; local32++) {
			for (@Pc(36) int local36 = local30; local36 < 0; local36++) {
				if (arg0[arg1] == 0) {
					return true;
				}
				arg1 += arg5;
			}
			arg1 -= local9;
			if (arg0[arg1 - 1] == 0) {
				return true;
			}
			arg1 += arg4;
		}
		return false;
	}
}
