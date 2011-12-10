/*
 *  Copyright (C) 2009 WaveMaker Software, Inc.
 *
 *  This file is part of the WaveMaker Server Runtime.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.wavemaker.runtime.data.sample.sakila;

// Generated Jun 26, 2007 4:52:50 PM by Hibernate Tools 3.2.0.b9

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Store generated by hbm2java
 */
@SuppressWarnings({ "serial", "unchecked" })
public class TestStore implements java.io.Serializable {

    private Byte storeId;

    private TestAddress address;

    private Date lastUpdate;

    private Set customers = new HashSet(0);

    public TestStore() {
    }

    public TestStore(TestAddress address, Date lastUpdate) {
        this.address = address;
        this.lastUpdate = lastUpdate;
    }

    public Byte getStoreId() {
        return this.storeId;
    }

    public void setStoreId(Byte storeId) {
        this.storeId = storeId;
    }

    public TestAddress getAddress() {
        return this.address;
    }

    public void setAddress(TestAddress address) {
        this.address = address;
    }

    public Date getLastUpdate() {
        return this.lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Set getCustomers() {
        return this.customers;
    }

    public void setCustomers(Set customers) {
        this.customers = customers;
    }
}