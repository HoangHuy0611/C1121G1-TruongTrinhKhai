package bai_tap_lam_them_cua_thay_Chanh.vehicle_management_program.service;


import bai_tap_lam_them_cua_thay_Chanh.vehicle_management_program.model.Vehicle;

import java.util.List;

public interface IVehicleService {
    void add();

    void delete(String controlPlate);

    void display();
}
