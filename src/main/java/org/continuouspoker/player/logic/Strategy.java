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
package org.continuouspoker.player.logic;

import org.continuouspoker.player.model.Bet;
import org.continuouspoker.player.model.Table;

public class Strategy {

   public Bet decide(final Table table) {
      System.out.println(table);
      return new Bet().bet(0);
   }

}
