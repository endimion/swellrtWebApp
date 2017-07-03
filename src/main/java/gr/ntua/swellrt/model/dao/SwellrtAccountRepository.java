/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.ntua.swellrt.model.dao;


import gr.ntua.swellrt.model.dmo.AccountBuilder.SwellrtAccountMngDMO;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author nikos
 */
public interface SwellrtAccountRepository extends MongoRepository<SwellrtAccountMngDMO,Long>{
    public SwellrtAccountMngDMO findByToken(String token);
    public SwellrtAccountMngDMO findByEid(String eid);
}