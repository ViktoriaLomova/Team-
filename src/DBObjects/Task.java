package DBObjects;

import java.sql.Date;
import java.util.Objects;

public class Task {
    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Integer getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Date getExpTime() {
        return expTime;
    }

    public void setExpTime(Date expTime) {
        this.expTime = expTime;
    }

    Integer taskId, taskStatus,eventId;
    String taskName;
    Date deadline, expTime;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(getTaskId(), task.getTaskId()) && Objects.equals(getTaskStatus(), task.getTaskStatus()) && Objects.equals(getEventId(), task.getEventId()) && Objects.equals(getTaskName(), task.getTaskName()) && Objects.equals(getDeadline(), task.getDeadline()) && Objects.equals(getExpTime(), task.getExpTime());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTaskId(), getTaskStatus(), getEventId(), getTaskName(), getDeadline(), getExpTime());
    }
}
