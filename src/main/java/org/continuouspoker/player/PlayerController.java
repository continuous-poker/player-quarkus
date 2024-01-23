/*
 * Copyright © 2020 - 2024 Jan Kreutzfeld
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
package org.continuouspoker.player;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.continuouspoker.player.logic.Strategy;
import org.continuouspoker.player.model.Bet;
import org.continuouspoker.player.model.Table;

@Path("/")
public class PlayerController {

   @POST
   @Consumes(MediaType.APPLICATION_JSON)
   @Produces(MediaType.APPLICATION_JSON)
   public Bet action(final Table table) {
      final Strategy player = new Strategy();
      return player.decide(table);
   }

   @GET
   @Produces(MediaType.TEXT_PLAIN)
   public String hello() {
      return "Quarkus Poker Player";
   }

}