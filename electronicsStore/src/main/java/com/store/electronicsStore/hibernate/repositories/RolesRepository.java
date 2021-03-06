package com.store.electronicsStore.hibernate.repositories;

import com.store.electronicsStore.hibernate.pojos.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepository extends JpaRepository<Roles, Integer> {

}
