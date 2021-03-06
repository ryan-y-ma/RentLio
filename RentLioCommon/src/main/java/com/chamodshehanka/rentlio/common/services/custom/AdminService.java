package com.chamodshehanka.rentlio.common.services.custom;

import com.chamodshehanka.rentlio.common.dto.AdminDTO;
import com.chamodshehanka.rentlio.common.observer.AdminObserver;
import com.chamodshehanka.rentlio.common.services.SuperService;

import java.util.List;

/**
 * @author chamodshehanka on 3/13/2018
 * @project RentLio
 **/
public interface AdminService extends SuperService{

    public boolean addAdmin(AdminDTO adminDTO) throws Exception;

    public boolean updateAdmin(AdminDTO adminDTO) throws Exception;

    public boolean deleteAdmin(String adminId) throws Exception;

    public AdminDTO findByIdAdmin(String adminId) throws Exception;

    public List<AdminDTO> getAllAdmins() throws Exception;

    public boolean addAdminObserver(AdminObserver adminObserver) throws Exception;

    public boolean removeAdminObserver(AdminObserver adminObserver) throws Exception;

}
