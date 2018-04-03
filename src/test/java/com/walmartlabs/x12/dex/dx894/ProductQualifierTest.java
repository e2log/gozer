/**
Copyright (c) 2018-present, Walmart, Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */
package com.walmartlabs.x12.dex.dx894;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductQualifierTest {

    @Test
    public void test_valid_value() {
        assertEquals(ProductQualifier.EN, ProductQualifier.convertyProductQualifier("EN"));
    }

    @Test
    public void test_invalid_value() {
        assertEquals(ProductQualifier.UNKNOWN, ProductQualifier.convertyProductQualifier("BOGUS"));
    }

    @Test
    public void test_invalid_empty() {
        assertEquals(ProductQualifier.UNKNOWN, ProductQualifier.convertyProductQualifier(""));
    }

    @Test
    public void test_invalid_null() {
        assertEquals(null, ProductQualifier.convertyProductQualifier(null));
    }

}
