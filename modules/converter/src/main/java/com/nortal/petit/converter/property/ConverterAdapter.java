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
package com.nortal.petit.converter.property;

import com.nortal.petit.beanmapper.Property;
import com.nortal.petit.converter.Converter;
import com.nortal.petit.converter.ConverterWrapper;

public class ConverterAdapter<F, T> extends ConverterWrapper<F, T> implements PropertyAdapter<F, T> {
	
	public ConverterAdapter(Converter<F, T> delegate) {
		super(delegate);
	}

	@Override
	public T convert(F value, Property<?, T> property) {
		return convert(value);
	}
}
