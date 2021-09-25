package decorator;

public class SupportLinkDecorator extends ColumDecorator {

    public SupportLinkDecorator(Report dReport) {
        super(dReport);
    }

    public String getFirstColumnData() {
        return addMoreInfo(super.getFirstColumnData());
    }

    public String addMoreInfo(String data) {
        return data + " --support link-- ";
    }
    
}
