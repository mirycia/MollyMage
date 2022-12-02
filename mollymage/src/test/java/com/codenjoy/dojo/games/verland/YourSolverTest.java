package com.codenjoy.dojo.games.verland;

/*-
 * #%L
 * Codenjoy - it's a dojo-like platform from developers to developers.
 * %%
 * Copyright (C) 2012 - 2022 Codenjoy
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */


import com.codenjoy.dojo.services.Dice;
import com.codenjoy.dojo.services.Direction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class YourSolverTest {

    private Dice dice = mock(Dice.class);
    private final YourSolver solver = new YourSolver(dice);

    private Board board(String board) {
        return (Board) new Board().forString(board);
    }

    private void dice(Direction direction) {
        when(dice.next(anyInt())).thenReturn(direction.value());
    }

    private void assertB(String board, String command) {
        assertEquals(command, solver.get(board(board)));
    }

    // TODO these dummy tests are here for an example, delete it and write your own

    @Test
    public void shouldSomething_whenCase1() {
        assertB("☼☼☼☼☼☼☼☼☼\n" +
                "☼*******☼\n" +
                "☼*******☼\n" +
                "☼*******☼\n" +
                "☼*******☼\n" +
                "☼*******☼\n" +
                "☼*******☼\n" +
                "☼♥******☼\n" +
                "☼☼☼☼☼☼☼☼☼\n", Command.MOVE_UP);
    }

    @Test
    public void shouldSomething_whenCase2() {
        assertB("☼☼☼☼☼☼☼☼☼\n" +
                "☼*******☼\n" +
                "☼*******☼\n" +
                "☼*******☼\n" +
                "☼*******☼\n" +
                "☼*******☼\n" +
                "☼♥******☼\n" +
                "☼ ******☼\n" +
                "☼☼☼☼☼☼☼☼☼\n", Command.MOVE_UP);
    }

    @Test
    public void shouldSomething_whenCase3() {
        assertB("☼☼☼☼☼☼☼☼☼\n" +
                "☼*******☼\n" +
                "☼*******☼\n" +
                "☼*******☼\n" +
                "☼*******☼\n" +
                "☼♥******☼\n" +
                "☼ ******☼\n" +
                "☼ ******☼\n" +
                "☼☼☼☼☼☼☼☼☼\n", Command.MOVE_UP);
    }

    @Test
    public void shouldSomething_whenCase4() {
        assertB("☼☼☼☼☼☼☼☼☼\n" +
                "☼*******☼\n" +
                "☼*******☼\n" +
                "☼*******☼\n" +
                "☼♥******☼\n" +
                "☼ ******☼\n" +
                "☼ ******☼\n" +
                "☼ ******☼\n" +
                "☼☼☼☼☼☼☼☼☼\n", Command.MOVE_UP);
    }
}
