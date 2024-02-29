package jagex3;

import jagex3.twitchtv.TwitchTV;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!amm")
public final class Class166_Sub13 extends Class166 {

	@OriginalMember(owner = "client!amm", name = "w", descriptor = "I")
	static final int anInt2148 = 0;

	@OriginalMember(owner = "client!amm", name = "l", descriptor = "I")
	static final int anInt2149 = 3;

	@OriginalMember(owner = "client!amm", name = "x", descriptor = "Lclient!com/jagex/twitchtv/TwitchTV;")
	static TwitchTV aTwitchTV1;

	@OriginalMember(owner = "client!amm", name = "<init>", descriptor = "(Lclient!ali;)V")
	public Class166_Sub13(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amm", name = "<init>", descriptor = "(ILclient!ali;)V")
	public Class166_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amm", name = "u", descriptor = "()I")
	@Override
	int method16560() {
		return 0;
	}

	@OriginalMember(owner = "client!amm", name = "o", descriptor = "(I)V")
	public void method15645(@OriginalArg(0) int arg0) {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 3) {
			this.anInt2379 = this.method16554((byte) 13) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amm", name = "s", descriptor = "(I)I")
	public int method15646(@OriginalArg(0) int arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amm", name = "e", descriptor = "(B)I")
	@Override
	int method16554(@OriginalArg(0) byte arg0) {
		return 0;
	}

	@OriginalMember(owner = "client!amm", name = "n", descriptor = "(II)I")
	@Override
	int method16555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 3;
	}

	@OriginalMember(owner = "client!amm", name = "k", descriptor = "(II)V")
	@Override
	void method16557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amm", name = "l", descriptor = "()I")
	@Override
	int method16559() {
		return 0;
	}

	@OriginalMember(owner = "client!amm", name = "f", descriptor = "()I")
	@Override
	int method16553() {
		return 0;
	}

	@OriginalMember(owner = "client!amm", name = "w", descriptor = "()I")
	@Override
	int method16562() {
		return 0;
	}

	@OriginalMember(owner = "client!amm", name = "z", descriptor = "(I)I")
	@Override
	int method16561(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!amm", name = "p", descriptor = "(I)I")
	@Override
	int method16552(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!amm", name = "d", descriptor = "(I)V")
	@Override
	void method16558(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amm", name = "c", descriptor = "(I)V")
	@Override
	void method16563(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!amm", name = "y", descriptor = "()I")
	public int method15647() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amm", name = "q", descriptor = "()I")
	public int method15648() {
		return this.anInt2379 * 960141055;
	}
}
