package com.api.NormalizeService.model.OnlineMessage;


import com.api.NormalizeService.model.commonData.CommonMessage;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "online_message")
public class OnlineMessage extends CommonMessage {
    @Id
    @GeneratedValue
    private long id;
    private OnlineData onlineData;
}
