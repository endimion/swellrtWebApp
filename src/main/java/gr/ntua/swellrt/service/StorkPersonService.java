/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.ntua.swellrt.service;

import gr.ntua.swellrt.model.dmo.StorkPersonMngDMO;

/**
 *
 * @author nikos
 */
public interface StorkPersonService {
    public StorkPersonMngDMO findByEid(String eid);
    public StorkPersonMngDMO findByToken(String token);
    public void saveOrUpdateEidAttribute(StorkPersonMngDMO person);
}