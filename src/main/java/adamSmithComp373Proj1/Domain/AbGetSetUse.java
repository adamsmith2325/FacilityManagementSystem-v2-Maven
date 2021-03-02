package adamSmithComp373Proj1.Domain;
import java.sql.Date;

public abstract class AbGetSetUse {
    
    public abstract Integer getUseID();
    public abstract Date getDateStarted();
    public abstract Date getDateEnded();
    public abstract Integer getRoomID();
    public abstract Integer getFacility();

    public abstract void setUseID();
    public abstract void setDateStarted();
    public abstract void setDateEnded();
    public abstract void setRoomID();
    public abstract void setFacility();
}
