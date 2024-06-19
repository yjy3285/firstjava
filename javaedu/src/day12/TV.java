package day12;

public class TV {
	protected String model;
	protected int size;
	protected int channel;

	public TV() {
	}

	public TV(String model, int size, int channel) {
		this.model = model;
		this.size = size;
		this.channel = channel;

	}

	public String getModel() {
		return model;
	}

	

	public int getSize() {
		return size;
	}

	

	public int getChannel() {
		return channel;
	}

	

	public void channelUp() {
		channel++;
		if (channel > 10) {
			channel = 1;
		}

	}

	public void channelDown() {
		channel--;
		if (channel < 1) {
			channel = 10;
		}
	}

}
