package com.kevin.springclouduserservice.services;

import com.kevin.springclouduserservice.config.ServiceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    ServiceConfig serviceConfig;

    public String getConifg() {
        return serviceConfig.getExampleProperty();
    }


}
