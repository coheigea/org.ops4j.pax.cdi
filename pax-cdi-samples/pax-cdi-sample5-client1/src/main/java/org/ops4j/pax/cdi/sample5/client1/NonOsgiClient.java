/*
 * Copyright 2014 Harald Wellmann.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ops4j.pax.cdi.sample5.client1;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.ops4j.pax.cdi.api.Component;
import org.ops4j.pax.cdi.api.Filter;
import org.ops4j.pax.cdi.api.Immediate;
import org.ops4j.pax.cdi.api.OsgiService;
import org.ops4j.pax.cdi.api.Service;
import org.ops4j.pax.cdi.sample5.Client;

@Component @Immediate
public class NonOsgiClient {

    @Inject
    @Service
    @Filter("(name=client11)")
    private Client client11;


    /**
     * @return the client11
     */
    public Client getClient11() {
        return client11;
    }


    /**
     * @param client11 the client11 to set
     */
    public void setClient11(Client client11) {
        this.client11 = client11;
    }
}
