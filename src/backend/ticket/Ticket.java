package src.backend.ticket;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.Calendar;

public class Ticket {
    private int ID;
    private String ticketType;
    private Date entryTime;
    private Date exitTime;
    private double price;
    private int vehicleId;
    private int UserId;
}