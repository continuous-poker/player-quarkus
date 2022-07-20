package de.doubleslash.poker.player;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.doubleslash.poker.player.data.Table;
import de.doubleslash.poker.player.logic.Strategy;

@Path("/")
public class PlayerController {

   @POST
   @Consumes(MediaType.APPLICATION_JSON)
   @Produces(MediaType.TEXT_PLAIN)
   public int action(final Table table) {
      final Strategy player = new Strategy();
      return player.decide(table);
   }

}