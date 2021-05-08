package pl.gda.wsb.devices;

public class Phone {

    String manufacturer;
    boolean isShattered;
    String system;

    public Phone(String manufacturer, boolean isShattered, String system) {
        this.manufacturer = manufacturer;
        this.isShattered = isShattered;
        this.system = system;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "manufacturer='" + manufacturer + '\'' +
                ", isShattered=" + isShattered +
                ", system='" + system + '\'' +
                '}';
    }
}
