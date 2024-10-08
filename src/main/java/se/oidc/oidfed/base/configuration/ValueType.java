/*
 * Copyright 2024 OIDC Sweden
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
package se.oidc.oidfed.base.configuration;

/**
 * Metadata policy value types
 */
public class ValueType {
  public static final String STRING = "string";
  public static final String STRING_ARRAY = "array";
  public static final String SPACE_SEPARATED_STRINGS = "space_list";
  public static final String INTEGER = "integer";
  public static final String INTEGER_ARRAY = "integer_array";
  public static final String BOOLEAN = "boolean";

  public static final String BOOLEAN_ARRAY = "boolean_array";

  public static final String OBJECT = "object";

}
