package com.globalhands.gb.user.repository;

import com.globalhands.gb.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository <User, Integer> {   //<>, genéricos,sirven para decirla a una
                                                                          //clase, trabaja con este tipo de datos, solo funcionan
                                                                          //con objetos



}
