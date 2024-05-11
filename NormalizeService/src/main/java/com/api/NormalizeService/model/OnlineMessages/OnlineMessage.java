package com.api.NormalizeService.model.OnlineMessages;


import com.api.NormalizeService.model.commonData.CommonMessage;
import com.api.NormalizeService.model.commonData.VoucherInfo;
import jakarta.persistence.*;
import lombok.*;

import java.lang.annotation.Target;


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
