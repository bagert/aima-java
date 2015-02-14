package aima.core.api.search;

import aima.core.api.agent.Action;

import java.util.Set;

/**
 * Artificial Intelligence A Modern Approach (4thd Edition): page ??.<br>
 * <br>
 * A problem can be defined formally by five components: <br>
 * <ul>
 * <li>The <b>initial state</b> that the agent starts in.</li>
 * <li>A description of the possible <b>actions</b> available to the agent.
 * Given a particular state s, ACTIONS(s) returns the set of actions that can be
 * executed in s.</li>
 * <li>A description of what each action does; the formal name for this is the
 * <b>transition model, specified by a function RESULT(s, a) that returns the
 * state that results from doing action a in state s.</b></li>
 * <li>The <b>goal test</b>, which determines whether a given state is a goal
 * state.</li>
 * <li>A <b>path cost</b> function that assigns a numeric cost to each path. The
 * problem-solving agent chooses a cost function that reflects its own
 * performance measure. The <b>step cost</b> of taking action a in state s to
 * reach state s' is denoted by c(s,a,s')</li>
 * </ul>
 *
 * @param <S> the type of the initial state that the agent starts in.
 *
 * @author Ciaran O'Reilly
 */
public interface Problem<S> {
    S initialState();
    Set<Action> actions(S s);
    S result(S s, Action a);
    boolean isGoalState(S state);
    double stepCost(S s, Action a, S sPrime);
}