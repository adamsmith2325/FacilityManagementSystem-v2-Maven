package adamSmithComp373Proj1.Domain;
import adamSmithComp373Proj1.Domain;
import java.time.LocalDate;

public class FacilityUse {

    private Facility facility;
    private LocalDate dateStarted;
    private LocalDate dateEnded;
    private int facID;
    private int locationID;

    public LocalDate getDateStarted() {

        return dateStarted;
    }

    public void setDateStarted(LocalDate dateStarted) {

        this.dateStarted = dateStarted;
    }

    public LocalDate getDateEnded() {

        return dateEnded;
    }

    public void setDateEnded(LocalDate dateEnded) {

        this.dateEnded = dateEnded;
    }

    public Facility getFacility() {

        return facility;
    }

    public int getLocationID() {

        return locationID;
    }

    public void setLocationID(int locationID) {

        this.locationID = locationID;
    }

}
