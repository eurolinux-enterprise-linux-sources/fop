/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/* $Id: BaseConstructiveUserConfigTestCase.java 627367 2008-02-13 12:03:30Z maxberger $ */

package org.apache.fop.config;

public abstract class BaseConstructiveUserConfigTestCase extends BaseUserConfigTestCase {

    /**
     * @see junit.framework.TestCase#TestCase(String)
     */
    public BaseConstructiveUserConfigTestCase(String name) {
        super(name);
    }

    /**
     * Test using a standard FOP font
     * @throws Exception checkstyle wants a comment here, even a silly one
     */
    public void testUserConfig() throws Exception {
        try {
            initConfig();
            convertFO();
        } catch (Exception e) {
            // this should *not* happen!
            e.printStackTrace();
            fail(e.getMessage());
        }
    }
}
