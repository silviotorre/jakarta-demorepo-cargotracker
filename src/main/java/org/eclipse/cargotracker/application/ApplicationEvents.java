/**
 * Copyright 2021 Google LLC
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
package org.eclipse.cargotracker.application;

import org.eclipse.cargotracker.domain.model.cargo.Cargo;
import org.eclipse.cargotracker.domain.model.handling.HandlingEvent;
import org.eclipse.cargotracker.interfaces.handling.HandlingEventRegistrationAttempt;

/**
 * This interface provides a way to let other parts of the system know about events that have
 * occurred.
 *
 * <p>It may be implemented synchronously or asynchronously, using for example JMS.
 */
public interface ApplicationEvents {

  void cargoWasHandled(HandlingEvent event);

  void cargoWasMisdirected(Cargo cargo);

  void cargoHasArrived(Cargo cargo);

  void receivedHandlingEventRegistrationAttempt(HandlingEventRegistrationAttempt attempt);
}
