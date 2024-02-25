package dev.dubhe.fantasyskinserver.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@TableName("player")
public class Player extends AbstractSqlBase { // 角色
    private String name; // 角色名称
    private Long user; // 用户ID
    private Long skin; // 皮肤ID
    private Long cape; // 披风ID
    private String uuid; // UUID
    private String oldName; // 旧名称
}
