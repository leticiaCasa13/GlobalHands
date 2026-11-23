package com.globalhands.gb.repository;

import com.globalhands.gb.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Integer> {   //<>, genéricos,sirven para decirla a una
                                                                          //clase, trabaja con este tipo de datos, solo funcionan
                                                                          //con objetos



}
