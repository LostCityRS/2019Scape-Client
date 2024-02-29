package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!amc")
public class Class166_Sub3 extends Class166 {

	@OriginalMember(owner = "client!amc", name = "l", descriptor = "I")
	public static final int anInt2087 = 0;

	@OriginalMember(owner = "client!amc", name = "w", descriptor = "I")
	public static final int anInt2088 = 1;

	@OriginalMember(owner = "client!amc", name = "<init>", descriptor = "(Lclient!ali;)V", line = 12)
	public Class166_Sub3(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amc", name = "<init>", descriptor = "(ILclient!ali;)V", line = 16)
	public Class166_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amc", name = "q", descriptor = "()V", line = 20)
	public void method15400() {
		if (this.aClass93_Sub36_49.method14371((byte) 25) != Class702.aClass702_6) {
			this.anInt2379 = -88839937;
		}
		if (this.anInt2379 * 960141055 != 0 && this.anInt2379 * 960141055 != 1) {
			this.anInt2379 = this.method16545((byte) -61) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amc", name = "o", descriptor = "(S)V", line = 20)
	public void method15401(@OriginalArg(0) short arg0) {
		if (this.aClass93_Sub36_49.method14371((byte) 11) != Class702.aClass702_6) {
			this.anInt2379 = -88839937;
		}
		if (this.anInt2379 * 960141055 != 0 && this.anInt2379 * 960141055 != 1) {
			this.anInt2379 = this.method16545((byte) -48) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amc", name = "e", descriptor = "(B)I", line = 25)
	@Override
	int method16545(@OriginalArg(0) byte arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amc", name = "f", descriptor = "()I", line = 25)
	@Override
	int method16544() {
		return 1;
	}

	@OriginalMember(owner = "client!amc", name = "l", descriptor = "()I", line = 25)
	@Override
	int method16549() {
		return 1;
	}

	@OriginalMember(owner = "client!amc", name = "u", descriptor = "()I", line = 25)
	@Override
	int method16550() {
		return 1;
	}

	@OriginalMember(owner = "client!amc", name = "w", descriptor = "()I", line = 25)
	@Override
	int method16552() {
		return 1;
	}

	@OriginalMember(owner = "client!amc", name = "s", descriptor = "(B)Z", line = 29)
	public boolean method15402(@OriginalArg(0) byte arg0) {
		return this.aClass93_Sub36_49.method14371((byte) 99) == Class702.aClass702_6;
	}

	@OriginalMember(owner = "client!amc", name = "x", descriptor = "()Z", line = 29)
	public boolean method15403() {
		return this.aClass93_Sub36_49.method14371((byte) 16) == Class702.aClass702_6;
	}

	@OriginalMember(owner = "client!amc", name = "b", descriptor = "()Z", line = 29)
	public boolean method15404() {
		return this.aClass93_Sub36_49.method14371((byte) 16) == Class702.aClass702_6;
	}

	@OriginalMember(owner = "client!amc", name = "n", descriptor = "(II)I", line = 34)
	@Override
	public int method16546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass93_Sub36_49.method14371((byte) 36) == Class702.aClass702_6 ? 1 : 3;
	}

	@OriginalMember(owner = "client!amc", name = "z", descriptor = "(I)I", line = 34)
	@Override
	public int method16551(@OriginalArg(0) int arg0) {
		return this.aClass93_Sub36_49.method14371((byte) 75) == Class702.aClass702_6 ? 1 : 3;
	}

	@OriginalMember(owner = "client!amc", name = "p", descriptor = "(I)I", line = 34)
	@Override
	public int method16543(@OriginalArg(0) int arg0) {
		return this.aClass93_Sub36_49.method14371((byte) 69) == Class702.aClass702_6 ? 1 : 3;
	}

	@OriginalMember(owner = "client!amc", name = "k", descriptor = "(II)V", line = 39)
	@Override
	void method16547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amc", name = "d", descriptor = "(I)V", line = 39)
	@Override
	void method16548(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amc", name = "c", descriptor = "(I)V", line = 39)
	@Override
	void method16553(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amc", name = "y", descriptor = "(I)I", line = 43)
	public int method15405(@OriginalArg(0) int arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amc", name = "h", descriptor = "()I", line = 43)
	public int method15406() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amc", name = "e", descriptor = "(I)[Lclient!nz;", line = 206)
	public static Class453[] method15407(@OriginalArg(0) int arg0) {
		return new Class453[] { Class453.aClass453_161, Class453.aClass453_6, Class453.aClass453_49, Class453.aClass453_8, Class453.aClass453_52, Class453.aClass453_144, Class453.aClass453_11, Class453.aClass453_12, Class453.aClass453_13, Class453.aClass453_46, Class453.aClass453_15, Class453.aClass453_75, Class453.aClass453_17, Class453.aClass453_18, Class453.aClass453_19, Class453.aClass453_190, Class453.aClass453_21, Class453.aClass453_22, Class453.aClass453_23, Class453.aClass453_24, Class453.aClass453_16, Class453.aClass453_26, Class453.aClass453_194, Class453.aClass453_28, Class453.aClass453_29, Class453.aClass453_30, Class453.aClass453_169, Class453.aClass453_195, Class453.aClass453_101, Class453.aClass453_34, Class453.aClass453_35, Class453.aClass453_36, Class453.aClass453_37, Class453.aClass453_155, Class453.aClass453_39, Class453.aClass453_40, Class453.aClass453_175, Class453.aClass453_42, Class453.aClass453_43, Class453.aClass453_44, Class453.aClass453_45, Class453.aClass453_117, Class453.aClass453_199, Class453.aClass453_76, Class453.aClass453_68, Class453.aClass453_50, Class453.aClass453_51, Class453.aClass453_58, Class453.aClass453_53, Class453.aClass453_54, Class453.aClass453_25, Class453.aClass453_32, Class453.aClass453_57, Class453.aClass453_125, Class453.aClass453_59, Class453.aClass453_60, Class453.aClass453_61, Class453.aClass453_62, Class453.aClass453_146, Class453.aClass453_64, Class453.aClass453_65, Class453.aClass453_66, Class453.aClass453_67, Class453.aClass453_150, Class453.aClass453_69, Class453.aClass453_70, Class453.aClass453_38, Class453.aClass453_72, Class453.aClass453_73, Class453.aClass453_178, Class453.aClass453_131, Class453.aClass453_77, Class453.aClass453_138, Class453.aClass453_55, Class453.aClass453_79, Class453.aClass453_80, Class453.aClass453_113, Class453.aClass453_5, Class453.aClass453_83, Class453.aClass453_84, Class453.aClass453_170, Class453.aClass453_86, Class453.aClass453_87, Class453.aClass453_182, Class453.aClass453_89, Class453.aClass453_90, Class453.aClass453_91, Class453.aClass453_92, Class453.aClass453_93, Class453.aClass453_94, Class453.aClass453_106, Class453.aClass453_198, Class453.aClass453_127, Class453.aClass453_98, Class453.aClass453_99, Class453.aClass453_100, Class453.aClass453_10, Class453.aClass453_102, Class453.aClass453_103, Class453.aClass453_104, Class453.aClass453_85, Class453.aClass453_33, Class453.aClass453_107, Class453.aClass453_108, Class453.aClass453_109, Class453.aClass453_110, Class453.aClass453_111, Class453.aClass453_112, Class453.aClass453_176, Class453.aClass453_114, Class453.aClass453_115, Class453.aClass453_116, Class453.aClass453_120, Class453.aClass453_118, Class453.aClass453_119, Class453.aClass453_81, Class453.aClass453_197, Class453.aClass453_159, Class453.aClass453_122, Class453.aClass453_123, Class453.aClass453_124, Class453.aClass453_136, Class453.aClass453_41, Class453.aClass453_63, Class453.aClass453_128, Class453.aClass453_129, Class453.aClass453_130, Class453.aClass453_7, Class453.aClass453_132, Class453.aClass453_133, Class453.aClass453_134, Class453.aClass453_135, Class453.aClass453_173, Class453.aClass453_137, Class453.aClass453_121, Class453.aClass453_71, Class453.aClass453_140, Class453.aClass453_141, Class453.aClass453_82, Class453.aClass453_143, Class453.aClass453_196, Class453.aClass453_145, Class453.aClass453_95, Class453.aClass453_147, Class453.aClass453_78, Class453.aClass453_149, Class453.aClass453_142, Class453.aClass453_151, Class453.aClass453_152, Class453.aClass453_153, Class453.aClass453_154, Class453.aClass453_97, Class453.aClass453_156, Class453.aClass453_157, Class453.aClass453_158, Class453.aClass453_27, Class453.aClass453_160, Class453.aClass453_126, Class453.aClass453_48, Class453.aClass453_163, Class453.aClass453_164, Class453.aClass453_165, Class453.aClass453_166, Class453.aClass453_167, Class453.aClass453_168, Class453.aClass453_56, Class453.aClass453_96, Class453.aClass453_171, Class453.aClass453_172, Class453.aClass453_148, Class453.aClass453_174, Class453.aClass453_9, Class453.aClass453_88, Class453.aClass453_177, Class453.aClass453_193, Class453.aClass453_179, Class453.aClass453_180, Class453.aClass453_181, Class453.aClass453_74, Class453.aClass453_183, Class453.aClass453_184, Class453.aClass453_185, Class453.aClass453_186, Class453.aClass453_187, Class453.aClass453_188, Class453.aClass453_189, Class453.aClass453_105, Class453.aClass453_191, Class453.aClass453_192, Class453.aClass453_31, Class453.aClass453_47, Class453.aClass453_139, Class453.aClass453_20, Class453.aClass453_14, Class453.aClass453_162 };
	}
}
