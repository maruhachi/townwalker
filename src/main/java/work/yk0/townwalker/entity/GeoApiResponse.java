package work.yk0.townwalker.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;

@Data
public class GeoApiResponse {

    private HashMap<String, String> resultInfo;

    private ArrayList<HashMap> feature;
}
