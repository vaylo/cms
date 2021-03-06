package com.aconex.repository;

import com.aconex.model.ProjectModel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by vlo on 4/17/2016.
 */
public interface ProjectRepository extends JpaRepository<ProjectModel, Long> {

    ProjectModel findByName(String name);
}
