package org.tung.oopsection1;

public class Phone {
    private String name;
    private int screenSize;
    private int memoryRam;
    private int cameraResolution;

    public Phone(String name, int screenSize, int memoryRam, int cameraResolution) {
        this.name = name;
        this.screenSize = screenSize;
        this.memoryRam = memoryRam;
        this.cameraResolution = cameraResolution;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", screenSize=" + screenSize +
                ", memoryRam=" + memoryRam +
                ", cameraResolution=" + cameraResolution +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getMemoryRam() {
        return memoryRam;
    }

    public void setMemoryRam(int memoryRam) {
        this.memoryRam = memoryRam;
    }

    public int getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(int cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

    public Phone() {
    }
}
