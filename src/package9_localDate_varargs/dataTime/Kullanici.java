package package9_localDate_varargs.dataTime;

import java.time.LocalDateTime;

public class Kullanici {

    String name;
    LocalDateTime kayitZamani;

    public Kullanici() { // p siz cons
    }

    public Kullanici(String name, LocalDateTime kayitZamani) { // p li cons
        this.name = name;
        this.kayitZamani = kayitZamani;
    }
}