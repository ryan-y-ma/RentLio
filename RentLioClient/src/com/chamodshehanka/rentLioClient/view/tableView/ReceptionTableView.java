package com.chamodshehanka.rentLioClient.view.tableView;

import javafx.beans.property.SimpleStringProperty;

/**
 * @author chamodshehanka on 4/9/2018
 * @project RentLio
 **/
public class ReceptionTableView {

    private SimpleStringProperty receptionId;
    private SimpleStringProperty name;
    private SimpleStringProperty branch;
    private SimpleStringProperty address;
    private SimpleStringProperty email;
    private SimpleStringProperty tel;
    private SimpleStringProperty nic;

    public ReceptionTableView() {
    }

    public ReceptionTableView(SimpleStringProperty receptionId, SimpleStringProperty name, SimpleStringProperty branch, SimpleStringProperty address, SimpleStringProperty email, SimpleStringProperty tel, SimpleStringProperty nic) {
        this.receptionId = receptionId;
        this.name = name;
        this.branch = branch;
        this.address = address;
        this.email = email;
        this.tel = tel;
        this.nic = nic;
    }

    public String getReceptionId() {
        return receptionId.get();
    }

    public SimpleStringProperty receptionIdProperty() {
        return receptionId;
    }

    public void setReceptionId(String receptionId) {
        this.receptionId.set(receptionId);
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getBranch() {
        return branch.get();
    }

    public SimpleStringProperty branchProperty() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch.set(branch);
    }

    public String getAddress() {
        return address.get();
    }

    public SimpleStringProperty addressProperty() {
        return address;
    }

    public void setAddress(String address) {
        this.address.set(address);
    }

    public String getEmail() {
        return email.get();
    }

    public SimpleStringProperty emailProperty() {
        return email;
    }

    public void setEmail(String email) {
        this.email.set(email);
    }

    public String getTel() {
        return tel.get();
    }

    public SimpleStringProperty telProperty() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel.set(tel);
    }

    public String getNic() {
        return nic.get();
    }

    public SimpleStringProperty nicProperty() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic.set(nic);
    }
}
