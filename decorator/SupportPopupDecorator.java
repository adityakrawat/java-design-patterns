package decorator;

public class SupportPopupDecorator extends ColumDecorator {

    public SupportPopupDecorator(Report dReport) {
        super(dReport);
    }
    
    public String getFirstColumnData() {
        return addPopup(super.getFirstColumnData());
    }

    public String addPopup(String data) {
        return data + " -- support pop -- ";
    }

}
