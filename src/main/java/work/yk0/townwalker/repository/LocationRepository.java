package work.yk0.townwalker.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import work.yk0.townwalker.entity.Location;

import java.util.List;

/**
 * @author ykonno.
 * @since 2019/09/10.
 */
@Mapper
public interface LocationRepository {

    @Select("Select * from Location")
    List<Location> findAll();

    @Select("Select * from location where address like '%市%'")
    List<Location> findFixedDest();

    @Update("Update location set lat_lon = #{latLon} where id = #{id}")
    int updateLatLon(String latLon, long id);
}
