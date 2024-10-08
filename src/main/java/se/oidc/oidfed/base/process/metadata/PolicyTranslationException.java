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
package se.oidc.oidfed.base.process.metadata;

import java.io.Serial;

/**
 * Exception for metadata policy translation errors
 */
public class PolicyTranslationException extends Exception {

  @Serial
  private static final long serialVersionUID = 7065232880282582329L;

  public PolicyTranslationException(final String message) {
    super(message);
  }

  public PolicyTranslationException(final String message, final Throwable cause) {
    super(message, cause);
  }
}
