/*
 * Copyright 2002-present the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.amqp.rabbit.retry;

import org.jspecify.annotations.Nullable;

import org.springframework.amqp.core.Message;

/**
 * Implementations of this interface can handle failed messages after retries are
 * exhausted.
 *
 * @author Dave Syer
 * @author Gary Russell
 * @author Artem Bilan
 *
 */
@FunctionalInterface
public interface MessageRecoverer {

	/**
	 * Callback for message that was consumed but failed all retry attempts.
	 *
	 * @param message the message to recover
	 * @param cause the cause of the error
	 */
	void recover(Message message, @Nullable Throwable cause);

}
