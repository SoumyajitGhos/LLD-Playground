package Buttons;

import Constants.Direction;

public class HallButton extends Button {
    private final Direction direction;

    public HallButton(Direction direction) {
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }

    public boolean isPressed() {
        return pressed;
    }
}
