package com.store.electronicsStore.hibernate.services;

import com.store.electronicsStore.hibernate.pojos.Roles;
import com.store.electronicsStore.hibernate.repositories.RolesRepository;
import java.util.ArrayList;
import org.springframework.stereotype.Service;

@Service
public class RolesService {


  private final RolesRepository rolesRepository;

  public RolesService(RolesRepository rolesRepository) {
    this.rolesRepository = rolesRepository;
  }

  public String[] allTypes() {
    ArrayList<String> roleTypes = new ArrayList<>();
    rolesRepository.findAll().forEach(roles -> roleTypes.add(roles.getRoleType()));
    return (String[]) roleTypes.toArray();
  }

  public Iterable<Roles> findAll() {
    return rolesRepository.findAll();
  }

  public Roles findById(Integer id) {
    return rolesRepository.findById(id).orElse(null);
  }

}
