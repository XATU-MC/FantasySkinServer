package dev.dubhe.fantasyskinserver.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@TableName("skin")
public class Skin extends AbstractResourcesBase { // 皮肤
    private String type; // 皮肤类型
}
