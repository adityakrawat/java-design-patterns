package decorator;

public abstract class ColumDecorator implements Report {
    
    private Report dReport;

    public ColumDecorator(Report dReport) {
        this.dReport = dReport;
    }

    public String getFirstColumnData() {
        return dReport.getFirstColumnData();
    }

    @Override
    public Object[][] getReportData(String reportId) {
        return dReport.getReportData(reportId); 
    }

}
