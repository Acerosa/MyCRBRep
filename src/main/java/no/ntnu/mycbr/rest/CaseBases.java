package no.ntnu.mycbr.rest;

import de.dfki.mycbr.core.DefaultCaseBase;
import de.dfki.mycbr.core.ICaseBase;
import no.ntnu.mycbr.rest.App;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by kerstin on 05/08/16.
 */
public class CaseBases {

    private final List<String> casebases = new LinkedList<>();


    public CaseBases() {

        de.dfki.mycbr.core.Project project = App.getProject();

        for (Map.Entry<String, ICaseBase> cb : project.getCaseBases().entrySet()) {
            casebases.add(cb.getKey());
        }
    }

    public List<String> getCaseBases() {
        return casebases;
    }
}
