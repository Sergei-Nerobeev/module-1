package hu.nero.homeworks.third.ex2;

public abstract class Component {
protected String model;
protected int width;
protected int length;
protected int height;
protected int zoom;
protected boolean hasFlash;

protected Component(String model) {
	this.model = model;
}

protected Component(String model, int width, int length, int height) {
	this.model = model;
	this.width = width;
	this.length = length;
	this.height = height;
}

protected Component(String model, int zoom, boolean hasFlash) {
	this.model = model;
	this.zoom = zoom;
	this.hasFlash = hasFlash;
}

public String getModel() {
	return model;
}

public String getSize() {
	return width + " X " + length + " X " + height;
}

public int getZoom() {
	return zoom;
}

public boolean isHasFlash() {
	return hasFlash;
}
}
