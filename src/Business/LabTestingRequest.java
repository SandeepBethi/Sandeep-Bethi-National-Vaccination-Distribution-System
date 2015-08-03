/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Bethi
 */
public class LabTestingRequest extends WorkRequest{
   
    private ReportCDCRequest rfr; 
    private String testReport;

    public LabTestingRequest() {
       
        
    }

    public String getTestReport() {
        return testReport;
    }

    public void setTestReport(String testReport) {
        this.testReport = testReport;
    }

    public ReportCDCRequest getRfr() {
        return rfr;
    }

    public void setRfr(ReportCDCRequest rfr) {
        this.rfr = rfr;
    }

   
    
}
