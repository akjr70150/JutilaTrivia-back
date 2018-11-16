package fi.academy.triviaback;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document (collection = "kysymykset")
public class Kysymys {
    @Id
    private ObjectId _id;
    private int id;
    private String kysymys;
    private List<String> vastausvaihtoehdot = new ArrayList<>();
    private int oikeaVastausIndeksi;

    public Kysymys() {

    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKysymys() {
        return kysymys;
    }

    public void setKysymys(String kysymys) {
        this.kysymys = kysymys;
    }

    public List<String> getVastausvaihtoehdot() {
        return vastausvaihtoehdot;
    }

    public void setVastausvaihtoehdot(List<String> vastausvaihtoehdot) {
        this.vastausvaihtoehdot = vastausvaihtoehdot;
    }

    public int getOikeaVastausIndeksi() {
        return oikeaVastausIndeksi;
    }

    public void setOikeaVastausIndeksi(int oikeaVastausIndeksi) {
        this.oikeaVastausIndeksi = oikeaVastausIndeksi;
    }
}
