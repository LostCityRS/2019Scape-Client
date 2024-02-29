package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public final class Class419 {

	@OriginalMember(owner = "client!mi", name = "n", descriptor = "I")
	int anInt4931;

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "Lclient!lr;")
	Interface37 anInterface37_24;

	// $FF: synthetic field
	@OriginalMember(owner = "client!mi", name = "this$0", descriptor = "Lclient!afc;")
	final Class104_Sub2 aClass104_Sub2_41;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Lclient!afc;I)V")
	Class419(@OriginalArg(0) Class104_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass104_Sub2_41 = arg0;
		this.method28888();
		this.method28892(arg1, this.anInt4931);
	}

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "()V")
	void method28888() {
		this.anInterface37_24 = this.aClass104_Sub2_41.method21025(true);
		this.aClass104_Sub2_41.method21005(new Class400[] { new Class400(new Class399[] { Class399.aClass399_9, Class399.aClass399_10 }) });
		this.aClass104_Sub2_41.method21005(new Class400[] { new Class400(new Class399[] { Class399.aClass399_9, Class399.aClass399_10 }) });
		this.aClass104_Sub2_41.method21005(new Class400[] { new Class400(new Class399[] { Class399.aClass399_9, Class399.aClass399_10 }) });
		this.anInt4931 = 16;
	}

	@OriginalMember(owner = "client!mi", name = "z", descriptor = "(II)V")
	void method28889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.anInterface37_24.method29496(arg0, arg1)) {
			System.out.println("PrimitiveVertexBuffer:ensureSize: failed vertexBuffer.allocate !");
		}
	}

	@OriginalMember(owner = "client!mi", name = "n", descriptor = "()V")
	void method28890() {
		this.anInterface37_24.method31065();
	}

	@OriginalMember(owner = "client!mi", name = "k", descriptor = "()V")
	void method28891() {
		this.anInterface37_24 = this.aClass104_Sub2_41.method21025(true);
		this.aClass104_Sub2_41.method21005(new Class400[] { new Class400(new Class399[] { Class399.aClass399_9, Class399.aClass399_10 }) });
		this.aClass104_Sub2_41.method21005(new Class400[] { new Class400(new Class399[] { Class399.aClass399_9, Class399.aClass399_10 }) });
		this.aClass104_Sub2_41.method21005(new Class400[] { new Class400(new Class399[] { Class399.aClass399_9, Class399.aClass399_10 }) });
		this.anInt4931 = 16;
	}

	@OriginalMember(owner = "client!mi", name = "m", descriptor = "(II)V")
	void method28892(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.anInterface37_24.method29496(arg0, arg1)) {
			System.out.println("PrimitiveVertexBuffer:ensureSize: failed vertexBuffer.allocate !");
		}
	}

	@OriginalMember(owner = "client!mi", name = "f", descriptor = "()V")
	void method28893() {
		this.anInterface37_24.method31065();
	}

	@OriginalMember(owner = "client!mi", name = "w", descriptor = "()V")
	void method28894() {
		this.anInterface37_24.method31065();
	}

	@OriginalMember(owner = "client!mi", name = "u", descriptor = "(II)V")
	void method28895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.anInterface37_24.method29496(arg0, arg1)) {
			System.out.println("PrimitiveVertexBuffer:ensureSize: failed vertexBuffer.allocate !");
		}
	}

	@OriginalMember(owner = "client!mi", name = "l", descriptor = "()V")
	void method28896() {
		this.anInterface37_24.method31065();
	}
}
