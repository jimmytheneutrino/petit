/**
 *   Copyright 2014 Nortal AS
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package com.nortal.petit.converter;

/**
 * @author Roman Tekhov
 */
public abstract class BaseConverter<F, T> implements Converter<F, T> {

    private Class<F> fromType;
    private Class<T> toType;

    public BaseConverter(Class<F> fromType, Class<T> toType) {
        this.fromType = fromType;
        this.toType = toType;
    }

    @Override
    public Class<F> getFromType() {
        return fromType;
    }

    @Override
    public Class<T> getToType() {
        return toType;
    }

}
