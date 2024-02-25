package dev.dubhe.fantasyskinserver.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@TableName("suit")
public class Suit extends AbstractSqlBase { // 套装
    private String name; // 套装名称
    private Long skin; // 皮肤ID
    private Long cape; // 披风ID
}
