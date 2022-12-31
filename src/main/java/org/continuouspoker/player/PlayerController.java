package org.continuouspoker.player;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.continuouspoker.player.model.Bet;
import org.continuouspoker.player.model.Table;
import org.continuouspoker.player.logic.Strategy;

@Path("/")
public class PlayerController {

   @POST
   @Consumes(MediaType.APPLICATION_JSON)
   @Produces(MediaType.APPLICATION_JSON)
   public Bet action(final Table table) {
      final Strategy player = new Strategy();
      return player.decide(table);
   }

}