package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.IOException;
import java.util.Iterator;

@OriginalClass("client!aif")
public final class Js5TcpNetQueue extends Js5NetQueue {

	@OriginalMember(owner = "client!aif", name = "y", descriptor = "Lclient!ug;")
	private BufferedSocket socket;

	@OriginalMember(owner = "client!aif", name = "c", descriptor = "(II)V")
	@Override
	void method10787(@OriginalArg(0) int archive, @OriginalArg(1) int group) {
		try {
			this.socket.close((short) 23005);
		} catch (@Pc(5) Exception ignored) {
		}
		this.socket = null;
		this.errorCount += 587474147;
		this.errorCode = -1948128749;
		this.encryptionKey = (byte) (Math.random() * 255.0D + 1.0D);
		this.errorArchive = archive * 644123047;
		this.errorGroup = group * 975887797;
	}

	@OriginalMember(owner = "client!aif", name = "ah", descriptor = "()V")
	@Override
	public void method10798() {
		if (this.socket != null) {
			this.socket.method15550((byte) 0);
		}
	}

	@OriginalMember(owner = "client!aif", name = "i", descriptor = "(I)Z")
	@Override
	public boolean cycle(@OriginalArg(0) int arg0) {
		if (this.socket != null) {
			@Pc(5) long now = Class303.currentTimeMillis((byte) 17);
			int duration = (int) (now - this.previousLoop * -3685984507407349449L);
			this.previousLoop = now * -5583368868183688057L;

			if (duration > 200) {
				duration = 200;
			}

			this.latency += duration * 1502058051;

			if (this.latency * 471656043 > 30000) {
				try {
					this.socket.close((short) -23086);
				} catch (@Pc(43) Exception ignored) {
				}
				this.socket = null;
			}
		}

		if (this.socket == null) {
			return this.getUrgentRequestCount((byte) -61) == 0 && this.getPrefetchRequestCount(-218394721) == 0;
		}

		try {
			for (Js5NetRequest request = (Js5NetRequest) this.pendingUrgentRequests.head((byte) 22); request != null; request = (Js5NetRequest) this.pendingUrgentRequests.next((byte) -102)) {
				this.outBuffer.pos = 0;
				this.outBuffer.p1(1);
				this.outBuffer.p5(request.dualKey * 4203303297430504511L);
				this.socket.write(this.outBuffer.data, 0, this.outBuffer.data.length, 779552044);
				this.inFlightUrgentRequests.addTail(request, 1599142138);
			}

			for (Js5NetRequest request = (Js5NetRequest) this.pendingPrefetchRequests.head((byte) -37); request != null; request = (Js5NetRequest) this.pendingPrefetchRequests.next((byte) -102)) {
				this.outBuffer.pos = 0;
				this.outBuffer.p1(0);
				this.outBuffer.p5(request.dualKey * 4203303297430504511L);
				this.socket.write(this.outBuffer.data, 0, this.outBuffer.data.length, 779552044);
				this.inFlightPrefetchRequests.addTail(request, 1599142138);
			}

			for (@Pc(161) int count = 0; count < 100; count++) {
				@Pc(169) int available = this.socket.available(812298590);
				if (available < 0) {
					throw new IOException();
				}

				if (available == 0) {
					break;
				}

				this.latency = 0;
				if (this.inBuffer == null) {
					int remaining = 5 - this.chunkHeader.pos * -1380987821;

					if (remaining > available) {
						remaining = available;
					}

					this.socket.read(this.chunkHeader.data, this.chunkHeader.pos * -1380987821, remaining, -1368891515);
					if (this.encryptionKey != 0 && !ClientConfig.DISABLE_JS5_XOR) {
						for (int i = 0; i < remaining; i++) {
							this.chunkHeader.data[this.chunkHeader.pos * -1380987821 + i] ^= this.encryptionKey;
						}
					}

					this.chunkHeader.pos += remaining * 1034180571;
					if (this.chunkHeader.pos * -1380987821 >= 5) {
						this.chunkHeader.pos = 0;

						int archive = this.chunkHeader.g1();
						int info = this.chunkHeader.g4();

						@Pc(278) boolean prefetch = (info & Integer.MIN_VALUE) != 0;
						@Pc(282) int group = info & Integer.MAX_VALUE;
						@Pc(290) long dualKey = (long) group + ((long) archive << 32);
						ClientConfig.printVerbose("Receiving js5 data archive=" + archive + " group=" + group);

						@Pc(296) Iterator it;
						@Pc(303) Js5NetRequest request;
						if (prefetch) {
							it = this.inFlightPrefetchRequests.iterator();
							while (it.hasNext()) {
								request = (Js5NetRequest) it.next();
								if (dualKey == request.dualKey * 4203303297430504511L) {
									this.inBuffer = request;
									break;
								}
							}
						} else {
							it = this.inFlightUrgentRequests.iterator();
							while (it.hasNext()) {
								request = (Js5NetRequest) it.next();
								if (request.dualKey * 4203303297430504511L == dualKey) {
									this.inBuffer = request;
									break;
								}
							}
						}

						if (this.inBuffer == null) {
							throw new IOException();
						}

						this.blockPosition = 413758963;
						this.chunkHeader.pos = 0;
						this.groupHeader.pos = 0;
					}
				} else {
					@Pc(363) Packet inBuffer = this.inBuffer.packet;

					if (inBuffer == null) {
						int remaining = 5 - this.groupHeader.pos * -1380987821;

						if (remaining > available) {
							remaining = available;
						}

						this.socket.read(this.groupHeader.data, this.groupHeader.pos * -1380987821, remaining, -1360803754);
						if (this.encryptionKey != 0 && !ClientConfig.DISABLE_JS5_XOR) {
							for (int i = 0; i < remaining; i++) {
								this.groupHeader.data[i + this.groupHeader.pos * -1380987821] ^= this.encryptionKey;
							}
						}

						this.groupHeader.pos += remaining * 1034180571;
						if (this.groupHeader.pos * -1380987821 >= 5) {
							this.groupHeader.pos = 0;

							int compression = this.groupHeader.g1();
							int length = this.groupHeader.g4();
							ClientConfig.printVerbose("Reading js5 header data compression=" + compression + " length=" + length + " bytes");

							@Pc(453) byte extraLength = 5;
							if (compression != Class486.UNCOMPRESSED.getId()) {
								extraLength = 9;
							}

							inBuffer = this.inBuffer.packet = new Packet(length + extraLength + this.inBuffer.trailerLen);
							inBuffer.p1(compression);
							inBuffer.p4(length);
							this.blockPosition += 413758963;
						}
					} else {
						int length = inBuffer.data.length - this.inBuffer.trailerLen;
						int remaining = 102400 - this.blockPosition * -349251545;

						if (remaining > length - inBuffer.pos * -1380987821) {
							remaining = length - inBuffer.pos * -1380987821;
						}

						if (remaining > available) {
							remaining = available;
						}

						this.socket.read(inBuffer.data, inBuffer.pos * -1380987821, remaining, -1725252174);
						if (this.encryptionKey != 0 && !ClientConfig.DISABLE_JS5_XOR) {
							for (int i = 0; i < remaining; i++) {
								inBuffer.data[i + inBuffer.pos * -1380987821] ^= this.encryptionKey;
							}
						}

						ClientConfig.printVerbose("Reading js5 data block=" + remaining + " bytes");
						inBuffer.pos += remaining * 1034180571;
						this.blockPosition += remaining * 1800738711;

						if (length == inBuffer.pos * -1380987821) {
							this.inBuffer.unlinkSecondary(-2147483644);
							this.inBuffer.incomplete = false;
							this.inBuffer = null;
						} else if (this.blockPosition * -349251545 == 102400) {
							this.blockPosition = 0;
							this.inBuffer = null;
						}
					}
				}
			}

			return true;
		} catch (@Pc(614) IOException ex) {
			if (ClientConfig.DEBUG) {
				ex.printStackTrace();
			}

			try {
				this.socket.close((short) 10148);
			} catch (@Pc(620) Exception ignored) {
			}
			this.socket = null;
			this.errorCount += 587474147;
			this.errorCode = 398709798;
			return this.getUrgentRequestCount((byte) 45) == 0 && this.getPrefetchRequestCount(476757852) == 0;
		}
	}

	@OriginalMember(owner = "client!aif", name = "m", descriptor = "(Ljava/lang/Object;ZI)V")
	@Override
	public void start(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (this.socket != null) {
			try {
				this.socket.close((short) -13531);
			} catch (@Pc(9) Exception local9) {
			}
			this.socket = null;
		}
		this.socket = (BufferedSocket) arg0;
		this.writeConnected((byte) 48);
		this.writeLoggedIn(arg1, (byte) 86);
		this.chunkHeader.pos = 0;
		this.groupHeader.pos = 0;
		this.inBuffer = null;
		while (true) {
			@Pc(40) Js5NetRequest local40 = (Js5NetRequest) this.inFlightUrgentRequests.method67(-1822402502);
			if (local40 == null) {
				while (true) {
					local40 = (Js5NetRequest) this.inFlightPrefetchRequests.method67(1000903141);
					if (local40 == null) {
						if (this.encryptionKey != 0 && !ClientConfig.DISABLE_JS5_XOR) {
							try {
								this.outBuffer.pos = 0;
								this.outBuffer.p1(4);
								this.outBuffer.p1(this.encryptionKey);
								this.outBuffer.p4(0);
								this.socket.write(this.outBuffer.data, 0, this.outBuffer.data.length, 779552044);
							} catch (@Pc(108) IOException ex) {
								try {
									this.socket.close((short) 936);
								} catch (@Pc(114) Exception ignored) {
								}
								this.socket = null;
								this.errorCount += 587474147;
								this.errorCode = 398709798;
							}
						}
						this.latency = 0;
						this.previousLoop = Class303.currentTimeMillis((byte) 106) * -5583368868183688057L;
						return;
					}
					local40.packet = null;
					this.pendingPrefetchRequests.addTail(local40, 1599142138);
				}
			}
			local40.packet = null;
			this.pendingUrgentRequests.addTail(local40, 1599142138);
		}
	}

	@OriginalMember(owner = "client!aif", name = "ad", descriptor = "(B)V")
	void writeConnected(@OriginalArg(0) byte arg0) {
		if (this.socket == null) {
			return;
		}

		try {
			this.outBuffer.pos = 0;
			this.outBuffer.p1(6);
			this.outBuffer.p3(4);
			this.outBuffer.p2(0);
			this.socket.write(this.outBuffer.data, 0, this.outBuffer.data.length, 779552044);
		} catch (@Pc(37) IOException ex) {
			try {
				this.socket.close((short) 9599);
			} catch (@Pc(43) Exception ignored) {
			}
			this.socket = null;
			this.errorCount += 587474147;
			this.errorCode = 398709798;
		}
	}

	@OriginalMember(owner = "client!aif", name = "ai", descriptor = "(Ljava/lang/Object;Z)V")
	@Override
	public void method10782(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1) {
		if (this.socket != null) {
			try {
				this.socket.close((short) 23165);
			} catch (@Pc(9) Exception local9) {
			}
			this.socket = null;
		}
		this.socket = (BufferedSocket) arg0;
		this.writeConnected((byte) 22);
		this.writeLoggedIn(arg1, (byte) 94);
		this.chunkHeader.pos = 0;
		this.groupHeader.pos = 0;
		this.inBuffer = null;
		while (true) {
			@Pc(40) Js5NetRequest local40 = (Js5NetRequest) this.inFlightUrgentRequests.method67(307481594);
			if (local40 == null) {
				while (true) {
					local40 = (Js5NetRequest) this.inFlightPrefetchRequests.method67(-1864334751);
					if (local40 == null) {
						if (this.encryptionKey != 0) {
							try {
								this.outBuffer.pos = 0;
								this.outBuffer.p1(4);
								this.outBuffer.p1(this.encryptionKey);
								this.outBuffer.p4(0);
								this.socket.write(this.outBuffer.data, 0, this.outBuffer.data.length, 779552044);
							} catch (@Pc(108) IOException local108) {
								try {
									this.socket.close((short) -7079);
								} catch (@Pc(114) Exception local114) {
								}
								this.socket = null;
								this.errorCount += 587474147;
								this.errorCode = 398709798;
							}
						}
						this.latency = 0;
						this.previousLoop = Class303.currentTimeMillis((byte) 59) * -5583368868183688057L;
						return;
					}
					local40.packet = null;
					this.pendingPrefetchRequests.addTail(local40, 1599142138);
				}
			}
			local40.packet = null;
			this.pendingUrgentRequests.addTail(local40, 1599142138);
		}
	}

	@OriginalMember(owner = "client!aif", name = "j", descriptor = "(I)V")
	@Override
	public void method10772(@OriginalArg(0) int arg0) {
		if (this.socket == null) {
			return;
		}
		try {
			this.outBuffer.pos = 0;
			this.outBuffer.p1(7);
			this.outBuffer.p5(0L);
			this.socket.write(this.outBuffer.data, 0, this.outBuffer.data.length, 779552044);
		} catch (@Pc(30) IOException local30) {
			try {
				this.socket.close((short) 8016);
			} catch (@Pc(36) Exception local36) {
			}
			this.socket = null;
			this.errorCount += 587474147;
			this.errorCode = 398709798;
		}
	}

	@OriginalMember(owner = "client!aif", name = "a", descriptor = "(B)V")
	@Override
	public void close(@OriginalArg(0) byte arg0) {
		if (this.socket != null) {
			this.socket.close((short) -7663);
		}
	}

	@OriginalMember(owner = "client!aif", name = "n", descriptor = "(II)V")
	@Override
	void method10797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.socket.close((short) 14245);
		} catch (@Pc(5) Exception ignored) {
		}
		this.socket = null;
		this.errorCount += 587474147;
		this.errorCode = -1948128749;
		this.encryptionKey = (byte) (Math.random() * 255.0D + 1.0D);
		this.errorArchive = arg0 * 644123047;
		this.errorGroup = arg1 * 975887797;
	}

	@OriginalMember(owner = "client!aif", name = "am", descriptor = "()V")
	@Override
	public void method10800() {
		if (this.socket != null) {
			this.socket.close((short) -17150);
		}
	}

	@OriginalMember(owner = "client!aif", name = "b", descriptor = "()Z")
	@Override
	public boolean method10781() {
		@Pc(13) int local13;
		if (this.socket != null) {
			@Pc(5) long local5 = Class303.currentTimeMillis((byte) 63);
			local13 = (int) (local5 - this.previousLoop * -3685984507407349449L);
			this.previousLoop = local5 * -5583368868183688057L;
			if (local13 > 200) {
				local13 = 200;
			}
			this.latency += local13 * 1502058051;
			if (this.latency * 471656043 > 30000) {
				try {
					this.socket.close((short) -17779);
				} catch (@Pc(43) Exception local43) {
				}
				this.socket = null;
			}
		}
		if (this.socket == null) {
			return this.getUrgentRequestCount((byte) 9) == 0 && this.getPrefetchRequestCount(992708531) == 0;
		}
		try {
			@Pc(68) Js5NetRequest local68;
			for (local68 = (Js5NetRequest) this.pendingUrgentRequests.head((byte) 25); local68 != null; local68 = (Js5NetRequest) this.pendingUrgentRequests.next((byte) -102)) {
				this.outBuffer.pos = 0;
				this.outBuffer.p1(1);
				this.outBuffer.p5(local68.dualKey * 4203303297430504511L);
				this.socket.write(this.outBuffer.data, 0, this.outBuffer.data.length, 779552044);
				this.inFlightUrgentRequests.addTail(local68, 1599142138);
			}
			for (local68 = (Js5NetRequest) this.pendingPrefetchRequests.head((byte) 2); local68 != null; local68 = (Js5NetRequest) this.pendingPrefetchRequests.next((byte) -102)) {
				this.outBuffer.pos = 0;
				this.outBuffer.p1(0);
				this.outBuffer.p5(local68.dualKey * 4203303297430504511L);
				this.socket.write(this.outBuffer.data, 0, this.outBuffer.data.length, 779552044);
				this.inFlightPrefetchRequests.addTail(local68, 1599142138);
			}
			for (@Pc(161) int local161 = 0; local161 < 100; local161++) {
				@Pc(169) int local169 = this.socket.available(-1081987792);
				if (local169 < 0) {
					throw new IOException();
				}
				if (local169 == 0) {
					break;
				}
				this.latency = 0;
				@Pc(217) int local217;
				@Pc(270) int local270;
				if (this.inBuffer == null) {
					local13 = 5 - this.chunkHeader.pos * -1380987821;
					if (local13 > local169) {
						local13 = local169;
					}
					this.socket.read(this.chunkHeader.data, this.chunkHeader.pos * -1380987821, local13, -1632691929);
					if (this.encryptionKey != 0 && !ClientConfig.DISABLE_JS5_XOR) {
						for (local217 = 0; local217 < local13; local217++) {
							this.chunkHeader.data[this.chunkHeader.pos * -1380987821 + local217] ^= this.encryptionKey;
						}
					}
					this.chunkHeader.pos += local13 * 1034180571;
					if (this.chunkHeader.pos * -1380987821 >= 5) {
						this.chunkHeader.pos = 0;
						local217 = this.chunkHeader.g1();
						local270 = this.chunkHeader.g4();
						@Pc(278) boolean local278 = (local270 & Integer.MIN_VALUE) != 0;
						@Pc(282) int local282 = local270 & Integer.MAX_VALUE;
						@Pc(290) long local290 = (long) local282 + ((long) local217 << 32);
						@Pc(296) Iterator local296;
						@Pc(303) Js5NetRequest local303;
						if (local278) {
							local296 = this.inFlightPrefetchRequests.iterator();
							while (local296.hasNext()) {
								local303 = (Js5NetRequest) local296.next();
								if (local290 == local303.dualKey * 4203303297430504511L) {
									this.inBuffer = local303;
									break;
								}
							}
						} else {
							local296 = this.inFlightUrgentRequests.iterator();
							while (local296.hasNext()) {
								local303 = (Js5NetRequest) local296.next();
								if (local303.dualKey * 4203303297430504511L == local290) {
									this.inBuffer = local303;
									break;
								}
							}
						}
						if (this.inBuffer == null) {
							throw new IOException();
						}
						this.blockPosition = 413758963;
						this.chunkHeader.pos = 0;
						this.groupHeader.pos = 0;
					}
				} else {
					@Pc(363) Packet local363 = this.inBuffer.packet;
					@Pc(451) int local451;
					if (local363 == null) {
						local217 = 5 - this.groupHeader.pos * -1380987821;
						if (local217 > local169) {
							local217 = local169;
						}
						this.socket.read(this.groupHeader.data, this.groupHeader.pos * -1380987821, local217, -2042035351);
						if (this.encryptionKey != 0 && !ClientConfig.DISABLE_JS5_XOR) {
							for (local270 = 0; local270 < local217; local270++) {
								this.groupHeader.data[local270 + this.groupHeader.pos * -1380987821] ^= this.encryptionKey;
							}
						}
						this.groupHeader.pos += local217 * 1034180571;
						if (this.groupHeader.pos * -1380987821 >= 5) {
							this.groupHeader.pos = 0;
							local270 = this.groupHeader.g1();
							local451 = this.groupHeader.g4();
							@Pc(453) byte local453 = 5;
							if (local270 != Class486.UNCOMPRESSED.getId()) {
								local453 = 9;
							}
							local363 = this.inBuffer.packet = new Packet(local451 + local453 + this.inBuffer.trailerLen);
							local363.p1(local270);
							local363.p4(local451);
							this.blockPosition += 413758963;
						}
					} else {
						local217 = local363.data.length - this.inBuffer.trailerLen;
						local270 = 102400 - this.blockPosition * -349251545;
						if (local270 > local217 - local363.pos * -1380987821) {
							local270 = local217 - local363.pos * -1380987821;
						}
						if (local270 > local169) {
							local270 = local169;
						}
						this.socket.read(local363.data, local363.pos * -1380987821, local270, -1160775717);
						if (this.encryptionKey != 0 && !ClientConfig.DISABLE_JS5_XOR) {
							for (local451 = 0; local451 < local270; local451++) {
								local363.data[local451 + local363.pos * -1380987821] ^= this.encryptionKey;
							}
						}
						local363.pos += local270 * 1034180571;
						this.blockPosition += local270 * 1800738711;
						if (local217 == local363.pos * -1380987821) {
							this.inBuffer.unlinkSecondary(-2147483647);
							this.inBuffer.incomplete = false;
							this.inBuffer = null;
						} else if (this.blockPosition * -349251545 == 102400) {
							this.blockPosition = 0;
							this.inBuffer = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(614) IOException local614) {
			try {
				this.socket.close((short) 14292);
			} catch (@Pc(620) Exception local620) {
			}
			this.socket = null;
			this.errorCount += 587474147;
			this.errorCode = 398709798;
			return this.getUrgentRequestCount((byte) -10) == 0 && this.getPrefetchRequestCount(728574263) == 0;
		}
	}

	@OriginalMember(owner = "client!aif", name = "ax", descriptor = "()Z")
	@Override
	public boolean method10770() {
		@Pc(13) int local13;
		if (this.socket != null) {
			@Pc(5) long local5 = Class303.currentTimeMillis((byte) 26);
			local13 = (int) (local5 - this.previousLoop * -3685984507407349449L);
			this.previousLoop = local5 * -5583368868183688057L;
			if (local13 > 200) {
				local13 = 200;
			}
			this.latency += local13 * 1502058051;
			if (this.latency * 471656043 > 30000) {
				try {
					this.socket.close((short) -17405);
				} catch (@Pc(43) Exception local43) {
				}
				this.socket = null;
			}
		}
		if (this.socket == null) {
			return this.getUrgentRequestCount((byte) 45) == 0 && this.getPrefetchRequestCount(871361488) == 0;
		}
		try {
			@Pc(68) Js5NetRequest local68;
			for (local68 = (Js5NetRequest) this.pendingUrgentRequests.head((byte) -23); local68 != null; local68 = (Js5NetRequest) this.pendingUrgentRequests.next((byte) -102)) {
				this.outBuffer.pos = 0;
				this.outBuffer.p1(1);
				this.outBuffer.p5(local68.dualKey * 4203303297430504511L);
				this.socket.write(this.outBuffer.data, 0, this.outBuffer.data.length, 779552044);
				this.inFlightUrgentRequests.addTail(local68, 1599142138);
			}
			for (local68 = (Js5NetRequest) this.pendingPrefetchRequests.head((byte) 102); local68 != null; local68 = (Js5NetRequest) this.pendingPrefetchRequests.next((byte) -102)) {
				this.outBuffer.pos = 0;
				this.outBuffer.p1(0);
				this.outBuffer.p5(local68.dualKey * 4203303297430504511L);
				this.socket.write(this.outBuffer.data, 0, this.outBuffer.data.length, 779552044);
				this.inFlightPrefetchRequests.addTail(local68, 1599142138);
			}
			for (@Pc(161) int local161 = 0; local161 < 100; local161++) {
				@Pc(169) int local169 = this.socket.available(86138249);
				if (local169 < 0) {
					throw new IOException();
				}
				if (local169 == 0) {
					break;
				}
				this.latency = 0;
				@Pc(217) int local217;
				@Pc(270) int local270;
				if (this.inBuffer == null) {
					local13 = 5 - this.chunkHeader.pos * -1380987821;
					if (local13 > local169) {
						local13 = local169;
					}
					this.socket.read(this.chunkHeader.data, this.chunkHeader.pos * -1380987821, local13, -1623409993);
					if (this.encryptionKey != 0 && !ClientConfig.DISABLE_JS5_XOR) {
						for (local217 = 0; local217 < local13; local217++) {
							this.chunkHeader.data[this.chunkHeader.pos * -1380987821 + local217] ^= this.encryptionKey;
						}
					}
					this.chunkHeader.pos += local13 * 1034180571;
					if (this.chunkHeader.pos * -1380987821 >= 5) {
						this.chunkHeader.pos = 0;
						local217 = this.chunkHeader.g1();
						local270 = this.chunkHeader.g4();
						@Pc(278) boolean local278 = (local270 & Integer.MIN_VALUE) != 0;
						@Pc(282) int local282 = local270 & Integer.MAX_VALUE;
						@Pc(290) long local290 = (long) local282 + ((long) local217 << 32);
						@Pc(296) Iterator local296;
						@Pc(303) Js5NetRequest local303;
						if (local278) {
							local296 = this.inFlightPrefetchRequests.iterator();
							while (local296.hasNext()) {
								local303 = (Js5NetRequest) local296.next();
								if (local290 == local303.dualKey * 4203303297430504511L) {
									this.inBuffer = local303;
									break;
								}
							}
						} else {
							local296 = this.inFlightUrgentRequests.iterator();
							while (local296.hasNext()) {
								local303 = (Js5NetRequest) local296.next();
								if (local303.dualKey * 4203303297430504511L == local290) {
									this.inBuffer = local303;
									break;
								}
							}
						}
						if (this.inBuffer == null) {
							throw new IOException();
						}
						this.blockPosition = 413758963;
						this.chunkHeader.pos = 0;
						this.groupHeader.pos = 0;
					}
				} else {
					@Pc(363) Packet local363 = this.inBuffer.packet;
					@Pc(451) int local451;
					if (local363 == null) {
						local217 = 5 - this.groupHeader.pos * -1380987821;
						if (local217 > local169) {
							local217 = local169;
						}
						this.socket.read(this.groupHeader.data, this.groupHeader.pos * -1380987821, local217, -1334677373);
						if (this.encryptionKey != 0 && !ClientConfig.DISABLE_JS5_XOR) {
							for (local270 = 0; local270 < local217; local270++) {
								this.groupHeader.data[local270 + this.groupHeader.pos * -1380987821] ^= this.encryptionKey;
							}
						}
						this.groupHeader.pos += local217 * 1034180571;
						if (this.groupHeader.pos * -1380987821 >= 5) {
							this.groupHeader.pos = 0;
							local270 = this.groupHeader.g1();
							local451 = this.groupHeader.g4();
							@Pc(453) byte local453 = 5;
							if (local270 != Class486.UNCOMPRESSED.getId()) {
								local453 = 9;
							}
							local363 = this.inBuffer.packet = new Packet(local451 + local453 + this.inBuffer.trailerLen);
							local363.p1(local270);
							local363.p4(local451);
							this.blockPosition += 413758963;
						}
					} else {
						local217 = local363.data.length - this.inBuffer.trailerLen;
						local270 = 102400 - this.blockPosition * -349251545;
						if (local270 > local217 - local363.pos * -1380987821) {
							local270 = local217 - local363.pos * -1380987821;
						}
						if (local270 > local169) {
							local270 = local169;
						}
						this.socket.read(local363.data, local363.pos * -1380987821, local270, -1855036990);
						if (this.encryptionKey != 0 && !ClientConfig.DISABLE_JS5_XOR) {
							for (local451 = 0; local451 < local270; local451++) {
								local363.data[local451 + local363.pos * -1380987821] ^= this.encryptionKey;
							}
						}
						local363.pos += local270 * 1034180571;
						this.blockPosition += local270 * 1800738711;
						if (local217 == local363.pos * -1380987821) {
							this.inBuffer.unlinkSecondary(-2147483642);
							this.inBuffer.incomplete = false;
							this.inBuffer = null;
						} else if (this.blockPosition * -349251545 == 102400) {
							this.blockPosition = 0;
							this.inBuffer = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(614) IOException local614) {
			try {
				this.socket.close((short) 949);
			} catch (@Pc(620) Exception local620) {
			}
			this.socket = null;
			this.errorCount += 587474147;
			this.errorCode = 398709798;
			return this.getUrgentRequestCount((byte) 55) == 0 && this.getPrefetchRequestCount(2042147860) == 0;
		}
	}

	@OriginalMember(owner = "client!aif", name = "ay", descriptor = "(Ljava/lang/Object;Z)V")
	@Override
	public void method10790(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1) {
		if (this.socket != null) {
			try {
				this.socket.close((short) 15043);
			} catch (@Pc(9) Exception local9) {
			}
			this.socket = null;
		}
		this.socket = (BufferedSocket) arg0;
		this.writeConnected((byte) 87);
		this.writeLoggedIn(arg1, (byte) 82);
		this.chunkHeader.pos = 0;
		this.groupHeader.pos = 0;
		this.inBuffer = null;
		while (true) {
			@Pc(40) Js5NetRequest local40 = (Js5NetRequest) this.inFlightUrgentRequests.method67(1824977122);
			if (local40 == null) {
				while (true) {
					local40 = (Js5NetRequest) this.inFlightPrefetchRequests.method67(-388870622);
					if (local40 == null) {
						if (this.encryptionKey != 0 && !ClientConfig.DISABLE_JS5_XOR) {
							try {
								this.outBuffer.pos = 0;
								this.outBuffer.p1(4);
								this.outBuffer.p1(this.encryptionKey);
								this.outBuffer.p4(0);
								this.socket.write(this.outBuffer.data, 0, this.outBuffer.data.length, 779552044);
							} catch (@Pc(108) IOException local108) {
								try {
									this.socket.close((short) -11194);
								} catch (@Pc(114) Exception local114) {
								}
								this.socket = null;
								this.errorCount += 587474147;
								this.errorCode = 398709798;
							}
						}
						this.latency = 0;
						this.previousLoop = Class303.currentTimeMillis((byte) 74) * -5583368868183688057L;
						return;
					}
					local40.packet = null;
					this.pendingPrefetchRequests.addTail(local40, 1599142138);
				}
			}
			local40.packet = null;
			this.pendingUrgentRequests.addTail(local40, 1599142138);
		}
	}

	@OriginalMember(owner = "client!aif", name = "af", descriptor = "()V")
	@Override
	public void method10789() {
		if (this.socket != null) {
			this.socket.method15550((byte) 0);
		}
	}

	@OriginalMember(owner = "client!aif", name = "aq", descriptor = "(Z)V")
	@Override
	public void method10792(@OriginalArg(0) boolean arg0) {
		if (this.socket == null) {
			return;
		}
		try {
			this.outBuffer.pos = 0;
			this.outBuffer.p1(arg0 ? 2 : 3);
			this.outBuffer.p5(0L);
			this.socket.write(this.outBuffer.data, 0, this.outBuffer.data.length, 779552044);
		} catch (@Pc(35) IOException local35) {
			try {
				this.socket.close((short) 16490);
			} catch (@Pc(41) Exception local41) {
			}
			this.socket = null;
			this.errorCount += 587474147;
			this.errorCode = 398709798;
		}
	}

	@OriginalMember(owner = "client!aif", name = "ao", descriptor = "(Z)V")
	@Override
	public void method10793(@OriginalArg(0) boolean arg0) {
		if (this.socket == null) {
			return;
		}
		try {
			this.outBuffer.pos = 0;
			this.outBuffer.p1(arg0 ? 2 : 3);
			this.outBuffer.p5(0L);
			this.socket.write(this.outBuffer.data, 0, this.outBuffer.data.length, 779552044);
		} catch (@Pc(35) IOException local35) {
			try {
				this.socket.close((short) 3784);
			} catch (@Pc(41) Exception local41) {
			}
			this.socket = null;
			this.errorCount += 587474147;
			this.errorCode = 398709798;
		}
	}

	@OriginalMember(owner = "client!aif", name = "aj", descriptor = "()V")
	@Override
	public void method10765() {
		if (this.socket == null) {
			return;
		}
		try {
			this.outBuffer.pos = 0;
			this.outBuffer.p1(7);
			this.outBuffer.p5(0L);
			this.socket.write(this.outBuffer.data, 0, this.outBuffer.data.length, 779552044);
		} catch (@Pc(30) IOException local30) {
			try {
				this.socket.close((short) 6196);
			} catch (@Pc(36) Exception local36) {
			}
			this.socket = null;
			this.errorCount += 587474147;
			this.errorCode = 398709798;
		}
	}

	@OriginalMember(owner = "client!aif", name = "o", descriptor = "(ZB)V")
	@Override
	public void writeLoggedIn(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1) {
		if (this.socket == null) {
			return;
		}

		try {
			this.outBuffer.pos = 0;
			this.outBuffer.p1(arg0 ? 2 : 3);
			this.outBuffer.p5(0L);
			this.socket.write(this.outBuffer.data, 0, this.outBuffer.data.length, 779552044);
		} catch (@Pc(35) IOException ex) {
			try {
				this.socket.close((short) 7535);
			} catch (@Pc(41) Exception ignored) {
			}
			this.socket = null;
			this.errorCount += 587474147;
			this.errorCode = 398709798;
		}
	}

	@OriginalMember(owner = "client!aif", name = "ag", descriptor = "()V")
	@Override
	public void method10778() {
		if (this.socket != null) {
			this.socket.method15550((byte) 0);
		}
	}

	@OriginalMember(owner = "client!aif", name = "ab", descriptor = "()V")
	@Override
	public void method10796() {
		if (this.socket != null) {
			this.socket.method15550((byte) 0);
		}
	}

	@OriginalMember(owner = "client!aif", name = "al", descriptor = "()V")
	@Override
	public void method10801() {
		if (this.socket != null) {
			this.socket.method15550((byte) 0);
		}
	}

	@OriginalMember(owner = "client!aif", name = "g", descriptor = "(III)V")
	@Override
	void rekey(@OriginalArg(0) int archive, @OriginalArg(1) int group, @OriginalArg(2) int arg2) {
		try {
			this.socket.close((short) -2186);
		} catch (@Pc(5) Exception ignored) {
		}

		this.socket = null;
		this.errorCount += 587474147;
		this.errorCode = -1948128749;
		this.encryptionKey = (byte) (Math.random() * 255.0D + 1.0D);
		this.errorArchive = archive * 644123047;
		this.errorGroup = group * 975887797;
	}

	@OriginalMember(owner = "client!aif", name = "ac", descriptor = "()V")
	@Override
	public void method10762() {
		if (this.socket != null) {
			this.socket.method15550((byte) 0);
		}
	}

	@OriginalMember(owner = "client!aif", name = "av", descriptor = "()V")
	void method10806() {
		if (this.socket == null) {
			return;
		}
		try {
			this.outBuffer.pos = 0;
			this.outBuffer.p1(6);
			this.outBuffer.p3(4);
			this.outBuffer.p2(0);
			this.socket.write(this.outBuffer.data, 0, this.outBuffer.data.length, 779552044);
		} catch (@Pc(37) IOException local37) {
			try {
				this.socket.close((short) 1056);
			} catch (@Pc(43) Exception local43) {
			}
			this.socket = null;
			this.errorCount += 587474147;
			this.errorCode = 398709798;
		}
	}

	@OriginalMember(owner = "client!aif", name = "s", descriptor = "(I)V")
	@Override
	public void method10774(@OriginalArg(0) int arg0) {
		if (this.socket != null) {
			this.socket.method15550((byte) 0);
		}
	}

	@OriginalMember(owner = "client!aif", name = "ak", descriptor = "()V")
	@Override
	public void method10776() {
		if (this.socket != null) {
			this.socket.close((short) 14993);
		}
	}

	@OriginalMember(owner = "client!aif", name = "at", descriptor = "()V")
	@Override
	public void method10802() {
		if (this.socket != null) {
			this.socket.close((short) -7658);
		}
	}
}
