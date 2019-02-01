/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springframework.samples.petclinic.system;

import org.springframework.data.repository.Repository;

/**
 *
 * @author Daniel Sarmiento
 */
public interface ReporteLoginRepository extends Repository<ReporteLogin, Integer>{
    
    void save(ReporteLogin reporteLogin);
    
}
