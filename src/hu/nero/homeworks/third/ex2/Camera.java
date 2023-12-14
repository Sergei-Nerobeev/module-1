package hu.nero.homeworks.third.ex2;

public class Camera extends Component {
public Camera(String model, int zoom, boolean hasFlash) {
		super(model, zoom, hasFlash);
}

@Override
public String getModel() {
		return super.getModel();
}

@Override
public int getZoom() {
		return super.getZoom();
}

@Override
public boolean isHasFlash() {
		return super.isHasFlash();
}
}
