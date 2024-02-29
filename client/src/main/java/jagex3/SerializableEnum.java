package jagex3;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public interface SerializableEnum {

	@OriginalMember(owner = "client!za", name = "n", descriptor = "()I")
	int getId();
}
