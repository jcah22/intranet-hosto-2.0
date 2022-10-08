package com.hosto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hosto.models.Odc;

@Repository
public interface OdcRepository extends JpaRepository<Odc, Integer> {

	@Query(value = "select * from odc WHERE odc.req_id= :filtro", nativeQuery = true)
	List<Odc> findByOdcs(@Param("filtro") int filtro);

}
