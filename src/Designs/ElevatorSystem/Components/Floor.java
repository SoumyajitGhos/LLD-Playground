package Components;

import java.util.ArrayList;
import java.util.List;

import Panels.HallPanel;

public class Floor {
    private final int floorNumber;
    private final List<HallPanel> panels;
    private final List<Display> displays;

    public Floor(int floorNumber, int numPanels, int numDisplay, int topFloor) {
        this.floorNumber = floorNumber;
        this.panels = new ArrayList<>();
        for (int i = 0; i < numPanels; i++) {
            panels.add(new HallPanel(floorNumber, topFloor));
        }
        this.displays = new ArrayList<>();
        for (int i = 0; i < numDisplay; i++) {
            displays.add(new Display());
        }
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public List<HallPanel> getPanels() {
        return panels;
    }

    public List<Display> getDisplays() {
        return displays;
    }

    public Display getDisplay(int index) {
        return displays.get(index);
    }
}