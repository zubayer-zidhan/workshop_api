package com.workshop_api.workshop_api.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.workshop_api.workshop_api.entities.Workshops;
import com.workshop_api.workshop_api.repository.WorkshopRepository;
import com.workshop_api.workshop_api.services.WorkshopService;


@Service
public class WorkshopServiceImpl implements WorkshopService {
    @Autowired
    WorkshopRepository workshopRepository;

    private final JdbcTemplate jdbcTemplate;


    public WorkshopServiceImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //Methods implementation
    @Override
    public List<Workshops> getAllWorkshops() {
        return workshopRepository.findAll();  //calling findAll() from Jparepository
    }


    @Override
    public List<Workshops> getWorkshopsByCity(int cid) {
        String stmt = "select * from workshops where city_id = ?";
        System.out.println(stmt);
        List<Workshops> newWorkshops = jdbcTemplate.query(stmt, new BeanPropertyRowMapper<>(Workshops.class), cid);
        // newWorkshops.addAll(jdbcTemplate.queryForList(stmt, Workshops.class));
        return newWorkshops;
    }



    @Override
    public Workshops addWorkshop(Workshops workshop) {
        return workshopRepository.save(workshop);
    }
    
}
