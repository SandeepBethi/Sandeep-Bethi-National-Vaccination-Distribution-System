/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;

/**
 *
 * @author Bethi
 */
public abstract class WorkRequest {
    
    public static enum StatusType{
    Open{@Override
        public String toString(){return "Open";}},
    PendingAtManufacturer{@Override
    public String toString(){return "Pending At Manufacturer";}},
    PendingAtLicenseDept{@Override
    public String toString(){return "Pending At License Dept";}},
    PendingOutOfStock{@Override
    public String toString(){return "PendingOutOfStock";}},
    PendingAtInventory{@Override
    public String toString(){return "Pending At Inventory";}},
    PendingAtLab{@Override
    public String toString(){return "Pending At Lab";}},
    AtLicenseDepartment{@Override
    public String toString(){return "At License Department";}},
    Resolved{@Override
    public String toString(){return "Resolved";}},
    SentForTesting{@Override
    public String toString(){return "Sent To Testing";}},
    SentToFDA{@Override
    public String toString(){return "Sent To FDA";}},
    PendingatShippingDept{@Override
    public String toString(){return "Pending at Shipping Dept";}},
    Shipped{@Override
    public String toString(){return "Shipped";}},
    PendingatSalesEmployee{@Override
    public String toString(){return "Pending at Sales Employee";}},
    PendingatBilling{@Override
    public String toString(){return "Pending at Billing";}},
    AtShippingDepartment{@Override
    public String toString(){return "At Shipping Department";}},
    TestResultReported{@Override
    public String toString(){return "Test Result Reported";}},
    AtSalesOrganization{@Override
    public String toString(){return "At Sales Organization";}}
    }
    
    public static enum WRType{
    SalesRequest{@Override
    public String toString(){return "Sales Request";}},
    EnterpriseLicenseApprovalRequest{@Override
    public String toString(){return "Enterprise License Approval Request";}},
    VaccineLicenseRequest{@Override
    public String toString(){return "VaccineLicense Request";}},
    RevokeVaccineLicenseRequestRequest{@Override
    public String toString(){return "Revoke VaccineLicense Request";}},
    ReturnSafeVaccinesRequest{@Override
    public String toString(){return "Return Safe Vaccines Request";}},
    ShippingRequest{@Override
    public String toString(){return "Shipping Request";}},
    ReportFDARequest{@Override
    public String toString(){return "Report FDA Request";}},
    RequestForVaccines{@Override
    public String toString(){return "Request For Vaccines";}},
    VaccineDispositionRequest{@Override
    public String toString(){return "Vaccine Disposition Request";}},
    LabTestingRequest{@Override
    public String toString(){return "Lab Testing Request";}}
//    ReceiveShipmentRequest{@Override
//    public String toString(){return "Receive Shipment Request";}}
    }
    
    private String status;
    private String reqDetail;
    private int reqQuantity;
    
    private UserAccount sender;
    private UserAccount receiver;
    private Date reqDate;

    public WorkRequest() {
    
    reqDate=new Date();
    }


    public String getStatus() {
        return status;
    }

    public int getReqQuantity() {
        return reqQuantity;
    }

    public void setReqQuantity(int reqQuantity) {
        this.reqQuantity = reqQuantity;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReqDetail() {
        return reqDetail;
    }

    public void setReqDetail(String reqDetail) {
        this.reqDetail = reqDetail;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public Date getReqDate() {
        return reqDate;
    }

    public void setReqDate(Date reqDate) {
        this.reqDate = reqDate;
    }
    
@Override 
public String toString(){

    return reqDate.toString();
}
    
}
