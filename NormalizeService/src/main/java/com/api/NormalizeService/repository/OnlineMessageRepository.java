package com.api.NormalizeService.repository;

import com.api.NormalizeService.model.OnlineMessages.OnlineMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface OnlineMessageRepository extends JpaRepository<OnlineMessage,Long> {
    //ArrayList<OnlineMessage> findAll();
    //OnlineMessage save(OnlineMessage onlineMessage);
}
