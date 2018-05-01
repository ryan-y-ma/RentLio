package com.chamodshehanka.rentLioClient.view.controller;

import com.chamodshehanka.rentLioClient.controller.CustomerController;
import com.chamodshehanka.rentLioClient.controller.DriverController;
import com.chamodshehanka.rentLioClient.util.AlertBuilder;
import com.chamodshehanka.rentLioClient.util.IDGenerator;
import com.chamodshehanka.rentLioCommon.dto.CustomerDTO;
import com.chamodshehanka.rentLioCommon.dto.DriverDTO;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

/**
 * @author chamodshehanka on 4/30/2018
 * @project RentLio
 **/
public class ManageReservationUIController implements Initializable{

    @FXML
    private JFXTextField txtReservationID;

    @FXML
    private JFXTextField txtCustomerID;

    @FXML
    private JFXTextField txtCustomerName;

    @FXML
    private JFXTextField txtDriverID;

    @FXML
    private JFXCheckBox chbxDriver;

    @FXML
    private JFXTextField txtDriverName;

    @FXML
    private JFXTextField txtDriverTel;

    @FXML
    private JFXTextField txtDriverNIC;

    private List<CustomerDTO>  customerDTOList;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
//        generateReservationID();
        txtReservationID.setText("E001");
    }

    @FXML
    private void needDriverAction(){
        if (chbxDriver.isSelected()){
            txtDriverID.setDisable(false);
            txtDriverName.setDisable(false);
            txtDriverTel.setDisable(false);
            txtDriverNIC.setDisable(false);

        }else if (!chbxDriver.isSelected()){
            txtDriverID.setDisable(true);
            txtDriverName.setDisable(true);
            txtDriverTel.setDisable(true);
            txtDriverNIC.setDisable(true);
        }
    }

    @FXML
    private void getDriverByID(){
        try {
            DriverDTO driverDTO = DriverController.getDriverBy(txtDriverID.getText());
            if (driverDTO != null){
                txtDriverName.setText(driverDTO.getDriverName());
                txtDriverTel.setText(0+String.valueOf(driverDTO.getTel()));
                txtDriverNIC.setText(driverDTO.getDriverNIC());
            }else {
                new AlertBuilder("warn","Manage Driver","Driver Search",
                        "Driver couldn't found");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void findCustomerAction(){
        try {
            CustomerDTO customerDTO = CustomerController.getCustomerById(txtCustomerID.getText());
            if (customerDTO != null){
                txtCustomerName.setText(customerDTO.getCustomerName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void getCustomerByName(){
        try {
            customerDTOList = CustomerController.getAllCustomers();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String customerName = txtCustomerName.getText();
        for (CustomerDTO customerDTO : customerDTOList
             ) {
            if (customerDTO.getCustomerName().equals(customerName)){
                txtCustomerID.setText(customerDTO.getCustomerId());
            }else {
                new AlertBuilder("warn","Customer","Customer Search",
                        "Customer couldn't found");
            }
        }
    }

    private void generateReservationID(){
        try {
            txtReservationID.setText(IDGenerator.getNewID("reservation","E"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}