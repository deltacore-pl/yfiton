/*
 * Copyright 2015 Laurent Pellegrino
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

package com.yfiton.api.parameter.validators;

import com.yfiton.api.exceptions.ValidationException;
import org.junit.Test;

/**
 * Unit tests associated to {@link NoValidator}.
 * <p/>
 * They should throw no exception whatever the input is.
 *
 * @author Laurent Pellegrino
 */
public class NoValidatorTest extends ValidatorTest<NoValidator> {

    public NoValidatorTest() {
        super(NoValidator.class);
    }

    @Test
    public void testValidateNullNull() throws ValidationException {
        getInstance().validate(null, null);
    }

    @Test
    public void testValidateANull() throws ValidationException {
        getInstance().validate("a", null);
    }

    @Test
    public void testValidateNullB() throws ValidationException {
        getInstance().validate(null, "b");
    }

    @Test
    public void testValidateAB() throws ValidationException {
        getInstance().validate("a", "b");
    }

}