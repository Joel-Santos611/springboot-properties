package com.jestec.springbootproperties.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.jestec.springbootproperties.entities.Propriedade;


public interface PropriedadeRepository  extends PagingAndSortingRepository<Propriedade,String>{

    @Query("select c from Propriedade c where c.nome like %:filtro% order by categoria, nome")
    public List<Propriedade> findByFiltro(@Param("filtro") String filtro);
}