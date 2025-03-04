/*
<<<<<<<< HEAD:incubator/cdi-inject-weld/src/test/java/org/glassfish/jersey/inject/weld/ClientTestParent.java
 * Copyright (c) 2024 Oracle and/or its affiliates. All rights reserved.
========
 * Copyright (c) 2022 Oracle and/or its affiliates. All rights reserved.
>>>>>>>> origin/3.1.JPMS:tests/integration/jersey-780/src/main/java/module-info.java
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

<<<<<<<< HEAD:incubator/cdi-inject-weld/src/test/java/org/glassfish/jersey/inject/weld/ClientTestParent.java
package org.glassfish.jersey.inject.weld;

import org.glassfish.jersey.internal.inject.Injections;
import org.junit.jupiter.api.BeforeEach;

import jakarta.ws.rs.RuntimeType;

public class ClientTestParent extends TestParent {
    @BeforeEach
    public void init() {
        injectionManager = Injections.createInjectionManager(RuntimeType.CLIENT);
    }
}
========
module org.glassfish.jersey.tests.integration.jersey_780 {
    requires jakarta.ws.rs;
}
>>>>>>>> origin/3.1.JPMS:tests/integration/jersey-780/src/main/java/module-info.java
