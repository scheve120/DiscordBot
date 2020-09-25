package datastorage.controller;

import datastorage.model.ServerUsers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServerUsersRepository extends JpaRepository<ServerUsers, Long> {
}
