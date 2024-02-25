package dev.dubhe.fantasyskinserver.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public abstract class AbstractResourcesBase extends AbstractSqlBase { // 资源基类
    private String path; // 资源路径
    private String name; // 资源名称
    private String hash; // 资源哈希
    private Long uploader; // 上传者
}
