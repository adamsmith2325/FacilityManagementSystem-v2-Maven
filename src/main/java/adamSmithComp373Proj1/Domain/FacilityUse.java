package adamSmithComp373Proj1.Domain;
import adamSmithComp373Proj1.Domain;
import java.time.LocalDate;

public class FacilityUse {


    private LocalDate dateStarted;
    private LocalDate dateEnded;

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

}  
