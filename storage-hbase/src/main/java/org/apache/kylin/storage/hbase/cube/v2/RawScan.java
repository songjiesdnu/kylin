/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.kylin.storage.hbase.cube.v2;

import java.util.List;

import org.apache.kylin.common.util.Pair;

public class RawScan {

    public byte[] startKey;
    public byte[] endKey;
    public List<Pair<byte[], byte[]>> hbaseColumns;
    public List<Pair<byte[], byte[]>> fuzzyKey;

    public RawScan(byte[] startKey, byte[] endKey, List<Pair<byte[], byte[]>> hbaseColumns, List<Pair<byte[], byte[]>> fuzzyKey) {

        this.startKey = startKey;
        this.endKey = endKey;
        this.hbaseColumns = hbaseColumns;
        this.fuzzyKey = fuzzyKey;
    }

}