import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name ="groups")
public class Groups {
@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long Id;
@Column (name="schedule_id")
    private Integer scheduleId;
@Column (name="room_id")
    private Integer roomId;
@Column (name="date_start")
    private Date dateStart;
@Column (name="date_finish")
    private Date dateFinish;
@Column (name="course_id")
    private Integer courseId;

    public Groups() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateFinish() {
        return dateFinish;
    }

    public void setDateFinish(Date dateFinish) {
        this.dateFinish = dateFinish;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

}

