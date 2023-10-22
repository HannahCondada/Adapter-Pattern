package AdapterPattern;

public class SmartphoneAdapter implements PowerOutlet {
    private SmartphoneCharger sPC;

    public SmartphoneAdapter(SmartphoneCharger sPC) {
        this.sPC = sPC;
    }

    @Override
    public String plugIn() {
        return sPC.chargePhone();
    }
}
