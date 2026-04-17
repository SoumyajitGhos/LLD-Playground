package Buttons;

public abstract class Button {
    protected boolean pressed = false;

    public void pressedDown() {
        pressed = true;
    }

    public void reset() {
        pressed = false;
    }

    public abstract boolean isPressed();
}
