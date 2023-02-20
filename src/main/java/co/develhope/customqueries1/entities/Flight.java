package co.develhope.customqueries1.entities;

import javax.persistence.*;

@Entity
@Table
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String description;
    @Column
    private String fromAirport;
    @Column
    private String toAirPort;
    @Column
    private FlightStatus status;

    public Flight () {}

    public Flight(Integer id, String description, String fromAirport, String toAirPort, FlightStatus status) {
        this.id = id;
        this.description = description;
        this.fromAirport = fromAirport;
        this.toAirPort = toAirPort;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFromAirport() {
        return fromAirport;
    }

    public void setFromAirport(String fromAirport) {
        this.fromAirport = fromAirport;
    }

    public String getToAirPort() {
        return toAirPort;
    }

    public void setToAirPort(String toAirPort) {
        this.toAirPort = toAirPort;
    }

    public FlightStatus getStatus() {
        return status;
    }

    public void setStatus(FlightStatus status) {
        this.status = status;
    }
}