package com.ibformation.cinema2.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibformation.cinema2.bo.Seance;
@Repository
public interface SeanceDao extends CrudRepository<Seance, Integer> {

}
