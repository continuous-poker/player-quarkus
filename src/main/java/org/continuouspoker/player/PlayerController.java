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