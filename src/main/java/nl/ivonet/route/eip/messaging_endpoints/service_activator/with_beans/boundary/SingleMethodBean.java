/*
 * Copyright 2017 Ivo Woltring <WebMaster@ivonet.nl>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package nl.ivonet.route.eip.messaging_endpoints.service_activator.with_beans.boundary;

import org.springframework.stereotype.Component;

/**
 * This bean only has one method and can therefore be used as a bean reference without providing a method reference.
 *
 * It is not recommended to do this because of maintainability and readability.
 *
 * @author Ivo Woltring
 */
@Component
public class SingleMethodBean {
    public String sayHello(final String name) {
        return "hello " + name;
    }
}
