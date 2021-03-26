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

import java.time.LocalDate;
import java.util.List;
import org.eclipse.cargotracker.domain.model.cargo.Itinerary;
import org.eclipse.cargotracker.domain.model.cargo.TrackingId;
import org.eclipse.cargotracker.domain.model.location.UnLocode;

/** Cargo booking service. */
public interface BookingService {

  /** Registers a new cargo in the tracking system, not yet routed. */
  TrackingId bookNewCargo(UnLocode origin, UnLocode destination, LocalDate arrivalDeadline);

  /**
   * Requests a list of itineraries describing possible routes for this cargo.
   *
   * @param trackingId Cargo tracking ID
   * @return A list of possible itineraries for this cargo
   */
  List<Itinerary> requestPossibleRoutesForCargo(TrackingId trackingId);

  void assignCargoToRoute(Itinerary itinerary, TrackingId trackingId);

  void changeDestination(TrackingId trackingId, UnLocode unLocode);

  void changeDeadline(TrackingId trackingId, LocalDate deadline);
}
