package org.example.couriersystem.repository;

import org.example.couriersystem.PackageInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PackageRepository extends JpaRepository<PackageInfo, Long> {
}
