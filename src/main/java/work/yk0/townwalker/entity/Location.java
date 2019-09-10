package work.yk0.townwalker.entity;

import lombok.Data;

/**
 * @author ykonno.
 * @since 2019/09/10.
 */
@Data
public class Location {

    private long id;

    private String dest;

    private String address;

    private String member;
}
