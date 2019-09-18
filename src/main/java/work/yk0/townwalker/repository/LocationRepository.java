package work.yk0.townwalker.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import work.yk0.townwalker.entity.Location;

import java.util.List;

/**
 * @author ykonno.
 * @since 2019/09/10.
 */
@Mapper
public interface LocationRepository {

    @Select("Select * from Location")
    public List<Location> findAll();
}
