package pattern;

/**
 * @author YMolodkov
 * @since 0.5
 */

interface Statelike {

    /**
     * Writer method for the state name.
     * @param context the stateful context
     * @param name the name to be written
     */
    void writeName(StateContext context, String name);

}

class StateA implements Statelike {

    @Override
    public void writeName(final StateContext context, final String name) {
        System.out.println(name.toLowerCase());
        context.setState(new StateB());
    }

}

class StateB implements Statelike {
    /** State counter */
    private int count = 0;

    @Override
    public void writeName(final StateContext context, final String name) {
        System.out.println(name.toUpperCase());
        /* Change state after StateB's writeName() gets invoked twice */
        if(++count > 1) {
            context.setState(new StateA());
        }
    }

}

class StateContext {
    private Statelike myState;
    /**
     * Standard constructor
     */
    StateContext() {
        setState(new StateA());
    }

    /**
     * Setter method for the state.
     * Normally only called by classes implementing the State interface.
     * @param newState the new state of this context
     */
    void setState(final Statelike newState) {
        myState = newState;
    }

    /**
     * Writer method
     * @param name the name to be written
     */
    public void writeName(final String name) {
        myState.writeName(this, name);
    }
}

class TestClientState {
    public static void main(String[] args) {
        final StateContext sc = new StateContext();

        sc.writeName("Monday");
        sc.writeName("Tuesday");
        sc.writeName("Wednesday");
        sc.writeName("Thursday");
        sc.writeName("Friday");
        sc.writeName("Saturday");
        sc.writeName("Sunday");
    }
}