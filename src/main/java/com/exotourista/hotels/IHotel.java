package com.exotourista.hotels;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHotel extends JpaRepository<Hotels, Long> {
    
}
