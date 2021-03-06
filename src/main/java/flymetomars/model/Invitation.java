package flymetomars.model;

import com.google.common.base.Objects;

import java.util.Date;

/**
 * Created by yli on 10/03/15.
 */
public class Invitation extends SeriablizableEntity {

    public enum InvitationStatus {
        SENT("sent"),
        CREATED("created"),
        ACCEPTED("accepted"),
        DECLINED("declined");

        private String name;

        private InvitationStatus(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }

    private Mission mission;
    private Person creator;
    private Person recipient;

    private Date lastUpdated;
    private InvitationStatus status;

    public Invitation() {
    }

    public Mission getMission() {
        return mission;
    }


    public void setMission(Mission mission) {
        this.mission = mission;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }

    public InvitationStatus getStatus() {
        return status;
    }

    public void setStatus(InvitationStatus status) {
        this.status = status;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Person getRecipient() {
        return recipient;
    }

    public void setRecipient(Person recipient) {
        this.recipient = recipient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Invitation that = (Invitation) o;
        return Objects.equal(mission, that.mission) &&
                Objects.equal(creator, that.creator) &&
                Objects.equal(recipient, that.recipient);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(mission, creator, recipient);
    }

}
