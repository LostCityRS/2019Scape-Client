package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aih")
public class Class142_Sub1 extends Class142 {

	@OriginalMember(owner = "client!aih", name = "cm", descriptor = "I")
	static final int anInt1304 = 3;

	@OriginalMember(owner = "client!aih", name = "co", descriptor = "I")
	static final int anInt1305 = 1;

	@OriginalMember(owner = "client!aih", name = "cf", descriptor = "I")
	static final int anInt1306 = 0;

	@OriginalMember(owner = "client!aih", name = "cr", descriptor = "I")
	static final int anInt1307 = 2;

	@OriginalMember(owner = "client!aih", name = "cw", descriptor = "Z")
	static boolean aBoolean241 = false;

	@OriginalMember(owner = "client!aih", name = "ct", descriptor = "Z")
	static boolean aBoolean240 = false;

	@OriginalMember(owner = "client!aih", name = "cq", descriptor = "[I")
	static final int[] anIntArray156 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!aih", name = "ch", descriptor = "[I")
	static final int[] anIntArray155 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!aih", name = "cb", descriptor = "[I")
	static final int[] anIntArray154 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!aih", name = "cs", descriptor = "[I")
	static final int[] anIntArray157 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!aih", name = "cy", descriptor = "I")
	int anInt1303 = -940453439;

	@OriginalMember(owner = "client!aih", name = "cz", descriptor = "Lclient!aop;")
	Class32_Sub14 aClass32_Sub14_1;

	@OriginalMember(owner = "client!aih", name = "cc", descriptor = "Lclient!xu;")
	Class671 aClass671_1;

	@OriginalMember(owner = "client!aih", name = "<init>", descriptor = "(Lclient!tx;Lclient!aop;IIIZLclient!qx;Lclient!xu;)V", line = 67)
	public Class142_Sub1(@OriginalArg(0) Class585 arg0, @OriginalArg(1) Class32_Sub14 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) Class520 arg6, @OriginalArg(7) Class671 arg7) {
		super(arg0, arg2, arg3, arg4, arg5, Class682.aClass32_Sub1_3, Class692.aClass32_Sub4_3, arg6);
		this.aClass32_Sub14_1 = arg1;
		this.aClass671_1 = arg7;
	}

	@OriginalMember(owner = "client!aih", name = "ce", descriptor = "(Lclient!dh;Lclient!alw;IIB)V", line = 73)
	public final void method10952(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Packet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (this.aBoolean236) {
			return;
		}
		arg1.pos += 1319886248;
		@Pc(11) boolean local11 = false;
		@Pc(13) Class672 local13 = null;
		@Pc(15) boolean local15 = false;
		while (true) {
			@Pc(27) int local27;
			@Pc(55) int local55;
			@Pc(256) int local256;
			@Pc(260) int local260;
			@Pc(59) int local59;
			while (arg1.pos * 212851357 < arg1.data.length) {
				local27 = arg1.g1((short) 16384);
				if (local27 != 0) {
					@Pc(121) int local121;
					@Pc(129) int local129;
					@Pc(133) int local133;
					if (local27 == 1) {
						local55 = arg1.g1((short) 16384);
						if (local55 > 0) {
							for (local59 = 0; local59 < local55; local59++) {
								@Pc(74) Class597 local74 = new Class597(arg0, this.aClass585_5.anInt5438 * -358186793, arg1, 2);
								if (local74.anInt5528 * 365017865 == 31) {
									@Pc(88) Class85 local88 = (Class85) Class668.aClass32_Sub15_1.method18261(arg1.g2(-1434290800), 110165572);
									local74.method31768(local88.anInt260 * 649135051, local88.anInt262 * 2054784993, local88.anInt259 * 243149709, local88.anInt261 * -88051697, -81207454);
								}
								if (arg0.method20527() > 0) {
									@Pc(113) Class93_Sub16 local113 = local74.aClass93_Sub16_3;
									local121 = local113.method13520(1179409114) + (arg2 << 9);
									local129 = local113.method13524(1348216252) + (arg3 << 9);
									local133 = local121 >> 9;
									@Pc(137) int local137 = local129 >> 9;
									if (local133 >= 0 && local137 >= 0 && local133 < this.anInt1279 * -115974587 && local137 < this.anInt1280 * -586018753) {
										local113.method13545(local121, this.anIntArrayArrayArray14[local74.anInt5520 * -1484967795][local133][local137] - local113.method13521(1655674161), local129, -2115548501);
										this.aClass585_5.method31600(local74, (byte) 6);
									}
								}
							}
						}
					} else if (local27 == 2) {
						if (local13 == null) {
							local13 = new Class672();
						}
						local13.method33062(arg1, -688572878);
					} else if (local27 == 3) {
						if (local13 == null) {
							local13 = new Class672();
						}
						local13.method33063(arg1, 1976785945);
					} else if (local27 == 128) {
						if (local13 == null) {
							local13 = new Class672();
						}
						local13.method33067(arg1, this.aClass671_1, 218649240);
					} else if (local27 == 129) {
						if (this.aByteArrayArrayArray5 == null) {
							this.aByteArrayArrayArray5 = new byte[4][][];
						}
						for (local55 = 0; local55 < 4; local55++) {
							@Pc(246) byte local246 = arg1.g1b(2055395259);
							if (local246 == 0 && this.aByteArrayArrayArray5[local55] != null) {
								local256 = arg2;
								local260 = arg2 + 64;
								local121 = arg3;
								local129 = arg3 + 64;
								if (arg2 < 0) {
									local256 = 0;
								} else if (arg2 >= this.anInt1279 * -115974587) {
									local256 = this.anInt1279 * -115974587;
								}
								if (local260 < 0) {
									local260 = 0;
								} else if (local260 >= this.anInt1279 * -115974587) {
									local260 = this.anInt1279 * -115974587;
								}
								if (arg3 < 0) {
									local121 = 0;
								} else if (arg3 >= this.anInt1280 * -586018753) {
									local121 = this.anInt1280 * -586018753;
								}
								if (local129 < 0) {
									local129 = 0;
								} else if (local129 >= this.anInt1280 * -586018753) {
									local129 = this.anInt1280 * -586018753;
								}
								while (local256 < local260) {
									while (local121 < local129) {
										this.aByteArrayArrayArray5[local55][local256][local121] = 0;
										local121++;
									}
									local256++;
								}
							} else if (local246 == 1) {
								if (this.aByteArrayArrayArray5[local55] == null) {
									this.aByteArrayArrayArray5[local55] = new byte[this.anInt1279 * -115974587 + 1][this.anInt1280 * -586018753 + 1];
								}
								for (local256 = 0; local256 < 64; local256 += 4) {
									for (local260 = 0; local260 < 64; local260 += 4) {
										@Pc(389) byte local389 = arg1.g1b(1584925073);
										for (local129 = local256 + arg2; local129 < local256 + 4 + arg2; local129++) {
											for (local133 = local260 + arg3; local133 < local260 + 4 + arg3; local133++) {
												if (local129 >= 0 && local129 < this.anInt1279 * -115974587 && local133 >= 0 && local133 < this.anInt1280 * -586018753) {
													this.aByteArrayArrayArray5[local55][local129][local133] = local389;
												}
											}
										}
									}
								}
							} else if (local246 == 2) {
								if (this.aByteArrayArrayArray5[local55] == null) {
									this.aByteArrayArrayArray5[local55] = new byte[this.anInt1279 * -115974587 + 1][this.anInt1280 * -586018753 + 1];
								}
								if (local55 > 0) {
									local256 = arg2;
									local260 = arg2 + 64;
									local121 = arg3;
									local129 = arg3 + 64;
									if (arg2 < 0) {
										local256 = 0;
									} else if (arg2 >= this.anInt1279 * -115974587) {
										local256 = this.anInt1279 * -115974587;
									}
									if (local260 < 0) {
										local260 = 0;
									} else if (local260 >= this.anInt1279 * -115974587) {
										local260 = this.anInt1279 * -115974587;
									}
									if (arg3 < 0) {
										local121 = 0;
									} else if (arg3 >= this.anInt1280 * -586018753) {
										local121 = this.anInt1280 * -586018753;
									}
									if (local129 < 0) {
										local129 = 0;
									} else if (local129 >= this.anInt1280 * -586018753) {
										local129 = this.anInt1280 * -586018753;
									}
									while (local256 < local260) {
										while (local121 < local129) {
											this.aByteArrayArrayArray5[local55][local256][local121] = this.aByteArrayArrayArray5[local55 - 1][local256][local121];
											local121++;
										}
										local256++;
									}
								}
							}
						}
						local11 = true;
					} else if (local27 == 130) {
						local15 = true;
					} else {
						throw new IllegalStateException("");
					}
				} else if (local13 == null) {
					local13 = new Class672(arg1, this.aClass671_1);
				} else {
					local13.method33058(arg1, this.aClass671_1, (byte) -12);
				}
			}
			for (local27 = 0; local27 < 8; local27++) {
				for (local55 = 0; local55 < 8; local55++) {
					local59 = local27 + (arg2 >> 3);
					local256 = (arg3 >> 3) + local55;
					if (local59 >= 0 && local59 < this.anInt1279 * -115974587 >> 3 && local256 >= 0 && local256 < this.anInt1280 * -586018753 >> 3) {
						if (local13 != null) {
							this.aClass671_1.method32993(local59, local256, local13, 1075187593);
						}
						Class29.method605(local59, local256, local15, (byte) 60);
					}
				}
			}
			if (!local11 && this.aByteArrayArrayArray5 != null) {
				for (local27 = 0; local27 < 4; local27++) {
					if (this.aByteArrayArrayArray5[local27] != null) {
						for (local55 = 0; local55 < 16; local55++) {
							for (local59 = 0; local59 < 16; local59++) {
								local256 = local55 + (arg2 >> 2);
								local260 = local59 + (arg3 >> 2);
								if (local256 >= 0 && local256 < 26 && local260 >= 0 && local260 < 26) {
									this.aByteArrayArrayArray5[local27][local256][local260] = 0;
								}
							}
						}
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!aih", name = "cr", descriptor = "(Lclient!dh;Lclient!alw;II)V", line = 73)
	public final void method10953(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Packet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aBoolean236) {
			return;
		}
		arg1.pos += 1319886248;
		@Pc(11) boolean local11 = false;
		@Pc(13) Class672 local13 = null;
		@Pc(15) boolean local15 = false;
		while (true) {
			@Pc(27) int local27;
			@Pc(55) int local55;
			@Pc(256) int local256;
			@Pc(260) int local260;
			@Pc(59) int local59;
			while (arg1.pos * 212851357 < arg1.data.length) {
				local27 = arg1.g1((short) 16384);
				if (local27 != 0) {
					@Pc(121) int local121;
					@Pc(129) int local129;
					@Pc(133) int local133;
					if (local27 == 1) {
						local55 = arg1.g1((short) 16384);
						if (local55 > 0) {
							for (local59 = 0; local59 < local55; local59++) {
								@Pc(74) Class597 local74 = new Class597(arg0, this.aClass585_5.anInt5438 * -358186793, arg1, 2);
								if (local74.anInt5528 * 365017865 == 31) {
									@Pc(88) Class85 local88 = (Class85) Class668.aClass32_Sub15_1.method18261(arg1.g2(-1434290800), -1042531125);
									local74.method31768(local88.anInt260 * 649135051, local88.anInt262 * 2054784993, local88.anInt259 * 243149709, local88.anInt261 * -88051697, -81207454);
								}
								if (arg0.method20527() > 0) {
									@Pc(113) Class93_Sub16 local113 = local74.aClass93_Sub16_3;
									local121 = local113.method13520(-1202907260) + (arg2 << 9);
									local129 = local113.method13524(1461435150) + (arg3 << 9);
									local133 = local121 >> 9;
									@Pc(137) int local137 = local129 >> 9;
									if (local133 >= 0 && local137 >= 0 && local133 < this.anInt1279 * -115974587 && local137 < this.anInt1280 * -586018753) {
										local113.method13545(local121, this.anIntArrayArrayArray14[local74.anInt5520 * -1484967795][local133][local137] - local113.method13521(1655674161), local129, -1875168452);
										this.aClass585_5.method31600(local74, (byte) 6);
									}
								}
							}
						}
					} else if (local27 == 2) {
						if (local13 == null) {
							local13 = new Class672();
						}
						local13.method33062(arg1, -688572878);
					} else if (local27 == 3) {
						if (local13 == null) {
							local13 = new Class672();
						}
						local13.method33063(arg1, 2071158041);
					} else if (local27 == 128) {
						if (local13 == null) {
							local13 = new Class672();
						}
						local13.method33067(arg1, this.aClass671_1, 399586244);
					} else if (local27 == 129) {
						if (this.aByteArrayArrayArray5 == null) {
							this.aByteArrayArrayArray5 = new byte[4][][];
						}
						for (local55 = 0; local55 < 4; local55++) {
							@Pc(246) byte local246 = arg1.g1b(633862400);
							if (local246 == 0 && this.aByteArrayArrayArray5[local55] != null) {
								local256 = arg2;
								local260 = arg2 + 64;
								local121 = arg3;
								local129 = arg3 + 64;
								if (arg2 < 0) {
									local256 = 0;
								} else if (arg2 >= this.anInt1279 * -115974587) {
									local256 = this.anInt1279 * -115974587;
								}
								if (local260 < 0) {
									local260 = 0;
								} else if (local260 >= this.anInt1279 * -115974587) {
									local260 = this.anInt1279 * -115974587;
								}
								if (arg3 < 0) {
									local121 = 0;
								} else if (arg3 >= this.anInt1280 * -586018753) {
									local121 = this.anInt1280 * -586018753;
								}
								if (local129 < 0) {
									local129 = 0;
								} else if (local129 >= this.anInt1280 * -586018753) {
									local129 = this.anInt1280 * -586018753;
								}
								while (local256 < local260) {
									while (local121 < local129) {
										this.aByteArrayArrayArray5[local55][local256][local121] = 0;
										local121++;
									}
									local256++;
								}
							} else if (local246 == 1) {
								if (this.aByteArrayArrayArray5[local55] == null) {
									this.aByteArrayArrayArray5[local55] = new byte[this.anInt1279 * -115974587 + 1][this.anInt1280 * -586018753 + 1];
								}
								for (local256 = 0; local256 < 64; local256 += 4) {
									for (local260 = 0; local260 < 64; local260 += 4) {
										@Pc(389) byte local389 = arg1.g1b(1115406076);
										for (local129 = local256 + arg2; local129 < local256 + 4 + arg2; local129++) {
											for (local133 = local260 + arg3; local133 < local260 + 4 + arg3; local133++) {
												if (local129 >= 0 && local129 < this.anInt1279 * -115974587 && local133 >= 0 && local133 < this.anInt1280 * -586018753) {
													this.aByteArrayArrayArray5[local55][local129][local133] = local389;
												}
											}
										}
									}
								}
							} else if (local246 == 2) {
								if (this.aByteArrayArrayArray5[local55] == null) {
									this.aByteArrayArrayArray5[local55] = new byte[this.anInt1279 * -115974587 + 1][this.anInt1280 * -586018753 + 1];
								}
								if (local55 > 0) {
									local256 = arg2;
									local260 = arg2 + 64;
									local121 = arg3;
									local129 = arg3 + 64;
									if (arg2 < 0) {
										local256 = 0;
									} else if (arg2 >= this.anInt1279 * -115974587) {
										local256 = this.anInt1279 * -115974587;
									}
									if (local260 < 0) {
										local260 = 0;
									} else if (local260 >= this.anInt1279 * -115974587) {
										local260 = this.anInt1279 * -115974587;
									}
									if (arg3 < 0) {
										local121 = 0;
									} else if (arg3 >= this.anInt1280 * -586018753) {
										local121 = this.anInt1280 * -586018753;
									}
									if (local129 < 0) {
										local129 = 0;
									} else if (local129 >= this.anInt1280 * -586018753) {
										local129 = this.anInt1280 * -586018753;
									}
									while (local256 < local260) {
										while (local121 < local129) {
											this.aByteArrayArrayArray5[local55][local256][local121] = this.aByteArrayArrayArray5[local55 - 1][local256][local121];
											local121++;
										}
										local256++;
									}
								}
							}
						}
						local11 = true;
					} else if (local27 == 130) {
						local15 = true;
					} else {
						throw new IllegalStateException("");
					}
				} else if (local13 == null) {
					local13 = new Class672(arg1, this.aClass671_1);
				} else {
					local13.method33058(arg1, this.aClass671_1, (byte) -29);
				}
			}
			for (local27 = 0; local27 < 8; local27++) {
				for (local55 = 0; local55 < 8; local55++) {
					local59 = local27 + (arg2 >> 3);
					local256 = (arg3 >> 3) + local55;
					if (local59 >= 0 && local59 < this.anInt1279 * -115974587 >> 3 && local256 >= 0 && local256 < this.anInt1280 * -586018753 >> 3) {
						if (local13 != null) {
							this.aClass671_1.method32993(local59, local256, local13, 871754871);
						}
						Class29.method605(local59, local256, local15, (byte) 100);
					}
				}
			}
			if (!local11 && this.aByteArrayArrayArray5 != null) {
				for (local27 = 0; local27 < 4; local27++) {
					if (this.aByteArrayArrayArray5[local27] != null) {
						for (local55 = 0; local55 < 16; local55++) {
							for (local59 = 0; local59 < 16; local59++) {
								local256 = local55 + (arg2 >> 2);
								local260 = local59 + (arg3 >> 2);
								if (local256 >= 0 && local256 < 26 && local260 >= 0 && local260 < 26) {
									this.aByteArrayArrayArray5[local27][local256][local260] = 0;
								}
							}
						}
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!aih", name = "cq", descriptor = "(Lclient!dh;Lclient!alw;II)V", line = 73)
	public final void method10954(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Packet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aBoolean236) {
			return;
		}
		arg1.pos += 1319886248;
		@Pc(11) boolean local11 = false;
		@Pc(13) Class672 local13 = null;
		@Pc(15) boolean local15 = false;
		while (true) {
			@Pc(27) int local27;
			@Pc(55) int local55;
			@Pc(256) int local256;
			@Pc(260) int local260;
			@Pc(59) int local59;
			while (arg1.pos * 212851357 < arg1.data.length) {
				local27 = arg1.g1((short) 16384);
				if (local27 != 0) {
					@Pc(121) int local121;
					@Pc(129) int local129;
					@Pc(133) int local133;
					if (local27 == 1) {
						local55 = arg1.g1((short) 16384);
						if (local55 > 0) {
							for (local59 = 0; local59 < local55; local59++) {
								@Pc(74) Class597 local74 = new Class597(arg0, this.aClass585_5.anInt5438 * -358186793, arg1, 2);
								if (local74.anInt5528 * 365017865 == 31) {
									@Pc(88) Class85 local88 = (Class85) Class668.aClass32_Sub15_1.method18261(arg1.g2(-1434290800), 904551016);
									local74.method31768(local88.anInt260 * 649135051, local88.anInt262 * 2054784993, local88.anInt259 * 243149709, local88.anInt261 * -88051697, -81207454);
								}
								if (arg0.method20527() > 0) {
									@Pc(113) Class93_Sub16 local113 = local74.aClass93_Sub16_3;
									local121 = local113.method13520(1151577854) + (arg2 << 9);
									local129 = local113.method13524(158477460) + (arg3 << 9);
									local133 = local121 >> 9;
									@Pc(137) int local137 = local129 >> 9;
									if (local133 >= 0 && local137 >= 0 && local133 < this.anInt1279 * -115974587 && local137 < this.anInt1280 * -586018753) {
										local113.method13545(local121, this.anIntArrayArrayArray14[local74.anInt5520 * -1484967795][local133][local137] - local113.method13521(1655674161), local129, -788866433);
										this.aClass585_5.method31600(local74, (byte) 6);
									}
								}
							}
						}
					} else if (local27 == 2) {
						if (local13 == null) {
							local13 = new Class672();
						}
						local13.method33062(arg1, -688572878);
					} else if (local27 == 3) {
						if (local13 == null) {
							local13 = new Class672();
						}
						local13.method33063(arg1, 829621983);
					} else if (local27 == 128) {
						if (local13 == null) {
							local13 = new Class672();
						}
						local13.method33067(arg1, this.aClass671_1, 1620217953);
					} else if (local27 == 129) {
						if (this.aByteArrayArrayArray5 == null) {
							this.aByteArrayArrayArray5 = new byte[4][][];
						}
						for (local55 = 0; local55 < 4; local55++) {
							@Pc(246) byte local246 = arg1.g1b(720380177);
							if (local246 == 0 && this.aByteArrayArrayArray5[local55] != null) {
								local256 = arg2;
								local260 = arg2 + 64;
								local121 = arg3;
								local129 = arg3 + 64;
								if (arg2 < 0) {
									local256 = 0;
								} else if (arg2 >= this.anInt1279 * -115974587) {
									local256 = this.anInt1279 * -115974587;
								}
								if (local260 < 0) {
									local260 = 0;
								} else if (local260 >= this.anInt1279 * -115974587) {
									local260 = this.anInt1279 * -115974587;
								}
								if (arg3 < 0) {
									local121 = 0;
								} else if (arg3 >= this.anInt1280 * -586018753) {
									local121 = this.anInt1280 * -586018753;
								}
								if (local129 < 0) {
									local129 = 0;
								} else if (local129 >= this.anInt1280 * -586018753) {
									local129 = this.anInt1280 * -586018753;
								}
								while (local256 < local260) {
									while (local121 < local129) {
										this.aByteArrayArrayArray5[local55][local256][local121] = 0;
										local121++;
									}
									local256++;
								}
							} else if (local246 == 1) {
								if (this.aByteArrayArrayArray5[local55] == null) {
									this.aByteArrayArrayArray5[local55] = new byte[this.anInt1279 * -115974587 + 1][this.anInt1280 * -586018753 + 1];
								}
								for (local256 = 0; local256 < 64; local256 += 4) {
									for (local260 = 0; local260 < 64; local260 += 4) {
										@Pc(389) byte local389 = arg1.g1b(1990852908);
										for (local129 = local256 + arg2; local129 < local256 + 4 + arg2; local129++) {
											for (local133 = local260 + arg3; local133 < local260 + 4 + arg3; local133++) {
												if (local129 >= 0 && local129 < this.anInt1279 * -115974587 && local133 >= 0 && local133 < this.anInt1280 * -586018753) {
													this.aByteArrayArrayArray5[local55][local129][local133] = local389;
												}
											}
										}
									}
								}
							} else if (local246 == 2) {
								if (this.aByteArrayArrayArray5[local55] == null) {
									this.aByteArrayArrayArray5[local55] = new byte[this.anInt1279 * -115974587 + 1][this.anInt1280 * -586018753 + 1];
								}
								if (local55 > 0) {
									local256 = arg2;
									local260 = arg2 + 64;
									local121 = arg3;
									local129 = arg3 + 64;
									if (arg2 < 0) {
										local256 = 0;
									} else if (arg2 >= this.anInt1279 * -115974587) {
										local256 = this.anInt1279 * -115974587;
									}
									if (local260 < 0) {
										local260 = 0;
									} else if (local260 >= this.anInt1279 * -115974587) {
										local260 = this.anInt1279 * -115974587;
									}
									if (arg3 < 0) {
										local121 = 0;
									} else if (arg3 >= this.anInt1280 * -586018753) {
										local121 = this.anInt1280 * -586018753;
									}
									if (local129 < 0) {
										local129 = 0;
									} else if (local129 >= this.anInt1280 * -586018753) {
										local129 = this.anInt1280 * -586018753;
									}
									while (local256 < local260) {
										while (local121 < local129) {
											this.aByteArrayArrayArray5[local55][local256][local121] = this.aByteArrayArrayArray5[local55 - 1][local256][local121];
											local121++;
										}
										local256++;
									}
								}
							}
						}
						local11 = true;
					} else if (local27 == 130) {
						local15 = true;
					} else {
						throw new IllegalStateException("");
					}
				} else if (local13 == null) {
					local13 = new Class672(arg1, this.aClass671_1);
				} else {
					local13.method33058(arg1, this.aClass671_1, (byte) 27);
				}
			}
			for (local27 = 0; local27 < 8; local27++) {
				for (local55 = 0; local55 < 8; local55++) {
					local59 = local27 + (arg2 >> 3);
					local256 = (arg3 >> 3) + local55;
					if (local59 >= 0 && local59 < this.anInt1279 * -115974587 >> 3 && local256 >= 0 && local256 < this.anInt1280 * -586018753 >> 3) {
						if (local13 != null) {
							this.aClass671_1.method32993(local59, local256, local13, -66105139);
						}
						Class29.method605(local59, local256, local15, (byte) -17);
					}
				}
			}
			if (!local11 && this.aByteArrayArrayArray5 != null) {
				for (local27 = 0; local27 < 4; local27++) {
					if (this.aByteArrayArrayArray5[local27] != null) {
						for (local55 = 0; local55 < 16; local55++) {
							for (local59 = 0; local59 < 16; local59++) {
								local256 = local55 + (arg2 >> 2);
								local260 = local59 + (arg3 >> 2);
								if (local256 >= 0 && local256 < 26 && local260 >= 0 && local260 < 26) {
									this.aByteArrayArrayArray5[local27][local256][local260] = 0;
								}
							}
						}
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!aih", name = "cm", descriptor = "(Lclient!dh;Lclient!alw;II)V", line = 73)
	public final void method10955(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Packet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aBoolean236) {
			return;
		}
		arg1.pos += 1319886248;
		@Pc(11) boolean local11 = false;
		@Pc(13) Class672 local13 = null;
		@Pc(15) boolean local15 = false;
		while (true) {
			@Pc(27) int local27;
			@Pc(55) int local55;
			@Pc(256) int local256;
			@Pc(260) int local260;
			@Pc(59) int local59;
			while (arg1.pos * 212851357 < arg1.data.length) {
				local27 = arg1.g1((short) 16384);
				if (local27 != 0) {
					@Pc(121) int local121;
					@Pc(129) int local129;
					@Pc(133) int local133;
					if (local27 == 1) {
						local55 = arg1.g1((short) 16384);
						if (local55 > 0) {
							for (local59 = 0; local59 < local55; local59++) {
								@Pc(74) Class597 local74 = new Class597(arg0, this.aClass585_5.anInt5438 * -358186793, arg1, 2);
								if (local74.anInt5528 * 365017865 == 31) {
									@Pc(88) Class85 local88 = (Class85) Class668.aClass32_Sub15_1.method18261(arg1.g2(-1434290800), -1035510331);
									local74.method31768(local88.anInt260 * 649135051, local88.anInt262 * 2054784993, local88.anInt259 * 243149709, local88.anInt261 * -88051697, -81207454);
								}
								if (arg0.method20527() > 0) {
									@Pc(113) Class93_Sub16 local113 = local74.aClass93_Sub16_3;
									local121 = local113.method13520(1894426898) + (arg2 << 9);
									local129 = local113.method13524(2084143102) + (arg3 << 9);
									local133 = local121 >> 9;
									@Pc(137) int local137 = local129 >> 9;
									if (local133 >= 0 && local137 >= 0 && local133 < this.anInt1279 * -115974587 && local137 < this.anInt1280 * -586018753) {
										local113.method13545(local121, this.anIntArrayArrayArray14[local74.anInt5520 * -1484967795][local133][local137] - local113.method13521(1655674161), local129, -385871603);
										this.aClass585_5.method31600(local74, (byte) 6);
									}
								}
							}
						}
					} else if (local27 == 2) {
						if (local13 == null) {
							local13 = new Class672();
						}
						local13.method33062(arg1, -688572878);
					} else if (local27 == 3) {
						if (local13 == null) {
							local13 = new Class672();
						}
						local13.method33063(arg1, 1357827639);
					} else if (local27 == 128) {
						if (local13 == null) {
							local13 = new Class672();
						}
						local13.method33067(arg1, this.aClass671_1, 1554104531);
					} else if (local27 == 129) {
						if (this.aByteArrayArrayArray5 == null) {
							this.aByteArrayArrayArray5 = new byte[4][][];
						}
						for (local55 = 0; local55 < 4; local55++) {
							@Pc(246) byte local246 = arg1.g1b(834389538);
							if (local246 == 0 && this.aByteArrayArrayArray5[local55] != null) {
								local256 = arg2;
								local260 = arg2 + 64;
								local121 = arg3;
								local129 = arg3 + 64;
								if (arg2 < 0) {
									local256 = 0;
								} else if (arg2 >= this.anInt1279 * -115974587) {
									local256 = this.anInt1279 * -115974587;
								}
								if (local260 < 0) {
									local260 = 0;
								} else if (local260 >= this.anInt1279 * -115974587) {
									local260 = this.anInt1279 * -115974587;
								}
								if (arg3 < 0) {
									local121 = 0;
								} else if (arg3 >= this.anInt1280 * -586018753) {
									local121 = this.anInt1280 * -586018753;
								}
								if (local129 < 0) {
									local129 = 0;
								} else if (local129 >= this.anInt1280 * -586018753) {
									local129 = this.anInt1280 * -586018753;
								}
								while (local256 < local260) {
									while (local121 < local129) {
										this.aByteArrayArrayArray5[local55][local256][local121] = 0;
										local121++;
									}
									local256++;
								}
							} else if (local246 == 1) {
								if (this.aByteArrayArrayArray5[local55] == null) {
									this.aByteArrayArrayArray5[local55] = new byte[this.anInt1279 * -115974587 + 1][this.anInt1280 * -586018753 + 1];
								}
								for (local256 = 0; local256 < 64; local256 += 4) {
									for (local260 = 0; local260 < 64; local260 += 4) {
										@Pc(389) byte local389 = arg1.g1b(772501868);
										for (local129 = local256 + arg2; local129 < local256 + 4 + arg2; local129++) {
											for (local133 = local260 + arg3; local133 < local260 + 4 + arg3; local133++) {
												if (local129 >= 0 && local129 < this.anInt1279 * -115974587 && local133 >= 0 && local133 < this.anInt1280 * -586018753) {
													this.aByteArrayArrayArray5[local55][local129][local133] = local389;
												}
											}
										}
									}
								}
							} else if (local246 == 2) {
								if (this.aByteArrayArrayArray5[local55] == null) {
									this.aByteArrayArrayArray5[local55] = new byte[this.anInt1279 * -115974587 + 1][this.anInt1280 * -586018753 + 1];
								}
								if (local55 > 0) {
									local256 = arg2;
									local260 = arg2 + 64;
									local121 = arg3;
									local129 = arg3 + 64;
									if (arg2 < 0) {
										local256 = 0;
									} else if (arg2 >= this.anInt1279 * -115974587) {
										local256 = this.anInt1279 * -115974587;
									}
									if (local260 < 0) {
										local260 = 0;
									} else if (local260 >= this.anInt1279 * -115974587) {
										local260 = this.anInt1279 * -115974587;
									}
									if (arg3 < 0) {
										local121 = 0;
									} else if (arg3 >= this.anInt1280 * -586018753) {
										local121 = this.anInt1280 * -586018753;
									}
									if (local129 < 0) {
										local129 = 0;
									} else if (local129 >= this.anInt1280 * -586018753) {
										local129 = this.anInt1280 * -586018753;
									}
									while (local256 < local260) {
										while (local121 < local129) {
											this.aByteArrayArrayArray5[local55][local256][local121] = this.aByteArrayArrayArray5[local55 - 1][local256][local121];
											local121++;
										}
										local256++;
									}
								}
							}
						}
						local11 = true;
					} else if (local27 == 130) {
						local15 = true;
					} else {
						throw new IllegalStateException("");
					}
				} else if (local13 == null) {
					local13 = new Class672(arg1, this.aClass671_1);
				} else {
					local13.method33058(arg1, this.aClass671_1, (byte) 63);
				}
			}
			for (local27 = 0; local27 < 8; local27++) {
				for (local55 = 0; local55 < 8; local55++) {
					local59 = local27 + (arg2 >> 3);
					local256 = (arg3 >> 3) + local55;
					if (local59 >= 0 && local59 < this.anInt1279 * -115974587 >> 3 && local256 >= 0 && local256 < this.anInt1280 * -586018753 >> 3) {
						if (local13 != null) {
							this.aClass671_1.method32993(local59, local256, local13, 2144764471);
						}
						Class29.method605(local59, local256, local15, (byte) 14);
					}
				}
			}
			if (!local11 && this.aByteArrayArrayArray5 != null) {
				for (local27 = 0; local27 < 4; local27++) {
					if (this.aByteArrayArrayArray5[local27] != null) {
						for (local55 = 0; local55 < 16; local55++) {
							for (local59 = 0; local59 < 16; local59++) {
								local256 = local55 + (arg2 >> 2);
								local260 = local59 + (arg3 >> 2);
								if (local256 >= 0 && local256 < 26 && local260 >= 0 && local260 < 26) {
									this.aByteArrayArrayArray5[local27][local256][local260] = 0;
								}
							}
						}
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!aih", name = "w", descriptor = "(Lclient!dh;B)V", line = 95)
	static void method10956(@OriginalArg(0) Class104 arg0, @OriginalArg(1) byte arg1) {
		if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100 != 405524325 * Class172.anInt3175 && client.aClass532_1.method30481(-1234365214) != null) {
			Class305.method26797(151523623);
			if (Class26.method579(arg0, Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100, (byte) 2)) {
				Class172.anInt3175 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100 * 1899481709;
			}
		}
	}

	@OriginalMember(owner = "client!aih", name = "cu", descriptor = "(Lclient!dh;Lclient!alw;IIIIIIIB)V", line = 213)
	public final void method10957(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Packet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) byte arg9) {
		if (this.aBoolean236) {
			return;
		}
		arg1.pos += 1319886248;
		@Pc(11) boolean local11 = false;
		@Pc(13) Class672 local13 = null;
		@Pc(15) boolean local15 = false;
		@Pc(21) int local21 = (arg6 & 0x7) * 8;
		@Pc(27) int local27 = (arg7 & 0x7) * 8;
		while (true) {
			@Pc(39) int local39;
			@Pc(66) int local66;
			@Pc(329) int local329;
			@Pc(70) int local70;
			while (arg1.pos * 212851357 < arg1.data.length) {
				local39 = arg1.g1((short) 16384);
				if (local39 != 0) {
					@Pc(136) int local136;
					@Pc(176) int local176;
					@Pc(194) int local194;
					@Pc(130) int local130;
					if (local39 == 1) {
						local66 = arg1.g1((short) 16384);
						if (local66 > 0) {
							for (local70 = 0; local70 < local66; local70++) {
								@Pc(85) Class597 local85 = new Class597(arg0, this.aClass585_5.anInt5438 * -358186793, arg1, 2);
								if (local85.anInt5528 * 365017865 == 31) {
									@Pc(99) Class85 local99 = (Class85) Class668.aClass32_Sub15_1.method18261(arg1.g2(-1434290800), -908353382);
									local85.method31768(local99.anInt260 * 649135051, local99.anInt262 * 2054784993, local99.anInt259 * 243149709, local99.anInt261 * -88051697, -81207454);
								}
								if (arg0.method20527() > 0) {
									@Pc(124) Class93_Sub16 local124 = local85.aClass93_Sub16_3;
									local130 = local124.method13520(-625270097) >> 9;
									local136 = local124.method13524(203681870) >> 9;
									if (arg5 == local85.anInt5520 * -1484967795 && local130 >= local21 && local130 < local21 + 8 && local136 >= local27 && local136 < local27 + 8) {
										local176 = (arg3 << 9) + Class477.method29702(local124.method13520(1260376996) & 0xFFF, local124.method13524(2129958887) & 0xFFF, arg8, (byte) 108);
										local194 = (arg4 << 9) + Class590.method31691(local124.method13520(910546986) & 0xFFF, local124.method13524(1085631640) & 0xFFF, arg8, 1788527300);
										local130 = local176 >> 9;
										local136 = local194 >> 9;
										if (local130 >= 0 && local136 >= 0 && local130 < this.anInt1279 * -115974587 && local136 < this.anInt1280 * -586018753) {
											local85.anInt5520 = arg2 * -348646843;
											local124.method13545(local176, this.anIntArrayArrayArray14[local85.anInt5520 * -1484967795][local130][local136] - local124.method13521(1655674161), local194, -701326741);
											this.aClass585_5.method31600(local85, (byte) 6);
										}
									}
								}
							}
						}
					} else if (local39 == 2) {
						if (local13 == null) {
							local13 = new Class672();
						}
						local13.method33062(arg1, -688572878);
					} else if (local39 == 3) {
						if (local13 == null) {
							local13 = new Class672();
						}
						local13.method33063(arg1, 1565116669);
					} else if (local39 == 128) {
						if (local13 == null) {
							local13 = new Class672();
						}
						local13.method33067(arg1, this.aClass671_1, 1760045391);
					} else if (local39 == 129) {
						if (this.aByteArrayArrayArray5 == null) {
							this.aByteArrayArrayArray5 = new byte[4][][];
						}
						for (local66 = 0; local66 < 4; local66++) {
							@Pc(316) byte local316 = arg1.g1b(1541105232);
							@Pc(333) int local333;
							if (local316 == 0 && this.aByteArrayArrayArray5[arg2] != null) {
								if (local66 <= arg5) {
									local329 = arg3;
									local333 = arg3 + 7;
									local130 = arg4;
									local136 = arg4 + 7;
									if (arg3 < 0) {
										local329 = 0;
									} else if (arg3 >= this.anInt1279 * -115974587) {
										local329 = this.anInt1279 * -115974587;
									}
									if (local333 < 0) {
										local333 = 0;
									} else if (local333 >= this.anInt1279 * -115974587) {
										local333 = this.anInt1279 * -115974587;
									}
									if (arg4 < 0) {
										local130 = 0;
									} else if (arg4 >= this.anInt1280 * -586018753) {
										local130 = this.anInt1280 * -586018753;
									}
									if (local136 < 0) {
										local136 = 0;
									} else if (local136 >= this.anInt1280 * -586018753) {
										local136 = this.anInt1280 * -586018753;
									}
									while (local329 < local333) {
										while (local130 < local136) {
											this.aByteArrayArrayArray5[arg2][local329][local130] = 0;
											local130++;
										}
										local329++;
									}
								}
							} else if (local316 == 1) {
								if (this.aByteArrayArrayArray5[arg2] == null) {
									this.aByteArrayArrayArray5[arg2] = new byte[this.anInt1279 * -115974587 + 1][this.anInt1280 * -586018753 + 1];
								}
								for (local329 = 0; local329 < 64; local329 += 4) {
									for (local333 = 0; local333 < 64; local333 += 4) {
										@Pc(463) byte local463 = arg1.g1b(742413516);
										if (local66 <= arg5) {
											for (local136 = local329; local136 < local329 + 4; local136++) {
												for (local176 = local333; local176 < local333 + 4; local176++) {
													if (local136 >= local21 && local136 < local21 + 8 && local176 >= local27 && local176 < local27 + 8) {
														local194 = arg3 + Class49.method16594(local136 & 0x7, local176 & 0x7, arg8, 1189701933);
														@Pc(520) int local520 = arg4 + Class40.method794(local136 & 0x7, local176 & 0x7, arg8, 94383871);
														if (local194 >= 0 && local194 < this.anInt1279 * -115974587 && local520 >= 0 && local520 < this.anInt1280 * -586018753) {
															this.aByteArrayArrayArray5[arg2][local194][local520] = local463;
															local11 = true;
														}
													}
												}
											}
										}
									}
								}
							} else if (local316 == 2) {
							}
						}
					} else if (local39 == 130) {
						local15 = true;
					} else {
						throw new IllegalStateException("");
					}
				} else if (local13 == null) {
					local13 = new Class672(arg1, this.aClass671_1);
				} else {
					local13.method33058(arg1, this.aClass671_1, (byte) 24);
				}
			}
			if (local13 != null) {
				this.aClass671_1.method32993(arg3 >> 3, arg4 >> 3, local13, -1191363159);
			}
			Class29.method605(arg3 >> 3, arg4 >> 3, local15, (byte) 59);
			if (!local11 && this.aByteArrayArrayArray5 != null && this.aByteArrayArrayArray5[arg2] != null) {
				local39 = arg3 + 7;
				local66 = arg4 + 7;
				for (local70 = arg3; local70 < local39; local70++) {
					for (local329 = arg4; local329 < local66; local329++) {
						this.aByteArrayArrayArray5[arg2][local70][local329] = 0;
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!aih", name = "ch", descriptor = "(Lclient!aop;[BIIIILclient!xe;Lclient!xe;)I", line = 335)
	public static final int method10958(@OriginalArg(0) Class32_Sub14 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class656 arg6, @OriginalArg(7) Class656 arg7) {
		@Pc(1) int local1 = 0;
		@Pc(6) Packet local6 = new Packet(arg1);
		@Pc(8) int local8 = -1;
		label73: while (true) {
			@Pc(12) int local12 = local6.gExtended1or2(1717424420);
			if (local12 == 0) {
				return local1;
			}
			local8 += local12;
			@Pc(21) int local21 = 0;
			@Pc(23) boolean local23 = false;
			while (true) {
				@Pc(36) Class629 local36;
				@Pc(62) int local62;
				@Pc(68) Class610 local68;
				@Pc(86) int local86;
				do {
					@Pc(58) int local58;
					@Pc(81) int local81;
					do {
						do {
							do {
								do {
									@Pc(27) int local27;
									do {
										local27 = local6.gSmart1or2((byte) -64);
										if (local27 == 0) {
											continue label73;
										}
										local36 = new Class629(local6);
									} while (local23);
									local21 += local27 - 1;
									@Pc(48) int local48 = local21 & 0x3F;
									@Pc(54) int local54 = local21 >> 6 & 0x3F;
									local58 = local54 + arg2;
									local62 = arg3 + local48;
									local68 = (Class610) arg0.method18261(local8, -1150804951);
									if ((local36.anInt5708 * -1626288991 & 0x1) == 0) {
										local81 = local68.anInt5608 * 427800467;
										local86 = local68.anInt5603 * -774442965;
									} else {
										local81 = local68.anInt5603 * -774442965;
										local86 = local68.anInt5608 * 427800467;
									}
								} while (local58 >= arg4);
							} while (local62 >= arg5);
						} while (local81 + local58 < 0);
					} while (local86 + local62 < 0);
				} while (local36.anInt5709 * 1175627307 == Class615.aClass615_24.anInt5628 * 948246811 && Class51.aClass93_Sub36_1.aClass166_Sub3_1.method15405(-602436248) == 0 && local68.anInt5592 * 1067969079 == 0 && local68.anInt5591 * -297318857 != 1 && !local68.aBoolean835);
				if (!local68.method31981(arg7, (short) 16811)) {
					arg6.anInt5810 = local8 * -33749981;
					local1++;
				}
				local23 = true;
			}
		}
	}

	@OriginalMember(owner = "client!aih", name = "cb", descriptor = "(Lclient!aop;[BIIIILclient!xe;Lclient!xe;)I", line = 335)
	public static final int method10959(@OriginalArg(0) Class32_Sub14 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class656 arg6, @OriginalArg(7) Class656 arg7) {
		@Pc(1) int local1 = 0;
		@Pc(6) Packet local6 = new Packet(arg1);
		@Pc(8) int local8 = -1;
		label73: while (true) {
			@Pc(12) int local12 = local6.gExtended1or2(1737313311);
			if (local12 == 0) {
				return local1;
			}
			local8 += local12;
			@Pc(21) int local21 = 0;
			@Pc(23) boolean local23 = false;
			while (true) {
				@Pc(36) Class629 local36;
				@Pc(62) int local62;
				@Pc(68) Class610 local68;
				@Pc(86) int local86;
				do {
					@Pc(58) int local58;
					@Pc(81) int local81;
					do {
						do {
							do {
								do {
									@Pc(27) int local27;
									do {
										local27 = local6.gSmart1or2((byte) -13);
										if (local27 == 0) {
											continue label73;
										}
										local36 = new Class629(local6);
									} while (local23);
									local21 += local27 - 1;
									@Pc(48) int local48 = local21 & 0x3F;
									@Pc(54) int local54 = local21 >> 6 & 0x3F;
									local58 = local54 + arg2;
									local62 = arg3 + local48;
									local68 = (Class610) arg0.method18261(local8, -244136268);
									if ((local36.anInt5708 * -1626288991 & 0x1) == 0) {
										local81 = local68.anInt5608 * 427800467;
										local86 = local68.anInt5603 * -774442965;
									} else {
										local81 = local68.anInt5603 * -774442965;
										local86 = local68.anInt5608 * 427800467;
									}
								} while (local58 >= arg4);
							} while (local62 >= arg5);
						} while (local81 + local58 < 0);
					} while (local86 + local62 < 0);
				} while (local36.anInt5709 * 1175627307 == Class615.aClass615_24.anInt5628 * 948246811 && Class51.aClass93_Sub36_1.aClass166_Sub3_1.method15405(-1496115445) == 0 && local68.anInt5592 * 1067969079 == 0 && local68.anInt5591 * -297318857 != 1 && !local68.aBoolean835);
				if (!local68.method31981(arg7, (short) 780)) {
					arg6.anInt5810 = local8 * -33749981;
					local1++;
				}
				local23 = true;
			}
		}
	}

	@OriginalMember(owner = "client!aih", name = "cs", descriptor = "(Lclient!aop;[BIIIILclient!xe;Lclient!xe;)I", line = 335)
	public static final int method10960(@OriginalArg(0) Class32_Sub14 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class656 arg6, @OriginalArg(7) Class656 arg7) {
		@Pc(1) int local1 = 0;
		@Pc(6) Packet local6 = new Packet(arg1);
		@Pc(8) int local8 = -1;
		label73: while (true) {
			@Pc(12) int local12 = local6.gExtended1or2(1959290041);
			if (local12 == 0) {
				return local1;
			}
			local8 += local12;
			@Pc(21) int local21 = 0;
			@Pc(23) boolean local23 = false;
			while (true) {
				@Pc(36) Class629 local36;
				@Pc(62) int local62;
				@Pc(68) Class610 local68;
				@Pc(86) int local86;
				do {
					@Pc(58) int local58;
					@Pc(81) int local81;
					do {
						do {
							do {
								do {
									@Pc(27) int local27;
									do {
										local27 = local6.gSmart1or2((byte) -25);
										if (local27 == 0) {
											continue label73;
										}
										local36 = new Class629(local6);
									} while (local23);
									local21 += local27 - 1;
									@Pc(48) int local48 = local21 & 0x3F;
									@Pc(54) int local54 = local21 >> 6 & 0x3F;
									local58 = local54 + arg2;
									local62 = arg3 + local48;
									local68 = (Class610) arg0.method18261(local8, 1970755084);
									if ((local36.anInt5708 * -1626288991 & 0x1) == 0) {
										local81 = local68.anInt5608 * 427800467;
										local86 = local68.anInt5603 * -774442965;
									} else {
										local81 = local68.anInt5603 * -774442965;
										local86 = local68.anInt5608 * 427800467;
									}
								} while (local58 >= arg4);
							} while (local62 >= arg5);
						} while (local81 + local58 < 0);
					} while (local86 + local62 < 0);
				} while (local36.anInt5709 * 1175627307 == Class615.aClass615_24.anInt5628 * 948246811 && Class51.aClass93_Sub36_1.aClass166_Sub3_1.method15405(-1216062289) == 0 && local68.anInt5592 * 1067969079 == 0 && local68.anInt5591 * -297318857 != 1 && !local68.aBoolean835);
				if (!local68.method31981(arg7, (short) 27658)) {
					arg6.anInt5810 = local8 * -33749981;
					local1++;
				}
				local23 = true;
			}
		}
	}

	@OriginalMember(owner = "client!aih", name = "cy", descriptor = "(Lclient!aop;II)Z", line = 380)
	static final boolean method10961(@OriginalArg(0) Class32_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class610 local5 = (Class610) arg0.method18261(arg1, 1042228997);
		if (arg2 == 11) {
			arg2 = 10;
		}
		if (arg2 >= 5 && arg2 <= 8) {
			arg2 = 4;
		}
		return local5.method31977(arg2, (byte) -12);
	}

	@OriginalMember(owner = "client!aih", name = "cc", descriptor = "(Lclient!dh;[BII)V", line = 387)
	public final void method10962(@OriginalArg(0) Class104 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Packet local4 = new Packet(arg1);
		@Pc(6) int local6 = -1;
		label66: while (true) {
			@Pc(10) int local10 = local4.gExtended1or2(2120694925);
			if (local10 == 0) {
				return;
			}
			local6 += local10;
			@Pc(20) int local20 = 0;
			while (true) {
				@Pc(48) int local48;
				@Pc(53) Class629 local53;
				@Pc(57) int local57;
				@Pc(61) int local61;
				@Pc(104) int local104;
				do {
					@Pc(100) int local100;
					do {
						do {
							do {
								do {
									@Pc(24) int local24 = local4.gSmart1or2((byte) -106);
									if (local24 == 0) {
										continue label66;
									}
									local20 += local24 - 1;
									@Pc(38) int local38 = local20 & 0x3F;
									@Pc(44) int local44 = local20 >> 6 & 0x3F;
									local48 = local20 >> 12;
									local53 = new Class629(local4);
									local57 = arg2 + local44;
									local61 = arg3 + local38;
									@Pc(68) Class610 local68 = (Class610) this.aClass32_Sub14_1.method18261(local6, -1523237490);
									@Pc(80) int local80;
									@Pc(85) int local85;
									if ((local53.anInt5708 * -1626288991 & 0x1) == 0) {
										local80 = local68.anInt5608 * 427800467;
										local85 = local68.anInt5603 * -774442965;
									} else {
										local80 = local68.anInt5603 * -774442965;
										local85 = local68.anInt5608 * 427800467;
									}
									local100 = local80 + local57;
									local104 = local61 + local85;
								} while (local57 >= this.anInt1279 * -115974587);
							} while (local61 >= this.anInt1280 * -586018753);
						} while (local100 <= 0);
					} while (local104 <= 0);
				} while (local53.anInt5709 * 1175627307 != Class615.aClass615_21.anInt5628 * 948246811 && local53.anInt5709 * 1175627307 != Class615.aClass615_22.anInt5628 * 948246811 && (local57 <= 0 || local61 <= 0 || local57 >= this.anInt1279 * -115974587 - 1 || local61 >= this.anInt1280 * -586018753 - 1));
				this.method10972(arg0, local48, local48, local57, local61, local6, local53.anInt5708 * -1626288991, local53.anInt5709 * 1175627307, -1, 0, local53.aClass458_90, -1401671972);
			}
		}
	}

	@OriginalMember(owner = "client!aih", name = "cz", descriptor = "(Lclient!dh;[BII)V", line = 387)
	public final void method10963(@OriginalArg(0) Class104 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Packet local4 = new Packet(arg1);
		@Pc(6) int local6 = -1;
		label66: while (true) {
			@Pc(10) int local10 = local4.gExtended1or2(1285392261);
			if (local10 == 0) {
				return;
			}
			local6 += local10;
			@Pc(20) int local20 = 0;
			while (true) {
				@Pc(48) int local48;
				@Pc(53) Class629 local53;
				@Pc(57) int local57;
				@Pc(61) int local61;
				@Pc(104) int local104;
				do {
					@Pc(100) int local100;
					do {
						do {
							do {
								do {
									@Pc(24) int local24 = local4.gSmart1or2((byte) -37);
									if (local24 == 0) {
										continue label66;
									}
									local20 += local24 - 1;
									@Pc(38) int local38 = local20 & 0x3F;
									@Pc(44) int local44 = local20 >> 6 & 0x3F;
									local48 = local20 >> 12;
									local53 = new Class629(local4);
									local57 = arg2 + local44;
									local61 = arg3 + local38;
									@Pc(68) Class610 local68 = (Class610) this.aClass32_Sub14_1.method18261(local6, -866167413);
									@Pc(80) int local80;
									@Pc(85) int local85;
									if ((local53.anInt5708 * -1626288991 & 0x1) == 0) {
										local80 = local68.anInt5608 * 427800467;
										local85 = local68.anInt5603 * -774442965;
									} else {
										local80 = local68.anInt5603 * -774442965;
										local85 = local68.anInt5608 * 427800467;
									}
									local100 = local80 + local57;
									local104 = local61 + local85;
								} while (local57 >= this.anInt1279 * -115974587);
							} while (local61 >= this.anInt1280 * -586018753);
						} while (local100 <= 0);
					} while (local104 <= 0);
				} while (local53.anInt5709 * 1175627307 != Class615.aClass615_21.anInt5628 * 948246811 && local53.anInt5709 * 1175627307 != Class615.aClass615_22.anInt5628 * 948246811 && (local57 <= 0 || local61 <= 0 || local57 >= this.anInt1279 * -115974587 - 1 || local61 >= this.anInt1280 * -586018753 - 1));
				this.method10972(arg0, local48, local48, local57, local61, local6, local53.anInt5708 * -1626288991, local53.anInt5709 * 1175627307, -1, 0, local53.aClass458_90, -1401671972);
			}
		}
	}

	@OriginalMember(owner = "client!aih", name = "ck", descriptor = "(Lclient!dh;[BII)V", line = 387)
	public final void method10964(@OriginalArg(0) Class104 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Packet local4 = new Packet(arg1);
		@Pc(6) int local6 = -1;
		label66: while (true) {
			@Pc(10) int local10 = local4.gExtended1or2(1927274145);
			if (local10 == 0) {
				return;
			}
			local6 += local10;
			@Pc(20) int local20 = 0;
			while (true) {
				@Pc(48) int local48;
				@Pc(53) Class629 local53;
				@Pc(57) int local57;
				@Pc(61) int local61;
				@Pc(104) int local104;
				do {
					@Pc(100) int local100;
					do {
						do {
							do {
								do {
									@Pc(24) int local24 = local4.gSmart1or2((byte) -42);
									if (local24 == 0) {
										continue label66;
									}
									local20 += local24 - 1;
									@Pc(38) int local38 = local20 & 0x3F;
									@Pc(44) int local44 = local20 >> 6 & 0x3F;
									local48 = local20 >> 12;
									local53 = new Class629(local4);
									local57 = arg2 + local44;
									local61 = arg3 + local38;
									@Pc(68) Class610 local68 = (Class610) this.aClass32_Sub14_1.method18261(local6, 1243491282);
									@Pc(80) int local80;
									@Pc(85) int local85;
									if ((local53.anInt5708 * -1626288991 & 0x1) == 0) {
										local80 = local68.anInt5608 * 427800467;
										local85 = local68.anInt5603 * -774442965;
									} else {
										local80 = local68.anInt5603 * -774442965;
										local85 = local68.anInt5608 * 427800467;
									}
									local100 = local80 + local57;
									local104 = local61 + local85;
								} while (local57 >= this.anInt1279 * -115974587);
							} while (local61 >= this.anInt1280 * -586018753);
						} while (local100 <= 0);
					} while (local104 <= 0);
				} while (local53.anInt5709 * 1175627307 != Class615.aClass615_21.anInt5628 * 948246811 && local53.anInt5709 * 1175627307 != Class615.aClass615_22.anInt5628 * 948246811 && (local57 <= 0 || local61 <= 0 || local57 >= this.anInt1279 * -115974587 - 1 || local61 >= this.anInt1280 * -586018753 - 1));
				this.method10972(arg0, local48, local48, local57, local61, local6, local53.anInt5708 * -1626288991, local53.anInt5709 * 1175627307, -1, 0, local53.aClass458_90, -1401671972);
			}
		}
	}

	@OriginalMember(owner = "client!aih", name = "cj", descriptor = "(Lclient!dh;[BII)V", line = 387)
	public final void method10965(@OriginalArg(0) Class104 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Packet local4 = new Packet(arg1);
		@Pc(6) int local6 = -1;
		label66: while (true) {
			@Pc(10) int local10 = local4.gExtended1or2(1504811884);
			if (local10 == 0) {
				return;
			}
			local6 += local10;
			@Pc(20) int local20 = 0;
			while (true) {
				@Pc(48) int local48;
				@Pc(53) Class629 local53;
				@Pc(57) int local57;
				@Pc(61) int local61;
				@Pc(104) int local104;
				do {
					@Pc(100) int local100;
					do {
						do {
							do {
								do {
									@Pc(24) int local24 = local4.gSmart1or2((byte) -107);
									if (local24 == 0) {
										continue label66;
									}
									local20 += local24 - 1;
									@Pc(38) int local38 = local20 & 0x3F;
									@Pc(44) int local44 = local20 >> 6 & 0x3F;
									local48 = local20 >> 12;
									local53 = new Class629(local4);
									local57 = arg2 + local44;
									local61 = arg3 + local38;
									@Pc(68) Class610 local68 = (Class610) this.aClass32_Sub14_1.method18261(local6, -1581959712);
									@Pc(80) int local80;
									@Pc(85) int local85;
									if ((local53.anInt5708 * -1626288991 & 0x1) == 0) {
										local80 = local68.anInt5608 * 427800467;
										local85 = local68.anInt5603 * -774442965;
									} else {
										local80 = local68.anInt5603 * -774442965;
										local85 = local68.anInt5608 * 427800467;
									}
									local100 = local80 + local57;
									local104 = local61 + local85;
								} while (local57 >= this.anInt1279 * -115974587);
							} while (local61 >= this.anInt1280 * -586018753);
						} while (local100 <= 0);
					} while (local104 <= 0);
				} while (local53.anInt5709 * 1175627307 != Class615.aClass615_21.anInt5628 * 948246811 && local53.anInt5709 * 1175627307 != Class615.aClass615_22.anInt5628 * 948246811 && (local57 <= 0 || local61 <= 0 || local57 >= this.anInt1279 * -115974587 - 1 || local61 >= this.anInt1280 * -586018753 - 1));
				this.method10972(arg0, local48, local48, local57, local61, local6, local53.anInt5708 * -1626288991, local53.anInt5709 * 1175627307, -1, 0, local53.aClass458_90, -1401671972);
			}
		}
	}

	@OriginalMember(owner = "client!aih", name = "cd", descriptor = "(Lclient!dh;[BII)V", line = 387)
	public final void method10966(@OriginalArg(0) Class104 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Packet local4 = new Packet(arg1);
		@Pc(6) int local6 = -1;
		label66: while (true) {
			@Pc(10) int local10 = local4.gExtended1or2(1625672509);
			if (local10 == 0) {
				return;
			}
			local6 += local10;
			@Pc(20) int local20 = 0;
			while (true) {
				@Pc(48) int local48;
				@Pc(53) Class629 local53;
				@Pc(57) int local57;
				@Pc(61) int local61;
				@Pc(104) int local104;
				do {
					@Pc(100) int local100;
					do {
						do {
							do {
								do {
									@Pc(24) int local24 = local4.gSmart1or2((byte) -56);
									if (local24 == 0) {
										continue label66;
									}
									local20 += local24 - 1;
									@Pc(38) int local38 = local20 & 0x3F;
									@Pc(44) int local44 = local20 >> 6 & 0x3F;
									local48 = local20 >> 12;
									local53 = new Class629(local4);
									local57 = arg2 + local44;
									local61 = arg3 + local38;
									@Pc(68) Class610 local68 = (Class610) this.aClass32_Sub14_1.method18261(local6, 1473409033);
									@Pc(80) int local80;
									@Pc(85) int local85;
									if ((local53.anInt5708 * -1626288991 & 0x1) == 0) {
										local80 = local68.anInt5608 * 427800467;
										local85 = local68.anInt5603 * -774442965;
									} else {
										local80 = local68.anInt5603 * -774442965;
										local85 = local68.anInt5608 * 427800467;
									}
									local100 = local80 + local57;
									local104 = local61 + local85;
								} while (local57 >= this.anInt1279 * -115974587);
							} while (local61 >= this.anInt1280 * -586018753);
						} while (local100 <= 0);
					} while (local104 <= 0);
				} while (local53.anInt5709 * 1175627307 != Class615.aClass615_21.anInt5628 * 948246811 && local53.anInt5709 * 1175627307 != Class615.aClass615_22.anInt5628 * 948246811 && (local57 <= 0 || local61 <= 0 || local57 >= this.anInt1279 * -115974587 - 1 || local61 >= this.anInt1280 * -586018753 - 1));
				this.method10972(arg0, local48, local48, local57, local61, local6, local53.anInt5708 * -1626288991, local53.anInt5709 * 1175627307, -1, 0, local53.aClass458_90, -1401671972);
			}
		}
	}

	@OriginalMember(owner = "client!aih", name = "cv", descriptor = "(Lclient!dh;[BIII)V", line = 387)
	public final void method10967(@OriginalArg(0) Class104 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(4) Packet local4 = new Packet(arg1);
		@Pc(6) int local6 = -1;
		label66: while (true) {
			@Pc(10) int local10 = local4.gExtended1or2(1496907785);
			if (local10 == 0) {
				return;
			}
			local6 += local10;
			@Pc(20) int local20 = 0;
			while (true) {
				@Pc(48) int local48;
				@Pc(53) Class629 local53;
				@Pc(57) int local57;
				@Pc(61) int local61;
				@Pc(104) int local104;
				do {
					@Pc(100) int local100;
					do {
						do {
							do {
								do {
									@Pc(24) int local24 = local4.gSmart1or2((byte) -26);
									if (local24 == 0) {
										continue label66;
									}
									local20 += local24 - 1;
									@Pc(38) int local38 = local20 & 0x3F;
									@Pc(44) int local44 = local20 >> 6 & 0x3F;
									local48 = local20 >> 12;
									local53 = new Class629(local4);
									local57 = arg2 + local44;
									local61 = arg3 + local38;
									@Pc(68) Class610 local68 = (Class610) this.aClass32_Sub14_1.method18261(local6, -274683347);
									@Pc(80) int local80;
									@Pc(85) int local85;
									if ((local53.anInt5708 * -1626288991 & 0x1) == 0) {
										local80 = local68.anInt5608 * 427800467;
										local85 = local68.anInt5603 * -774442965;
									} else {
										local80 = local68.anInt5603 * -774442965;
										local85 = local68.anInt5608 * 427800467;
									}
									local100 = local80 + local57;
									local104 = local61 + local85;
								} while (local57 >= this.anInt1279 * -115974587);
							} while (local61 >= this.anInt1280 * -586018753);
						} while (local100 <= 0);
					} while (local104 <= 0);
				} while (local53.anInt5709 * 1175627307 != Class615.aClass615_21.anInt5628 * 948246811 && local53.anInt5709 * 1175627307 != Class615.aClass615_22.anInt5628 * 948246811 && (local57 <= 0 || local61 <= 0 || local57 >= this.anInt1279 * -115974587 - 1 || local61 >= this.anInt1280 * -586018753 - 1));
				this.method10972(arg0, local48, local48, local57, local61, local6, local53.anInt5708 * -1626288991, local53.anInt5709 * 1175627307, -1, 0, local53.aClass458_90, -1401671972);
			}
		}
	}

	@OriginalMember(owner = "client!aih", name = "dd", descriptor = "(Lclient!dh;[BIIIIIII)V", line = 427)
	public final void method10968(@OriginalArg(0) Class104 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(4) Packet local4 = new Packet(arg1);
		@Pc(6) int local6 = -1;
		label91: while (true) {
			@Pc(10) int local10 = local4.gExtended1or2(1405362307);
			if (local10 == 0) {
				return;
			}
			local6 += local10;
			@Pc(19) int local19 = 0;
			while (true) {
				@Pc(51) Class629 local51;
				@Pc(129) int local129;
				@Pc(153) int local153;
				@Pc(161) int local161;
				do {
					@Pc(157) int local157;
					do {
						do {
							do {
								do {
									@Pc(36) int local36;
									@Pc(42) int local42;
									do {
										do {
											do {
												@Pc(46) int local46;
												do {
													do {
														@Pc(23) int local23 = local4.gSmart1or2((byte) -76);
														if (local23 == 0) {
															continue label91;
														}
														local19 += local23 - 1;
														local36 = local19 & 0x3F;
														local42 = local19 >> 6 & 0x3F;
														local46 = local19 >> 12;
														local51 = new Class629(local4);
													} while (local46 != arg5);
												} while (local42 < arg6);
											} while (local42 >= arg6 + 8);
										} while (local36 < arg7);
									} while (local36 >= arg7 + 8);
									@Pc(77) Class610 local77 = (Class610) this.aClass32_Sub14_1.method18261(local6, -2007022956);
									@Pc(89) int local89;
									@Pc(94) int local94;
									if ((local51.anInt5708 * -1626288991 & 0x1) == 0) {
										local89 = local77.anInt5608 * 427800467;
										local94 = local77.anInt5603 * -774442965;
									} else {
										local89 = local77.anInt5603 * -774442965;
										local94 = local77.anInt5608 * 427800467;
									}
									local129 = arg3 + Class641.method32507(local42 & 0x7, local36 & 0x7, arg8, local77.anInt5608 * 427800467, local77.anInt5603 * -774442965, local51.anInt5708 * -1626288991, (byte) -1);
									local153 = arg4 + Class106.method7536(local42 & 0x7, local36 & 0x7, arg8, local77.anInt5608 * 427800467, local77.anInt5603 * -774442965, local51.anInt5708 * -1626288991, -2111315739);
									local157 = local129 + local89;
									local161 = local94 + local153;
								} while (local129 >= this.anInt1279 * -115974587);
							} while (local153 >= this.anInt1280 * -586018753);
						} while (local157 <= 0);
					} while (local161 <= 0);
				} while (local51.anInt5709 * 1175627307 != Class615.aClass615_21.anInt5628 * 948246811 && Class615.aClass615_22.anInt5628 * 948246811 != local51.anInt5709 * 1175627307 && (local129 <= 0 || local153 <= 0 || local129 >= this.anInt1279 * -115974587 - 1 || local153 >= this.anInt1280 * -586018753 - 1));
				this.method10972(arg0, arg2, arg2, local129, local153, local6, local51.anInt5708 * -1626288991 + arg8 & 0x3, local51.anInt5709 * 1175627307, -1, 0, local51.aClass458_90, -1401671972);
			}
		}
	}

	@OriginalMember(owner = "client!aih", name = "cp", descriptor = "(Lclient!dh;[BIIIIIIII)V", line = 427)
	public final void method10969(@OriginalArg(0) Class104 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(4) Packet local4 = new Packet(arg1);
		@Pc(6) int local6 = -1;
		label91: while (true) {
			@Pc(10) int local10 = local4.gExtended1or2(1697451881);
			if (local10 == 0) {
				return;
			}
			local6 += local10;
			@Pc(19) int local19 = 0;
			while (true) {
				@Pc(51) Class629 local51;
				@Pc(129) int local129;
				@Pc(153) int local153;
				@Pc(161) int local161;
				do {
					@Pc(157) int local157;
					do {
						do {
							do {
								do {
									@Pc(36) int local36;
									@Pc(42) int local42;
									do {
										do {
											do {
												@Pc(46) int local46;
												do {
													do {
														@Pc(23) int local23 = local4.gSmart1or2((byte) -25);
														if (local23 == 0) {
															continue label91;
														}
														local19 += local23 - 1;
														local36 = local19 & 0x3F;
														local42 = local19 >> 6 & 0x3F;
														local46 = local19 >> 12;
														local51 = new Class629(local4);
													} while (local46 != arg5);
												} while (local42 < arg6);
											} while (local42 >= arg6 + 8);
										} while (local36 < arg7);
									} while (local36 >= arg7 + 8);
									@Pc(77) Class610 local77 = (Class610) this.aClass32_Sub14_1.method18261(local6, 923331474);
									@Pc(89) int local89;
									@Pc(94) int local94;
									if ((local51.anInt5708 * -1626288991 & 0x1) == 0) {
										local89 = local77.anInt5608 * 427800467;
										local94 = local77.anInt5603 * -774442965;
									} else {
										local89 = local77.anInt5603 * -774442965;
										local94 = local77.anInt5608 * 427800467;
									}
									local129 = arg3 + Class641.method32507(local42 & 0x7, local36 & 0x7, arg8, local77.anInt5608 * 427800467, local77.anInt5603 * -774442965, local51.anInt5708 * -1626288991, (byte) -1);
									local153 = arg4 + Class106.method7536(local42 & 0x7, local36 & 0x7, arg8, local77.anInt5608 * 427800467, local77.anInt5603 * -774442965, local51.anInt5708 * -1626288991, -1525040504);
									local157 = local129 + local89;
									local161 = local94 + local153;
								} while (local129 >= this.anInt1279 * -115974587);
							} while (local153 >= this.anInt1280 * -586018753);
						} while (local157 <= 0);
					} while (local161 <= 0);
				} while (local51.anInt5709 * 1175627307 != Class615.aClass615_21.anInt5628 * 948246811 && Class615.aClass615_22.anInt5628 * 948246811 != local51.anInt5709 * 1175627307 && (local129 <= 0 || local153 <= 0 || local129 >= this.anInt1279 * -115974587 - 1 || local153 >= this.anInt1280 * -586018753 - 1));
				this.method10972(arg0, arg2, arg2, local129, local153, local6, local51.anInt5708 * -1626288991 + arg8 & 0x3, local51.anInt5709 * 1175627307, -1, 0, local51.aClass458_90, -1401671972);
			}
		}
	}

	@OriginalMember(owner = "client!aih", name = "dr", descriptor = "(Lclient!dh;[BIIIIIII)V", line = 427)
	public final void method10970(@OriginalArg(0) Class104 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(4) Packet local4 = new Packet(arg1);
		@Pc(6) int local6 = -1;
		label91: while (true) {
			@Pc(10) int local10 = local4.gExtended1or2(1616838902);
			if (local10 == 0) {
				return;
			}
			local6 += local10;
			@Pc(19) int local19 = 0;
			while (true) {
				@Pc(51) Class629 local51;
				@Pc(129) int local129;
				@Pc(153) int local153;
				@Pc(161) int local161;
				do {
					@Pc(157) int local157;
					do {
						do {
							do {
								do {
									@Pc(36) int local36;
									@Pc(42) int local42;
									do {
										do {
											do {
												@Pc(46) int local46;
												do {
													do {
														@Pc(23) int local23 = local4.gSmart1or2((byte) -36);
														if (local23 == 0) {
															continue label91;
														}
														local19 += local23 - 1;
														local36 = local19 & 0x3F;
														local42 = local19 >> 6 & 0x3F;
														local46 = local19 >> 12;
														local51 = new Class629(local4);
													} while (local46 != arg5);
												} while (local42 < arg6);
											} while (local42 >= arg6 + 8);
										} while (local36 < arg7);
									} while (local36 >= arg7 + 8);
									@Pc(77) Class610 local77 = (Class610) this.aClass32_Sub14_1.method18261(local6, -2104361079);
									@Pc(89) int local89;
									@Pc(94) int local94;
									if ((local51.anInt5708 * -1626288991 & 0x1) == 0) {
										local89 = local77.anInt5608 * 427800467;
										local94 = local77.anInt5603 * -774442965;
									} else {
										local89 = local77.anInt5603 * -774442965;
										local94 = local77.anInt5608 * 427800467;
									}
									local129 = arg3 + Class641.method32507(local42 & 0x7, local36 & 0x7, arg8, local77.anInt5608 * 427800467, local77.anInt5603 * -774442965, local51.anInt5708 * -1626288991, (byte) -1);
									local153 = arg4 + Class106.method7536(local42 & 0x7, local36 & 0x7, arg8, local77.anInt5608 * 427800467, local77.anInt5603 * -774442965, local51.anInt5708 * -1626288991, -1773157313);
									local157 = local129 + local89;
									local161 = local94 + local153;
								} while (local129 >= this.anInt1279 * -115974587);
							} while (local153 >= this.anInt1280 * -586018753);
						} while (local157 <= 0);
					} while (local161 <= 0);
				} while (local51.anInt5709 * 1175627307 != Class615.aClass615_21.anInt5628 * 948246811 && Class615.aClass615_22.anInt5628 * 948246811 != local51.anInt5709 * 1175627307 && (local129 <= 0 || local153 <= 0 || local129 >= this.anInt1279 * -115974587 - 1 || local153 >= this.anInt1280 * -586018753 - 1));
				this.method10972(arg0, arg2, arg2, local129, local153, local6, local51.anInt5708 * -1626288991 + arg8 & 0x3, local51.anInt5709 * 1175627307, -1, 0, local51.aClass458_90, -1401671972);
			}
		}
	}

	@OriginalMember(owner = "client!aih", name = "c", descriptor = "(B)Lclient!aac;", line = 463)
	static Class5 method10971(@OriginalArg(0) byte arg0) {
		@Pc(9) Class5 local9;
		if (!Class454.aBoolean774) {
			local9 = Class110_Sub3.aClass5_7;
		} else if (Class276.aClass106_10 == null || Class49.aClass5_12 == null) {
			local9 = Class110_Sub3.aClass5_7;
		} else {
			local9 = Class49.aClass5_12;
		}
		Class454.anInt5036 = local9.anInt6 * 1275164249 + local9.anInt10 * -1045092183;
		return local9;
	}

	@OriginalMember(owner = "client!aih", name = "ca", descriptor = "(Lclient!dh;IIIIIIIIILclient!oe;I)V", line = 469)
	final void method10972(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class458 arg10, @OriginalArg(11) int arg11) {
		if (arg2 < this.anInt1303 * -1860234461) {
			this.anInt1303 = arg2 * 728020107;
		}
		@Pc(17) Class610 local17 = (Class610) this.aClass32_Sub14_1.method18261(arg5, -1483752704);
		if (Class51.aClass93_Sub36_1.aClass166_Sub14_1.method15656(-1684897143) == 0 && local17.aBoolean838) {
			return;
		}
		@Pc(37) int local37;
		@Pc(42) int local42;
		if (arg6 == 1 || arg6 == 3) {
			local37 = local17.anInt5603 * -774442965;
			local42 = local17.anInt5608 * 427800467;
		} else {
			local37 = local17.anInt5608 * 427800467;
			local42 = local17.anInt5603 * -774442965;
		}
		@Pc(67) int local67;
		@Pc(75) int local75;
		if (local37 + arg3 <= this.anInt1279 * -115974587) {
			local67 = (local37 >> 1) + arg3;
			local75 = arg3 + (local37 + 1 >> 1);
		} else {
			local67 = arg3;
			local75 = arg3 + 1;
		}
		@Pc(96) int local96;
		@Pc(104) int local104;
		if (local42 + arg4 <= this.anInt1280 * -586018753) {
			local96 = arg4 + (local42 >> 1);
			local104 = arg4 + (local42 + 1 >> 1);
		} else {
			local96 = arg4;
			local104 = arg4 + 1;
		}
		@Pc(117) Class99 local117 = this.aClass585_5.aClass99Array1[arg1];
		@Pc(155) int local155;
		if (Class615.aClass615_21.anInt5628 * 948246811 == arg7 || Class615.aClass615_22.anInt5628 * 948246811 == arg7) {
			local155 = local117.method2481(local67, local96, 665765747) + local117.method2481(local75, local96, -2122552647) + local117.method2481(local67, local104, -795850275) + local117.method2481(local75, local104, -1263896124) >> 2;
		} else {
			local155 = local117.method2480(local67, local96, -1717657414) + local117.method2480(local75, local96, -877373011) + local117.method2480(local67, local104, -2041217442) + local117.method2480(local75, local104, -246702626) >> 2;
		}
		@Pc(190) int local190 = (local37 << 8) + (arg3 << 9);
		@Pc(198) int local198 = (local42 << 8) + (arg4 << 9);
		@Pc(211) boolean local211 = this.aBoolean232 && !this.aBoolean236 && local17.aBoolean830;
		if (local17.method32001(1892946812)) {
			Class643.method32582(arg2, arg3, arg4, arg6, local17, null, null, 694869299);
		}
		@Pc(252) boolean local252 = arg8 == -1 && (!local17.method32005((byte) 4) || local17.aBoolean831 && Class51.aClass93_Sub36_1.aClass166_Sub31_1.method16114((short) 29318) == 0) && local17.anIntArray492 == null && !local17.aBoolean840 && !local17.aBoolean841;
		if (aBoolean241 && (Class549.method31023(arg7, -1134295448) && local17.anInt5594 * 1349946317 != 1 || !(!Class281.method26462(arg7, -710594195) || local17.anInt5594 * 1349946317 != 0))) {
			return;
		}
		if (arg7 != Class615.aClass615_24.anInt5628 * 948246811) {
			@Pc(426) Class132_Sub1_Sub1 local426;
			@Pc(378) Class132_Sub1_Sub1_Sub2 local378;
			if (Class615.aClass615_21.anInt5628 * 948246811 == arg7 || arg7 == Class615.aClass615_22.anInt5628 * 948246811) {
				local378 = null;
				@Pc(424) int local424;
				if (local252) {
					@Pc(420) Class132_Sub1_Sub1_Sub2 local420 = new Class132_Sub1_Sub1_Sub2(this.aClass585_5, arg0, this.aClass32_Sub14_1, local17, arg2, arg1, local190, local155, local198, this.aBoolean236, arg3, arg3 + local37 - 1, arg4, arg4 + local42 - 1, arg7, arg6, local211, Class613.aClass613_4 != local17.aClass613_1, arg10);
					local424 = local420.method13140(-65841782);
					local426 = local420;
					local378 = local420;
				} else {
					local426 = new Class132_Sub1_Sub1_Sub3(this.aClass585_5, arg0, this.aClass32_Sub14_1, local17, arg2, arg1, local190, local155, local198, this.aBoolean236, arg3, local37 + arg3 - 1, arg4, arg4 + local42 - 1, arg7, arg6, arg8, arg9, local17.aClass613_1 != Class613.aClass613_4, arg10);
					local424 = 15;
				}
				if (this.aClass585_5.method31495(local426, false, -2013812986)) {
					if (local378 != null && local378.method13406(-1540746877)) {
						local378.method13417(arg0, (byte) 24);
					}
					if (local17.aBoolean834 && this.aBoolean232) {
						if (local424 > 30) {
							local424 = 30;
						}
						for (@Pc(503) int local503 = 0; local503 <= local37; local503++) {
							for (@Pc(508) int local508 = 0; local508 <= local42; local508++) {
								local117.method2486(arg3 + local503, local508 + arg4, local424);
							}
						}
					}
				}
			} else if (Class281.method26462(arg7, -927932646) || Class476.method29686(arg7, -783424709)) {
				if (local252) {
					local378 = new Class132_Sub1_Sub1_Sub2(this.aClass585_5, arg0, this.aClass32_Sub14_1, local17, arg2, arg1, local190, local155, local198, this.aBoolean236, arg3, local37 + arg3 - 1, arg4, local42 + arg4 - 1, arg7, arg6, local211, true, arg10);
					if (local378.method13406(-53867068)) {
						local378.method13417(arg0, (byte) 83);
					}
					local426 = local378;
				} else {
					local426 = new Class132_Sub1_Sub1_Sub3(this.aClass585_5, arg0, this.aClass32_Sub14_1, local17, arg2, arg1, local190, local155, local198, this.aBoolean236, arg3, local37 + arg3 - 1, arg4, arg4 + local42 - 1, arg7, arg6, arg8, arg9, true, arg10);
				}
				this.aClass585_5.method31495(local426, false, -1970586157);
				if (this.aBoolean232 && !this.aBoolean236 && Class281.method26462(arg7, 1592122379) && Class615.aClass615_11.anInt5628 * 948246811 != arg7 && arg2 > 0 && local17.anInt5594 * 1349946317 != 0) {
					this.aByteArrayArrayArray6[arg2][arg3][arg4] = (byte) (this.aByteArrayArrayArray6[arg2][arg3][arg4] | 0x4);
				}
			} else if (!this.method10975(arg0, arg7, arg6, local252, local17, arg8, arg9, arg2, arg1, local190, local155, local198, arg3, arg4, local211, local117, local37, local42, arg10, -467967349) && !this.method10979(arg0, arg7, arg6, local252, local17, arg8, arg9, arg2, arg1, local190, local155, local198, arg3, arg4, arg10, (byte) 50)) {
				;
			}
		} else if (Class51.aClass93_Sub36_1.aClass166_Sub3_1.method15405(-392085377) != 0 || local17.anInt5592 * 1067969079 != 0 || local17.anInt5591 * -297318857 == 1 || local17.aBoolean835) {
			@Pc(333) Class132_Sub1_Sub4 local333;
			if (local252) {
				@Pc(323) Class132_Sub1_Sub4_Sub2 local323 = new Class132_Sub1_Sub4_Sub2(this.aClass585_5, arg0, this.aClass32_Sub14_1, local17, arg2, arg1, local190, local155, local198, this.aBoolean236, arg6, local211, arg10);
				if (local323.method13406(900141033)) {
					local323.method13417(arg0, (byte) 50);
				}
				local333 = local323;
			} else {
				local333 = new Class132_Sub1_Sub4_Sub1(this.aClass585_5, arg0, this.aClass32_Sub14_1, local17, arg2, arg1, local190, local155, local198, this.aBoolean236, arg6, arg8, arg9, arg10);
			}
			this.aClass585_5.method31479(arg2, arg3, arg4, local333, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!aih", name = "dt", descriptor = "(Lclient!dh;IIIIIIIIILclient!oe;)V", line = 469)
	final void method10973(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class458 arg10) {
		if (arg2 < this.anInt1303 * -1860234461) {
			this.anInt1303 = arg2 * 728020107;
		}
		@Pc(17) Class610 local17 = (Class610) this.aClass32_Sub14_1.method18261(arg5, 1820923607);
		if (Class51.aClass93_Sub36_1.aClass166_Sub14_1.method15656(-1138395363) == 0 && local17.aBoolean838) {
			return;
		}
		@Pc(37) int local37;
		@Pc(42) int local42;
		if (arg6 == 1 || arg6 == 3) {
			local37 = local17.anInt5603 * -774442965;
			local42 = local17.anInt5608 * 427800467;
		} else {
			local37 = local17.anInt5608 * 427800467;
			local42 = local17.anInt5603 * -774442965;
		}
		@Pc(67) int local67;
		@Pc(75) int local75;
		if (local37 + arg3 <= this.anInt1279 * -115974587) {
			local67 = (local37 >> 1) + arg3;
			local75 = arg3 + (local37 + 1 >> 1);
		} else {
			local67 = arg3;
			local75 = arg3 + 1;
		}
		@Pc(96) int local96;
		@Pc(104) int local104;
		if (local42 + arg4 <= this.anInt1280 * -586018753) {
			local96 = arg4 + (local42 >> 1);
			local104 = arg4 + (local42 + 1 >> 1);
		} else {
			local96 = arg4;
			local104 = arg4 + 1;
		}
		@Pc(117) Class99 local117 = this.aClass585_5.aClass99Array1[arg1];
		@Pc(155) int local155;
		if (Class615.aClass615_21.anInt5628 * 948246811 == arg7 || Class615.aClass615_22.anInt5628 * 948246811 == arg7) {
			local155 = local117.method2481(local67, local96, -180982977) + local117.method2481(local75, local96, -291332770) + local117.method2481(local67, local104, 1081957269) + local117.method2481(local75, local104, 1082099554) >> 2;
		} else {
			local155 = local117.method2480(local67, local96, -323337588) + local117.method2480(local75, local96, -1592040199) + local117.method2480(local67, local104, -1846753281) + local117.method2480(local75, local104, -513095181) >> 2;
		}
		@Pc(190) int local190 = (local37 << 8) + (arg3 << 9);
		@Pc(198) int local198 = (local42 << 8) + (arg4 << 9);
		@Pc(211) boolean local211 = this.aBoolean232 && !this.aBoolean236 && local17.aBoolean830;
		if (local17.method32001(1496718186)) {
			Class643.method32582(arg2, arg3, arg4, arg6, local17, null, null, 694869299);
		}
		@Pc(252) boolean local252 = arg8 == -1 && (!local17.method32005((byte) -17) || local17.aBoolean831 && Class51.aClass93_Sub36_1.aClass166_Sub31_1.method16114((short) 23182) == 0) && local17.anIntArray492 == null && !local17.aBoolean840 && !local17.aBoolean841;
		if (aBoolean241 && (Class549.method31023(arg7, -1331345271) && local17.anInt5594 * 1349946317 != 1 || !(!Class281.method26462(arg7, 1231996485) || local17.anInt5594 * 1349946317 != 0))) {
			return;
		}
		if (arg7 != Class615.aClass615_24.anInt5628 * 948246811) {
			@Pc(426) Class132_Sub1_Sub1 local426;
			@Pc(378) Class132_Sub1_Sub1_Sub2 local378;
			if (Class615.aClass615_21.anInt5628 * 948246811 == arg7 || arg7 == Class615.aClass615_22.anInt5628 * 948246811) {
				local378 = null;
				@Pc(424) int local424;
				if (local252) {
					@Pc(420) Class132_Sub1_Sub1_Sub2 local420 = new Class132_Sub1_Sub1_Sub2(this.aClass585_5, arg0, this.aClass32_Sub14_1, local17, arg2, arg1, local190, local155, local198, this.aBoolean236, arg3, arg3 + local37 - 1, arg4, arg4 + local42 - 1, arg7, arg6, local211, Class613.aClass613_4 != local17.aClass613_1, arg10);
					local424 = local420.method13140(-65841782);
					local426 = local420;
					local378 = local420;
				} else {
					local426 = new Class132_Sub1_Sub1_Sub3(this.aClass585_5, arg0, this.aClass32_Sub14_1, local17, arg2, arg1, local190, local155, local198, this.aBoolean236, arg3, local37 + arg3 - 1, arg4, arg4 + local42 - 1, arg7, arg6, arg8, arg9, local17.aClass613_1 != Class613.aClass613_4, arg10);
					local424 = 15;
				}
				if (this.aClass585_5.method31495(local426, false, -2142397325)) {
					if (local378 != null && local378.method13406(-414225069)) {
						local378.method13417(arg0, (byte) 66);
					}
					if (local17.aBoolean834 && this.aBoolean232) {
						if (local424 > 30) {
							local424 = 30;
						}
						for (@Pc(503) int local503 = 0; local503 <= local37; local503++) {
							for (@Pc(508) int local508 = 0; local508 <= local42; local508++) {
								local117.method2486(arg3 + local503, local508 + arg4, local424);
							}
						}
					}
				}
			} else if (Class281.method26462(arg7, 1407992027) || Class476.method29686(arg7, -825987591)) {
				if (local252) {
					local378 = new Class132_Sub1_Sub1_Sub2(this.aClass585_5, arg0, this.aClass32_Sub14_1, local17, arg2, arg1, local190, local155, local198, this.aBoolean236, arg3, local37 + arg3 - 1, arg4, local42 + arg4 - 1, arg7, arg6, local211, true, arg10);
					if (local378.method13406(-2076116071)) {
						local378.method13417(arg0, (byte) 35);
					}
					local426 = local378;
				} else {
					local426 = new Class132_Sub1_Sub1_Sub3(this.aClass585_5, arg0, this.aClass32_Sub14_1, local17, arg2, arg1, local190, local155, local198, this.aBoolean236, arg3, local37 + arg3 - 1, arg4, arg4 + local42 - 1, arg7, arg6, arg8, arg9, true, arg10);
				}
				this.aClass585_5.method31495(local426, false, -1947287444);
				if (this.aBoolean232 && !this.aBoolean236 && Class281.method26462(arg7, -1352716932) && Class615.aClass615_11.anInt5628 * 948246811 != arg7 && arg2 > 0 && local17.anInt5594 * 1349946317 != 0) {
					this.aByteArrayArrayArray6[arg2][arg3][arg4] = (byte) (this.aByteArrayArrayArray6[arg2][arg3][arg4] | 0x4);
				}
			} else if (!this.method10975(arg0, arg7, arg6, local252, local17, arg8, arg9, arg2, arg1, local190, local155, local198, arg3, arg4, local211, local117, local37, local42, arg10, -1038156393) && !this.method10979(arg0, arg7, arg6, local252, local17, arg8, arg9, arg2, arg1, local190, local155, local198, arg3, arg4, arg10, (byte) 1)) {
				;
			}
		} else if (Class51.aClass93_Sub36_1.aClass166_Sub3_1.method15405(-1733924144) != 0 || local17.anInt5592 * 1067969079 != 0 || local17.anInt5591 * -297318857 == 1 || local17.aBoolean835) {
			@Pc(333) Class132_Sub1_Sub4 local333;
			if (local252) {
				@Pc(323) Class132_Sub1_Sub4_Sub2 local323 = new Class132_Sub1_Sub4_Sub2(this.aClass585_5, arg0, this.aClass32_Sub14_1, local17, arg2, arg1, local190, local155, local198, this.aBoolean236, arg6, local211, arg10);
				if (local323.method13406(414633391)) {
					local323.method13417(arg0, (byte) 82);
				}
				local333 = local323;
			} else {
				local333 = new Class132_Sub1_Sub4_Sub1(this.aClass585_5, arg0, this.aClass32_Sub14_1, local17, arg2, arg1, local190, local155, local198, this.aBoolean236, arg6, arg8, arg9, arg10);
			}
			this.aClass585_5.method31479(arg2, arg3, arg4, local333, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!aih", name = "da", descriptor = "(Lclient!dh;IIIIIIIIILclient!oe;)V", line = 469)
	final void method10974(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class458 arg10) {
		if (arg2 < this.anInt1303 * -1860234461) {
			this.anInt1303 = arg2 * 728020107;
		}
		@Pc(17) Class610 local17 = (Class610) this.aClass32_Sub14_1.method18261(arg5, 150234049);
		if (Class51.aClass93_Sub36_1.aClass166_Sub14_1.method15656(-881210666) == 0 && local17.aBoolean838) {
			return;
		}
		@Pc(37) int local37;
		@Pc(42) int local42;
		if (arg6 == 1 || arg6 == 3) {
			local37 = local17.anInt5603 * -774442965;
			local42 = local17.anInt5608 * 427800467;
		} else {
			local37 = local17.anInt5608 * 427800467;
			local42 = local17.anInt5603 * -774442965;
		}
		@Pc(67) int local67;
		@Pc(75) int local75;
		if (local37 + arg3 <= this.anInt1279 * -115974587) {
			local67 = (local37 >> 1) + arg3;
			local75 = arg3 + (local37 + 1 >> 1);
		} else {
			local67 = arg3;
			local75 = arg3 + 1;
		}
		@Pc(96) int local96;
		@Pc(104) int local104;
		if (local42 + arg4 <= this.anInt1280 * -586018753) {
			local96 = arg4 + (local42 >> 1);
			local104 = arg4 + (local42 + 1 >> 1);
		} else {
			local96 = arg4;
			local104 = arg4 + 1;
		}
		@Pc(117) Class99 local117 = this.aClass585_5.aClass99Array1[arg1];
		@Pc(155) int local155;
		if (Class615.aClass615_21.anInt5628 * 948246811 == arg7 || Class615.aClass615_22.anInt5628 * 948246811 == arg7) {
			local155 = local117.method2481(local67, local96, -1161411426) + local117.method2481(local75, local96, 1987230162) + local117.method2481(local67, local104, 917823015) + local117.method2481(local75, local104, -803258403) >> 2;
		} else {
			local155 = local117.method2480(local67, local96, -1817257531) + local117.method2480(local75, local96, -935306634) + local117.method2480(local67, local104, -934465764) + local117.method2480(local75, local104, -959254417) >> 2;
		}
		@Pc(190) int local190 = (local37 << 8) + (arg3 << 9);
		@Pc(198) int local198 = (local42 << 8) + (arg4 << 9);
		@Pc(211) boolean local211 = this.aBoolean232 && !this.aBoolean236 && local17.aBoolean830;
		if (local17.method32001(2046333735)) {
			Class643.method32582(arg2, arg3, arg4, arg6, local17, null, null, 694869299);
		}
		@Pc(252) boolean local252 = arg8 == -1 && (!local17.method32005((byte) -96) || local17.aBoolean831 && Class51.aClass93_Sub36_1.aClass166_Sub31_1.method16114((short) 3885) == 0) && local17.anIntArray492 == null && !local17.aBoolean840 && !local17.aBoolean841;
		if (aBoolean241 && (Class549.method31023(arg7, -2140254338) && local17.anInt5594 * 1349946317 != 1 || !(!Class281.method26462(arg7, -1679122361) || local17.anInt5594 * 1349946317 != 0))) {
			return;
		}
		if (arg7 != Class615.aClass615_24.anInt5628 * 948246811) {
			@Pc(426) Class132_Sub1_Sub1 local426;
			@Pc(378) Class132_Sub1_Sub1_Sub2 local378;
			if (Class615.aClass615_21.anInt5628 * 948246811 == arg7 || arg7 == Class615.aClass615_22.anInt5628 * 948246811) {
				local378 = null;
				@Pc(424) int local424;
				if (local252) {
					@Pc(420) Class132_Sub1_Sub1_Sub2 local420 = new Class132_Sub1_Sub1_Sub2(this.aClass585_5, arg0, this.aClass32_Sub14_1, local17, arg2, arg1, local190, local155, local198, this.aBoolean236, arg3, arg3 + local37 - 1, arg4, arg4 + local42 - 1, arg7, arg6, local211, Class613.aClass613_4 != local17.aClass613_1, arg10);
					local424 = local420.method13140(-65841782);
					local426 = local420;
					local378 = local420;
				} else {
					local426 = new Class132_Sub1_Sub1_Sub3(this.aClass585_5, arg0, this.aClass32_Sub14_1, local17, arg2, arg1, local190, local155, local198, this.aBoolean236, arg3, local37 + arg3 - 1, arg4, arg4 + local42 - 1, arg7, arg6, arg8, arg9, local17.aClass613_1 != Class613.aClass613_4, arg10);
					local424 = 15;
				}
				if (this.aClass585_5.method31495(local426, false, -1950005234)) {
					if (local378 != null && local378.method13406(-1385899574)) {
						local378.method13417(arg0, (byte) 108);
					}
					if (local17.aBoolean834 && this.aBoolean232) {
						if (local424 > 30) {
							local424 = 30;
						}
						for (@Pc(503) int local503 = 0; local503 <= local37; local503++) {
							for (@Pc(508) int local508 = 0; local508 <= local42; local508++) {
								local117.method2486(arg3 + local503, local508 + arg4, local424);
							}
						}
					}
				}
			} else if (Class281.method26462(arg7, 1340892987) || Class476.method29686(arg7, -2136962862)) {
				if (local252) {
					local378 = new Class132_Sub1_Sub1_Sub2(this.aClass585_5, arg0, this.aClass32_Sub14_1, local17, arg2, arg1, local190, local155, local198, this.aBoolean236, arg3, local37 + arg3 - 1, arg4, local42 + arg4 - 1, arg7, arg6, local211, true, arg10);
					if (local378.method13406(-1932323835)) {
						local378.method13417(arg0, (byte) 21);
					}
					local426 = local378;
				} else {
					local426 = new Class132_Sub1_Sub1_Sub3(this.aClass585_5, arg0, this.aClass32_Sub14_1, local17, arg2, arg1, local190, local155, local198, this.aBoolean236, arg3, local37 + arg3 - 1, arg4, arg4 + local42 - 1, arg7, arg6, arg8, arg9, true, arg10);
				}
				this.aClass585_5.method31495(local426, false, -2014285509);
				if (this.aBoolean232 && !this.aBoolean236 && Class281.method26462(arg7, 559319193) && Class615.aClass615_11.anInt5628 * 948246811 != arg7 && arg2 > 0 && local17.anInt5594 * 1349946317 != 0) {
					this.aByteArrayArrayArray6[arg2][arg3][arg4] = (byte) (this.aByteArrayArrayArray6[arg2][arg3][arg4] | 0x4);
				}
			} else if (!this.method10975(arg0, arg7, arg6, local252, local17, arg8, arg9, arg2, arg1, local190, local155, local198, arg3, arg4, local211, local117, local37, local42, arg10, -1791655926) && !this.method10979(arg0, arg7, arg6, local252, local17, arg8, arg9, arg2, arg1, local190, local155, local198, arg3, arg4, arg10, (byte) -43)) {
				;
			}
		} else if (Class51.aClass93_Sub36_1.aClass166_Sub3_1.method15405(-1019863038) != 0 || local17.anInt5592 * 1067969079 != 0 || local17.anInt5591 * -297318857 == 1 || local17.aBoolean835) {
			@Pc(333) Class132_Sub1_Sub4 local333;
			if (local252) {
				@Pc(323) Class132_Sub1_Sub4_Sub2 local323 = new Class132_Sub1_Sub4_Sub2(this.aClass585_5, arg0, this.aClass32_Sub14_1, local17, arg2, arg1, local190, local155, local198, this.aBoolean236, arg6, local211, arg10);
				if (local323.method13406(-652480868)) {
					local323.method13417(arg0, (byte) 62);
				}
				local333 = local323;
			} else {
				local333 = new Class132_Sub1_Sub4_Sub1(this.aClass585_5, arg0, this.aClass32_Sub14_1, local17, arg2, arg1, local190, local155, local198, this.aBoolean236, arg6, arg8, arg9, arg10);
			}
			this.aClass585_5.method31479(arg2, arg3, arg4, local333, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!aih", name = "cx", descriptor = "(Lclient!dh;IIZLclient!vd;IIIIIIIIIZLclient!cb;IILclient!oe;I)Z", line = 570)
	boolean method10975(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class610 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) Class99 arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) Class458 arg18, @OriginalArg(19) int arg19) {
		@Pc(53) Class132_Sub1_Sub2 local53;
		if (Class615.aClass615_13.anInt5628 * 948246811 == arg1) {
			@Pc(10) int local10 = arg4.anInt5594 * 1349946317;
			if (aBoolean240 && arg4.anInt5594 * 1349946317 == -1) {
				local10 = 1;
			}
			if (arg3) {
				@Pc(43) Class132_Sub1_Sub2_Sub1 local43 = new Class132_Sub1_Sub2_Sub1(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, arg1, arg2, arg14, arg18);
				if (local43.method13406(717072911)) {
					local43.method13417(arg0, (byte) 69);
				}
				local53 = local43;
			} else {
				local53 = new Class132_Sub1_Sub2_Sub2(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, arg1, arg2, arg5, arg6, arg18);
			}
			this.aClass585_5.method31488(arg7, arg12, arg13, local53, null, 1303565495);
			if (arg2 == 0) {
				if (this.aBoolean232 && arg4.aBoolean834) {
					arg15.method2486(arg12, arg13, 50);
					arg15.method2486(arg12, arg13 + 1, 50);
				}
				if (local10 == 1 && !this.aBoolean236) {
					this.aClass585_5.aClass598_2.method31788(1, arg7, arg12, arg13, arg4.anInt5595 * -2039712105, arg4.anInt5596 * 955083601);
				}
			} else if (arg2 == 1) {
				if (this.aBoolean232 && arg4.aBoolean834) {
					arg15.method2486(arg12, arg13 + 1, 50);
					arg15.method2486(arg12 + 1, arg13 + 1, 50);
				}
				if (local10 == 1 && !this.aBoolean236) {
					this.aClass585_5.aClass598_2.method31788(2, arg7, arg12, arg13 + 1, arg4.anInt5595 * -2039712105, -(arg4.anInt5596 * 955083601));
				}
			} else if (arg2 == 2) {
				if (this.aBoolean232 && arg4.aBoolean834) {
					arg15.method2486(arg12 + 1, arg13, 50);
					arg15.method2486(arg12 + 1, arg13 + 1, 50);
				}
				if (local10 == 1 && !this.aBoolean236) {
					this.aClass585_5.aClass598_2.method31788(1, arg7, arg12 + 1, arg13, arg4.anInt5595 * -2039712105, -(arg4.anInt5596 * 955083601));
				}
			} else if (arg2 == 3) {
				if (this.aBoolean232 && arg4.aBoolean834) {
					arg15.method2486(arg12, arg13, 50);
					arg15.method2486(arg12 + 1, arg13, 50);
				}
				if (local10 == 1 && !this.aBoolean236) {
					this.aClass585_5.aClass598_2.method31788(2, arg7, arg12, arg13, arg4.anInt5595 * -2039712105, arg4.anInt5596 * 955083601);
				}
			}
			if (arg4.anInt5597 * 1128343593 != 64) {
				this.aClass585_5.method31497(arg7, arg12, arg13, arg4.anInt5597 * 1128343593, 2118916794);
			}
			return true;
		}
		@Pc(331) Class132_Sub1_Sub2 local331;
		@Pc(321) Class132_Sub1_Sub2_Sub1 local321;
		if (arg1 == Class615.aClass615_10.anInt5628 * 948246811) {
			if (arg3) {
				local321 = new Class132_Sub1_Sub2_Sub1(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, arg1, arg2, arg14, arg18);
				if (local321.method13406(-1293960411)) {
					local321.method13417(arg0, (byte) 17);
				}
				local331 = local321;
			} else {
				local331 = new Class132_Sub1_Sub2_Sub2(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, arg1, arg2, arg5, arg6, arg18);
			}
			this.aClass585_5.method31488(arg7, arg12, arg13, local331, null, 201739670);
			if (arg4.aBoolean834 && this.aBoolean232) {
				if (arg2 == 0) {
					arg15.method2486(arg12, arg13 + 1, 50);
				} else if (arg2 == 1) {
					arg15.method2486(arg12 + 1, arg13 + 1, 50);
				} else if (arg2 == 2) {
					arg15.method2486(arg12 + 1, arg13, 50);
				} else if (arg2 == 3) {
					arg15.method2486(arg12, arg13, 50);
				}
			}
			return true;
		} else if (arg1 == Class615.aClass615_4.anInt5628 * 948246811) {
			@Pc(425) int local425 = arg2 + 1 & 0x3;
			if (arg3) {
				@Pc(450) Class132_Sub1_Sub2_Sub1 local450 = new Class132_Sub1_Sub2_Sub1(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, arg1, arg2 + 4, arg14, arg18);
				@Pc(471) Class132_Sub1_Sub2_Sub1 local471 = new Class132_Sub1_Sub2_Sub1(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, arg1, local425, arg14, arg18);
				if (local450.method13406(-591275729)) {
					local450.method13417(arg0, (byte) 25);
				}
				if (local471.method13406(26130360)) {
					local471.method13417(arg0, (byte) 11);
				}
				local331 = local450;
				local53 = local471;
			} else {
				local331 = new Class132_Sub1_Sub2_Sub2(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, arg1, arg2 + 4, arg5, arg6, arg18);
				local53 = new Class132_Sub1_Sub2_Sub2(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, arg1, local425, arg5, arg6, arg18);
			}
			this.aClass585_5.method31488(arg7, arg12, arg13, local331, local53, 463053404);
			if ((arg4.anInt5594 * 1349946317 == 1 || aBoolean240 && arg4.anInt5594 * 1349946317 == -1) && !this.aBoolean236) {
				if (arg2 == 0) {
					this.aClass585_5.aClass598_2.method31788(1, arg7, arg12, arg13, arg4.anInt5595 * -2039712105, arg4.anInt5596 * 955083601);
					this.aClass585_5.aClass598_2.method31788(2, arg7, arg12, arg13 + 1, arg4.anInt5595 * -2039712105, arg4.anInt5596 * 955083601);
				} else if (arg2 == 1) {
					this.aClass585_5.aClass598_2.method31788(1, arg7, arg12 + 1, arg13, arg4.anInt5595 * -2039712105, arg4.anInt5596 * 955083601);
					this.aClass585_5.aClass598_2.method31788(2, arg7, arg12, arg13 + 1, arg4.anInt5595 * -2039712105, arg4.anInt5596 * 955083601);
				} else if (arg2 == 2) {
					this.aClass585_5.aClass598_2.method31788(1, arg7, arg12 + 1, arg13, arg4.anInt5595 * -2039712105, arg4.anInt5596 * 955083601);
					this.aClass585_5.aClass598_2.method31788(2, arg7, arg12, arg13, arg4.anInt5595 * -2039712105, arg4.anInt5596 * 955083601);
				} else if (arg2 == 3) {
					this.aClass585_5.aClass598_2.method31788(1, arg7, arg12, arg13, arg4.anInt5595 * -2039712105, arg4.anInt5596 * 955083601);
					this.aClass585_5.aClass598_2.method31788(2, arg7, arg12, arg13, arg4.anInt5595 * -2039712105, arg4.anInt5596 * 955083601);
				}
			}
			if (arg4.anInt5597 * 1128343593 != 64) {
				this.aClass585_5.method31497(arg7, arg12, arg13, arg4.anInt5597 * 1128343593, 2033173460);
			}
			return true;
		} else if (Class615.aClass615_5.anInt5628 * 948246811 == arg1) {
			if (arg3) {
				local321 = new Class132_Sub1_Sub2_Sub1(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, arg1, arg2, arg14, arg18);
				if (local321.method13406(-1488283881)) {
					local321.method13417(arg0, (byte) 99);
				}
				local331 = local321;
			} else {
				local331 = new Class132_Sub1_Sub2_Sub2(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, arg1, arg2, arg5, arg6, arg18);
			}
			this.aClass585_5.method31488(arg7, arg12, arg13, local331, null, 1774273358);
			if (arg4.aBoolean834 && this.aBoolean232) {
				if (arg2 == 0) {
					arg15.method2486(arg12, arg13 + 1, 50);
				} else if (arg2 == 1) {
					arg15.method2486(arg12 + 1, arg13 + 1, 50);
				} else if (arg2 == 2) {
					arg15.method2486(arg12 + 1, arg13, 50);
				} else if (arg2 == 3) {
					arg15.method2486(arg12, arg13, 50);
				}
			}
			return true;
		} else if (arg1 == Class615.aClass615_6.anInt5628 * 948246811) {
			@Pc(899) Class132_Sub1_Sub1 local899;
			if (arg3) {
				@Pc(889) Class132_Sub1_Sub1_Sub2 local889 = new Class132_Sub1_Sub1_Sub2(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, arg12, arg12, arg13, arg13, arg1, arg2, arg14, true, arg18);
				if (local889.method13406(753274084)) {
					local889.method13417(arg0, (byte) 26);
				}
				local899 = local889;
			} else {
				local899 = new Class132_Sub1_Sub1_Sub3(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, arg12, arg12 + arg16 - 1, arg13, arg13 + arg17 - 1, arg1, arg2, arg5, arg6, true, arg18);
			}
			this.aClass585_5.method31495(local899, false, -2078323471);
			if (arg4.anInt5594 * 1349946317 == 1 && !this.aBoolean236) {
				@Pc(957) byte local957;
				if ((arg2 & 0x1) == 0) {
					local957 = 8;
				} else {
					local957 = 16;
				}
				this.aClass585_5.aClass598_2.method31788(local957, arg7, arg12, arg13, arg4.anInt5595 * -2039712105, 0);
			}
			if (arg4.anInt5597 * 1128343593 != 64) {
				this.aClass585_5.method31497(arg7, arg12, arg13, arg4.anInt5597 * 1128343593, 2102830930);
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aih", name = "dz", descriptor = "(Lclient!dh;IIZLclient!vd;IIIIIIIIIZLclient!cb;IILclient!oe;)Z", line = 570)
	boolean method10976(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class610 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) Class99 arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) Class458 arg18) {
		@Pc(53) Class132_Sub1_Sub2 local53;
		if (Class615.aClass615_13.anInt5628 * 948246811 == arg1) {
			@Pc(10) int local10 = arg4.anInt5594 * 1349946317;
			if (aBoolean240 && arg4.anInt5594 * 1349946317 == -1) {
				local10 = 1;
			}
			if (arg3) {
				@Pc(43) Class132_Sub1_Sub2_Sub1 local43 = new Class132_Sub1_Sub2_Sub1(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, arg1, arg2, arg14, arg18);
				if (local43.method13406(824515739)) {
					local43.method13417(arg0, (byte) 15);
				}
				local53 = local43;
			} else {
				local53 = new Class132_Sub1_Sub2_Sub2(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, arg1, arg2, arg5, arg6, arg18);
			}
			this.aClass585_5.method31488(arg7, arg12, arg13, local53, null, -392317038);
			if (arg2 == 0) {
				if (this.aBoolean232 && arg4.aBoolean834) {
					arg15.method2486(arg12, arg13, 50);
					arg15.method2486(arg12, arg13 + 1, 50);
				}
				if (local10 == 1 && !this.aBoolean236) {
					this.aClass585_5.aClass598_2.method31788(1, arg7, arg12, arg13, arg4.anInt5595 * -2039712105, arg4.anInt5596 * 955083601);
				}
			} else if (arg2 == 1) {
				if (this.aBoolean232 && arg4.aBoolean834) {
					arg15.method2486(arg12, arg13 + 1, 50);
					arg15.method2486(arg12 + 1, arg13 + 1, 50);
				}
				if (local10 == 1 && !this.aBoolean236) {
					this.aClass585_5.aClass598_2.method31788(2, arg7, arg12, arg13 + 1, arg4.anInt5595 * -2039712105, -(arg4.anInt5596 * 955083601));
				}
			} else if (arg2 == 2) {
				if (this.aBoolean232 && arg4.aBoolean834) {
					arg15.method2486(arg12 + 1, arg13, 50);
					arg15.method2486(arg12 + 1, arg13 + 1, 50);
				}
				if (local10 == 1 && !this.aBoolean236) {
					this.aClass585_5.aClass598_2.method31788(1, arg7, arg12 + 1, arg13, arg4.anInt5595 * -2039712105, -(arg4.anInt5596 * 955083601));
				}
			} else if (arg2 == 3) {
				if (this.aBoolean232 && arg4.aBoolean834) {
					arg15.method2486(arg12, arg13, 50);
					arg15.method2486(arg12 + 1, arg13, 50);
				}
				if (local10 == 1 && !this.aBoolean236) {
					this.aClass585_5.aClass598_2.method31788(2, arg7, arg12, arg13, arg4.anInt5595 * -2039712105, arg4.anInt5596 * 955083601);
				}
			}
			if (arg4.anInt5597 * 1128343593 != 64) {
				this.aClass585_5.method31497(arg7, arg12, arg13, arg4.anInt5597 * 1128343593, 2062843511);
			}
			return true;
		}
		@Pc(331) Class132_Sub1_Sub2 local331;
		@Pc(321) Class132_Sub1_Sub2_Sub1 local321;
		if (arg1 == Class615.aClass615_10.anInt5628 * 948246811) {
			if (arg3) {
				local321 = new Class132_Sub1_Sub2_Sub1(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, arg1, arg2, arg14, arg18);
				if (local321.method13406(-1115253402)) {
					local321.method13417(arg0, (byte) 29);
				}
				local331 = local321;
			} else {
				local331 = new Class132_Sub1_Sub2_Sub2(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, arg1, arg2, arg5, arg6, arg18);
			}
			this.aClass585_5.method31488(arg7, arg12, arg13, local331, null, 1440938884);
			if (arg4.aBoolean834 && this.aBoolean232) {
				if (arg2 == 0) {
					arg15.method2486(arg12, arg13 + 1, 50);
				} else if (arg2 == 1) {
					arg15.method2486(arg12 + 1, arg13 + 1, 50);
				} else if (arg2 == 2) {
					arg15.method2486(arg12 + 1, arg13, 50);
				} else if (arg2 == 3) {
					arg15.method2486(arg12, arg13, 50);
				}
			}
			return true;
		} else if (arg1 == Class615.aClass615_4.anInt5628 * 948246811) {
			@Pc(425) int local425 = arg2 + 1 & 0x3;
			if (arg3) {
				@Pc(450) Class132_Sub1_Sub2_Sub1 local450 = new Class132_Sub1_Sub2_Sub1(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, arg1, arg2 + 4, arg14, arg18);
				@Pc(471) Class132_Sub1_Sub2_Sub1 local471 = new Class132_Sub1_Sub2_Sub1(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, arg1, local425, arg14, arg18);
				if (local450.method13406(-2023702000)) {
					local450.method13417(arg0, (byte) 49);
				}
				if (local471.method13406(-555817817)) {
					local471.method13417(arg0, (byte) 93);
				}
				local331 = local450;
				local53 = local471;
			} else {
				local331 = new Class132_Sub1_Sub2_Sub2(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, arg1, arg2 + 4, arg5, arg6, arg18);
				local53 = new Class132_Sub1_Sub2_Sub2(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, arg1, local425, arg5, arg6, arg18);
			}
			this.aClass585_5.method31488(arg7, arg12, arg13, local331, local53, -936173736);
			if ((arg4.anInt5594 * 1349946317 == 1 || aBoolean240 && arg4.anInt5594 * 1349946317 == -1) && !this.aBoolean236) {
				if (arg2 == 0) {
					this.aClass585_5.aClass598_2.method31788(1, arg7, arg12, arg13, arg4.anInt5595 * -2039712105, arg4.anInt5596 * 955083601);
					this.aClass585_5.aClass598_2.method31788(2, arg7, arg12, arg13 + 1, arg4.anInt5595 * -2039712105, arg4.anInt5596 * 955083601);
				} else if (arg2 == 1) {
					this.aClass585_5.aClass598_2.method31788(1, arg7, arg12 + 1, arg13, arg4.anInt5595 * -2039712105, arg4.anInt5596 * 955083601);
					this.aClass585_5.aClass598_2.method31788(2, arg7, arg12, arg13 + 1, arg4.anInt5595 * -2039712105, arg4.anInt5596 * 955083601);
				} else if (arg2 == 2) {
					this.aClass585_5.aClass598_2.method31788(1, arg7, arg12 + 1, arg13, arg4.anInt5595 * -2039712105, arg4.anInt5596 * 955083601);
					this.aClass585_5.aClass598_2.method31788(2, arg7, arg12, arg13, arg4.anInt5595 * -2039712105, arg4.anInt5596 * 955083601);
				} else if (arg2 == 3) {
					this.aClass585_5.aClass598_2.method31788(1, arg7, arg12, arg13, arg4.anInt5595 * -2039712105, arg4.anInt5596 * 955083601);
					this.aClass585_5.aClass598_2.method31788(2, arg7, arg12, arg13, arg4.anInt5595 * -2039712105, arg4.anInt5596 * 955083601);
				}
			}
			if (arg4.anInt5597 * 1128343593 != 64) {
				this.aClass585_5.method31497(arg7, arg12, arg13, arg4.anInt5597 * 1128343593, 2101075318);
			}
			return true;
		} else if (Class615.aClass615_5.anInt5628 * 948246811 == arg1) {
			if (arg3) {
				local321 = new Class132_Sub1_Sub2_Sub1(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, arg1, arg2, arg14, arg18);
				if (local321.method13406(-836055786)) {
					local321.method13417(arg0, (byte) 70);
				}
				local331 = local321;
			} else {
				local331 = new Class132_Sub1_Sub2_Sub2(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, arg1, arg2, arg5, arg6, arg18);
			}
			this.aClass585_5.method31488(arg7, arg12, arg13, local331, null, -793118018);
			if (arg4.aBoolean834 && this.aBoolean232) {
				if (arg2 == 0) {
					arg15.method2486(arg12, arg13 + 1, 50);
				} else if (arg2 == 1) {
					arg15.method2486(arg12 + 1, arg13 + 1, 50);
				} else if (arg2 == 2) {
					arg15.method2486(arg12 + 1, arg13, 50);
				} else if (arg2 == 3) {
					arg15.method2486(arg12, arg13, 50);
				}
			}
			return true;
		} else if (arg1 == Class615.aClass615_6.anInt5628 * 948246811) {
			@Pc(899) Class132_Sub1_Sub1 local899;
			if (arg3) {
				@Pc(889) Class132_Sub1_Sub1_Sub2 local889 = new Class132_Sub1_Sub1_Sub2(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, arg12, arg12, arg13, arg13, arg1, arg2, arg14, true, arg18);
				if (local889.method13406(-1633741675)) {
					local889.method13417(arg0, (byte) 118);
				}
				local899 = local889;
			} else {
				local899 = new Class132_Sub1_Sub1_Sub3(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, arg12, arg12 + arg16 - 1, arg13, arg13 + arg17 - 1, arg1, arg2, arg5, arg6, true, arg18);
			}
			this.aClass585_5.method31495(local899, false, -2002518365);
			if (arg4.anInt5594 * 1349946317 == 1 && !this.aBoolean236) {
				@Pc(957) byte local957;
				if ((arg2 & 0x1) == 0) {
					local957 = 8;
				} else {
					local957 = 16;
				}
				this.aClass585_5.aClass598_2.method31788(local957, arg7, arg12, arg13, arg4.anInt5595 * -2039712105, 0);
			}
			if (arg4.anInt5597 * 1128343593 != 64) {
				this.aClass585_5.method31497(arg7, arg12, arg13, arg4.anInt5597 * 1128343593, 2119525962);
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aih", name = "do", descriptor = "(Lclient!dh;IIZLclient!vd;IIIIIIIIIZLclient!cb;IILclient!oe;)Z", line = 570)
	boolean method10977(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class610 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) Class99 arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) Class458 arg18) {
		@Pc(53) Class132_Sub1_Sub2 local53;
		if (Class615.aClass615_13.anInt5628 * 948246811 == arg1) {
			@Pc(10) int local10 = arg4.anInt5594 * 1349946317;
			if (aBoolean240 && arg4.anInt5594 * 1349946317 == -1) {
				local10 = 1;
			}
			if (arg3) {
				@Pc(43) Class132_Sub1_Sub2_Sub1 local43 = new Class132_Sub1_Sub2_Sub1(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, arg1, arg2, arg14, arg18);
				if (local43.method13406(818242104)) {
					local43.method13417(arg0, (byte) 51);
				}
				local53 = local43;
			} else {
				local53 = new Class132_Sub1_Sub2_Sub2(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, arg1, arg2, arg5, arg6, arg18);
			}
			this.aClass585_5.method31488(arg7, arg12, arg13, local53, null, -967065086);
			if (arg2 == 0) {
				if (this.aBoolean232 && arg4.aBoolean834) {
					arg15.method2486(arg12, arg13, 50);
					arg15.method2486(arg12, arg13 + 1, 50);
				}
				if (local10 == 1 && !this.aBoolean236) {
					this.aClass585_5.aClass598_2.method31788(1, arg7, arg12, arg13, arg4.anInt5595 * -2039712105, arg4.anInt5596 * 955083601);
				}
			} else if (arg2 == 1) {
				if (this.aBoolean232 && arg4.aBoolean834) {
					arg15.method2486(arg12, arg13 + 1, 50);
					arg15.method2486(arg12 + 1, arg13 + 1, 50);
				}
				if (local10 == 1 && !this.aBoolean236) {
					this.aClass585_5.aClass598_2.method31788(2, arg7, arg12, arg13 + 1, arg4.anInt5595 * -2039712105, -(arg4.anInt5596 * 955083601));
				}
			} else if (arg2 == 2) {
				if (this.aBoolean232 && arg4.aBoolean834) {
					arg15.method2486(arg12 + 1, arg13, 50);
					arg15.method2486(arg12 + 1, arg13 + 1, 50);
				}
				if (local10 == 1 && !this.aBoolean236) {
					this.aClass585_5.aClass598_2.method31788(1, arg7, arg12 + 1, arg13, arg4.anInt5595 * -2039712105, -(arg4.anInt5596 * 955083601));
				}
			} else if (arg2 == 3) {
				if (this.aBoolean232 && arg4.aBoolean834) {
					arg15.method2486(arg12, arg13, 50);
					arg15.method2486(arg12 + 1, arg13, 50);
				}
				if (local10 == 1 && !this.aBoolean236) {
					this.aClass585_5.aClass598_2.method31788(2, arg7, arg12, arg13, arg4.anInt5595 * -2039712105, arg4.anInt5596 * 955083601);
				}
			}
			if (arg4.anInt5597 * 1128343593 != 64) {
				this.aClass585_5.method31497(arg7, arg12, arg13, arg4.anInt5597 * 1128343593, 2076723479);
			}
			return true;
		}
		@Pc(331) Class132_Sub1_Sub2 local331;
		@Pc(321) Class132_Sub1_Sub2_Sub1 local321;
		if (arg1 == Class615.aClass615_10.anInt5628 * 948246811) {
			if (arg3) {
				local321 = new Class132_Sub1_Sub2_Sub1(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, arg1, arg2, arg14, arg18);
				if (local321.method13406(-539207249)) {
					local321.method13417(arg0, (byte) 80);
				}
				local331 = local321;
			} else {
				local331 = new Class132_Sub1_Sub2_Sub2(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, arg1, arg2, arg5, arg6, arg18);
			}
			this.aClass585_5.method31488(arg7, arg12, arg13, local331, null, -1556982255);
			if (arg4.aBoolean834 && this.aBoolean232) {
				if (arg2 == 0) {
					arg15.method2486(arg12, arg13 + 1, 50);
				} else if (arg2 == 1) {
					arg15.method2486(arg12 + 1, arg13 + 1, 50);
				} else if (arg2 == 2) {
					arg15.method2486(arg12 + 1, arg13, 50);
				} else if (arg2 == 3) {
					arg15.method2486(arg12, arg13, 50);
				}
			}
			return true;
		} else if (arg1 == Class615.aClass615_4.anInt5628 * 948246811) {
			@Pc(425) int local425 = arg2 + 1 & 0x3;
			if (arg3) {
				@Pc(450) Class132_Sub1_Sub2_Sub1 local450 = new Class132_Sub1_Sub2_Sub1(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, arg1, arg2 + 4, arg14, arg18);
				@Pc(471) Class132_Sub1_Sub2_Sub1 local471 = new Class132_Sub1_Sub2_Sub1(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, arg1, local425, arg14, arg18);
				if (local450.method13406(-1052197426)) {
					local450.method13417(arg0, (byte) 2);
				}
				if (local471.method13406(-1660961228)) {
					local471.method13417(arg0, (byte) 37);
				}
				local331 = local450;
				local53 = local471;
			} else {
				local331 = new Class132_Sub1_Sub2_Sub2(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, arg1, arg2 + 4, arg5, arg6, arg18);
				local53 = new Class132_Sub1_Sub2_Sub2(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, arg1, local425, arg5, arg6, arg18);
			}
			this.aClass585_5.method31488(arg7, arg12, arg13, local331, local53, 1068406428);
			if ((arg4.anInt5594 * 1349946317 == 1 || aBoolean240 && arg4.anInt5594 * 1349946317 == -1) && !this.aBoolean236) {
				if (arg2 == 0) {
					this.aClass585_5.aClass598_2.method31788(1, arg7, arg12, arg13, arg4.anInt5595 * -2039712105, arg4.anInt5596 * 955083601);
					this.aClass585_5.aClass598_2.method31788(2, arg7, arg12, arg13 + 1, arg4.anInt5595 * -2039712105, arg4.anInt5596 * 955083601);
				} else if (arg2 == 1) {
					this.aClass585_5.aClass598_2.method31788(1, arg7, arg12 + 1, arg13, arg4.anInt5595 * -2039712105, arg4.anInt5596 * 955083601);
					this.aClass585_5.aClass598_2.method31788(2, arg7, arg12, arg13 + 1, arg4.anInt5595 * -2039712105, arg4.anInt5596 * 955083601);
				} else if (arg2 == 2) {
					this.aClass585_5.aClass598_2.method31788(1, arg7, arg12 + 1, arg13, arg4.anInt5595 * -2039712105, arg4.anInt5596 * 955083601);
					this.aClass585_5.aClass598_2.method31788(2, arg7, arg12, arg13, arg4.anInt5595 * -2039712105, arg4.anInt5596 * 955083601);
				} else if (arg2 == 3) {
					this.aClass585_5.aClass598_2.method31788(1, arg7, arg12, arg13, arg4.anInt5595 * -2039712105, arg4.anInt5596 * 955083601);
					this.aClass585_5.aClass598_2.method31788(2, arg7, arg12, arg13, arg4.anInt5595 * -2039712105, arg4.anInt5596 * 955083601);
				}
			}
			if (arg4.anInt5597 * 1128343593 != 64) {
				this.aClass585_5.method31497(arg7, arg12, arg13, arg4.anInt5597 * 1128343593, 2036817184);
			}
			return true;
		} else if (Class615.aClass615_5.anInt5628 * 948246811 == arg1) {
			if (arg3) {
				local321 = new Class132_Sub1_Sub2_Sub1(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, arg1, arg2, arg14, arg18);
				if (local321.method13406(-2037283125)) {
					local321.method13417(arg0, (byte) 87);
				}
				local331 = local321;
			} else {
				local331 = new Class132_Sub1_Sub2_Sub2(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, arg1, arg2, arg5, arg6, arg18);
			}
			this.aClass585_5.method31488(arg7, arg12, arg13, local331, null, 823296042);
			if (arg4.aBoolean834 && this.aBoolean232) {
				if (arg2 == 0) {
					arg15.method2486(arg12, arg13 + 1, 50);
				} else if (arg2 == 1) {
					arg15.method2486(arg12 + 1, arg13 + 1, 50);
				} else if (arg2 == 2) {
					arg15.method2486(arg12 + 1, arg13, 50);
				} else if (arg2 == 3) {
					arg15.method2486(arg12, arg13, 50);
				}
			}
			return true;
		} else if (arg1 == Class615.aClass615_6.anInt5628 * 948246811) {
			@Pc(899) Class132_Sub1_Sub1 local899;
			if (arg3) {
				@Pc(889) Class132_Sub1_Sub1_Sub2 local889 = new Class132_Sub1_Sub1_Sub2(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, arg12, arg12, arg13, arg13, arg1, arg2, arg14, true, arg18);
				if (local889.method13406(-556365782)) {
					local889.method13417(arg0, (byte) 53);
				}
				local899 = local889;
			} else {
				local899 = new Class132_Sub1_Sub1_Sub3(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, arg12, arg12 + arg16 - 1, arg13, arg13 + arg17 - 1, arg1, arg2, arg5, arg6, true, arg18);
			}
			this.aClass585_5.method31495(local899, false, -2082658262);
			if (arg4.anInt5594 * 1349946317 == 1 && !this.aBoolean236) {
				@Pc(957) byte local957;
				if ((arg2 & 0x1) == 0) {
					local957 = 8;
				} else {
					local957 = 16;
				}
				this.aClass585_5.aClass598_2.method31788(local957, arg7, arg12, arg13, arg4.anInt5595 * -2039712105, 0);
			}
			if (arg4.anInt5597 * 1128343593 != 64) {
				this.aClass585_5.method31497(arg7, arg12, arg13, arg4.anInt5597 * 1128343593, 2107563648);
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aih", name = "dv", descriptor = "(Lclient!dh;IIZLclient!vd;IIIIIIIIIZLclient!cb;IILclient!oe;)Z", line = 570)
	boolean method10978(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class610 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) Class99 arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) Class458 arg18) {
		@Pc(53) Class132_Sub1_Sub2 local53;
		if (Class615.aClass615_13.anInt5628 * 948246811 == arg1) {
			@Pc(10) int local10 = arg4.anInt5594 * 1349946317;
			if (aBoolean240 && arg4.anInt5594 * 1349946317 == -1) {
				local10 = 1;
			}
			if (arg3) {
				@Pc(43) Class132_Sub1_Sub2_Sub1 local43 = new Class132_Sub1_Sub2_Sub1(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, arg1, arg2, arg14, arg18);
				if (local43.method13406(-1778865662)) {
					local43.method13417(arg0, (byte) 6);
				}
				local53 = local43;
			} else {
				local53 = new Class132_Sub1_Sub2_Sub2(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, arg1, arg2, arg5, arg6, arg18);
			}
			this.aClass585_5.method31488(arg7, arg12, arg13, local53, null, -2035698952);
			if (arg2 == 0) {
				if (this.aBoolean232 && arg4.aBoolean834) {
					arg15.method2486(arg12, arg13, 50);
					arg15.method2486(arg12, arg13 + 1, 50);
				}
				if (local10 == 1 && !this.aBoolean236) {
					this.aClass585_5.aClass598_2.method31788(1, arg7, arg12, arg13, arg4.anInt5595 * -2039712105, arg4.anInt5596 * 955083601);
				}
			} else if (arg2 == 1) {
				if (this.aBoolean232 && arg4.aBoolean834) {
					arg15.method2486(arg12, arg13 + 1, 50);
					arg15.method2486(arg12 + 1, arg13 + 1, 50);
				}
				if (local10 == 1 && !this.aBoolean236) {
					this.aClass585_5.aClass598_2.method31788(2, arg7, arg12, arg13 + 1, arg4.anInt5595 * -2039712105, -(arg4.anInt5596 * 955083601));
				}
			} else if (arg2 == 2) {
				if (this.aBoolean232 && arg4.aBoolean834) {
					arg15.method2486(arg12 + 1, arg13, 50);
					arg15.method2486(arg12 + 1, arg13 + 1, 50);
				}
				if (local10 == 1 && !this.aBoolean236) {
					this.aClass585_5.aClass598_2.method31788(1, arg7, arg12 + 1, arg13, arg4.anInt5595 * -2039712105, -(arg4.anInt5596 * 955083601));
				}
			} else if (arg2 == 3) {
				if (this.aBoolean232 && arg4.aBoolean834) {
					arg15.method2486(arg12, arg13, 50);
					arg15.method2486(arg12 + 1, arg13, 50);
				}
				if (local10 == 1 && !this.aBoolean236) {
					this.aClass585_5.aClass598_2.method31788(2, arg7, arg12, arg13, arg4.anInt5595 * -2039712105, arg4.anInt5596 * 955083601);
				}
			}
			if (arg4.anInt5597 * 1128343593 != 64) {
				this.aClass585_5.method31497(arg7, arg12, arg13, arg4.anInt5597 * 1128343593, 2051174199);
			}
			return true;
		}
		@Pc(331) Class132_Sub1_Sub2 local331;
		@Pc(321) Class132_Sub1_Sub2_Sub1 local321;
		if (arg1 == Class615.aClass615_10.anInt5628 * 948246811) {
			if (arg3) {
				local321 = new Class132_Sub1_Sub2_Sub1(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, arg1, arg2, arg14, arg18);
				if (local321.method13406(-543836195)) {
					local321.method13417(arg0, (byte) 50);
				}
				local331 = local321;
			} else {
				local331 = new Class132_Sub1_Sub2_Sub2(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, arg1, arg2, arg5, arg6, arg18);
			}
			this.aClass585_5.method31488(arg7, arg12, arg13, local331, null, -196615372);
			if (arg4.aBoolean834 && this.aBoolean232) {
				if (arg2 == 0) {
					arg15.method2486(arg12, arg13 + 1, 50);
				} else if (arg2 == 1) {
					arg15.method2486(arg12 + 1, arg13 + 1, 50);
				} else if (arg2 == 2) {
					arg15.method2486(arg12 + 1, arg13, 50);
				} else if (arg2 == 3) {
					arg15.method2486(arg12, arg13, 50);
				}
			}
			return true;
		} else if (arg1 == Class615.aClass615_4.anInt5628 * 948246811) {
			@Pc(425) int local425 = arg2 + 1 & 0x3;
			if (arg3) {
				@Pc(450) Class132_Sub1_Sub2_Sub1 local450 = new Class132_Sub1_Sub2_Sub1(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, arg1, arg2 + 4, arg14, arg18);
				@Pc(471) Class132_Sub1_Sub2_Sub1 local471 = new Class132_Sub1_Sub2_Sub1(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, arg1, local425, arg14, arg18);
				if (local450.method13406(-738771744)) {
					local450.method13417(arg0, (byte) 15);
				}
				if (local471.method13406(157444614)) {
					local471.method13417(arg0, (byte) 16);
				}
				local331 = local450;
				local53 = local471;
			} else {
				local331 = new Class132_Sub1_Sub2_Sub2(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, arg1, arg2 + 4, arg5, arg6, arg18);
				local53 = new Class132_Sub1_Sub2_Sub2(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, arg1, local425, arg5, arg6, arg18);
			}
			this.aClass585_5.method31488(arg7, arg12, arg13, local331, local53, 416723625);
			if ((arg4.anInt5594 * 1349946317 == 1 || aBoolean240 && arg4.anInt5594 * 1349946317 == -1) && !this.aBoolean236) {
				if (arg2 == 0) {
					this.aClass585_5.aClass598_2.method31788(1, arg7, arg12, arg13, arg4.anInt5595 * -2039712105, arg4.anInt5596 * 955083601);
					this.aClass585_5.aClass598_2.method31788(2, arg7, arg12, arg13 + 1, arg4.anInt5595 * -2039712105, arg4.anInt5596 * 955083601);
				} else if (arg2 == 1) {
					this.aClass585_5.aClass598_2.method31788(1, arg7, arg12 + 1, arg13, arg4.anInt5595 * -2039712105, arg4.anInt5596 * 955083601);
					this.aClass585_5.aClass598_2.method31788(2, arg7, arg12, arg13 + 1, arg4.anInt5595 * -2039712105, arg4.anInt5596 * 955083601);
				} else if (arg2 == 2) {
					this.aClass585_5.aClass598_2.method31788(1, arg7, arg12 + 1, arg13, arg4.anInt5595 * -2039712105, arg4.anInt5596 * 955083601);
					this.aClass585_5.aClass598_2.method31788(2, arg7, arg12, arg13, arg4.anInt5595 * -2039712105, arg4.anInt5596 * 955083601);
				} else if (arg2 == 3) {
					this.aClass585_5.aClass598_2.method31788(1, arg7, arg12, arg13, arg4.anInt5595 * -2039712105, arg4.anInt5596 * 955083601);
					this.aClass585_5.aClass598_2.method31788(2, arg7, arg12, arg13, arg4.anInt5595 * -2039712105, arg4.anInt5596 * 955083601);
				}
			}
			if (arg4.anInt5597 * 1128343593 != 64) {
				this.aClass585_5.method31497(arg7, arg12, arg13, arg4.anInt5597 * 1128343593, 2069523779);
			}
			return true;
		} else if (Class615.aClass615_5.anInt5628 * 948246811 == arg1) {
			if (arg3) {
				local321 = new Class132_Sub1_Sub2_Sub1(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, arg1, arg2, arg14, arg18);
				if (local321.method13406(652433385)) {
					local321.method13417(arg0, (byte) 56);
				}
				local331 = local321;
			} else {
				local331 = new Class132_Sub1_Sub2_Sub2(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, arg1, arg2, arg5, arg6, arg18);
			}
			this.aClass585_5.method31488(arg7, arg12, arg13, local331, null, -1988356073);
			if (arg4.aBoolean834 && this.aBoolean232) {
				if (arg2 == 0) {
					arg15.method2486(arg12, arg13 + 1, 50);
				} else if (arg2 == 1) {
					arg15.method2486(arg12 + 1, arg13 + 1, 50);
				} else if (arg2 == 2) {
					arg15.method2486(arg12 + 1, arg13, 50);
				} else if (arg2 == 3) {
					arg15.method2486(arg12, arg13, 50);
				}
			}
			return true;
		} else if (arg1 == Class615.aClass615_6.anInt5628 * 948246811) {
			@Pc(899) Class132_Sub1_Sub1 local899;
			if (arg3) {
				@Pc(889) Class132_Sub1_Sub1_Sub2 local889 = new Class132_Sub1_Sub1_Sub2(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, arg12, arg12, arg13, arg13, arg1, arg2, arg14, true, arg18);
				if (local889.method13406(-451129703)) {
					local889.method13417(arg0, (byte) 36);
				}
				local899 = local889;
			} else {
				local899 = new Class132_Sub1_Sub1_Sub3(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, arg12, arg12 + arg16 - 1, arg13, arg13 + arg17 - 1, arg1, arg2, arg5, arg6, true, arg18);
			}
			this.aClass585_5.method31495(local899, false, -1948810001);
			if (arg4.anInt5594 * 1349946317 == 1 && !this.aBoolean236) {
				@Pc(957) byte local957;
				if ((arg2 & 0x1) == 0) {
					local957 = 8;
				} else {
					local957 = 16;
				}
				this.aClass585_5.aClass598_2.method31788(local957, arg7, arg12, arg13, arg4.anInt5595 * -2039712105, 0);
			}
			if (arg4.anInt5597 * 1128343593 != 64) {
				this.aClass585_5.method31497(arg7, arg12, arg13, arg4.anInt5597 * 1128343593, 2025999481);
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aih", name = "cw", descriptor = "(Lclient!dh;IIZLclient!vd;IIIIIIIIILclient!oe;B)Z", line = 706)
	boolean method10979(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class610 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) Class458 arg14, @OriginalArg(15) byte arg15) {
		@Pc(39) Class132_Sub1_Sub3 local39;
		if (Class615.aClass615_7.anInt5628 * 948246811 == arg1) {
			if (arg3) {
				@Pc(29) Class132_Sub1_Sub3_Sub2 local29 = new Class132_Sub1_Sub3_Sub2(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, 0, 0, arg1, arg2, arg14);
				if (local29.method13406(-619403433)) {
					local29.method13417(arg0, (byte) 34);
				}
				local39 = local29;
			} else {
				local39 = new Class132_Sub1_Sub3_Sub1(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, 0, 0, arg1, arg2, arg5, arg6, arg14);
			}
			this.aClass585_5.method31492(arg7, arg12, arg13, local39, null, (byte) -6);
			return true;
		}
		@Pc(83) int local83;
		@Pc(92) Interface61 local92;
		@Pc(140) Class132_Sub1_Sub3_Sub2 local140;
		if (Class615.aClass615_8.anInt5628 * 948246811 == arg1) {
			local83 = 65;
			local92 = (Interface61) this.aClass585_5.method31534(arg7, arg12, arg13, -1309876799);
			if (local92 != null) {
				local83 = ((Class610) this.aClass32_Sub14_1.method18261(local92.method13423(-1037211373), 425980959)).anInt5597 * 1128343593 + 1;
			}
			if (arg3) {
				local140 = new Class132_Sub1_Sub3_Sub2(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, anIntArray156[arg2] * local83, anIntArray155[arg2] * local83, arg1, arg2, arg14);
				if (local140.method13406(-32672059)) {
					local140.method13417(arg0, (byte) 106);
				}
				local39 = local140;
			} else {
				local39 = new Class132_Sub1_Sub3_Sub1(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, local83 * anIntArray156[arg2], local83 * anIntArray155[arg2], arg1, arg2, arg5, arg6, arg14);
			}
			this.aClass585_5.method31492(arg7, arg12, arg13, local39, null, (byte) 32);
			return true;
		} else if (arg1 == Class615.aClass615_9.anInt5628 * 948246811) {
			local83 = 33;
			local92 = (Interface61) this.aClass585_5.method31534(arg7, arg12, arg13, -1309876799);
			if (local92 != null) {
				local83 = ((Class610) this.aClass32_Sub14_1.method18261(local92.method13423(-1037211373), -1411769706)).anInt5597 * 1128343593 / 2 + 1;
			}
			if (arg3) {
				local140 = new Class132_Sub1_Sub3_Sub2(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, local83 * anIntArray156[arg2], local83 * anIntArray155[arg2], arg1, arg2 + 4, arg14);
				if (local140.method13406(-753233312)) {
					local140.method13417(arg0, (byte) 67);
				}
				local39 = local140;
			} else {
				local39 = new Class132_Sub1_Sub3_Sub1(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, anIntArray154[arg2] * local83, local83 * anIntArray157[arg2], arg1, arg2 + 4, arg5, arg6, arg14);
			}
			this.aClass585_5.method31492(arg7, arg12, arg13, local39, null, (byte) 8);
			return true;
		} else if (arg1 == Class615.aClass615_16.anInt5628 * 948246811) {
			local83 = arg2 + 2 & 0x3;
			if (arg3) {
				@Pc(358) Class132_Sub1_Sub3_Sub2 local358 = new Class132_Sub1_Sub3_Sub2(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, 0, 0, arg1, local83 + 4, arg14);
				if (local358.method13406(1043439236)) {
					local358.method13417(arg0, (byte) 2);
				}
				local39 = local358;
			} else {
				local39 = new Class132_Sub1_Sub3_Sub1(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, 0, 0, arg1, local83 + 4, arg5, arg6, arg14);
			}
			this.aClass585_5.method31492(arg7, arg12, arg13, local39, null, (byte) 77);
			return true;
		} else if (Class615.aClass615_2.anInt5628 * 948246811 == arg1) {
			@Pc(418) int local418 = arg2 + 2 & 0x3;
			@Pc(420) int local420 = 33;
			@Pc(429) Interface61 local429 = (Interface61) this.aClass585_5.method31534(arg7, arg12, arg13, -1309876799);
			if (local429 != null) {
				local420 = ((Class610) this.aClass32_Sub14_1.method18261(local429.method13423(-1037211373), 1106137551)).anInt5597 * 1128343593 / 2 + 1;
			}
			@Pc(525) Class132_Sub1_Sub3 local525;
			if (arg3) {
				@Pc(481) Class132_Sub1_Sub3_Sub2 local481 = new Class132_Sub1_Sub3_Sub2(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, anIntArray154[arg2] * local420, local420 * anIntArray157[arg2], arg1, arg2 + 4, arg14);
				@Pc(505) Class132_Sub1_Sub3_Sub2 local505 = new Class132_Sub1_Sub3_Sub2(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, 0, 0, arg1, local418 + 4, arg14);
				if (local481.method13406(-1721997444)) {
					local481.method13417(arg0, (byte) 75);
				}
				if (local505.method13406(-702027794)) {
					local505.method13417(arg0, (byte) 60);
				}
				local39 = local481;
				local525 = local505;
			} else {
				@Pc(560) Class132_Sub1_Sub3_Sub1 local560 = new Class132_Sub1_Sub3_Sub1(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, local420 * anIntArray154[arg2], anIntArray157[arg2] * local420, arg1, arg2 + 4, arg5, arg6, arg14);
				@Pc(586) Class132_Sub1_Sub3_Sub1 local586 = new Class132_Sub1_Sub3_Sub1(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, 0, 0, arg1, local418 + 4, arg5, arg6, arg14);
				local39 = local560;
				local525 = local586;
			}
			this.aClass585_5.method31492(arg7, arg12, arg13, local39, local525, (byte) 40);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aih", name = "dm", descriptor = "(Lclient!dh;IIZLclient!vd;IIIIIIIIILclient!oe;)Z", line = 706)
	boolean method10980(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class610 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) Class458 arg14) {
		@Pc(39) Class132_Sub1_Sub3 local39;
		if (Class615.aClass615_7.anInt5628 * 948246811 == arg1) {
			if (arg3) {
				@Pc(29) Class132_Sub1_Sub3_Sub2 local29 = new Class132_Sub1_Sub3_Sub2(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, 0, 0, arg1, arg2, arg14);
				if (local29.method13406(22055748)) {
					local29.method13417(arg0, (byte) 126);
				}
				local39 = local29;
			} else {
				local39 = new Class132_Sub1_Sub3_Sub1(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, 0, 0, arg1, arg2, arg5, arg6, arg14);
			}
			this.aClass585_5.method31492(arg7, arg12, arg13, local39, null, (byte) -106);
			return true;
		}
		@Pc(83) int local83;
		@Pc(92) Interface61 local92;
		@Pc(140) Class132_Sub1_Sub3_Sub2 local140;
		if (Class615.aClass615_8.anInt5628 * 948246811 == arg1) {
			local83 = 65;
			local92 = (Interface61) this.aClass585_5.method31534(arg7, arg12, arg13, -1309876799);
			if (local92 != null) {
				local83 = ((Class610) this.aClass32_Sub14_1.method18261(local92.method13423(-1037211373), -1558405476)).anInt5597 * 1128343593 + 1;
			}
			if (arg3) {
				local140 = new Class132_Sub1_Sub3_Sub2(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, anIntArray156[arg2] * local83, anIntArray155[arg2] * local83, arg1, arg2, arg14);
				if (local140.method13406(300105598)) {
					local140.method13417(arg0, (byte) 87);
				}
				local39 = local140;
			} else {
				local39 = new Class132_Sub1_Sub3_Sub1(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, local83 * anIntArray156[arg2], local83 * anIntArray155[arg2], arg1, arg2, arg5, arg6, arg14);
			}
			this.aClass585_5.method31492(arg7, arg12, arg13, local39, null, (byte) -59);
			return true;
		} else if (arg1 == Class615.aClass615_9.anInt5628 * 948246811) {
			local83 = 33;
			local92 = (Interface61) this.aClass585_5.method31534(arg7, arg12, arg13, -1309876799);
			if (local92 != null) {
				local83 = ((Class610) this.aClass32_Sub14_1.method18261(local92.method13423(-1037211373), 913038263)).anInt5597 * 1128343593 / 2 + 1;
			}
			if (arg3) {
				local140 = new Class132_Sub1_Sub3_Sub2(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, local83 * anIntArray156[arg2], local83 * anIntArray155[arg2], arg1, arg2 + 4, arg14);
				if (local140.method13406(-290383790)) {
					local140.method13417(arg0, (byte) 9);
				}
				local39 = local140;
			} else {
				local39 = new Class132_Sub1_Sub3_Sub1(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, anIntArray154[arg2] * local83, local83 * anIntArray157[arg2], arg1, arg2 + 4, arg5, arg6, arg14);
			}
			this.aClass585_5.method31492(arg7, arg12, arg13, local39, null, (byte) 34);
			return true;
		} else if (arg1 == Class615.aClass615_16.anInt5628 * 948246811) {
			local83 = arg2 + 2 & 0x3;
			if (arg3) {
				@Pc(358) Class132_Sub1_Sub3_Sub2 local358 = new Class132_Sub1_Sub3_Sub2(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, 0, 0, arg1, local83 + 4, arg14);
				if (local358.method13406(1068860720)) {
					local358.method13417(arg0, (byte) 10);
				}
				local39 = local358;
			} else {
				local39 = new Class132_Sub1_Sub3_Sub1(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, 0, 0, arg1, local83 + 4, arg5, arg6, arg14);
			}
			this.aClass585_5.method31492(arg7, arg12, arg13, local39, null, (byte) 4);
			return true;
		} else if (Class615.aClass615_2.anInt5628 * 948246811 == arg1) {
			@Pc(418) int local418 = arg2 + 2 & 0x3;
			@Pc(420) int local420 = 33;
			@Pc(429) Interface61 local429 = (Interface61) this.aClass585_5.method31534(arg7, arg12, arg13, -1309876799);
			if (local429 != null) {
				local420 = ((Class610) this.aClass32_Sub14_1.method18261(local429.method13423(-1037211373), 935013888)).anInt5597 * 1128343593 / 2 + 1;
			}
			@Pc(525) Class132_Sub1_Sub3 local525;
			if (arg3) {
				@Pc(481) Class132_Sub1_Sub3_Sub2 local481 = new Class132_Sub1_Sub3_Sub2(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, anIntArray154[arg2] * local420, local420 * anIntArray157[arg2], arg1, arg2 + 4, arg14);
				@Pc(505) Class132_Sub1_Sub3_Sub2 local505 = new Class132_Sub1_Sub3_Sub2(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, 0, 0, arg1, local418 + 4, arg14);
				if (local481.method13406(-351308562)) {
					local481.method13417(arg0, (byte) 94);
				}
				if (local505.method13406(-1089507323)) {
					local505.method13417(arg0, (byte) 74);
				}
				local39 = local481;
				local525 = local505;
			} else {
				@Pc(560) Class132_Sub1_Sub3_Sub1 local560 = new Class132_Sub1_Sub3_Sub1(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, local420 * anIntArray154[arg2], anIntArray157[arg2] * local420, arg1, arg2 + 4, arg5, arg6, arg14);
				@Pc(586) Class132_Sub1_Sub3_Sub1 local586 = new Class132_Sub1_Sub3_Sub1(this.aClass585_5, arg0, this.aClass32_Sub14_1, arg4, arg7, arg8, arg9, arg10, arg11, this.aBoolean236, 0, 0, arg1, local418 + 4, arg5, arg6, arg14);
				local39 = local560;
				local525 = local586;
			}
			this.aClass585_5.method31492(arg7, arg12, arg13, local39, local525, (byte) -51);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aih", name = "ct", descriptor = "(Lclient!dh;IIIIB)V", line = 785)
	void method10981(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5) {
		@Pc(7) Interface61 local7 = this.method10987(arg1, arg2, arg3, arg4, 894408153);
		if (local7 == null) {
			return;
		}
		@Pc(19) Class610 local19 = (Class610) this.aClass32_Sub14_1.method18261(local7.method13423(-1037211373), -961474130);
		@Pc(23) int local23 = local7.method13420(1381183806);
		@Pc(27) int local27 = local7.method13404(1586088497);
		if (local19.method32001(819545494)) {
			Class462.method29276(arg1, arg3, arg4, local19, (byte) 22);
		}
		if (local7.method13406(-559427376)) {
			local7.method13409(arg0, (byte) 111);
		}
		if (arg2 == 0) {
			this.aClass585_5.method31500(arg1, arg3, arg4, (byte) 1);
			this.aClass585_5.method31510(arg1, arg3, arg4, (byte) 111);
			if (local19.anInt5594 * 1349946317 == 1) {
				if (local27 == 0) {
					this.aClass585_5.aClass598_2.method31789(1, arg1, arg3, arg4);
				} else if (local27 == 1) {
					this.aClass585_5.aClass598_2.method31789(2, arg1, arg3, arg4 + 1);
				} else if (local27 == 2) {
					this.aClass585_5.aClass598_2.method31789(1, arg1, arg3 + 1, arg4);
				} else if (local27 == 3) {
					this.aClass585_5.aClass598_2.method31789(2, arg1, arg3, arg4);
				}
			}
		} else if (arg2 == 1) {
			this.aClass585_5.method31511(arg1, arg3, arg4, 2057399220);
			this.aClass585_5.method31514(arg1, arg3, arg4, 649756054);
		} else if (arg2 == 2) {
			this.aClass585_5.method31525(arg1, arg3, arg4, client.anInterface62_1, 1392748730);
			if (Class615.aClass615_6.anInt5628 * 948246811 == local23) {
				if ((local27 & 0x1) == 0) {
					this.aClass585_5.aClass598_2.method31789(8, arg1, arg3, arg4);
				} else {
					this.aClass585_5.aClass598_2.method31789(16, arg1, arg3, arg4);
				}
			}
		} else if (arg2 == 3) {
			this.aClass585_5.method31518(arg1, arg3, arg4, (byte) 82);
		}
	}

	@OriginalMember(owner = "client!aih", name = "dq", descriptor = "(Lclient!dh;IIII)V", line = 785)
	void method10982(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) Interface61 local7 = this.method10987(arg1, arg2, arg3, arg4, 1470544567);
		if (local7 == null) {
			return;
		}
		@Pc(19) Class610 local19 = (Class610) this.aClass32_Sub14_1.method18261(local7.method13423(-1037211373), 632295491);
		@Pc(23) int local23 = local7.method13420(1729391823);
		@Pc(27) int local27 = local7.method13404(2030479628);
		if (local19.method32001(762906085)) {
			Class462.method29276(arg1, arg3, arg4, local19, (byte) 33);
		}
		if (local7.method13406(-1791791222)) {
			local7.method13409(arg0, (byte) 36);
		}
		if (arg2 == 0) {
			this.aClass585_5.method31500(arg1, arg3, arg4, (byte) 1);
			this.aClass585_5.method31510(arg1, arg3, arg4, (byte) 114);
			if (local19.anInt5594 * 1349946317 == 1) {
				if (local27 == 0) {
					this.aClass585_5.aClass598_2.method31789(1, arg1, arg3, arg4);
				} else if (local27 == 1) {
					this.aClass585_5.aClass598_2.method31789(2, arg1, arg3, arg4 + 1);
				} else if (local27 == 2) {
					this.aClass585_5.aClass598_2.method31789(1, arg1, arg3 + 1, arg4);
				} else if (local27 == 3) {
					this.aClass585_5.aClass598_2.method31789(2, arg1, arg3, arg4);
				}
			}
		} else if (arg2 == 1) {
			this.aClass585_5.method31511(arg1, arg3, arg4, 2057399220);
			this.aClass585_5.method31514(arg1, arg3, arg4, 649756054);
		} else if (arg2 == 2) {
			this.aClass585_5.method31525(arg1, arg3, arg4, client.anInterface62_1, 18005483);
			if (Class615.aClass615_6.anInt5628 * 948246811 == local23) {
				if ((local27 & 0x1) == 0) {
					this.aClass585_5.aClass598_2.method31789(8, arg1, arg3, arg4);
				} else {
					this.aClass585_5.aClass598_2.method31789(16, arg1, arg3, arg4);
				}
			}
		} else if (arg2 == 3) {
			this.aClass585_5.method31518(arg1, arg3, arg4, (byte) 11);
		}
	}

	@OriginalMember(owner = "client!aih", name = "dn", descriptor = "(IIII)Lclient!st;", line = 820)
	Interface61 method10983(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) Interface61 local1 = null;
		if (arg1 == 0) {
			local1 = (Interface61) this.aClass585_5.method31534(arg0, arg2, arg3, -1309876799);
		}
		if (arg1 == 1) {
			local1 = (Interface61) this.aClass585_5.method31544(arg0, arg2, arg3, -2037283232);
		}
		if (arg1 == 2) {
			local1 = (Interface61) this.aClass585_5.method31551(arg0, arg2, arg3, client.anInterface62_1, (byte) 3);
		}
		if (arg1 == 3) {
			local1 = (Interface61) this.aClass585_5.method31556(arg0, arg2, arg3, -968156135);
		}
		return local1;
	}

	@OriginalMember(owner = "client!aih", name = "dc", descriptor = "(IIII)Lclient!st;", line = 820)
	Interface61 method10984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) Interface61 local1 = null;
		if (arg1 == 0) {
			local1 = (Interface61) this.aClass585_5.method31534(arg0, arg2, arg3, -1309876799);
		}
		if (arg1 == 1) {
			local1 = (Interface61) this.aClass585_5.method31544(arg0, arg2, arg3, -2048261820);
		}
		if (arg1 == 2) {
			local1 = (Interface61) this.aClass585_5.method31551(arg0, arg2, arg3, client.anInterface62_1, (byte) 3);
		}
		if (arg1 == 3) {
			local1 = (Interface61) this.aClass585_5.method31556(arg0, arg2, arg3, -968156135);
		}
		return local1;
	}

	@OriginalMember(owner = "client!aih", name = "di", descriptor = "(IIII)Lclient!st;", line = 820)
	Interface61 method10985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) Interface61 local1 = null;
		if (arg1 == 0) {
			local1 = (Interface61) this.aClass585_5.method31534(arg0, arg2, arg3, -1309876799);
		}
		if (arg1 == 1) {
			local1 = (Interface61) this.aClass585_5.method31544(arg0, arg2, arg3, -2048992569);
		}
		if (arg1 == 2) {
			local1 = (Interface61) this.aClass585_5.method31551(arg0, arg2, arg3, client.anInterface62_1, (byte) 3);
		}
		if (arg1 == 3) {
			local1 = (Interface61) this.aClass585_5.method31556(arg0, arg2, arg3, -968156135);
		}
		return local1;
	}

	@OriginalMember(owner = "client!aih", name = "dk", descriptor = "(IIII)Lclient!st;", line = 820)
	Interface61 method10986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) Interface61 local1 = null;
		if (arg1 == 0) {
			local1 = (Interface61) this.aClass585_5.method31534(arg0, arg2, arg3, -1309876799);
		}
		if (arg1 == 1) {
			local1 = (Interface61) this.aClass585_5.method31544(arg0, arg2, arg3, -2058043489);
		}
		if (arg1 == 2) {
			local1 = (Interface61) this.aClass585_5.method31551(arg0, arg2, arg3, client.anInterface62_1, (byte) 3);
		}
		if (arg1 == 3) {
			local1 = (Interface61) this.aClass585_5.method31556(arg0, arg2, arg3, -968156135);
		}
		return local1;
	}

	@OriginalMember(owner = "client!aih", name = "cf", descriptor = "(IIIII)Lclient!st;", line = 820)
	Interface61 method10987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(1) Interface61 local1 = null;
		if (arg1 == 0) {
			local1 = (Interface61) this.aClass585_5.method31534(arg0, arg2, arg3, -1309876799);
		}
		if (arg1 == 1) {
			local1 = (Interface61) this.aClass585_5.method31544(arg0, arg2, arg3, -2042186071);
		}
		if (arg1 == 2) {
			local1 = (Interface61) this.aClass585_5.method31551(arg0, arg2, arg3, client.anInterface62_1, (byte) 3);
		}
		if (arg1 == 3) {
			local1 = (Interface61) this.aClass585_5.method31556(arg0, arg2, arg3, -968156135);
		}
		return local1;
	}

	@OriginalMember(owner = "client!aih", name = "df", descriptor = "(Lclient!dh;Z)V", line = 829)
	public final void method10988(@OriginalArg(0) Class104 arg0, @OriginalArg(1) boolean arg1) {
		this.aClass585_5.method31561();
		if (!arg1) {
			@Pc(12) int local12;
			@Pc(20) int local20;
			if (this.anInt1292 * 604655629 > 1) {
				for (local12 = 0; local12 < this.anInt1279 * -115974587; local12++) {
					for (local20 = 0; local20 < this.anInt1280 * -586018753; local20++) {
						if ((this.aClass520_2.aByteArrayArrayArray12[1][local12][local20] & 0x2) == 2) {
							this.aClass585_5.method31443(local12, local20, -2079279570);
						}
					}
				}
			}
			for (local12 = 0; local12 < this.anInt1292 * 604655629; local12++) {
				for (local20 = 0; local20 <= this.anInt1280 * -586018753; local20++) {
					for (@Pc(67) int local67 = 0; local67 <= this.anInt1279 * -115974587; local67++) {
						if ((this.aByteArrayArrayArray6[local12][local67][local20] & 0x4) != 0) {
							@Pc(87) int local87 = local67;
							@Pc(89) int local89 = local67;
							@Pc(91) int local91 = local20;
							@Pc(93) int local93 = local20;
							while (local91 > 0 && (this.aByteArrayArrayArray6[local12][local67][local91 - 1] & 0x4) != 0 && local93 - local91 < 10) {
								local91--;
							}
							while (local93 < this.anInt1280 * -586018753 && (this.aByteArrayArrayArray6[local12][local67][local93 + 1] & 0x4) != 0 && local93 - local91 < 10) {
								local93++;
							}
							@Pc(152) int local152;
							label108: while (local87 > 0 && local89 - local87 < 10) {
								for (local152 = local91; local152 <= local93; local152++) {
									if ((this.aByteArrayArrayArray6[local12][local87 - 1][local152] & 0x4) == 0) {
										break label108;
									}
								}
								local87--;
							}
							label95: while (local89 < this.anInt1279 * -115974587 && local89 - local87 < 10) {
								for (local152 = local91; local152 <= local93; local152++) {
									if ((this.aByteArrayArrayArray6[local12][local89 + 1][local152] & 0x4) == 0) {
										break label95;
									}
								}
								local89++;
							}
							if ((local89 - local87 + 1) * ((local93 - local91) + 1) >= 4) {
								local152 = this.anIntArrayArrayArray14[local12][local87][local91];
								this.aClass585_5.aClass598_2.method31796(4, local12, local87 << 9, (local89 << 9) + 512, local91 << 9, (local93 << 9) + 512, local152, local152);
								for (@Pc(255) int local255 = local87; local255 <= local89; local255++) {
									for (@Pc(260) int local260 = local91; local260 <= local93; local260++) {
										this.aByteArrayArrayArray6[local12][local255][local260] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			this.aClass585_5.aClass598_2.method31791();
		}
		this.aByteArrayArrayArray6 = null;
	}

	@OriginalMember(owner = "client!aih", name = "co", descriptor = "(Lclient!dh;ZB)V", line = 829)
	public final void method10989(@OriginalArg(0) Class104 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte arg2) {
		this.aClass585_5.method31561();
		if (!arg1) {
			@Pc(12) int local12;
			@Pc(20) int local20;
			if (this.anInt1292 * 604655629 > 1) {
				for (local12 = 0; local12 < this.anInt1279 * -115974587; local12++) {
					for (local20 = 0; local20 < this.anInt1280 * -586018753; local20++) {
						if ((this.aClass520_2.aByteArrayArrayArray12[1][local12][local20] & 0x2) == 2) {
							this.aClass585_5.method31443(local12, local20, 794758852);
						}
					}
				}
			}
			for (local12 = 0; local12 < this.anInt1292 * 604655629; local12++) {
				for (local20 = 0; local20 <= this.anInt1280 * -586018753; local20++) {
					for (@Pc(67) int local67 = 0; local67 <= this.anInt1279 * -115974587; local67++) {
						if ((this.aByteArrayArrayArray6[local12][local67][local20] & 0x4) != 0) {
							@Pc(87) int local87 = local67;
							@Pc(89) int local89 = local67;
							@Pc(91) int local91 = local20;
							@Pc(93) int local93 = local20;
							while (local91 > 0 && (this.aByteArrayArrayArray6[local12][local67][local91 - 1] & 0x4) != 0 && local93 - local91 < 10) {
								local91--;
							}
							while (local93 < this.anInt1280 * -586018753 && (this.aByteArrayArrayArray6[local12][local67][local93 + 1] & 0x4) != 0 && local93 - local91 < 10) {
								local93++;
							}
							@Pc(152) int local152;
							label108: while (local87 > 0 && local89 - local87 < 10) {
								for (local152 = local91; local152 <= local93; local152++) {
									if ((this.aByteArrayArrayArray6[local12][local87 - 1][local152] & 0x4) == 0) {
										break label108;
									}
								}
								local87--;
							}
							label95: while (local89 < this.anInt1279 * -115974587 && local89 - local87 < 10) {
								for (local152 = local91; local152 <= local93; local152++) {
									if ((this.aByteArrayArrayArray6[local12][local89 + 1][local152] & 0x4) == 0) {
										break label95;
									}
								}
								local89++;
							}
							if ((local89 - local87 + 1) * ((local93 - local91) + 1) >= 4) {
								local152 = this.anIntArrayArrayArray14[local12][local87][local91];
								this.aClass585_5.aClass598_2.method31796(4, local12, local87 << 9, (local89 << 9) + 512, local91 << 9, (local93 << 9) + 512, local152, local152);
								for (@Pc(255) int local255 = local87; local255 <= local89; local255++) {
									for (@Pc(260) int local260 = local91; local260 <= local93; local260++) {
										this.aByteArrayArrayArray6[local12][local255][local260] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			this.aClass585_5.aClass598_2.method31791();
		}
		this.aByteArrayArrayArray6 = null;
	}

	@OriginalMember(owner = "client!aih", name = "dw", descriptor = "(Lclient!dh;Z)V", line = 829)
	public final void method10990(@OriginalArg(0) Class104 arg0, @OriginalArg(1) boolean arg1) {
		this.aClass585_5.method31561();
		if (!arg1) {
			@Pc(12) int local12;
			@Pc(20) int local20;
			if (this.anInt1292 * 604655629 > 1) {
				for (local12 = 0; local12 < this.anInt1279 * -115974587; local12++) {
					for (local20 = 0; local20 < this.anInt1280 * -586018753; local20++) {
						if ((this.aClass520_2.aByteArrayArrayArray12[1][local12][local20] & 0x2) == 2) {
							this.aClass585_5.method31443(local12, local20, 1092536433);
						}
					}
				}
			}
			for (local12 = 0; local12 < this.anInt1292 * 604655629; local12++) {
				for (local20 = 0; local20 <= this.anInt1280 * -586018753; local20++) {
					for (@Pc(67) int local67 = 0; local67 <= this.anInt1279 * -115974587; local67++) {
						if ((this.aByteArrayArrayArray6[local12][local67][local20] & 0x4) != 0) {
							@Pc(87) int local87 = local67;
							@Pc(89) int local89 = local67;
							@Pc(91) int local91 = local20;
							@Pc(93) int local93 = local20;
							while (local91 > 0 && (this.aByteArrayArrayArray6[local12][local67][local91 - 1] & 0x4) != 0 && local93 - local91 < 10) {
								local91--;
							}
							while (local93 < this.anInt1280 * -586018753 && (this.aByteArrayArrayArray6[local12][local67][local93 + 1] & 0x4) != 0 && local93 - local91 < 10) {
								local93++;
							}
							@Pc(152) int local152;
							label108: while (local87 > 0 && local89 - local87 < 10) {
								for (local152 = local91; local152 <= local93; local152++) {
									if ((this.aByteArrayArrayArray6[local12][local87 - 1][local152] & 0x4) == 0) {
										break label108;
									}
								}
								local87--;
							}
							label95: while (local89 < this.anInt1279 * -115974587 && local89 - local87 < 10) {
								for (local152 = local91; local152 <= local93; local152++) {
									if ((this.aByteArrayArrayArray6[local12][local89 + 1][local152] & 0x4) == 0) {
										break label95;
									}
								}
								local89++;
							}
							if ((local89 - local87 + 1) * ((local93 - local91) + 1) >= 4) {
								local152 = this.anIntArrayArrayArray14[local12][local87][local91];
								this.aClass585_5.aClass598_2.method31796(4, local12, local87 << 9, (local89 << 9) + 512, local91 << 9, (local93 << 9) + 512, local152, local152);
								for (@Pc(255) int local255 = local87; local255 <= local89; local255++) {
									for (@Pc(260) int local260 = local91; local260 <= local93; local260++) {
										this.aByteArrayArrayArray6[local12][local255][local260] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			this.aClass585_5.aClass598_2.method31791();
		}
		this.aByteArrayArrayArray6 = null;
	}

	@OriginalMember(owner = "client!aih", name = "ayi", descriptor = "(Lclient!yf;I)V", line = 14093)
	static final void method10991(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) boolean local1 = false;
		if (client.aBoolean632) {
			try {
				@Pc(43) Object local43 = Class447.aClass447_3.method28904(new Object[] { Class626.anInt5704 * 2085461781, Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte75 == 1, arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091] }, 466662730);
				if (local43 != null) {
					local1 = (Boolean) local43;
				}
			} catch (@Pc(52) Throwable local52) {
			}
		}
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local1 ? 1 : 0;
	}
}
