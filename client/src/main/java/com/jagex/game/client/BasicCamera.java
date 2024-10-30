package com.jagex.game.client;

import com.jagex.core.io.Packet;
import com.jagex.game.camera.CameraEffect;
import com.jagex.game.camera.LookatMode;
import com.jagex.game.world.entity.PositionMode;
import com.jagex.graphics.camera.Camera;
import com.jagex.graphics.camera.CameraControlMode;
import com.jagex.graphics.camera.CameraEffectType;
import com.jagex.graphics.camera.CameraException;
import com.jagex.graphics.camera.CameraLinearMovementMode;
import com.jagex.graphics.camera.CameraProjectionMode;
import com.jagex.graphics.camera.CameraRelated;
import com.jagex.graphics.camera.CameraSettingType;
import com.jagex.graphics.camera.CameraTrackableProvider;
import deob.ObfuscatedName;
import java.util.Iterator;

@ObfuscatedName("ahc")
public class BasicCamera extends Camera {

	@ObfuscatedName("ahc.au")
	public int field10465 = 0;

	public BasicCamera(CameraTrackableProvider arg0) {
		super(CameraRelated.field2813, arg0);
	}

	@ObfuscatedName("ahc.fs(B)I")
	public int method16602() {
		this.field10465++;
		if (this.field10465 == 126) {
			this.field10465 = 0;
		}
		return this.field10465;
	}

	@ObfuscatedName("ahc.fz(Lalw;II)V")
	public void decode(Packet arg0, int arg1) {
		int var3 = arg0.pos;
		int var4 = arg0.g1();
		this.setControlMode(CameraControlMode.of(var4 & 0x1));
		if ((var4 & 0x8) != 0) {
			LookatMode var5 = LookatMode.of(arg0.g1());
			if (this.lookatMode != var5) {
				try {
					this.setLookatMode(var5, true);
				} catch (CameraException var20) {
					var20.printStackTrace();
				}
			}
		}
		if ((var4 & 0x10) != 0) {
			PositionMode var7 = PositionMode.method1058(arg0.g1());
			if (this.positionMode != var7) {
				try {
					this.setPositionMode(var7, true);
				} catch (CameraException var19) {
					var19.printStackTrace();
				}
			}
		}
		if ((var4 >> 7 & 0x1) == 1) {
			int var9 = arg0.g2();
			if ((var9 >> CameraSettingType.field2810.field2803 & 0x1) == 1) {
				this.lookatMaxSpeed.decode(arg0);
			}
			if ((var9 >> CameraSettingType.field2797.field2803 & 0x1) == 1) {
				this.positionMaxSpeed.decode(arg0);
			}
			if ((var9 >> CameraSettingType.field2809.field2803 & 0x1) == 1) {
				this.lookatAcceleration.decode(arg0);
			}
			if ((var9 >> CameraSettingType.field2799.field2803 & 0x1) == 1) {
				this.positionAcceleration.decode(arg0);
			}
			if ((var9 >> CameraSettingType.field2798.field2803 & 0x1) == 1) {
				this.field2855 = arg0.gFloat();
				this.field2859 = arg0.gFloat();
			}
			if ((var9 >> CameraSettingType.field2801.field2803 & 0x1) == 1) {
				this.field2872 = arg0.gFloat();
				this.field2868 = arg0.gFloat();
			}
			if ((var9 >> CameraSettingType.field2802.field2803 & 0x1) == 1) {
				this.projectionMode = CameraProjectionMode.method16906(arg0.g1());
			}
			if ((var9 >> CameraSettingType.field2806.field2803 & 0x1) == 1) {
				this.field2851 = arg0.g3();
				arg0.g1();
			}
			if ((var9 >> CameraSettingType.field2804.field2803 & 0x1) == 1) {
				int var10 = arg0.g1();
				this.field2862 = (var10 & 0x1) == 1;
				this.field2875 = (var10 & 0x2) == 2;
			}
			if ((var9 >> CameraSettingType.field2805.field2803 & 0x1) == 1) {
				int var11 = arg0.g1();
				for (int var12 = 0; var12 < var11; var12++) {
					int var13 = arg0.g1();
					int var14 = arg0.g1();
					if (var13 == 0) {
						this.removeEffect(var14);
					} else {
						CameraEffectType var15 = CameraEffectType.of(arg0.g1());
						boolean var16 = true;
						Iterator var17 = this.effects.iterator();
						while (var17.hasNext()) {
							CameraEffect var18 = (CameraEffect) var17.next();
							if (var18.id == var14) {
								var18.decode(arg0);
								var16 = false;
								break;
							}
						}
						if (var16) {
							this.addEffect(CameraEffect.createCameraEffect(var14, var15, arg0));
						}
					}
				}
			}
			if ((var9 >> CameraSettingType.field2811.field2803 & 0x1) == 1) {
				this.field2876 = arg0.g2();
				this.field2877 = arg0.gFloat();
			}
			if ((var9 >> CameraSettingType.field2807.field2803 & 0x1) == 1) {
				this.linearMovementMode = CameraLinearMovementMode.method17805(arg0.g1());
			}
			if ((var9 >> CameraSettingType.field2808.field2803 & 0x1) == 1) {
				this.lookatSpring.decode(arg0);
				this.positionSpring.decode(arg0);
				this.field2866 = arg0.gFloat();
				this.field2843 = arg0.gFloat();
			}
			if ((var9 >> CameraSettingType.field2796.field2803 & 0x1) == 1) {
				arg0.gFloat();
			}
			if ((var9 >> CameraSettingType.field2800.field2803 & 0x1) == 1) {
				this.positionAngularInterpolation = arg0.gFloat();
			}
		}
		if (this.lookat != null && (var4 >> 5 & 0x1) == 1) {
			this.lookat.decode(arg0);
		}
		if (this.position != null && (var4 >> 6 & 0x1) == 1) {
			this.position.method5224(arg0);
		}
		if (arg0.pos - var3 != arg1) {
			throw new RuntimeException(arg0.pos - var3 + "," + arg1);
		}
	}
}
