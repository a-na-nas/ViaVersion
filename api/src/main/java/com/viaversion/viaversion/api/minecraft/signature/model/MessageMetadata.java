/*
 * This file is part of ViaVersion - https://github.com/ViaVersion/ViaVersion
 * Copyright (C) 2016-2025 ViaVersion and contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.viaversion.viaversion.api.minecraft.signature.model;

import java.time.Instant;
import java.util.UUID;

public class MessageMetadata {

    private final UUID sender;
    private final Instant timestamp;
    private final long salt;

    public MessageMetadata(final UUID sender, final Instant timestamp, final long salt) {
        this.sender = sender;
        this.timestamp = timestamp;
        this.salt = salt;
    }

    public MessageMetadata(final UUID sender, final long timestamp, final long salt) {
        this(sender, Instant.ofEpochMilli(timestamp), salt);
    }

    public UUID sender() {
        return this.sender;
    }

    public Instant timestamp() {
        return this.timestamp;
    }

    public long salt() {
        return this.salt;
    }

}
