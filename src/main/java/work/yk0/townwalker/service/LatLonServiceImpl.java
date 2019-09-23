package work.yk0.townwalker.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import work.yk0.townwalker.entity.Location;
import work.yk0.townwalker.repository.LocationRepository;

import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class LatLonServiceImpl implements LatLonService {

    @Autowired
    final LocationRepository locationRepository = null;

    @Value("${yahoo.api.key}")
    String apiKey;

    @Override
    @Transactional
    public void registerLatLon() {
        // 住所が固定な設置場所を取得
        List<Location> allDest = locationRepository.findFixedDest();

        RestTemplate restTemplate = new RestTemplateBuilder().build();

        // 住所検索APIへ投げる
        for (Location element : allDest) {
            URI uri = UriComponentsBuilder.newInstance()
                    .scheme("https")
                    .host("map.yahooapis.jp")
                    .path("/geocode/V1/geoCoder")
                    .queryParam("al", "4")
                    .queryParam("output", "json")
                    .queryParam("query", element.getAddress())
                    .queryParam("appid", apiKey)
                    .build()
                    .encode()
                    .toUri();
            Map res = restTemplate.getForObject(uri, Map.class);
            var feature = ((ArrayList) res.get("Feature")).get(0);
            var geometry = ((LinkedHashMap) feature).get("Geometry");
            String latlon = ((LinkedHashMap) geometry).get("Coordinates").toString();
            log.info("here");
        }
    }
}
