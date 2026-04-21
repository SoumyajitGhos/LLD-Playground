package Components;

import Constants.Direction;
import Constants.ElevatorState;

public class Display {
    private int floor = 0;
    private int load = 0;
    private Direction direction = Direction.IDLE;
    private ElevatorState state = ElevatorState.IDLE;
    private boolean maintanance = false;
    private boolean overload = false;

    public void update(int floor, int load, Direction direction, ElevatorState state, boolean maintanance,
            boolean overload) {
        this.floor = floor;
        this.load = load;
        this.direction = direction;
        this.state = state;
        this.maintanance = maintanance;
        this.overload = overload;
    }

    public void showElevatorDisplay(int cardId) {
        String stateMessage = maintanance ? "MAINTANANCE"
                : overload ? "OVERLOAD"
                        : state == ElevatorState.IDLE ? "IDLE"
                                : state == ElevatorState.UP ? "UP"
                                        : state == ElevatorState.DOWN ? "DOWN"
                                                : "UNKNOWN";
        System.out.printf("Elevator %d => Floor: %d | Direction: %s | Load: %d | State: %s", cardId, floor, direction,
                load, stateMessage);
    }
}
