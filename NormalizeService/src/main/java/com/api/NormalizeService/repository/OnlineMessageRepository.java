package com.api.NormalizeService.repository;

import com.api.NormalizeService.model.OnlineMessage.OnlineMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnlineMessageRepository extends JpaRepository<OnlineMessage,Long> {
    //ArrayList<OnlineMessage> findAll();
    //OnlineMessage save(OnlineMessage onlineMessage);
}
