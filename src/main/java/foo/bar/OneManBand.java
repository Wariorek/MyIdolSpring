package foo.bar;

import java.util.Collection;
/**
 * Created with IntelliJ IDEA.
 * User: War
 * Date: 21.04.14
 * Time: 00:18
 * To change this template use File | Settings | File Templates.
 */
public class OneManBand implements Performer {

    public OneManBand(){}

    public void perform() {
       for(Instrument instrument:instruments){
           instrument.play();
       }
    }

    private Collection<Instrument> instruments;

    public void setInstruments(Collection<Instrument> instruments){
        this.instruments = instruments;
    }
}
