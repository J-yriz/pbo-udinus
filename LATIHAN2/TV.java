public class TV {
    int channel;
    int volumeLevel;
    boolean on;

    TV() {
        this.channel = 1;
        this.volumeLevel = 1;
        this.on = false;
    }

    public void turnOn() {
        this.on = true;
    }

    public void turnOff() {
        this.on = false;
    }

    public void setChannel(int newChannel) {
        if (this.on && newChannel >= 1 && newChannel <= 120) {
            this.channel = newChannel;
        }
    }

    public void setVolume(int newVolumeLevel) {
        if (this.on && newVolumeLevel >= 1 && newVolumeLevel <= 7) {
            this.volumeLevel = newVolumeLevel;
        }
    }

    public void channelUp() {
        if (this.on && this.channel < 120) {
            this.channel++;
        }
    }

    public void channelDown() {
        if (this.on && this.channel > 1) {
            this.channel--;
        }
    }

    public void volumeUp() {
        if (this.on && this.volumeLevel < 7) {
            this.volumeLevel++;
        }
    }

    public void volumeDown() {
        if (this.on && this.volumeLevel > 1) {
            this.volumeLevel--;
        }
    }
}
