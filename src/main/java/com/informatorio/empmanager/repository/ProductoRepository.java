package com.informatorio.empmanager.repository;

import com.informatorio.empmanager.entity.Producto;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

  // SELECT * FROM Productos AS p Where p.name LIKE %:name%
  // @Query("select")
  List<Producto> findByNameLike(String name);
}
